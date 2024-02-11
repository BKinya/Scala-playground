package exercises

def multiplicationTable(num: Int): Unit = {
    for i <- 1 to 9 do
      println(s"product => ${i *num}")
}


def table2(num: Int): Seq[Int] ={
  val list: IndexedSeq[Int] = 
    for i <- 1 to 9 
    yield i * num
    
  println(s"list is $list")
  list
}