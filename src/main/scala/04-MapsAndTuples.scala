package MapsAndTuples

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
}