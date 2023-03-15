
# Square Event Data

## Structure

`SquareEventData`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | Name of the affected object’s type. | String getType() |
| `Id` | `String` | Optional | ID of the affected object. | String getId() |
| `Deleted` | `Boolean` | Optional | Is true if the affected object was deleted. Otherwise absent. | Boolean getDeleted() |
| `Object` | `JsonObject` | Optional | An object containing fields and values relevant to the event. Is absent if affected object was deleted. | JsonObject getObject() |

## Example (as JSON)

```json
{
  "type": null,
  "id": null,
  "deleted": null,
  "object": null
}
```

