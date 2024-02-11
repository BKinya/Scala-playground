package exercises

import scala.math.abs

/*
* Write a Scala program to get the absolute difference between n and 51.
*  If n is greater than 51 return triple the absolute difference.
 */

def findAbsoluteDifference(num: Int): Int = {
  val diff = abs(num - 51)
  if num > 51 then
    diff * 3
  else diff

}


