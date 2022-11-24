package w3Basic

object check_Integer {

  def test(x:Int, y:Int) : Boolean = {
      x == 30 || y == 30 || x+y == 30;
  }

  def main(args: Array[String]): Unit = {
    println("Result = " + test(30,1));
    println("Result = " + test(30,30));
    println("Result = " + test(20,2));
    println("Result = " + test(25,5));
  }
}
