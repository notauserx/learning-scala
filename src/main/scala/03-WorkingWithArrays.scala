package WorkingWithArrays

class WorkingWithArrays {
    /* Ex 2
    //  Write a loop that swaps adjacent elements of an array of integers. For example,
    //  Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
    */
    def swapAdjacent(a : Array[Int]) = {
        for (i <- 0 until a.length if i % 2 == 1) {val t = a(i); a(i) = a(i-1); a(i-1) = t }
    }

    def swapAdjacentAndReturn(a : Array[Int]) : Array[Int] = {
        for (i <- 0 until a.length if i % 2 == 1) {val t = a(i); a(i) = a(i-1); a(i-1) = t }
        a
    }

    /* Ex 4
        Given an array of integers, produce a new array that contains all positive values 
        of the original array, in their original order, followed by all values that are 
        zero or negative, in their original order.
    */

    def splitPositiveAndNonPositive(a : Array[Int]) = a.filter(_ > 0) ++ a.filter(_ <= 0)
}
