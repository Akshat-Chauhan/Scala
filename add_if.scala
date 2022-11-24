package w3Basic

object add_if {

  def test(x:String) : String = {;
    if (x.startsWith("if")) x else "if " + x;
  }

  def main(args: Array[String]): Unit = {
    println("Result = " + test("Lets go"));
    println("Result = " + test("if there was someone"));
  }
}
