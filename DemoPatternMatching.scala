// This is for demonstrating Pattern Matching

object DemoPatternMatching {
  def main(args: Array[String]){
    println(matchTest(100))
    
    println(matchTest2(3))
  }
    def matchTest(x: Int):String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "many"
  }
    def matchTest2(x: Any): Any = x match{
      case 1 => "one"
      case "two" => 2
      case y:Int => "scala.Int"
      case _ => "many"
    }
}