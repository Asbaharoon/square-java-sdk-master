
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.Objects;

/**
 * This is a model class for SaveCardOptions type.
 */
public class SaveCardOptions {
    private final String customerId;
    private final String cardId;
    private final OptionalNullable<String> referenceId;

    /**
     * Initialization constructor.
     * @param  customerId  String value for customerId.
     * @param  cardId  String value for cardId.
     * @param  referenceId  String value for referenceId.
     */
    @JsonCreator
    public SaveCardOptions(
            @JsonProperty("customer_id") String customerId,
            @JsonProperty("card_id") String cardId,
            @JsonProperty("reference_id") String referenceId) {
        this.customerId = customerId;
        this.cardId = cardId;
        this.referenceId = OptionalNullable.of(referenceId);
    }

    /**
     * Internal initialization constructor.
     */
    protected SaveCardOptions(String customerId, String cardId,
            OptionalNullable<String> referenceId) {
        this.customerId = customerId;
        this.cardId = cardId;
        this.referenceId = referenceId;
    }

    /**
     * Getter for CustomerId.
     * The square-assigned ID of the customer linked to the saved card.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Getter for CardId.
     * The id of the created card-on-file.
     * @return Returns the String
     */
    @JsonGetter("card_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardId() {
        return cardId;
    }

    /**
     * Internal Getter for ReferenceId.
     * An optional user-defined reference ID that can be used to associate this `Card` to another
     * entity in an external system. For example, a customer ID generated by a third-party system.
     * @return Returns the Internal String
     */
    @JsonGetter("reference_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReferenceId() {
        return this.referenceId;
    }

    /**
     * Getter for ReferenceId.
     * An optional user-defined reference ID that can be used to associate this `Card` to another
     * entity in an external system. For example, a customer ID generated by a third-party system.
     * @return Returns the String
     */
    @JsonIgnore
    public String getReferenceId() {
        return OptionalNullable.getFrom(referenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, cardId, referenceId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SaveCardOptions)) {
            return false;
        }
        SaveCardOptions other = (SaveCardOptions) obj;
        return Objects.equals(customerId, other.customerId)
            && Objects.equals(cardId, other.cardId)
            && Objects.equals(referenceId, other.referenceId);
    }

    /**
     * Converts this SaveCardOptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SaveCardOptions [" + "customerId=" + customerId + ", cardId=" + cardId
                + ", referenceId=" + referenceId + "]";
    }

    /**
     * Builds a new {@link SaveCardOptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SaveCardOptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customerId)
                .cardId(getCardId());
        builder.referenceId = internalGetReferenceId();
        return builder;
    }

    /**
     * Class to build instances of {@link SaveCardOptions}.
     */
    public static class Builder {
        private String customerId;
        private String cardId;
        private OptionalNullable<String> referenceId;

        /**
         * Initialization constructor.
         * @param  customerId  String value for customerId.
         */
        public Builder(String customerId) {
            this.customerId = customerId;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  String value for cardId.
         * @return Builder
         */
        public Builder cardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for referenceId.
         * @param  referenceId  String value for referenceId.
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = OptionalNullable.of(referenceId);
            return this;
        }

        /**
         * UnSetter for referenceId.
         * @return Builder
         */
        public Builder unsetReferenceId() {
            referenceId = null;
            return this;
        }

        /**
         * Builds a new {@link SaveCardOptions} object using the set fields.
         * @return {@link SaveCardOptions}
         */
        public SaveCardOptions build() {
            return new SaveCardOptions(customerId, cardId, referenceId);
        }
    }
}
