package chap20.abstract_types

class Cow extends Animal {
  type SuitableFood = Grass

  override def eat(food: Grass) = {}
}
