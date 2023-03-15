
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
 * This is a model class for RetrieveCatalogObjectRequest type.
 */
public class RetrieveCatalogObjectRequest {
    private final OptionalNullable<Boolean> includeRelatedObjects;
    private final OptionalNullable<Long> catalogVersion;

    /**
     * Initialization constructor.
     * @param  includeRelatedObjects  Boolean value for includeRelatedObjects.
     * @param  catalogVersion  Long value for catalogVersion.
     */
    @JsonCreator
    public RetrieveCatalogObjectRequest(
            @JsonProperty("include_related_objects") Boolean includeRelatedObjects,
            @JsonProperty("catalog_version") Long catalogVersion) {
        this.includeRelatedObjects = OptionalNullable.of(includeRelatedObjects);
        this.catalogVersion = OptionalNullable.of(catalogVersion);
    }

    /**
     * Internal initialization constructor.
     */
    protected RetrieveCatalogObjectRequest(OptionalNullable<Boolean> includeRelatedObjects,
            OptionalNullable<Long> catalogVersion) {
        this.includeRelatedObjects = includeRelatedObjects;
        this.catalogVersion = catalogVersion;
    }

    /**
     * Internal Getter for IncludeRelatedObjects.
     * If `true`, the response will include additional objects that are related to the requested
     * objects. Related objects are defined as any objects referenced by ID by the results in the
     * `objects` field of the response. These objects are put in the `related_objects` field.
     * Setting this to `true` is helpful when the objects are needed for immediate display to a
     * user. This process only goes one level deep. Objects referenced by the related objects will
     * not be included. For example, if the `objects` field of the response contains a CatalogItem,
     * its associated CatalogCategory objects, CatalogTax objects, CatalogImage objects and
     * CatalogModifierLists will be returned in the `related_objects` field of the response. If the
     * `objects` field of the response contains a CatalogItemVariation, its parent CatalogItem will
     * be returned in the `related_objects` field of the response. Default value: `false`
     * @return Returns the Internal Boolean
     */
    @JsonGetter("include_related_objects")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetIncludeRelatedObjects() {
        return this.includeRelatedObjects;
    }

    /**
     * Getter for IncludeRelatedObjects.
     * If `true`, the response will include additional objects that are related to the requested
     * objects. Related objects are defined as any objects referenced by ID by the results in the
     * `objects` field of the response. These objects are put in the `related_objects` field.
     * Setting this to `true` is helpful when the objects are needed for immediate display to a
     * user. This process only goes one level deep. Objects referenced by the related objects will
     * not be included. For example, if the `objects` field of the response contains a CatalogItem,
     * its associated CatalogCategory objects, CatalogTax objects, CatalogImage objects and
     * CatalogModifierLists will be returned in the `related_objects` field of the response. If the
     * `objects` field of the response contains a CatalogItemVariation, its parent CatalogItem will
     * be returned in the `related_objects` field of the response. Default value: `false`
     * @return Returns the Boolean
     */
    @JsonIgnore
    public Boolean getIncludeRelatedObjects() {
        return OptionalNullable.getFrom(includeRelatedObjects);
    }

    /**
     * Internal Getter for CatalogVersion.
     * Requests objects as of a specific version of the catalog. This allows you to retrieve
     * historical versions of objects. The value to retrieve a specific version of an object can be
     * found in the version field of [CatalogObject]($m/CatalogObject)s. If not included, results
     * will be from the current version of the catalog.
     * @return Returns the Internal Long
     */
    @JsonGetter("catalog_version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Long> internalGetCatalogVersion() {
        return this.catalogVersion;
    }

    /**
     * Getter for CatalogVersion.
     * Requests objects as of a specific version of the catalog. This allows you to retrieve
     * historical versions of objects. The value to retrieve a specific version of an object can be
     * found in the version field of [CatalogObject]($m/CatalogObject)s. If not included, results
     * will be from the current version of the catalog.
     * @return Returns the Long
     */
    @JsonIgnore
    public Long getCatalogVersion() {
        return OptionalNullable.getFrom(catalogVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeRelatedObjects, catalogVersion);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveCatalogObjectRequest)) {
            return false;
        }
        RetrieveCatalogObjectRequest other = (RetrieveCatalogObjectRequest) obj;
        return Objects.equals(includeRelatedObjects, other.includeRelatedObjects)
            && Objects.equals(catalogVersion, other.catalogVersion);
    }

    /**
     * Converts this RetrieveCatalogObjectRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RetrieveCatalogObjectRequest [" + "includeRelatedObjects=" + includeRelatedObjects
                + ", catalogVersion=" + catalogVersion + "]";
    }

    /**
     * Builds a new {@link RetrieveCatalogObjectRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveCatalogObjectRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.includeRelatedObjects = internalGetIncludeRelatedObjects();
        builder.catalogVersion = internalGetCatalogVersion();
        return builder;
    }

    /**
     * Class to build instances of {@link RetrieveCatalogObjectRequest}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> includeRelatedObjects;
        private OptionalNullable<Long> catalogVersion;



        /**
         * Setter for includeRelatedObjects.
         * @param  includeRelatedObjects  Boolean value for includeRelatedObjects.
         * @return Builder
         */
        public Builder includeRelatedObjects(Boolean includeRelatedObjects) {
            this.includeRelatedObjects = OptionalNullable.of(includeRelatedObjects);
            return this;
        }

        /**
         * UnSetter for includeRelatedObjects.
         * @return Builder
         */
        public Builder unsetIncludeRelatedObjects() {
            includeRelatedObjects = null;
            return this;
        }

        /**
         * Setter for catalogVersion.
         * @param  catalogVersion  Long value for catalogVersion.
         * @return Builder
         */
        public Builder catalogVersion(Long catalogVersion) {
            this.catalogVersion = OptionalNullable.of(catalogVersion);
            return this;
        }

        /**
         * UnSetter for catalogVersion.
         * @return Builder
         */
        public Builder unsetCatalogVersion() {
            catalogVersion = null;
            return this;
        }

        /**
         * Builds a new {@link RetrieveCatalogObjectRequest} object using the set fields.
         * @return {@link RetrieveCatalogObjectRequest}
         */
        public RetrieveCatalogObjectRequest build() {
            return new RetrieveCatalogObjectRequest(includeRelatedObjects, catalogVersion);
        }
    }
}
