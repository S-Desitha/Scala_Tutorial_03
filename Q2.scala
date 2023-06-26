object SelectStrings 
{
  def SelectStrings(list: List[String]): List[String] = 
  {
    list.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = 
  {
    val colors = List("Red", "Orange", "Blue", "Purple", "Brown","Maroon")
    val selectedStrings = SelectStrings(colors)
    println(selectedStrings)
  }
}
