
# Terminal Checkout

Represents a checkout processed by the Square Terminal.

## Structure

`TerminalCheckout`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | A unique ID for this `TerminalCheckout`.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `255` | String getId() |
| `AmountMoney` | [`Money`](../../doc/models/money.md) | Required | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. | Money getAmountMoney() |
| `ReferenceId` | `String` | Optional | An optional user-defined reference ID that can be used to associate<br>this `TerminalCheckout` to another entity in an external system. For example, an order<br>ID generated by a third-party shopping cart. The ID is also associated with any payments<br>used to complete the checkout.<br>**Constraints**: *Maximum Length*: `40` | String getReferenceId() |
| `Note` | `String` | Optional | An optional note to associate with the checkout, as well as with any payments used to complete the checkout.<br>Note: maximum 500 characters<br>**Constraints**: *Maximum Length*: `500` | String getNote() |
| `OrderId` | `String` | Optional | The reference to the Square order ID for the checkout request. Supported only in the US. | String getOrderId() |
| `PaymentOptions` | [`PaymentOptions`](../../doc/models/payment-options.md) | Optional | - | PaymentOptions getPaymentOptions() |
| `DeviceOptions` | [`DeviceCheckoutOptions`](../../doc/models/device-checkout-options.md) | Required | - | DeviceCheckoutOptions getDeviceOptions() |
| `DeadlineDuration` | `String` | Optional | An RFC 3339 duration, after which the checkout is automatically canceled.<br>A `TerminalCheckout` that is `PENDING` is automatically `CANCELED` and has a cancellation reason<br>of `TIMED_OUT`.<br><br>Default: 5 minutes from creation<br><br>Maximum: 5 minutes | String getDeadlineDuration() |
| `Status` | `String` | Optional | The status of the `TerminalCheckout`.<br>Options: `PENDING`, `IN_PROGRESS`, `CANCEL_REQUESTED`, `CANCELED`, `COMPLETED` | String getStatus() |
| `CancelReason` | [`String`](../../doc/models/action-cancel-reason.md) | Optional | - | String getCancelReason() |
| `PaymentIds` | `List<String>` | Optional | A list of IDs for payments created by this `TerminalCheckout`. | List<String> getPaymentIds() |
| `CreatedAt` | `String` | Optional | The time when the `TerminalCheckout` was created, as an RFC 3339 timestamp. | String getCreatedAt() |
| `UpdatedAt` | `String` | Optional | The time when the `TerminalCheckout` was last updated, as an RFC 3339 timestamp. | String getUpdatedAt() |
| `AppId` | `String` | Optional | The ID of the application that created the checkout. | String getAppId() |
| `LocationId` | `String` | Optional | The location of the device where the `TerminalCheckout` was directed. | String getLocationId() |
| `PaymentType` | [`String`](../../doc/models/checkout-options-payment-type.md) | Optional | - | String getPaymentType() |
| `CustomerId` | `String` | Optional | An optional ID of the customer associated with the checkout. | String getCustomerId() |
| `AppFeeMoney` | [`Money`](../../doc/models/money.md) | Optional | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. | Money getAppFeeMoney() |

## Example (as JSON)

```json
{
  "id": null,
  "amount_money": {
    "amount": null,
    "currency": null
  },
  "reference_id": null,
  "note": null,
  "order_id": null,
  "payment_options": null,
  "device_options": {
    "device_id": "device_id6",
    "skip_receipt_screen": null,
    "collect_signature": null,
    "tip_settings": null,
    "show_itemized_cart": null
  },
  "deadline_duration": null,
  "status": null,
  "cancel_reason": null,
  "payment_ids": null,
  "created_at": null,
  "updated_at": null,
  "app_id": null,
  "location_id": null,
  "payment_type": null,
  "customer_id": null,
  "app_fee_money": null
}
```
