package w3Basic

object check_Range {

  def test(x:Int) : Boolean = {
        Math.abs(100 - x) <=20 || Math.abs(300 - x) <=20
  }

  def main(args: Array[String]): Unit = {
    println("Result = " + test(115));
    println("Result = " + test(250));
    println("Result = " + test(80));
    println("Result = " + test(320));
  }
}
