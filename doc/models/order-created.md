
# Order Created

## Structure

`OrderCreated`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `OrderId` | `String` | Optional | The order's unique ID. | String getOrderId() |
| `Version` | `Integer` | Optional | The version number, which is incremented each time an update is committed to the order.<br>Orders that were not created through the API do not include a version number and<br>therefore cannot be updated.<br><br>[Read more about working with versions.](https://developer.squareup.com/docs/orders-api/manage-orders/update-orders) | Integer getVersion() |
| `LocationId` | `String` | Optional | The ID of the seller location that this order is associated with. | String getLocationId() |
| `State` | [`String`](../../doc/models/order-state.md) | Optional | The state of the order. | String getState() |
| `CreatedAt` | `String` | Optional | The timestamp for when the order was created, in RFC 3339 format. | String getCreatedAt() |

## Example (as JSON)

```json
{
  "order_id": null,
  "version": null,
  "location_id": null,
  "state": null,
  "created_at": null
}
```
