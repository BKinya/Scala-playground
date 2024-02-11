package exercises


def fibonnanciSeries(count: Int): Unit = {
  /**
   * 0 1 1 2 3 5  8 13 21
   */
  var counter = count
  var num1 = 0 // 1, 1
  var num2 = 1 // 1, 2
  while counter > 0 do
    println(s"Num is $num1")
//    println(s"Num 2 is $num2")
    val oldNum1 = num1
    num1 = num2

    num2 = num2 + oldNum1

    counter = counter - 1

}


