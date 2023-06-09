
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
 * This is a model class for ListCustomersResponse type.
 */
public class ListCustomersResponse {
    private HttpContext httpContext;
    private final List<Error> errors;
    private final List<Customer> customers;
    private final String cursor;

    /**
     * Initialization constructor.
     * @param  errors  List of Error value for errors.
     * @param  customers  List of Customer value for customers.
     * @param  cursor  String value for cursor.
     */
    @JsonCreator
    public ListCustomersResponse(
            @JsonProperty("errors") List<Error> errors,
            @JsonProperty("customers") List<Customer> customers,
            @JsonProperty("cursor") String cursor) {
        this.errors = errors;
        this.customers = customers;
        this.cursor = cursor;
    }

    @JsonIgnore
    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * Getter for Customers.
     * The customer profiles associated with the Square account or an empty object (`{}`) if none
     * are found.
     * @return Returns the List of Customer
     */
    @JsonGetter("customers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * Getter for Cursor.
     * A pagination cursor to retrieve the next set of results for the original query. A cursor is
     * only present if the request succeeded and additional results are available. For more
     * information, see
     * [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination).
     * @return Returns the String
     */
    @JsonGetter("cursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCursor() {
        return cursor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, customers, cursor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCustomersResponse)) {
            return false;
        }
        ListCustomersResponse other = (ListCustomersResponse) obj;
        return Objects.equals(errors, other.errors)
            && Objects.equals(customers, other.customers)
            && Objects.equals(cursor, other.cursor);
    }

    /**
     * Converts this ListCustomersResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCustomersResponse [" + "errors=" + errors + ", customers=" + customers
                + ", cursor=" + cursor + "]";
    }

    /**
     * Builds a new {@link ListCustomersResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCustomersResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors())
                .customers(getCustomers())
                .cursor(getCursor());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCustomersResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private List<Error> errors;
        private List<Customer> customers;
        private String cursor;



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
         * Setter for customers.
         * @param  customers  List of Customer value for customers.
         * @return Builder
         */
        public Builder customers(List<Customer> customers) {
            this.customers = customers;
            return this;
        }

        /**
         * Setter for cursor.
         * @param  cursor  String value for cursor.
         * @return Builder
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Builds a new {@link ListCustomersResponse} object using the set fields.
         * @return {@link ListCustomersResponse}
         */
        public ListCustomersResponse build() {
            ListCustomersResponse model =
                    new ListCustomersResponse(errors, customers, cursor);
            model.httpContext = httpContext;
            return model;
        }
    }
}
