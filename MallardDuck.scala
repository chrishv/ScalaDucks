package Ducks

/**
  * Created by Chris on 23/11/2016.
  */
 class MallardDuck extends Duck{
  //def this() {
    //this()
    override val quackBehaviour = new Quack
    override val flyBehaviour = new FlyWithWings
  //}

  def display() {
    System.out.println("I'm a real Mallard duck")
  }
}
