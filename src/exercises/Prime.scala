package exercises

import scala.annotation.tailrec

object Prime extends App {

  def isPrime(n: Int): Boolean = {

    @tailrec
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))

}
