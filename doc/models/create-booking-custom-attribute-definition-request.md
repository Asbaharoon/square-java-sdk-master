
# Create Booking Custom Attribute Definition Request

Represents a [CreateBookingCustomAttributeDefinition](../../doc/api/booking-custom-attributes.md#create-booking-custom-attribute-definition) request.

## Structure

`CreateBookingCustomAttributeDefinitionRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `CustomAttributeDefinition` | [`CustomAttributeDefinition`](../../doc/models/custom-attribute-definition.md) | Required | Represents a definition for custom attribute values. A custom attribute definition<br>specifies the key, visibility, schema, and other properties for a custom attribute. | CustomAttributeDefinition getCustomAttributeDefinition() |
| `IdempotencyKey` | `String` | Optional | A unique identifier for this request, used to ensure idempotency. For more information,<br>see [Idempotency](https://developer.squareup.com/docs/build-basics/common-api-patterns/idempotency).<br>**Constraints**: *Maximum Length*: `45` | String getIdempotencyKey() |

## Example (as JSON)

```json
{
  "custom_attribute_definition": {
    "key": null,
    "schema": null,
    "name": null,
    "description": null,
    "visibility": null,
    "version": null,
    "updated_at": null,
    "created_at": null
  },
  "idempotency_key": null
}
```
