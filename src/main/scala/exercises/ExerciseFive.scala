package exercises

/*
Write a Scala program to create a new string with the last char
added at the front and back of a given string of length 1 or more.
 */
// What if the length is zero??
/**
 * 
 * @param testText
 * @return
 */
def swapCharacters(testText: String): String = {
  if testText.nonEmpty then 
    val char1 = testText.charAt(0)
    val char2 = testText.last
    val result = char2.toString + testText.subSequence(1, testText.length - 1) + char1
    result
  else throw Exception("Invalid String")
}