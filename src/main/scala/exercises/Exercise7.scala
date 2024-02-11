package exercises

/*
Write a Scala program to check whether a
given character presents in a string between 2 to 4 times
 */

def howManyTimes(someText: String, char: Char): Boolean = {
  /*
  Option 1... iterate through the string counting the number of occurences
   */

  val newLength = someText.count(x => x == char)
  newLength >= 2 && newLength <= 4


}


