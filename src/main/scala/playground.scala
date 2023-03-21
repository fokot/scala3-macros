package playground
/**
 * This file is a place where we can experiment with macros defined elsewhere. This is necessary
 * because we can't invoke a macro in the file it is defined in.
 *
 * To try a method from `sbt`, call:
 * sbt> runMain playground.run
 */

//@main
//def run(): Unit =
//  val body: Int => Unit = number => println(number)
//  println(quotesAndSplices.exercise18.unroll(3) { i => body(i) })

case class Person(name: String, age: Int)

@main
def run(): Unit =
  reflectionAndTrees.exercise6.explore(5)
  reflectionAndTrees.exercise6.explore(new Person("Batman", 33))
  println(reflectionAndTrees.exercise7.companion[Person].eq(Person))
//  reflectionAndTrees.exercise5.typeReflect[X]
//  val body: Int => Unit = number => println(number)
//  reflectionAndTrees.exercise2.inspect("foo".substring(2))


object experimental:
  val _ = ()