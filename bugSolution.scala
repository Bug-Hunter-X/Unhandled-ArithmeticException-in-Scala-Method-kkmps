```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    try {
      if (y == 0) {
        0 // Return 0 or a default value instead of throwing exception
      } else {
        x / y
      }
    } catch {
      case e: ArithmeticException => {
        println("Error: Division by zero encountered.")
        0 //Return default value
      }
      case e: Exception => {
        println("An unexpected error occurred: " + e.getMessage)
        0 // Return a default value
      }
    }
  }
}

val obj = new MyClass(10)
println(obj.myMethod(0))
println(obj.myMethod(2))
```