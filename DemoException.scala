import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

//Code for exception handling in Scala
object DemoException {
  def main(args: Array[String]){
      
    try{
      val f = new FileReader("input.txt")
    }
    catch{
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
    
      case ex: IOException => {
        println("IO exception");
      }
    }
     finally {
       println("Exiting finally!!") 
    }
   }
}