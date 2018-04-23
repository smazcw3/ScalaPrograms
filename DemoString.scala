//This demo is for string operations in Scala

object DemoString {
  val greeting:String = "Hello, World!"
  
  var greeting2:String = "Hello, again!"
  
  val palindrome_string = "Dot saw I was tod";
  
  val length = palindrome_string.length();
  
  
  def main(args: Array[String]){
    println(greeting); 
    println(greeting2)
    
    println(palindrome_string + " " + greeting2)
  }
  
}