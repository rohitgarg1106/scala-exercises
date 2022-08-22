package lec1


object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2));
  println(str.length);
  println(str.replace(' ', '-'));
  println(str.toLowerCase());
  println(str.startsWith("Hello"));

  val aNumberString = "2";
  val aNumber = aNumberString.toInt;
  println('a' +: aNumberString :+ 'z');
  println(str.reverse);
  println(str.take(2));

  val name = "David";
  val age = 12;

  println()

  val speed = 1.2f
  val name2 = "Daniel"
  val myth = f"$name2 can eat $speed%2.2f burgers per minute"

  println(myth);


}
