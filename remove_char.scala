package w3Basic

object remove_char {

  def test(x:String, y:Int) : String = {
      x.take(y) + x.drop(y+1)
  }

  def main(args: Array[String]): Unit = {
    println("Result = " + test("Scala", 1));
    println("Result = " + test("Scala",2));
  }
}
