object Main {
  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f
    var g: Float = 4.0f

   //a
    b-=1 //--b
    println(b*a+c*d)  //24
    d-=1 //d--

    //b
    println(a)  //2
    a+=1 //a++

    //c
    println(-2 * (g-k)+c)   //4.6000004

    //d
    println(c)  //4
    c+=1 //c++

    //e
    println(c*a)  //15 (no need to increment c, because in (d) part c incremented)
    a+=1  //a++
  }
}
