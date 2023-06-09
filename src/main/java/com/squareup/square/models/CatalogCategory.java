
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for CatalogCategory type.
 */
public class CatalogCategory {
    private final OptionalNullable<String> name;
    private final OptionalNullable<List<String>> imageIds;

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  imageIds  List of String value for imageIds.
     */
    @JsonCreator
    public CatalogCategory(
            @JsonProperty("name") String name,
            @JsonProperty("image_ids") List<String> imageIds) {
        this.name = OptionalNullable.of(name);
        this.imageIds = OptionalNullable.of(imageIds);
    }

    /**
     * Internal initialization constructor.
     */
    protected CatalogCategory(OptionalNullable<String> name,
            OptionalNullable<List<String>> imageIds) {
        this.name = name;
        this.imageIds = imageIds;
    }

    /**
     * Internal Getter for Name.
     * The category name. This is a searchable attribute for use in applicable query filters, and
     * its value length is of Unicode code points.
     * @return Returns the Internal String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetName() {
        return this.name;
    }

    /**
     * Getter for Name.
     * The category name. This is a searchable attribute for use in applicable query filters, and
     * its value length is of Unicode code points.
     * @return Returns the String
     */
    @JsonIgnore
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Internal Getter for ImageIds.
     * The IDs of images associated with this `CatalogCategory` instance. Currently these images are
     * not displayed by Square, but are free to be displayed in 3rd party applications.
     * @return Returns the Internal List of String
     */
    @JsonGetter("image_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetImageIds() {
        return this.imageIds;
    }

    /**
     * Getter for ImageIds.
     * The IDs of images associated with this `CatalogCategory` instance. Currently these images are
     * not displayed by Square, but are free to be displayed in 3rd party applications.
     * @return Returns the List of String
     */
    @JsonIgnore
    public List<String> getImageIds() {
        return OptionalNullable.getFrom(imageIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatalogCategory)) {
            return false;
        }
        CatalogCategory other = (CatalogCategory) obj;
        return Objects.equals(name, other.name)
            && Objects.equals(imageIds, other.imageIds);
    }

    /**
     * Converts this CatalogCategory into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CatalogCategory [" + "name=" + name + ", imageIds=" + imageIds + "]";
    }

    /**
     * Builds a new {@link CatalogCategory.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CatalogCategory.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.name = internalGetName();
        builder.imageIds = internalGetImageIds();
        return builder;
    }

    /**
     * Class to build instances of {@link CatalogCategory}.
     */
    public static class Builder {
        private OptionalNullable<String> name;
        private OptionalNullable<List<String>> imageIds;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = OptionalNullable.of(name);
            return this;
        }

        /**
         * UnSetter for name.
         * @return Builder
         */
        public Builder unsetName() {
            name = null;
            return this;
        }

        /**
         * Setter for imageIds.
         * @param  imageIds  List of String value for imageIds.
         * @return Builder
         */
        public Builder imageIds(List<String> imageIds) {
            this.imageIds = OptionalNullable.of(imageIds);
            return this;
        }

        /**
         * UnSetter for imageIds.
         * @return Builder
         */
        public Builder unsetImageIds() {
            imageIds = null;
            return this;
        }

        /**
         * Builds a new {@link CatalogCategory} object using the set fields.
         * @return {@link CatalogCategory}
         */
        public CatalogCategory build() {
            return new CatalogCategory(name, imageIds);
        }
    }
}
