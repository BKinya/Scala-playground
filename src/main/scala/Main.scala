import extractors.{ HobbitCompanion, HobbitName, Student, StudentCompanion}
import patternMatching.constantMatching

@main def hello(): Unit = {

  val newStudent = Student("Kotlin student", 91259, 99.00)

  //  val student = StudentCompanion("Scala Student", 91250, 99.00)
  val StudentCompanion(name: String, studentId: Int, score: Float) = newStudent
  //  val name = StudentCompanion.unapply(student).get._1
  //  val studentId = StudentCompanion.unapply(student).get._2
  //  val score = StudentCompanion.unapply(student).get._3
  println(s"Student name => $name")
  println(s"Student ID => $studentId")
  println(s"Student's Score is $score")
  //  val student1 = StudentCompanion.apply("Scala Student", 91250, 99.00)

  val hobbit = HobbitName(firstName = "Bilbo", lastName = "Baggins")
  val HobbitCompanion(firstName: String, lastName: String) = hobbit
  println(s"firstName => $firstName")
  println(s"lastname => $lastName")
}

def uapplyMatch(student: Student): Unit = {
  //  student match
  // try using student here and show the error
  // unapply method is used for constructor matching
  //    case StudentSample(_, _, age) => if(age>10)
  //      println("soooo young")
  //
  //    case s: Student =>
  //      println(s"Name is ${s.name}")


}



