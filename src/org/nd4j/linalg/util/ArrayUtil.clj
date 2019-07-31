(ns org.nd4j.linalg.util.ArrayUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util ArrayUtil]))

(defn *reverse-copy
  "Create a backwards copy of the given array

  e - the array to createComplex a reverse clone of - `int[]`

  returns: the reversed copy - `int[]`"
  ([e]
    (ArrayUtil/reverseCopy e)))

(defn *arg-min
  "Returns the index of the minimum value in the array.
  If two entries have same minimum value, index of the first one is returned.

  in - `int[]`

  returns: `int`"
  (^Integer [in]
    (ArrayUtil/argMin in)))

(defn *to-long-array
  "int-array - `int[]`

  returns: `long[]`"
  ([int-array]
    (ArrayUtil/toLongArray int-array)))

(defn *range
  "Returns a subset of an array from 0 to \"to\"
  using the specified stride

  data - the data to getFromOrigin a subset of - `double[]`
  to - the end point of the data - `int`
  stride - the stride to go through the array - `int`
  num-elements-each-stride - the number of elements to collect at each stride - `int`

  returns: the subset of the data specified - `double[]`"
  ([data ^Integer to ^Integer stride ^Integer num-elements-each-stride]
    (ArrayUtil/range data to stride num-elements-each-stride))
  ([data ^Integer to ^Integer stride]
    (ArrayUtil/range data to stride))
  ([data ^Integer to]
    (ArrayUtil/range data to)))

(defn *to-doubles
  "ints - `int[]`

  returns: `double[]`"
  ([ints]
    (ArrayUtil/toDoubles ints)))

(defn *to-halfs
  "data - `float[]`

  returns: `short[]`"
  ([data]
    (ArrayUtil/toHalfs data)))

(defn *min
  "Returns the minimum value in the array

  in - `int[]`

  returns: `int`"
  (^Integer [in]
    (ArrayUtil/min in)))

(defn *sum-long
  "add - `long`

  returns: `long`"
  (^Long [^Long add]
    (ArrayUtil/sumLong add)))

(defn *to-floats
  "ints - `int[][]`

  returns: `float[]`"
  ([ints]
    (ArrayUtil/toFloats ints)))

(defn *remove-index
  "Return a copy of this array with the
  given index omitted
  PLEASE NOTE: index to be omitted must exist in source array.

  data - the data to copy - `int[]`
  index - the index of the item to remove - `int`

  returns: the new array with the omitted
  item - `int[]`"
  ([data ^Integer index]
    (ArrayUtil/removeIndex data index)))

(defn *arg-min-of-sum
  "first - `int[]`
  second - `int[]`

  returns: `int`"
  (^Integer [first second]
    (ArrayUtil/argMinOfSum first second)))

(defn *calc-offset
  "Compute the offset
  based on teh shape strides and offsets

  shape - the shape to compute - `java.util.List`
  offsets - the offsets to compute - `java.util.List`
  strides - the strides to compute - `java.util.List`

  returns: the offset for the given shape,offset,and strides - `int`"
  (^Integer [^java.util.List shape ^java.util.List offsets ^java.util.List strides]
    (ArrayUtil/calcOffset shape offsets strides)))

(defn *combine-double
  "Combines a apply of int arrays in to one flat int array

  nums - the int arrays to combineDouble - `java.util.List`

  returns: one combined int array - `double[]`"
  ([^java.util.List nums]
    (ArrayUtil/combineDouble nums)))

(defn *copy-of-range-from
  "Generate an array from 0 to length
  and generate take a subset

  length - the length to generate to - `int`
  from - the begin of the interval to take - `int`
  to - the end of the interval to take - `int`

  returns: the generated array - `int[]`"
  ([^Integer length ^Integer from ^Integer to]
    (ArrayUtil/copyOfRangeFrom length from to)))

(defn *to-outcome-array
  "outcome - `int`
  num-outcomes - `int`

  returns: `int[]`"
  ([^Integer outcome ^Integer num-outcomes]
    (ArrayUtil/toOutcomeArray outcome num-outcomes)))

(defn *of
  "arr - `int`

  returns: `int[]`"
  ([^Integer arr]
    (ArrayUtil/of arr)))

(defn *keep
  "Return a copy of this array with only the
  given index(es) remaining

  data - the data to copy - `int[]`
  index - the index of the item to remove - `int`

  returns: the new array with the omitted
  item - `int[]`"
  ([data ^Integer index]
    (ArrayUtil/keep data index)))

(defn *zero?
  "Returns true if any of the elements are zero

  as - `int[]`

  returns: `boolean`"
  (^Boolean [as]
    (ArrayUtil/isZero as)))

(defn *to-ints
  "data - `float[]`

  returns: `int[]`"
  ([data]
    (ArrayUtil/toInts data)))

(defn *copy
  "copy - `int[]`

  returns: `int[]`"
  ([copy]
    (ArrayUtil/copy copy)))

(defn *shuffle-with-map
  "objects - `java.util.List`
  map - `int[]`

  returns: `<T> void`"
  ([^java.util.List objects map]
    (ArrayUtil/shuffleWithMap objects map)))

(defn *any-larger-than
  "arrs - `int[]`
  check - `int`

  returns: `boolean`"
  (^Boolean [arrs ^Integer check]
    (ArrayUtil/anyLargerThan arrs check)))

(defn *greater-than
  "target - `int[]`
  test - `int[]`

  returns: `boolean`"
  (^Boolean [target test]
    (ArrayUtil/greaterThan target test)))

(defn *to-int-array
  "byte-array - `byte[]`

  returns: `int[]`"
  ([byte-array]
    (ArrayUtil/toIntArray byte-array)))

(defn *n-times
  "Repeat a value n times

  n - the number of times to repeat - `int`
  to-replicate - the value to repeat - `int`

  returns: an array of length n filled with the
  given value - `int[]`"
  ([^Integer n ^Integer to-replicate]
    (ArrayUtil/nTimes n to-replicate)))

(defn *float-copy-of
  "data - `double[]`

  returns: `float[]`"
  ([data]
    (ArrayUtil/floatCopyOf data)))

(defn *dot-product
  "xs - `java.util.List`
  ys - `java.util.List`

  returns: `int`"
  (^Integer [^java.util.List xs ^java.util.List ys]
    (ArrayUtil/dotProduct xs ys)))

(defn *double-copy-of
  "data - `float[]`

  returns: `double[]`"
  ([data]
    (ArrayUtil/doubleCopyOf data)))

(defn *prod
  "Product of an int array

  mult - the elementsto calculate the sum for - `java.util.List`

  returns: the product of this array - `int`"
  (^Integer [^java.util.List mult]
    (ArrayUtil/prod mult)))

(defn *sum
  "Sum of an int array

  add - the elementsto calculate the sum for - `java.util.List`

  returns: the sum of this array - `int`"
  (^Integer [^java.util.List add]
    (ArrayUtil/sum add)))

(defn *dot-product-long-2
  "xs - `java.util.List`
  ys - `java.util.List`

  returns: `long`"
  (^Long [^java.util.List xs ^java.util.List ys]
    (ArrayUtil/dotProductLong2 xs ys)))

(defn *plus
  "ints - `int[]`
  mult - `int`

  returns: `int[]`"
  ([ints ^Integer mult]
    (ArrayUtil/plus ints mult)))

(defn *reverse
  "Reverse the passed in array in place

  e - the array to reverse - `int[]`"
  ([e]
    (ArrayUtil/reverse e)))

(defn *to-double
  "Cast an int array to a double array

  arr - the array to cast - `int[][]`

  returns: the elements of this
  array cast as an int - `double[][]`"
  ([arr]
    (ArrayUtil/toDouble arr)))

(defn *read-float
  "length - `int`
  dis - `java.io.DataInputStream`

  returns: `float[]`

  throws: java.io.IOException"
  ([^Integer length ^java.io.DataInputStream dis]
    (ArrayUtil/readFloat length dis)))

(defn *to-half
  "data - `float`

  returns: `short`"
  (^Short [^Float data]
    (ArrayUtil/toHalf data)))

(defn *max
  "Returns the maximum value in the array

  in - `int[]`

  returns: `int`"
  (^Integer [in]
    (ArrayUtil/max in)))

(defn *all-unique
  "Returns true if all of the elements in the
  given int array are unique

  to-test - the array to test - `int[]`

  returns: true if all o fthe items
  are unique false otherwise - `boolean`"
  (^Boolean [to-test]
    (ArrayUtil/allUnique to-test)))

(defn *build-interleaved-vector
  "rng - `java.util.Random`
  length - `int`

  returns: `int[]`"
  ([^java.util.Random rng ^Integer length]
    (ArrayUtil/buildInterleavedVector rng length)))

(defn *assert-square
  "d - `double[]`"
  ([d]
    (ArrayUtil/assertSquare d)))

(defn *multiply-by
  "Multiply the given array
  by the given scalar

  arr - the array to multily - `int[]`
  mult - the scalar to multiply by - `int`"
  ([arr ^Integer mult]
    (ArrayUtil/multiplyBy arr mult)))

(defn *permute
  "Permute the given input
  switching the dimensions of the input shape
  array with in the order of the specified
  dimensions

  shape - the shape to permute - `int[]`
  dimensions - the dimensions - `int[]`

  returns: `int[]`"
  ([shape dimensions]
    (ArrayUtil/permute shape dimensions)))

(defn *offset-for
  "Calculate the offset for a given stride array

  stride - the stride to use - `int[]`
  i - the offset to calculate for - `int`

  returns: the offset for the given
  stride - `int`"
  (^Integer [stride ^Integer i]
    (ArrayUtil/offsetFor stride i)))

(defn *read
  "length - `int`
  dis - `java.io.DataInputStream`

  returns: `double[]`

  throws: java.io.IOException"
  ([^Integer length ^java.io.DataInputStream dis]
    (ArrayUtil/read length dis)))

(defn *array-shape
  "Calculate the shape of an arbitrary multi-dimensional array. Assumes:
  (a) array is rectangular (not ragged) and first elements (i.e., array[0][0][0]...) are non-null
  (b) First elements have > 0 length. So array[0].length > 0, array[0][0].length > 0, etc.
  Can pass any Java array opType: double[], Object[][][], float[][], etc.
  Length of returned array is number of dimensions; returned[i] is size of ith dimension.

  array - `java.lang.Object`

  returns: `int[]`"
  ([^java.lang.Object array]
    (ArrayUtil/arrayShape array)))

(defn *list-of-ints-contains
  "Proper comparison contains for list of int
  arrays

  list - the to search - `java.util.List`
  target - the target int array - `int[]`

  returns: whether the given target
  array is contained in the list - `boolean`"
  (^Boolean [^java.util.List list target]
    (ArrayUtil/listOfIntsContains list target)))

(defn *build-half-vector
  "rng - `java.util.Random`
  length - `int`

  returns: `int[]`"
  ([^java.util.Random rng ^Integer length]
    (ArrayUtil/buildHalfVector rng length)))

(defn *value-starting-at
  "Create a copy of the given array
  starting at the given index with the given length.
  The intent here is for striding.
  For example in slicing, you want the major stride to be first.
  You achieve this by taking the last index
  of the matrix's stride and putting
  this as the first stride of the new ndarray
  for slicing.
  All of the elements except the copied elements are
  initialized as the given value

  value-starting - the starting value - `int`
  copy - the array to copy - `int[]`
  idx-from - the index to start at in the from array - `int`
  idx-at - the index to start at in the return array - `int`
  length - the length of the array to create - `int`

  returns: the given array - `int[]`"
  ([^Integer value-starting copy ^Integer idx-from ^Integer idx-at ^Integer length]
    (ArrayUtil/valueStartingAt value-starting copy idx-from idx-at length)))

(defn *calc-offset-long-2
  "shape - `java.util.List`
  offsets - `java.util.List`
  strides - `java.util.List`

  returns: `long`"
  (^Long [^java.util.List shape ^java.util.List offsets ^java.util.List strides]
    (ArrayUtil/calcOffsetLong2 shape offsets strides)))

(defn *times
  "ints - `int[]`
  mult - `int`

  returns: `int[]`"
  ([ints ^Integer mult]
    (ArrayUtil/times ints mult)))

(defn *inverse?
  "Returns true if the given
  two arrays are reverse copies of each other

  first - `int[]`
  second - `int[]`

  returns: `boolean`"
  (^Boolean [first second]
    (ArrayUtil/isInverse first second)))

(defn *replace
  "Return a copy of this array with the
  given index omitted

  data - the data to copy - `int[]`
  index - the index of the item to remove - `int`
  new-value - the newValue to replace - `int`

  returns: the new array with the omitted
  item - `int[]`"
  ([data ^Integer index ^Integer new-value]
    (ArrayUtil/replace data index new-value)))

(defn *to-list
  "ints - `int`

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^Integer ints]
    (ArrayUtil/toList ints)))

(defn *to-array-double
  "list - `java.util.List`

  returns: `double[]`"
  ([^java.util.List list]
    (ArrayUtil/toArrayDouble list)))

(defn *from-boolean
  "Convert an int

  bool - `boolean`

  returns: `int`"
  (^Integer [^Boolean bool]
    (ArrayUtil/fromBoolean bool)))

(defn *dot-product-long
  "xs - `java.util.List`
  ys - `java.util.List`

  returns: `long`"
  (^Long [^java.util.List xs ^java.util.List ys]
    (ArrayUtil/dotProductLong xs ys)))

(defn *prod-long
  "Product of an int array

  mult - the elementsto calculate the sum for - `java.util.List`

  returns: the product of this array - `long`"
  (^Long [^java.util.List mult]
    (ArrayUtil/prodLong mult)))

(defn *zeros-matrix
  "dimensions - `long`

  returns: `java.util.List<double[]>`"
  ([^Long dimensions]
    (ArrayUtil/zerosMatrix dimensions)))

(defn *convert-to-string
  "Convert a int array to a string array

  arr - the array to convert - `int[]`

  returns: the equivalent string array - `java.lang.String[]`"
  ([arr]
    (ArrayUtil/convertToString arr)))

(defn *combine-float
  "Combines a applyTransformToDestination of int arrays in to one flat int array

  nums - the int arrays to combineDouble - `java.util.List`

  returns: one combined int array - `float[]`"
  ([^java.util.List nums]
    (ArrayUtil/combineFloat nums)))

(defn *any-more
  "target - `int[]`
  test - `int[]`

  returns: `boolean`"
  (^Boolean [target test]
    (ArrayUtil/anyMore target test)))

(defn *calc-strides
  "Computes the standard packed array strides for a given shape.

  shape - the shape of a matrix: - `int[]`
  start-value - the startValue for the strides - `int`

  returns: the strides for a matrix of n dimensions - `int[]`"
  ([shape ^Integer start-value]
    (ArrayUtil/calcStrides shape start-value))
  ([shape]
    (ArrayUtil/calcStrides shape)))

(defn *empty
  "returns: `int[]`"
  ([]
    (ArrayUtil/empty )))

(defn *argsort
  "Original credit: https://github.com/alberts/array4j/blob/master/src/main/java/net/lunglet/util/ArrayUtils.java

  a - `int[]`

  returns: `int[]`"
  ([a]
    (ArrayUtil/argsort a))
  ([a ^Boolean ascending]
    (ArrayUtil/argsort a ascending)))

(defn *less-than
  "target - `int[]`
  test - `int[]`

  returns: `boolean`"
  (^Boolean [target test]
    (ArrayUtil/lessThan target test)))

(defn *random-permutation
  "Credit to mikio braun from jblas

  Create a random permutation of the numbers 0, ..., size - 1.

  see Algorithm P, D.E. Knuth: The Art of Computer Programming, Vol. 2, p. 145

  size - `int`

  returns: `int[]`"
  ([^Integer size]
    (ArrayUtil/randomPermutation size)))

(defn *mod
  "input - `int[]`
  mod - `int`

  returns: `int[]`"
  ([input ^Integer mod]
    (ArrayUtil/mod input mod)))

(defn *get-tensor-mmul-shape
  "Get the tensor matrix multiply shape

  a-shape - the shape of the first array - `long[]`
  b-shape - the shape of the second array - `long[]`
  axes - the axes to do the multiply - `int[][]`

  returns: the shape for tensor matrix multiply - `long[]`"
  ([a-shape b-shape axes]
    (ArrayUtil/getTensorMmulShape a-shape b-shape axes)))

(defn *arg-min-of-max
  "first - `int[]`
  second - `int[]`

  returns: `int`"
  (^Integer [first second]
    (ArrayUtil/argMinOfMax first second))
  (^Integer [arrays]
    (ArrayUtil/argMinOfMax arrays)))

(defn *cons-array
  "a - `int`
  as - `int[]`

  returns: `int[]`"
  ([^Integer a as]
    (ArrayUtil/consArray a as)))

(defn *from-float
  "v - `float`

  returns: `short`"
  (^Short [^Float v]
    (ArrayUtil/fromFloat v)))

(defn *flatten-f
  "Convert a 2darray in to a flat
  array (row wise)

  arr - the array to flatten - `double[][]`

  returns: a flattened representation of the array - `double[]`"
  ([arr]
    (ArrayUtil/flattenF arr)))

(defn *contains-any-negative
  "Returns true if any array elements are negative.
  If the array is null, it returns false

  arr - the array to test - `int[]`

  returns: `boolean`"
  (^Boolean [arr]
    (ArrayUtil/containsAnyNegative arr)))

(defn *arg-max
  "Returns the index of the maximum value in the array.
  If two entries have same maximum value, index of the first one is returned.

  in - `int[]`

  returns: `int`"
  (^Integer [in]
    (ArrayUtil/argMax in)))

(defn *flatten-double-array
  "Convert an arbitrary-dimensional rectangular double array to flat vector.
  Can pass double[], double[][], double[][][], etc.

  double-array - `java.lang.Object`

  returns: `double[]`"
  ([^java.lang.Object double-array]
    (ArrayUtil/flattenDoubleArray double-array)))

(defn *get-random-element
  "list - `java.util.List`

  returns: `<T> T`"
  ([^java.util.List list]
    (ArrayUtil/getRandomElement list)))

(defn *to-float-array
  "byte-array - `byte[]`

  returns: `float[]`"
  ([byte-array]
    (ArrayUtil/toFloatArray byte-array)))

(defn *non-one-stride
  "For use with row vectors to ensure consistent strides
  with varying offsets

  arr - the array to get the stride for - `int[]`

  returns: the stride - `int`"
  (^Integer [arr]
    (ArrayUtil/nonOneStride arr)))

(defn *flatten
  "Convert a 2darray in to a flat
  array (row wise)

  arr - the array to flatten - `double[][]`

  returns: a flattened representation of the array - `double[]`"
  ([arr]
    (ArrayUtil/flatten arr)))

(defn *to-double-array
  "byte-array - `byte[]`

  returns: `double[]`"
  ([byte-array]
    (ArrayUtil/toDoubleArray byte-array)))

(defn *calc-strides-fortran
  "Computes the standard packed array strides for a given shape.

  shape - the shape of a matrix: - `int[]`
  start-num - the start number for the strides - `int`

  returns: the strides for a matrix of n dimensions - `int[]`"
  ([shape ^Integer start-num]
    (ArrayUtil/calcStridesFortran shape start-num))
  ([shape]
    (ArrayUtil/calcStridesFortran shape)))

(defn *to-array
  "list - `java.util.List`

  returns: `int[]`"
  ([^java.util.List list]
    (ArrayUtil/toArray list)))

(defn *convert-negative-indices
  "Convert all dimensions in the specified
  axes array to be positive
  based on the specified range of values

  range - `int`
  axes - `int[]`

  returns: `int[]`"
  ([^Integer range axes]
    (ArrayUtil/convertNegativeIndices range axes)))

(defn *to-array-long
  "list - `java.util.List`

  returns: `long[]`"
  ([^java.util.List list]
    (ArrayUtil/toArrayLong list)))

(defn *combine
  "Combines a apply of int arrays in to one flat int array

  nums - the int arrays to combineDouble - `java.util.List`

  returns: one combined int array - `float[]`"
  ([^java.util.List nums]
    (ArrayUtil/combine nums)))

(defn *read-double
  "length - `int`
  dis - `java.io.DataInputStream`

  returns: `double[]`

  throws: java.io.IOException"
  ([^Integer length ^java.io.DataInputStream dis]
    (ArrayUtil/readDouble length dis)))

(defn *any-less
  "target - `int[]`
  test - `int[]`

  returns: `boolean`"
  (^Boolean [target test]
    (ArrayUtil/anyLess target test)))

(defn *write
  "data - `double[]`
  dos - `java.io.DataOutputStream`

  throws: java.io.IOException"
  ([data ^java.io.DataOutputStream dos]
    (ArrayUtil/write data dos)))

(defn *to-byte-array
  "double-array - `double[]`

  returns: `byte[]`"
  ([double-array]
    (ArrayUtil/toByteArray double-array)))

(defn *equals
  "data - `float[]`
  data-2 - `double[]`

  returns: `boolean`"
  (^Boolean [data data-2]
    (ArrayUtil/equals data data-2)))

(defn *sort-map-by-value
  "map - `java.util.Map`

  returns: `<K,V extends java.lang.Comparable<? super V>> java.util.Map<K,V>`"
  ([^java.util.Map map]
    (ArrayUtil/sortMapByValue map)))

(defn *zip
  "Zip 2 arrays in to:

  as - `int[]`
  bs - `int[]`

  returns: `int[][]`"
  ([as bs]
    (ArrayUtil/zip as bs)))

(defn *calc-offset-long
  "Compute the offset
  based on teh shape strides and offsets

  shape - the shape to compute - `java.util.List`
  offsets - the offsets to compute - `java.util.List`
  strides - the strides to compute - `java.util.List`

  returns: the offset for the given shape,offset,and strides - `long`"
  (^Long [^java.util.List shape ^java.util.List offsets ^java.util.List strides]
    (ArrayUtil/calcOffsetLong shape offsets strides)))

(defn *any-less-than
  "arrs - `int[]`
  check - `int`

  returns: `boolean`"
  (^Boolean [arrs ^Integer check]
    (ArrayUtil/anyLessThan arrs check)))

(defn *flatten-float-array
  "Convert an arbitrary-dimensional rectangular float array to flat vector.
  Can pass float[], float[][], float[][][], etc.

  float-array - `java.lang.Object`

  returns: `float[]`"
  ([^java.lang.Object float-array]
    (ArrayUtil/flattenFloatArray float-array)))

