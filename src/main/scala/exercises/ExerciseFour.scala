package exercises

/*
 Write a Scala program to create a new string where 'if' is added to the front of a given string.
 If the string already begins with 'if', return the string unchanged.
 */

def stringManipulation(testText: String): String = {
  if testText.startsWith("if") then
    testText
  else testText.prependedAll("if")
}



