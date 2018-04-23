// This is for demonstrating how operations on arrays work in Scala

object DemoArrays {
  def main(args: Array[String]){
    val myList = Array(1.9, 2.9, 3.4, 3.5)
    
    for (x <- myList){
      println(x)
    }
    
    var total = 0.0 // mutable type
    
    for (i <- 0 to (myList.length -1)){
      total += myList(i)
    }
    println("Total is", total)
    
    var max = myList(0);
    
    for (i <- 1 to (myList.length - 1)){
      if(myList(i) >  max){
        max = myList(i);
      }
    }    
  }
}