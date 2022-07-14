package ControlStructuresAndFunctions

object Exercises {
    def multiply(args: Int*) : Int = {
        if(args.isEmpty) 1
        else multiply(args.tail: _*) * args.head
    }
}