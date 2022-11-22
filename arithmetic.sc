def am(firstElement: Int, ratio: Int, numberOfElements: Int): List[Int] =  {
  def loop(accum: List[Int], currentNumber: Int, i: Int): List[Int] = {
    if (i == numberOfElements) {
      return accum
    }
    else {
      var newList = accum :+ (currentNumber)
      return loop(newList, currentNumber + ratio, i + 1)
    }
  }

  loop(List(), firstElement, 0)
}
am(2,3,4)