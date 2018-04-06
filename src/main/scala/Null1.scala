object Null1 {
  def main(args: Array[String]): Unit = {
    var x:Null = null
    println(x)
    if (Math.PI==3.14+1/3)
      x = new throw RuntimeException

    val y:String=x
    println(y)
  }

}
