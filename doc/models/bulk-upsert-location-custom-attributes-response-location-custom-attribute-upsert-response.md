
# Bulk Upsert Location Custom Attributes Response Location Custom Attribute Upsert Response

Represents a response for an individual upsert request in a [BulkUpsertLocationCustomAttributes](../../doc/api/location-custom-attributes.md#bulk-upsert-location-custom-attributes) operation.

## Structure

`BulkUpsertLocationCustomAttributesResponseLocationCustomAttributeUpsertResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | The ID of the location associated with the custom attribute. | String getLocationId() |
| `CustomAttribute` | [`CustomAttribute`](../../doc/models/custom-attribute.md) | Optional | A custom attribute value. Each custom attribute value has a corresponding<br>`CustomAttributeDefinition` object. | CustomAttribute getCustomAttribute() |
| `Errors` | [`List<Error>`](../../doc/models/error.md) | Optional | Any errors that occurred while processing the individual request. | List<Error> getErrors() |

## Example (as JSON)

```json
{
  "location_id": null,
  "custom_attribute": null,
  "errors": null
}
```

