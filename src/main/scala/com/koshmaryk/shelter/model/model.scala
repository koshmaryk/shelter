package com.koshmaryk.shelter

import io.estatico.newtype.macros.newtype
import squants.market.Money

import java.util.UUID

package object model {

  @newtype case class UserId(value: UUID)
  @newtype case class UserName(value: String)
  @newtype case class Password(value: String)
  case class User(id: UserId,
                  name: UserName,
                  password: Password)

  case class Payment(id: UserId,
                     total: Money,
                     card: Card )

  @newtype case class CardName(value: String)
  @newtype case class CardNumber(value: Long)
  @newtype case class CardExpiration(value: String)
  @newtype case class CardCVV(value: Int)
  case class Card(name: CardName,
                  number: CardNumber,
                  expiration: CardExpiration,
                  cvv: CardCVV)

  @newtype case class OrderId(uuid: UUID)
  @newtype case class PaymentId(uuid: UUID)
  case class Order(id: OrderId,
                   paymentId: PaymentId,
                   items: Map[ItemId, Quantity],
                   total: Money)

  @newtype case class Quantity(value: Int)
  @newtype case class Cart(items: Map[ItemId, Quantity])

  case class CartItem(item: Item, quantity: Quantity)
  case class CartTotal(items: List[CartItem], total: Money)

  @newtype case class ItemId(value: UUID)
  @newtype case class ItemName(value: String)
  @newtype case class ItemDescription(value: String)

  case class Item(uuid: ItemId,
                  name: ItemName,
                  description: ItemDescription,
                  price: Money,
                  brand: Brand,
                  clazz: Clazz,
                  breed: Breed,
                  age: Age,
                  weight: Weight,
                  kind: Kind,
                  pack: Pack)


  @newtype case class BrandId(value: UUID)
  @newtype case class BrandName(value: String)

  case class Brand(id: BrandId, name: BrandName)

  @newtype case class ClazzId(value: UUID)
  @newtype case class ClazzType(value: String)

  case class Clazz(id: ClazzId, `type`: ClazzType)

  @newtype case class BreedId(value: UUID)
  @newtype case class BreedType(value: String)

  case class Breed(id: BreedId, `type`: BreedType)

  @newtype case class AgeId(value: UUID)
  @newtype case class AgeType(value: String)

  case class Age(id: AgeId, `type`: AgeType)

  @newtype case class WeightId(value: UUID)
  @newtype case class WeightType(value: String)

  case class Weight(id: WeightId, `type`: WeightType)

  @newtype case class KindId(value: UUID)
  @newtype case class KindType(value: String)

  case class Kind(id: KindId, `type`: KindType)

  @newtype case class PackId(value: UUID)
  @newtype case class PackType(value: String)

  case class Pack(id: PackId, `type`: PackType)
}
