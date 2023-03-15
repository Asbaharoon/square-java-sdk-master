
# Delete Location Custom Attribute Response

Represents a [DeleteLocationCustomAttribute](../../doc/api/location-custom-attributes.md#delete-location-custom-attribute) response.
Either an empty object `{}` (for a successful deletion) or `errors` is present in the response.

## Structure

`DeleteLocationCustomAttributeResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Errors` | [`List<Error>`](../../doc/models/error.md) | Optional | Any errors that occurred during the request. | List<Error> getErrors() |

## Example (as JSON)

```json
{}
```
