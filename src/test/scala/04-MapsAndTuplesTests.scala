package MapsAndTuples

import scala.collection.mutable.ArrayBuffer
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._
import matchers.should._

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

}