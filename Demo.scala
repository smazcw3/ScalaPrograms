object Demo {
  //This program is for variable declaration
  def main(args: Array[String]){
    var myVar :Int = 10; //mutable variable
    val myVal :String = "Hello Scala with datatype declaration."; //immutable variable
    
    var myVar1 = 20; //mutable variable
    var myVal1 = "Hello Scala new without datatype declaration."; //immutable variable
    
    println(myVar); println(myVal); println(myVar1);
    print(myVal1);
  }
}