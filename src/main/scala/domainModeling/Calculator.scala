package domainModeling

import scala.math.abs

class Calculator( num1: Int, num2: Int ) extends ComposedCalculator {


  override def add(num1: Int, num2: Int): Int = num1 + num2

  override def subtract(num1: Int, num2: Int): Int = num1 - num2

  override def multiply(num1: Int, num2: Int): Int = num1 * num2

  override def divide(num1: Int, num2: Int): Int = num1 / num2

  override def addAll(numbers: Int*): Int = numbers.sum

  override def multiplyAll(numbers: Int*): Int = numbers.product

  override def findModulus(num1: Int, num2: Int): Int = num1 % num2

  override def findSquare(num: Int): Int = num * num
}


