package calculator

object Polynomial {
  def computeDelta(a: Signal[Double], b: Signal[Double],
      c: Signal[Double]): Signal[Double] = {
    Signal {
      b.apply()*b.apply() - 4*a.apply()*c.apply()
    }

    // 5x² + 6x + 1 = 0
    // a = 5, b = 6, c = 1
    // 36 - 20
    // 16
  }

  def computeSolutions(a: Signal[Double], b: Signal[Double],
      c: Signal[Double], delta: Signal[Double]): Signal[Set[Double]] = {
    //    when b2 - 4ac is positive, we get two Real solutions
    //    when it is zero we get just ONE real solution (both answers are the same)
    //    when it is negative we get two Complex solutions

//    read https://www.mathsisfun.com/algebra/quadratic-equation.html


      // (-b ± √Δ) / 2a
    if (delta.apply() % 2 == 0.0)
      Signal {
//        Set((-b.apply() + square root of delta ) / 2 * a.apply())
      }
    ???
  }
}
