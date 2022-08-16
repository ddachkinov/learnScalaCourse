package lectures.part1basics

object Expressions extends App {
  val yearOfBirth = 1993
  val currentYear = 2020 + 2
  println(currentYear)
  println(2048-2*13)
  //+ - * / & | ^ << >> >>> (right shift with 0 extensions

  print("Is current year 2022? ")
  println(currentYear == 2022)

  //Logical operators < > <= >= && || ! == !=
  print("Is my Year of birth > current Year? ")
  println(currentYear > yearOfBirth)

  val isCurrentYearEven = currentYear %2 == 0
  val isCurrentYearOdd = !isCurrentYearEven

  var myAge = currentYear - yearOfBirth
  println(myAge)
  myAge += 1  // *= /= -=    side effects
  myAge -= 1 * 1
  print("What's my age again? ")
  println(myAge)

  val condition1 = true
  val condition1Value = if(condition1) 42 else 0
  println(condition1Value)

  //Unit
  val futureAge = (myAge = 35)
  println(futureAge)

  val legalAge = {
    16
    21
    18 //In code blocks Scala takes the last value in it
  }
  println(legalAge)

  val anotherCodeBlock = {
    val x = 1
    val z = x + 1
    if (z > 1) "two" else "mistake"
  }
  //val nextVal = z + 1   -> z can't be used outside of the code block it was defined

}
