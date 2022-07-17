import MapsAndTuples._
object HelloWorld extends App {
    println("Hello, world")
    val ins = new MapsAndTuples();
    val l = ins.countWords()
    for((k,v) <- l) println(k + " occurs " + v + "times.")
}