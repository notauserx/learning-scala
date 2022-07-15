package WorkingWithArrays

import scala.collection.mutable.ArrayBuffer
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

    // test for ex 4

    test("random array splits into positive and negetive") {
        ins.splitPositiveAndNonPositive(Array(1,-1,2,3,4,-2,-3, 0, 56)) should equal (Array(1, 2, 3, 4, 56, -1, -2, -3, 0))
    }

    // test for ex 7

    test("removeDups with   (1,1,1,2,2,2) returns (1,2)") {
        ins.removeDups(Array(1,1,1,2,2,2)) should equal (Array(1,2))
    }

    // test for ex 8

    test("removeAllButTheFirstNegetive with (-1,1,-2,2,-3,0) returns (-1,1,2,0)") {
        ins.removeAllButTheFirstNegetive(ArrayBuffer(-1,1,-2,2,-3,0)) should equal (ArrayBuffer(-1,1,2,0))
    }

}