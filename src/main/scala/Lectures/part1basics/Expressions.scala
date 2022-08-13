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

  var myAge = currentYear - yearOfBirth
  println(myAge)
  myAge += 1  // *= /= -=    side effects
  println(myAge)




}
