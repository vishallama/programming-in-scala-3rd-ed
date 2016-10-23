package chap20.abstract_types

object AnimalTest extends App {

  val bessy: Animal = new Cow
  // The following won't compile, because bessy can only eat food
  // of type Grass.
  // bessy eat (new Fish)
}
