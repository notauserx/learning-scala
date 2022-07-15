package ControlStructuresAndFunctions

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._
import matchers.should._
 
trait MockOutput extends Output {
    var messages: Seq[String] = Seq()

    override def print(s: String) = messages = messages :+ s
}

class ControlStructuresAndFunctionsTests extends AnyFunSuite with Matchers{
    val ins = new ControlStructuresAndFunctions with MockOutput

    // test
    test("the result of 5 times 4 times 3 times 2 times 1 is 120") {
        
        val result = ins.multiply(1,2,3,4,5)
        assert(result == 1*2*3*4*5)
    }

    // test exercise 5

    test("countdown(10) outputs a sequence from 10 to 1") {
        val result = ins.countdown(10)
        val expected =  Vector(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

        assert(result == expected)
    }


    // test exercise 5

    test("countdownandprint(10) prints \"109876543210\"") {
        val inslocal = new ControlStructuresAndFunctions with MockOutput

        val result = inslocal.countdownandprint(10)
        val expected =  "10 9 8 7 6 5 4 3 2 1 0 "


        inslocal.messages should contain theSameElementsAs List("10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "0")
        
    }




}