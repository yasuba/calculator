package calculator

object Polynomial {
  def computeDelta(a: Signal[Double], b: Signal[Double],
      c: Signal[Double]): Signal[Double] = Signal {
      b()*b() - 4*a()*c()
  }

  def computeSolutions(a: Signal[Double], b: Signal[Double],
      c: Signal[Double], delta: Signal[Double]): Signal[Set[Double]] = {
    delta() match {
      case d if d == 0.0 => Signal {
          Set((-b() + math.sqrt(delta())) / (2 * a()))
        }
      case d if d > 0.0 => Signal {
          Set((-b() + math.sqrt(delta())) / (2 * a()),
            (-b() - math.sqrt(delta())) / (2 * a()))
        }
      case _ => Signal {
        Set(0.0, 1.0) // why won't this work?
      }
    }
  }
}
