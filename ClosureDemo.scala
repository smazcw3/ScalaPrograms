// This code is to demonstrate closure function in scala
object ClosureDemo {
  def main(args: Array[String]){
    println("multipler 1 value", multiplier(1));
    println("multipler 2 value", multiplier(2));
  }
  var factor = 3;
  val multiplier = (i: Int) => i * factor
}