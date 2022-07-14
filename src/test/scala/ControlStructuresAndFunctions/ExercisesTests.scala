package ControlStructuresAndFunctions

import org.scalatest.funsuite.AnyFunSuite

class ExercisesTests extends AnyFunSuite {
    // test
    test("the result of 5 times 4 times 3 times 2 times 1 is 120") {
        val result = Exercises.multiply(1,2,3,4,5)
        assert(result == 1*2*3*4*5)
    }


}