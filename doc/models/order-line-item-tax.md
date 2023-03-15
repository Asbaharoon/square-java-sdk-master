
# Order Line Item Tax

Represents a tax that applies to one or more line item in the order.

Fixed-amount, order-scoped taxes are distributed across all non-zero line item totals.
The amount distributed to each line item is relative to the amount the item
contributes to the order subtotal.

## Structure

`OrderLineItemTax`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Uid` | `String` | Optional | A unique ID that identifies the tax only within this order.<br>**Constraints**: *Maximum Length*: `60` | String getUid() |
| `CatalogObjectId` | `String` | Optional | The catalog object ID referencing [CatalogTax](../../doc/models/catalog-tax.md).<br>**Constraints**: *Maximum Length*: `192` | String getCatalogObjectId() |
| `CatalogVersion` | `Long` | Optional | The version of the catalog object that this tax references. | Long getCatalogVersion() |
| `Name` | `String` | Optional | The tax's name.<br>**Constraints**: *Maximum Length*: `255` | String getName() |
| `Type` | [`String`](../../doc/models/order-line-item-tax-type.md) | Optional | Indicates how the tax is applied to the associated line item or order. | String getType() |
| `Percentage` | `String` | Optional | The percentage of the tax, as a string representation of a decimal<br>number. For example, a value of `"7.25"` corresponds to a percentage of<br>7.25%.<br>**Constraints**: *Maximum Length*: `10` | String getPercentage() |
| `Metadata` | `Map<String, String>` | Optional | Application-defined data attached to this tax. Metadata fields are intended<br>to store descriptive references or associations with an entity in another system or store brief<br>information about the object. Square does not process this field; it only stores and returns it<br>in relevant API calls. Do not use metadata to store any sensitive information (such as personally<br>identifiable information or card details).<br><br>Keys written by applications must be 60 characters or less and must be in the character set<br>`[a-zA-Z0-9_-]`. Entries can also include metadata generated by Square. These keys are prefixed<br>with a namespace, separated from the key with a ':' character.<br><br>Values have a maximum length of 255 characters.<br><br>An application can have up to 10 entries per metadata field.<br><br>Entries written by applications are private and can only be read or modified by the same<br>application.<br><br>For more information, see [Metadata](https://developer.squareup.com/docs/build-basics/metadata). | Map<String, String> getMetadata() |
| `AppliedMoney` | [`Money`](../../doc/models/money.md) | Optional | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. | Money getAppliedMoney() |
| `Scope` | [`String`](../../doc/models/order-line-item-tax-scope.md) | Optional | Indicates whether this is a line-item or order-level tax. | String getScope() |
| `AutoApplied` | `Boolean` | Optional | Determines whether the tax was automatically applied to the order based on<br>the catalog configuration. For an example, see<br>[Automatically Apply Taxes to an Order](https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes). | Boolean getAutoApplied() |

## Example (as JSON)

```json
{
  "uid": null,
  "catalog_object_id": null,
  "catalog_version": null,
  "name": null,
  "type": null,
  "percentage": null,
  "metadata": null,
  "applied_money": null,
  "scope": null,
  "auto_applied": null
}
```
