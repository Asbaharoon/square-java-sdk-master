
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.apimatic.core.types.BaseModel;
import java.util.Objects;

/**
 * This is a model class for CreateSubscriptionRequest type.
 */
public class CreateSubscriptionRequest {
    private final String idempotencyKey;
    private final String locationId;
    private final String planId;
    private final String customerId;
    private final String startDate;
    private final String canceledDate;
    private final String taxPercentage;
    private final Money priceOverrideMoney;
    private final String cardId;
    private final String timezone;
    private final SubscriptionSource source;

    /**
     * Initialization constructor.
     * @param  locationId  String value for locationId.
     * @param  planId  String value for planId.
     * @param  customerId  String value for customerId.
     * @param  idempotencyKey  String value for idempotencyKey.
     * @param  startDate  String value for startDate.
     * @param  canceledDate  String value for canceledDate.
     * @param  taxPercentage  String value for taxPercentage.
     * @param  priceOverrideMoney  Money value for priceOverrideMoney.
     * @param  cardId  String value for cardId.
     * @param  timezone  String value for timezone.
     * @param  source  SubscriptionSource value for source.
     */
    @JsonCreator
    public CreateSubscriptionRequest(
            @JsonProperty("location_id") String locationId,
            @JsonProperty("plan_id") String planId,
            @JsonProperty("customer_id") String customerId,
            @JsonProperty("idempotency_key") String idempotencyKey,
            @JsonProperty("start_date") String startDate,
            @JsonProperty("canceled_date") String canceledDate,
            @JsonProperty("tax_percentage") String taxPercentage,
            @JsonProperty("price_override_money") Money priceOverrideMoney,
            @JsonProperty("card_id") String cardId,
            @JsonProperty("timezone") String timezone,
            @JsonProperty("source") SubscriptionSource source) {
        this.idempotencyKey = idempotencyKey;
        this.locationId = locationId;
        this.planId = planId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.canceledDate = canceledDate;
        this.taxPercentage = taxPercentage;
        this.priceOverrideMoney = priceOverrideMoney;
        this.cardId = cardId;
        this.timezone = timezone;
        this.source = source;
    }

    /**
     * Getter for IdempotencyKey.
     * A unique string that identifies this `CreateSubscription` request. If you do not provide a
     * unique string (or provide an empty string as the value), the endpoint treats each request as
     * independent. For more information, see [Idempotency
     * keys](https://developer.squareup.com/docs/working-with-apis/idempotency).
     * @return Returns the String
     */
    @JsonGetter("idempotency_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    /**
     * Getter for LocationId.
     * The ID of the location the subscription is associated with.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * Getter for PlanId.
     * The ID of the subscription plan created using the Catalog API. For more information, see [Set
     * Up and Manage a Subscription
     * Plan](https://developer.squareup.com/docs/subscriptions-api/setup-plan) and [Subscriptions
     * Walkthrough](https://developer.squareup.com/docs/subscriptions-api/walkthrough).
     * @return Returns the String
     */
    @JsonGetter("plan_id")
    public String getPlanId() {
        return planId;
    }

    /**
     * Getter for CustomerId.
     * The ID of the [customer]($m/Customer) subscribing to the subscription plan.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Getter for StartDate.
     * The `YYYY-MM-DD`-formatted date to start the subscription. If it is unspecified, the
     * subscription starts immediately.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Getter for CanceledDate.
     * The `YYYY-MM-DD`-formatted date when the newly created subscription is scheduled for
     * cancellation. This date overrides the cancellation date set in the plan configuration. If the
     * cancellation date is earlier than the end date of a subscription cycle, the subscription
     * stops at the canceled date and the subscriber is sent a prorated invoice at the beginning of
     * the canceled cycle. When the subscription plan of the newly created subscription has a fixed
     * number of cycles and the `canceled_date` occurs before the subscription plan expires, the
     * specified `canceled_date` sets the date when the subscription stops through the end of the
     * last cycle.
     * @return Returns the String
     */
    @JsonGetter("canceled_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCanceledDate() {
        return canceledDate;
    }

    /**
     * Getter for TaxPercentage.
     * The tax to add when billing the subscription. The percentage is expressed in decimal form,
     * using a `'.'` as the decimal separator and without a `'%'` sign. For example, a value of 7.5
     * corresponds to 7.5%.
     * @return Returns the String
     */
    @JsonGetter("tax_percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxPercentage() {
        return taxPercentage;
    }

    /**
     * Getter for PriceOverrideMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("price_override_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getPriceOverrideMoney() {
        return priceOverrideMoney;
    }

    /**
     * Getter for CardId.
     * The ID of the [subscriber's]($m/Customer) [card]($m/Card) to charge. If it is not specified,
     * the subscriber receives an invoice via email. For an example to create a customer profile for
     * a subscriber and add a card on file, see [Subscriptions
     * Walkthrough](https://developer.squareup.com/docs/subscriptions-api/walkthrough).
     * @return Returns the String
     */
    @JsonGetter("card_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardId() {
        return cardId;
    }

    /**
     * Getter for Timezone.
     * The timezone that is used in date calculations for the subscription. If unset, defaults to
     * the location timezone. If a timezone is not configured for the location, defaults to
     * "America/New_York". Format: the IANA Timezone Database identifier for the location timezone.
     * For a list of time zones, see [List of tz database time
     * zones](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
     * @return Returns the String
     */
    @JsonGetter("timezone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTimezone() {
        return timezone;
    }

    /**
     * Getter for Source.
     * The origination details of the subscription.
     * @return Returns the SubscriptionSource
     */
    @JsonGetter("source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionSource getSource() {
        return source;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idempotencyKey, locationId, planId, customerId, startDate, canceledDate,
                taxPercentage, priceOverrideMoney, cardId, timezone, source);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateSubscriptionRequest)) {
            return false;
        }
        CreateSubscriptionRequest other = (CreateSubscriptionRequest) obj;
        return Objects.equals(idempotencyKey, other.idempotencyKey)
            && Objects.equals(locationId, other.locationId)
            && Objects.equals(planId, other.planId)
            && Objects.equals(customerId, other.customerId)
            && Objects.equals(startDate, other.startDate)
            && Objects.equals(canceledDate, other.canceledDate)
            && Objects.equals(taxPercentage, other.taxPercentage)
            && Objects.equals(priceOverrideMoney, other.priceOverrideMoney)
            && Objects.equals(cardId, other.cardId)
            && Objects.equals(timezone, other.timezone)
            && Objects.equals(source, other.source);
    }

    /**
     * Converts this CreateSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscriptionRequest [" + "locationId=" + locationId + ", planId=" + planId
                + ", customerId=" + customerId + ", idempotencyKey=" + idempotencyKey
                + ", startDate=" + startDate + ", canceledDate=" + canceledDate + ", taxPercentage="
                + taxPercentage + ", priceOverrideMoney=" + priceOverrideMoney + ", cardId="
                + cardId + ", timezone=" + timezone + ", source=" + source + "]";
    }

    /**
     * Builds a new {@link CreateSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(locationId, planId, customerId)
                .idempotencyKey(getIdempotencyKey())
                .startDate(getStartDate())
                .canceledDate(getCanceledDate())
                .taxPercentage(getTaxPercentage())
                .priceOverrideMoney(getPriceOverrideMoney())
                .cardId(getCardId())
                .timezone(getTimezone())
                .source(getSource());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscriptionRequest}.
     */
    public static class Builder {
        private String locationId;
        private String planId;
        private String customerId;
        private String idempotencyKey;
        private String startDate;
        private String canceledDate;
        private String taxPercentage;
        private Money priceOverrideMoney;
        private String cardId;
        private String timezone;
        private SubscriptionSource source;

        /**
         * Initialization constructor.
         * @param  locationId  String value for locationId.
         * @param  planId  String value for planId.
         * @param  customerId  String value for customerId.
         */
        public Builder(String locationId, String planId, String customerId) {
            this.locationId = locationId;
            this.planId = planId;
            this.customerId = customerId;
        }

        /**
         * Setter for locationId.
         * @param  locationId  String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        /**
         * Setter for planId.
         * @param  planId  String value for planId.
         * @return Builder
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
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
         * Setter for idempotencyKey.
         * @param  idempotencyKey  String value for idempotencyKey.
         * @return Builder
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for canceledDate.
         * @param  canceledDate  String value for canceledDate.
         * @return Builder
         */
        public Builder canceledDate(String canceledDate) {
            this.canceledDate = canceledDate;
            return this;
        }

        /**
         * Setter for taxPercentage.
         * @param  taxPercentage  String value for taxPercentage.
         * @return Builder
         */
        public Builder taxPercentage(String taxPercentage) {
            this.taxPercentage = taxPercentage;
            return this;
        }

        /**
         * Setter for priceOverrideMoney.
         * @param  priceOverrideMoney  Money value for priceOverrideMoney.
         * @return Builder
         */
        public Builder priceOverrideMoney(Money priceOverrideMoney) {
            this.priceOverrideMoney = priceOverrideMoney;
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
         * Setter for timezone.
         * @param  timezone  String value for timezone.
         * @return Builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Setter for source.
         * @param  source  SubscriptionSource value for source.
         * @return Builder
         */
        public Builder source(SubscriptionSource source) {
            this.source = source;
            return this;
        }

        /**
         * Builds a new {@link CreateSubscriptionRequest} object using the set fields.
         * @return {@link CreateSubscriptionRequest}
         */
        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(locationId, planId, customerId, idempotencyKey,
                    startDate, canceledDate, taxPercentage, priceOverrideMoney, cardId, timezone,
                    source);
        }
    }
}
