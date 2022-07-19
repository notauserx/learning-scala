package MapsAndTuples

import scala.collection.mutable.ArrayBuffer
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._
import matchers.should._
import org.scalatest.prop.TableDrivenPropertyChecks._

class MapsAndTuplesTests extends AnyFunSuite with Matchers{
    
    val ins = new MapsAndTuples()
    

    test("mutable map should capture word frequencies") {
        val words = "a"::"simple"::"test"::"for"::"a"::"map"::Nil

        val freq = ins.countWords(words);

        freq should equal (Map("a" -> 2, "simple" -> 1, "test" -> 1, "for"-> 1, "map" -> 1))
    }

    test("immutable map should capture word frequencies") {
        val words = "a"::"simple"::"test"::"for"::"a"::"map"::Nil

        val freq = ins.countWordsWithImmutableMap(words);

        freq should equal (Map("a" -> 2, "simple" -> 1, "test" -> 1, "for"-> 1, "map" -> 1))
    }

    test("sorted map should capture sorted word frequencies") {
        val words = "a"::"simple"::"test"::"for"::"a"::"map"::Nil

        val freq = ins.countWordsWithImmutableMap(words);

        print(freq)

        freq should equal (Map("a" -> 2, "for"-> 1, "map" -> 1, "simple" -> 1, "test" -> 1))
    }
    
    test("iteqgt returns 1,1,1 for [1,2,3] and 2") {
        val testCases = Table (
            ("values", "target", "expected"),
            (Array(1,1,1), 1, (0,3,0)),
            (Array(1,2,3), 2, (1,1,1)),
            (Array(1,1,2,2,2,3,3,3,3), 2, (2,3,4)),
            (Array[Int](), 1, (0,0,0))
        )

        forAll (testCases) { (values: Array[Int], target: Int, expected: (Int, Int, Int)) =>
            val result = ins.lteqgt(values, target)
            result should be (expected)

        }


        
    }
}