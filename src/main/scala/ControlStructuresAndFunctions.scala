package ControlStructuresAndFunctions

trait Output {
    def print(s: String) = Console.println(s)
}

class ControlStructuresAndFunctions  extends Output{
    def multiply(args: Int*) : Int = {
        if(args.isEmpty) 1
        else multiply(args.tail: _*) * args.head
    }

    // 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0.
    def countdown(n: Int)  = {
        for(i <- n to (0, -1)) yield i
    }

    def countdownandprint(n: Int)  = {
        for(i <- n to (0, -1)) print(i+ "")
    }
}
