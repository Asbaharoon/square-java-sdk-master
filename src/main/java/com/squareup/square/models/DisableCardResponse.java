
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for DisableCardResponse type.
 */
public class DisableCardResponse {
    private HttpContext httpContext;
    private final List<Error> errors;
    private final Card card;

    /**
     * Initialization constructor.
     * @param  errors  List of Error value for errors.
     * @param  card  Card value for card.
     */
    @JsonCreator
    public DisableCardResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("card") Card card) {
        this.errors = errors;
        this.card = card;
    }

    @JsonIgnore
    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Information on errors encountered during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * Getter for Card.
     * Represents the payment details of a card to be used for payments. These details are
     * determined by the payment token generated by Web Payments SDK.
     * @return Returns the Card
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Card getCard() {
        return card;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, card);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisableCardResponse)) {
            return false;
        }
        DisableCardResponse other = (DisableCardResponse) obj;
        return Objects.equals(errors, other.errors)
            && Objects.equals(card, other.card);
    }

    /**
     * Converts this DisableCardResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DisableCardResponse [" + "errors=" + errors + ", card=" + card + "]";
    }

    /**
     * Builds a new {@link DisableCardResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DisableCardResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors())
                .card(getCard());
        return builder;
    }

    /**
     * Class to build instances of {@link DisableCardResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private Card card;



        /**
         * Setter for httpContext.
         * @param  httpContext  HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of Error value for errors.
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  Card value for card.
         * @return Builder
         */
        public Builder card(Card card) {
            this.card = card;
            return this;
        }

        /**
         * Builds a new {@link DisableCardResponse} object using the set fields.
         * @return {@link DisableCardResponse}
         */
        public DisableCardResponse build() {
            DisableCardResponse model =
                    new DisableCardResponse(errors, card);
            model.httpContext = httpContext;
            return model;
        }
    }
}
