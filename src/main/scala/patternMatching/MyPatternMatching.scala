package patternMatching

def simpleMatching(num: Int): String = {
  num match
    case 0 => "zero"
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Greater then three"
}

def evaluateResultState(state: NetworkResultState): Unit = {
  state match // I just want to match the types ... maybe more than types ... constructor matching
    // I guess this is what uses destructuring
    // I guess this enables me to use pattern guards
    // I think pattern guards are like filters on lists
    // Koltin does not have this by design
    case Content(content) => println(s"content is $content")
    case NetworkError(message) => println(s"message is ${message}")
    case NetworkException(message) => println(s"exception is $message")

}

def evaluateResultState1(state: NetworkResultState): Unit = {
  state match // I just want to match the types ... maybe more than types
    case c: Content => println(s"content is ${c.content}")
    case ne: NetworkError => println(s"message is ${ne.message}")
    case nx: NetworkException => println(s"exception is ${nx.message}")

}

def constantMatching(constant: Any): String = {// Exhaustive
  constant match // Scala does not enforce exhaustive evaluation out of the box on constants.. why
    // so error prone
    case 1 => " I am a number"
    case true => "I a boolean"
    case "some text" => "I am a string"
    case 10L => "I am a Long"
    case _ => "Unknown case"


}


