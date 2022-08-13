package lectures.part1basics

object ValuesVariablesTypes extends App{
  val x = 42
  println(x)

  //  x = 2
  //vals are immutable
  //compiler can infer types
  //type of val and its assignment should match

  val aString: String = "Hi there";
  val aBoolean: Boolean = true
  val aChar: Char = 'A'
  val anInt: Int = x
  val aShort: Short = 213 //2B instead of 4B Int
  val aLong: Long = 53231 //8B, you can put "L" in the end
  val aFloat: Float = 2.0f // f in the end
  val aDouble: Double = 3.1415

  //variables

  var aVariable: Int = 4
  aVariable = 5 //side effects


}
