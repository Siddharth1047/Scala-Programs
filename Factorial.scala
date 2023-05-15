object Factorial {
  def main(args: Array[String]): Unit = {
    val number = 5
    val factorial = calculateFactorial(number)
    println(s"The factorial of $number is $factorial")
  }

  def calculateFactorial(n: Int): Int = {
    if (n <= 1) 1
    else n * calculateFactorial(n - 1)
  }
}
