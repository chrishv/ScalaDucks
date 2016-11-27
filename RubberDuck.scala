package Ducks

/**
  * Created by Chris on 24/11/2016.
  */
class RubberDuck extends Duck{

  override val quackBehaviour = new Squeak

  def display() {
    System.out.println("I'm a RubberDuck duck")
  }

}
