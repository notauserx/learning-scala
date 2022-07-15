

## Notes for Working with Arrays

### Key points

- Array 
    - mutable
    - not resizable
    - specialized for built in value types
    - scala and java arrays are interoperable
    - use a.toBuffer to get an ArrayBuffer from array a

- ArrayBuffer 
    - mutable 
    - resizable
    - prepend is slow, append is efficient
    - use b.toArray on ArrayBuffer to get an array from an ArrayBuffer b

- to access elements use ()
- don't use new on initializing
```
val s = Array(1,2)
```
- for traversal -> for(elem <-arr)
- (elem <- arr if . . . ) . . . yield . . . for transforming into a new array
    - or use filter and map

#### Common algorithms

- sum
```
Array(1 to 10: _*).sum
```
- min and max
```
Array(1 to 10: _*).min
```
- sorted
    - comparison function can be provided
```
Array(1 to 10: _*).sortWith(_ > _)
```
- mkString
```
Array(1 to 10: _*).mkString
```

#### MultiDimensional Arrays

- array of arrays
```
val matrix = Array.ofDim[Double](3, 4) // Three rows, four columns
maxtix(0)(1) = 12
```
- jagged arrays, with varying row lengths
```
val jag = new Array[Array[Int]](10)
```



#### Interop with Java

- Arrays are interoperable. you can pass them back and forth btw java and scala.
- For ArrayBuggers
    - import the implicit conversion methods in scala.collection.JavaConversions