package ControlStructuresAndFunctions

import java.time.LocalDate

trait Output {
    def print(s: String) = Console.println(s)
}

class ControlStructuresAndFunctions  extends Output{
    def multiply(args: Int*) : Int = {
        if(args.isEmpty) 1
        else multiply(args.tail: _*) * args.head
    }

    def countdown(n: Int)  = {
        for(i <- n to (0, -1)) yield i
    }

    // 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0.
    def countdownandprint(n: Int)  = {
        for(i <- n to (0, -1)) print(i+ "")
    }
}

object Helpers {
    /*
    11. Define a string interpolator date so that you can define a java.time.LocalDate as
    date"$year-$month-$day". You need to define an “implicit” class with a date method,
    like this:
    implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = . . .
    }
    args(i) is the value of the ith expression. Convert each to a string and then to
    an integer, and pass them to the LocalDate.of method. If you already know
    some Scala, add error handling. Throw an exception if there aren’t three
    arguments, or if they aren’t integers, or if they aren’t separated by dashes.
    (You get the strings in between the expressions as sc.parts.)
    */
    implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
        def date(args: Any*) : LocalDate = {
            try {
                if(args.length != 3) throw new IllegalArgumentException
                    ("There has to be three arguments")

                val (year, month, day) = (
                        args(0).toString.toInt, 
                        args(1).toString.toInt, 
                        args(2).toString.toInt)

                for(sep <- sc.parts) 
                    if(sep.length > 0 && !sep.equals("-")) 
                        throw new IllegalArgumentException("Arguments aren't seperated by dashes.")

                LocalDate.of(year, month, day)

            }
            catch {
                case ex: NumberFormatException => 
                    println("Not a valid date input")
                    throw ex
                case ex: IllegalArgumentException =>
                    throw ex
            }
        }
    }
}