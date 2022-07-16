### Notes from Maps and Tuples

- Highlights
    - syntax for creating, querying and traversing maps
    - mutable and immutable maps
    - hash map by default, but tree map is also available
    - interop btw scala and java maps
    - Tuples for aggregating values


#### Constructing a map

```scala


// Immutable map
val numbers = Map(1 -> "one", 2 -> "two")

// map is a collection of pairs, another way to declare
val things = Map((1,"one"), (2, "two"))

// mutable map
val mutableTens = scala.collection.mutable.Map(10 -> "ten", 11 -> "eleven")

// empty map
val empty: Map[Int, String] = Map()

```

#### Accessing Map values

```scala

val one = numbers(1)
val three = if(numbers.contains(3)) numbers(3) else "none"
val four = numbers.getOrElse(4, "none")


```

#### Updating map values

```scala

// can update mutable maps
val mutThings = scala.collection.mutable.Map((1,"one"), (2, "twu"))
things(2) = "two"
things += (3 -> "three", 4 -> "four")
things -= 4

// new maps has to be created for immutable maps

val moreThings = things + (3 -> "three", 4 -> "four")

// or using var

var countMap = Map (1 -> 2, 2 -> 3)
countMap = countMap + (1 -> 3, 3 -> 1)
countMap -= 3

```

#### Iterating

```scala

for((k, v) <- countMap) println(k + " maps to " + v)

for(i <- countMap.keySet) println(i)
for(i <- countMap.values) println(i)

// to reverse a map

for((k,v) <- countMap) yield (v,k)

```

#### Sorted Maps

scala.collection.mutable.SortedMap for sorted map with Hash table
scala.collection.mutable.LinkedHashMap lets you visit the map with the insertion order

#### Tuples

```scala

val t = (1, "2", 3.0)

// indexing starts with 1
val first = t _1 // or use t._1

val (f,s,t) = t // sets f to 1, s to "2" and t to 3.0

```