package Ducks

/**
  * Created by Chris on 23/11/2016.
  */
object  MiniDuckSimulator extends App {
  override def main(args: Array[String]) {
    val mallard: Duck = new MallardDuck
    mallard.performQuack()
    mallard.performFly()
    mallard.swim()
    mallard.display()

    val rubber: Duck = new RubberDuck
    rubber.display()
    rubber.performQuack()
    rubber.performWaddle()



  }
}
