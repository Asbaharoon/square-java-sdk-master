
# Update Item Modifier Lists Response

## Structure

`UpdateItemModifierListsResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Errors` | [`List<Error>`](../../doc/models/error.md) | Optional | Any errors that occurred during the request. | List<Error> getErrors() |
| `UpdatedAt` | `String` | Optional | The database [timestamp](https://developer.squareup.com/docs/build-basics/working-with-date) of this update in RFC 3339 format, e.g., `2016-09-04T23:59:33.123Z`. | String getUpdatedAt() |

## Example (as JSON)

```json
{
  "updated_at": "2016-11-16T22:25:24.878Z"
}
```

