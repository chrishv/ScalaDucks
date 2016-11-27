package Ducks

/**
  * Created by Chris on 24/11/2016.
  */
class RubberDuck extends Duck{

  override val quackBehaviour = new Squeak
  override val oddBehaviour = new NoWaddle

  def display() {
    System.out.println("I'm a RubberDuck duck")
  }

}
