import scala.util.matching.Regex

object DemoRegularExpressions {
  def main(args: Array[String]){
    val pattern = new Regex("(S|s)cala")
    val sample_string = "Scala is very scalabale amongst all scalable languages";
    
    println(pattern findFirstIn sample_string)
    println((pattern findAllIn sample_string).mkString(","))
    
    
    //Another way to create a pattern
    val pattern2 = "(S|s)cala".r
    val sample_string2 = "Scala is very scalabale amongst all scalable languages, its scalating";
    println(pattern2 findFirstIn sample_string)    
    println(pattern2 replaceFirstIn(sample_string, "Java"))
    
    //Another example of regular expressions
    val pattern3 = new Regex("abl[ae]\\d+")
    val sample_string3 = "ablaw is able1 and cool"
    println((pattern3 findAllIn sample_string3).mkString(","))
    
  }
}