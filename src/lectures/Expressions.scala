package lectures

object Expressions extends App {

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF Expression
  println(aConditionedValue)

  val aCodeBlock = {
    val z = 2

    if (z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)


}

// Avoid using While and for loops like plague! Everything in Scala is an expression!