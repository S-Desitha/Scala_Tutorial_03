object Average {
  def Avg(num1: Int, num2: Int): Double = { 
    val average = (num1 + num2)/ 2.0
    val round = BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    round
  }

  def main(args: Array[String]): Unit = {
    val num1 = 23
    val num2 = 48
    val average = Avg(num1, num2)
    println(average) 
  }
}
