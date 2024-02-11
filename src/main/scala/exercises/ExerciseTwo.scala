package exercises

/*
Write a program to compute the sum of two integer values. If two values are
return the triple of their sum
*/

def computeSum(num1: Int, num2: Int): Int = {
  val sum = num1 + num2
  if num1 == num2 then
    sum * 3
  else sum

}
