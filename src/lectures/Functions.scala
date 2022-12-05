package lectures

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else  aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello\n",5))

}
