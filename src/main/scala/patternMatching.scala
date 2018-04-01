object patternMatching extends App {
  class A(val x:Int,val y:String){

  }
  object A {
    def unapply(a: A): Option[(Int,String)] = Some(a.x,a.y)
  }
  val a = new A(1,"hello world")
  a match {
    case  A(x,y) => println(y)
    case _       => println("_")
  }
}
