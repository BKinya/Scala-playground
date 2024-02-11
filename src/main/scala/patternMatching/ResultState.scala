package patternMatching

sealed trait NetworkResultState

case class Content(content: String) extends NetworkResultState
case class NetworkError(message: String) extends NetworkResultState
case class NetworkException(message: String) extends NetworkResultState // inline classes in Scala?


