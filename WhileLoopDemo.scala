object WhileLoopDemo {
  def main(args: Array[String]){
    var a = 10;
    
    while(a > 0){
      println("Value of a:", + a);
      a = a - 1;
    }
  }
}