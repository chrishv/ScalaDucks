package Ducks


/**
  * Created by Chris on 22/11/2016.
  */
 abstract class Duck (val flyBehaviour: FlyBehaviour = null, val quackBehaviour: QuackBehaviour = null  ) {
  //private[Ducks]//
  //flyBehaviour: FlyBehaviour = null
  //private[Ducks]//
  //val quackBehaviour: QuackBehaviour = null

  //def this() {this()}

  def display()

  def performFly() {
    flyBehaviour.fly()
  }

  def performQuack() {
    quackBehaviour.quack()
  }

  def swim() {
    System.out.println("All ducks float, even decoys!")
  }

}
