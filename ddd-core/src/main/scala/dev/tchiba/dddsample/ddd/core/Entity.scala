package dev.tchiba.dddsample.ddd.core

trait Entity[ID <: EntityId[_]] extends Equals {
  val id: ID

  override def canEqual(that: Any): Boolean

  override def equals(obj: Any): Boolean = obj match {
    case that: Entity[_] => that.canEqual(this) && id == that.id
    case _               => false
  }

  override def hashCode(): Int = 31 * id.##
}
