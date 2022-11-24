package w3Basic

object absolute_difference {

    def test(n:Int) : Int = {
        val abs_diff = Math.abs(n-51)
      if (n > 51) abs_diff*3 else abs_diff
    }

  def main(args: Array[String]): Unit = {
    println("Result = " + test(10));
    println("Result = " + test(60));
  }
}
