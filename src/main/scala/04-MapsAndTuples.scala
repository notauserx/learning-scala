package MapsAndTuples

import com.typesafe.config._

class MapsAndTuples {
    def countWords() = {
        val wordCount : scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map()
        val in = new java.util.Scanner(new java.io.File("./src/main/scala/04-myfile.txt"))
        while (in.hasNext()) {
            val item = in.next()

            if(wordCount.contains(item))
                wordCount(item) += 1
            else wordCount(item) = 1
        }
        wordCount
    }

    def readFile() = {
        val conf = ConfigFactory.load()

        val fileName = conf.getString("app.mapsandtuplesFilePath")
        val words = """([A-Za-z])+""".r
        io.Source.fromFile(fileName)
            .getLines
            .flatMap(words.findAllIn)
            .toList     
    }


    // ex 2
    def countWords(source : List[String]) = {

        val wordCount : scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map()
        for(item <- source) {
            if(wordCount.contains(item))
                wordCount(item) += 1
            else wordCount(item) = 1 
        }
        wordCount
    }

    // ex 3
    def countWordsWithImmutableMap(source: List[String]) = {
        var wordCount : Map[String, Int] = Map();

        for(item <- source) {
            if(wordCount.contains(item)) {
                val newCount : Int = wordCount(item) + 1
                // cannot get wordCount += (item ->  wordCount(item) + 1) to work
                wordCount += (item ->  newCount)
            }
            else wordCount += (item -> 1)
        }
        wordCount


    }
    
}