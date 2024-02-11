package exercises

/*
 Write a Scala program to check whether two given positive integers have the same last digit.
 */

def hasMatchingLastDigits(num1: Int, num2: Int): Boolean ={
  num1.toString.last == num2.toString.last
}
