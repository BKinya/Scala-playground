package domainModeling

/**
 * Method accepting variable number of parameters
 */
trait BasicCalculator {
    val test = "See how things are"
    def add(num1: Int, num2: Int): Int
    def subtract (num1: Int, num2: Int): Int
    def multiply (num1: Int, num2: Int): Int
    def divide (num1: Int, num2: Int): Int
    def showName: String = "Hello Trait"

}

trait AdvanceCalculator{
    def addAll(numbers: Int*): Int
    def multiplyAll(number: Int*): Int
    def findModulus(num1: Int, num2: Int): Int
    def findSquare(num: Int): Int

}


trait ComposedCalculator extends BasicCalculator, AdvanceCalculator

