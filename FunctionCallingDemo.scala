// This is how function is called in scala
object FunctionCallingDemo {
  def main(args: Array[String]){
    println("Returned Value from function", addInt(5,7));
  }
  
  // Called function definition
  def addInt(a: Int, b: Int) : Int = {
    var sum: Int = 0;
    sum = a + b;
    
    return sum
  }
}