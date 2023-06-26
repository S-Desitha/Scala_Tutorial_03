object ReverseString {
  def reverseString(input: String): String = 
  {
    if (input.length <= 1)
    {
      input 
    }
    else 
    {
      reverseString(input.tail) + input.head
    }
  }

  def main(args: Array[String]): Unit = 
  {
    val value = "Hello World!"
    val reversed = reverseString(value)
    println(reversed) 
  }
}
