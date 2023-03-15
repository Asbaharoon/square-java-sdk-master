
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
 * This is a model class for PaymentBalanceActivityOtherAdjustmentDetail type.
 */
public class PaymentBalanceActivityOtherAdjustmentDetail {
    private final OptionalNullable<String> paymentId;

    /**
     * Initialization constructor.
     * @param  paymentId  String value for paymentId.
     */
    @JsonCreator
    public PaymentBalanceActivityOtherAdjustmentDetail(
            @JsonProperty("payment_id") String paymentId) {
        this.paymentId = OptionalNullable.of(paymentId);
    }

    /**
     * Internal initialization constructor.
     */
    protected PaymentBalanceActivityOtherAdjustmentDetail(OptionalNullable<String> paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Internal Getter for PaymentId.
     * The ID of the payment associated with this activity.
     * @return Returns the Internal String
     */
    @JsonGetter("payment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaymentId() {
        return this.paymentId;
    }

    /**
     * Getter for PaymentId.
     * The ID of the payment associated with this activity.
     * @return Returns the String
     */
    @JsonIgnore
    public String getPaymentId() {
        return OptionalNullable.getFrom(paymentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentBalanceActivityOtherAdjustmentDetail)) {
            return false;
        }
        PaymentBalanceActivityOtherAdjustmentDetail other =
                (PaymentBalanceActivityOtherAdjustmentDetail) obj;
        return Objects.equals(paymentId, other.paymentId);
    }

    /**
     * Converts this PaymentBalanceActivityOtherAdjustmentDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentBalanceActivityOtherAdjustmentDetail [" + "paymentId=" + paymentId + "]";
    }

    /**
     * Builds a new {@link PaymentBalanceActivityOtherAdjustmentDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentBalanceActivityOtherAdjustmentDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.paymentId = internalGetPaymentId();
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentBalanceActivityOtherAdjustmentDetail}.
     */
    public static class Builder {
        private OptionalNullable<String> paymentId;



        /**
         * Setter for paymentId.
         * @param  paymentId  String value for paymentId.
         * @return Builder
         */
        public Builder paymentId(String paymentId) {
            this.paymentId = OptionalNullable.of(paymentId);
            return this;
        }

        /**
         * UnSetter for paymentId.
         * @return Builder
         */
        public Builder unsetPaymentId() {
            paymentId = null;
            return this;
        }

        /**
         * Builds a new {@link PaymentBalanceActivityOtherAdjustmentDetail} object using the set
         * fields.
         * @return {@link PaymentBalanceActivityOtherAdjustmentDetail}
         */
        public PaymentBalanceActivityOtherAdjustmentDetail build() {
            return new PaymentBalanceActivityOtherAdjustmentDetail(paymentId);
        }
    }
}
