package extractors


class Student(val name: String, val studentId: Int, val score: Float)

object StudentCompanion:
//  def apply(name: String, studentId: Int, score: Float) =
//    new Student(name, studentId, score)


  def unapply(student: Student): Option[(String, Int, Float)] =
    Some(student.name, student.studentId, student.score)



class HobbitName(val firstName: String, val lastName: String)

object HobbitCompanion:
  def unapplySeq(hobbit: HobbitName): Option[List[String]]= {
    Option(List(hobbit.firstName, hobbit.lastName))
  }

