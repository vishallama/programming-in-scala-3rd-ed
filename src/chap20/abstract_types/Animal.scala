package chap20.abstract_types

abstract class Animal {
  type SuitableFood <: Food

  def eat(food: SuitableFood)
}
