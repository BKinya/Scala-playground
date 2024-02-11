package exercises
/*
Write a Scala program to create a new string which is 4 copies of the 2 front characters of a given string.
If the given string length is less than 2 return the original string.
 */

def generateString(someText: String): String = {
  if someText.length < 2 then
    someText
    else
    val newString = (someText.substring(0, 2)) * 4
    newString

}


