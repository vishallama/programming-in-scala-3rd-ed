package chap20.abstract_types

object AnimalTest extends App {

  val bessy = new Cow
  // The following won't compile, because bessy can only eat food
  // of type Grass.
  // bessy eat (new Fish)

  // This compiles just fine
  bessy eat (new Grass)
  bessy eat (new bessy.SuitableFood)
}
