package de.klotzsche.rdpc.easy.ch1

import scala.io.StdIn.readLine

object ch1 extends App{

  val name = readLine("Enter your name: ")
  val age = readLine("Enter your age: ")
  val username = readLine("Enter your username: ")

  println(s"Your name is $name, you are $age years old, and your username is $username")

}
