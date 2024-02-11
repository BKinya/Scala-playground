package exercises

/*
 Find factorial of a given number using while loop
 */
def findFactorial(num: Int): Int = {
  /*
  4 = 4 * 3* 1
   */
  var currentNumber = num
  var factorial = 1
  while currentNumber > 0 do
    factorial = factorial * currentNumber
    currentNumber = currentNumber - 1
  factorial
  
}
