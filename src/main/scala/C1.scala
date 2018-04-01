object C1 extends App {
 class A(x:Int){
   override def toString: String = "test"+x
 }
 val a = new A(1)
 println(a)
}
