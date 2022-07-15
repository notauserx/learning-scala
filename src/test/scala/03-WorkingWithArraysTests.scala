package WorkingWithArrays

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._
import matchers.should._

class WorkingWithArraysTests extends AnyFunSuite with Matchers {
    val ins = new WorkingWithArrays()
    // test exercise 2
    test("array swap with single element") {
        var prob = Array(1)
        ins.swapAdjacent(prob) 
        print(prob)
        prob should equal (Array(1))

    }

    test("array swap with two elements") {
        var prob = Array(1,2)
        ins.swapAdjacent(prob) 
        prob should equal (Array(2,1))

    }
}