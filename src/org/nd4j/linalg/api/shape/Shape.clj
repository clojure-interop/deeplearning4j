(ns org.nd4j.linalg.api.shape.Shape
  "Encapsulates all shape related logic (vector of 0 dimension is a scalar is equivalent to
 a vector of length 1...)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.shape Shape]))

(defn *to-buffer
  "Convert an array to a byte buffer

  arr - the array - `int`

  returns: a direct byte buffer with the array contents - `java.nio.IntBuffer`"
  (^java.nio.IntBuffer [^Integer arr]
    (Shape/toBuffer arr)))

(defn *has-default-strides-for-shape?
  "input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray input]
    (Shape/hasDefaultStridesForShape input)))

(defn *get-max-shape
  "Return the shape of the largest length array
  based on the input

  inputs - the inputs to get the max shape for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the largest shape based on the inputs - `long[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (Shape/getMaxShape inputs)))

(defn *to-offset-zero-copy-any-order
  "Create a copy of the ndarray where the new offset is zero.
  Unlike toOffsetZeroCopy(INDArray) (which always returns arrays of order Nd4j.order()),
  and toOffsetZeroCopy(INDArray,char) (which always returns arrays of a specified order)
  this method returns NDArrays of any order (sometimes c, sometimes f).
  This method may be faster than the other two toOffsetZeroCopyAnyOrder methods as a result,
  however no performance benefit (or cost) relative to them will be observed in many cases.
  If a copy is necessary, the output will have order Nd4j.order()

  arr - NDArray to duplicate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Copy with offset 0, but order might be c, or might be f - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Shape/toOffsetZeroCopyAnyOrder arr)))

(defn *set-order
  "Deprecated.

  buffer - the buffer - `java.nio.IntBuffer`
  order - `char`"
  ([^java.nio.IntBuffer buffer ^Character order]
    (Shape/setOrder buffer order)))

(defn *squeeze
  "Gets rid of any singleton dimensions of the given array

  shape - the shape to squeeze - `int[]`

  returns: the array with all of the singleton dimensions removed - `int[]`"
  ([shape]
    (Shape/squeeze shape)))

(defn *shape-to-string
  "Prints the shape
  for this shape information

  arr - the shape information to print - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the shape information to string - `java.lang.String`"
  (^java.lang.String [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Shape/shapeToString arr)))

(defn *get-reduced-shape
  "Get the shape of the reduced array

  whole-shape - the shape of the arraywith the reduce op being performed - `int[]`
  dimensions - the dimensions the reduce op is being performed on - `int[]`
  keep-dims - if set to true, corresponding dimensions will be set to 1 - `boolean`
  new-format - `boolean`

  returns: the shape of the result array as the result of the reduce - `long[]`"
  ([whole-shape dimensions ^Boolean keep-dims ^Boolean new-format]
    (Shape/getReducedShape whole-shape dimensions keep-dims new-format))
  ([whole-shape dimensions]
    (Shape/getReducedShape whole-shape dimensions)))

(defn *offset
  "Deprecated.

  buffer - the shape info buffer to get the offset for - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/offset buffer)))

(defn *get-tad-length
  "shape - `int[]`
  dimensions - `int`

  returns: `long`"
  (^Long [shape ^Integer dimensions]
    (Shape/getTADLength shape dimensions)))

(defn *whole-array?
  "Returns true if the dimension is null
  or the dimension length is 1 and the first entry
  is Integer.MAX_VALUE

  shape - the shape of the input array - `int[]`
  dimension - the dimensions specified - `int`

  returns: true if the dimension length is equal to the shape length
  the dimension is null or the dimension length is 1 and the first entry is
  Integer.MAX_VALUE - `boolean`"
  (^Boolean [shape ^Integer dimension]
    (Shape/isWholeArray shape dimension)))

(defn *to-indexes
  "Convert the given int indexes
  to nd array indexes

  indices - the indices to convert - `int[]`

  returns: the converted indexes - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([indices]
    (Shape/toIndexes indices)))

(defn *whole-array-dimension
  "Returns true if the given array
  is meant for the whole dimension

  arr - the array to test - `int`

  returns: true if arr.length == 1 && arr[0] is Integer.MAX_VALUE - `boolean`"
  (^Boolean [^Integer arr]
    (Shape/wholeArrayDimension arr)))

(defn *shape
  "Get array shape from the buffer, as an int[]

  buffer - Buffer to get the shape from - `java.nio.IntBuffer`

  returns: Shape array - `long[]`"
  ([^java.nio.IntBuffer buffer]
    (Shape/shape buffer)))

(defn *c-or-fortran-order
  "Infer order from

  shape - the shape to infer by - `long[]`
  stride - the stride to infer by - `long[]`
  element-stride - the element stride to start at - `long`

  returns: the storage order given shape and element stride - `boolean`"
  (^Boolean [shape stride ^Long element-stride]
    (Shape/cOrFortranOrder shape stride element-stride)))

(defn *length-of
  "shape - `long[]`

  returns: `long`"
  (^Long [shape]
    (Shape/lengthOf shape)))

(defn *shape-info-length
  "Return the shape info length
  given the rank

  rank - the rank to get the length for - `int`

  returns: rank * 2  4 - `int`"
  (^Integer [^Integer rank]
    (Shape/shapeInfoLength rank)))

(defn *assert-shape-less-than
  "Assert the both shapes are the same length
  and shape[i] < lessThan[i]

  shape - the shape to check - `int[]`
  less-than - the shape to assert against - `int[]`"
  ([shape less-than]
    (Shape/assertShapeLessThan shape less-than)))

(defn *are-shapes-broadcastable
  "x - `int[]`
  y - `int[]`

  returns: `boolean`"
  (^Boolean [x y]
    (Shape/areShapesBroadcastable x y)))

(defn *create-shape-information
  "Creates the shape information buffer
  given the shape,stride

  shape - the shape for the buffer - `int[]`
  stride - the stride for the buffer - `int[]`
  offset - the offset for the buffer - `long`
  element-wise-stride - the element wise stride for the buffer - `int`
  order - the order for the buffer - `char`

  returns: the shape information buffer given the parameters - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [shape stride ^Long offset ^Integer element-wise-stride ^Character order]
    (Shape/createShapeInformation shape stride offset element-wise-stride order)))

(defn *row-vector-shape?
  "Returns true if the given shape is of length 1
  or provided the shape length is 2:
  element 0 is 1

  shape-info - the shape info to check - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: true if the above conditions hold,false otherwise - `boolean`"
  (^Boolean [^org.nd4j.linalg.api.buffer.DataBuffer shape-info]
    (Shape/isRowVectorShape shape-info)))

(defn *iterate
  "Iterate over a pair of coordinates

  dimension - `int`
  n - `int`
  size - `int[]`
  res - `int[]`
  dimension-2 - `int`
  n-2 - `int`
  size-2 - `int[]`
  res-2 - `int[]`
  func - `org.nd4j.linalg.api.shape.loop.coordinatefunction.CoordinateFunction`"
  ([^Integer dimension ^Integer n size res ^Integer dimension-2 ^Integer n-2 size-2 res-2 ^org.nd4j.linalg.api.shape.loop.coordinatefunction.CoordinateFunction func]
    (Shape/iterate dimension n size res dimension-2 n-2 size-2 res-2 func))
  ([^Integer dimension ^Integer n size res ^org.nd4j.linalg.api.shape.loop.coordinatefunction.CoordinateFunction func]
    (Shape/iterate dimension n size res func))
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.ndarray.INDArray arr-2 ^org.nd4j.linalg.api.shape.loop.coordinatefunction.CoordinateFunction coordinate-function]
    (Shape/iterate arr arr-2 coordinate-function))
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.api.shape.loop.coordinatefunction.CoordinateFunction coordinate-function]
    (Shape/iterate arr coordinate-function)))

(defn *rank-from-shape
  "Return the rank for the given shape

  shape - Shape to get the rank for - `int[]`

  returns: Rank, of the array given the shape - `int`

  throws: org.nd4j.linalg.exception.ND4JIllegalStateException - If shape array is null"
  (^Integer [shape]
    (Shape/rankFromShape shape)))

(defn *stride-unsafe
  "Get the stride of the specified dimension, without any input validation

  buffer - The buffer to get the stride from - `org.nd4j.linalg.api.buffer.DataBuffer`
  dimension - The dimension to get. - `int`
  rank - Rank of the array - `int`

  returns: The stride of the specified dimension - `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer dimension ^Integer rank]
    (Shape/strideUnsafe buffer dimension rank)))

(defn *flags
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `int[]`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/flags buffer)))

(defn *offset-for
  "Compute the offset for the given array
  given the indices

  arr - the array to compute the offset for - `org.nd4j.linalg.api.ndarray.INDArray`
  indexes - the indexes along each dimension to create the offset for - `int[]`

  returns: the offset for the given array and indexes - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr indexes]
    (Shape/offsetFor arr indexes)))

(defn *to-string
  "To String for an int buffer

  buffer - `java.nio.IntBuffer`

  returns: `java.lang.String`"
  (^java.lang.String [^java.nio.IntBuffer buffer]
    (Shape/toString buffer)))

(defn *shape-equals
  "Returns whether 2 shapes are equals by checking for dimension semantics
  as well as array equality

  shape-1 - the first shape for comparison - `int[]`
  shape-2 - the second shape for comparison - `int[]`

  returns: whether the shapes are equivalent - `boolean`"
  (^Boolean [shape-1 shape-2]
    (Shape/shapeEquals shape-1 shape-2)))

(defn *extras
  "buffer - `long[]`

  returns: `long`"
  (^Long [buffer]
    (Shape/extras buffer)))

(defn *get-broadcast-dimensions
  "Compute the broadcast rules according to:
  https://docs.scipy.org/doc/numpy-1.10.1/user/basics.broadcasting.html
  Note that the array can be null if the arrays are already equal
  in shape.
  This function should be used in conjunction with
  the shape ops.

  left - the left array - `int[]`
  right - the right array (the array to be broadcasted - `int[]`

  returns: the broadcast dimensions if any - `int[]`"
  ([left right]
    (Shape/getBroadcastDimensions left right)))

(defn *to-mmul-compatible
  "This method is used in DL4J LSTM implementation

  input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray input]
    (Shape/toMmulCompatible input)))

(defn *rank
  "Gets the rank given the shape info buffer

  buffer - the buffer to get the rank for - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the rank for the shape buffer - `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/rank buffer)))

(defn *underlying-rank
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/underlyingRank buffer)))

(defn *vector?
  "Returns whether the given shape is a vector

  shape-info - the shapeinfo to test - `java.nio.IntBuffer`

  returns: whether the given shape is a vector - `boolean`"
  (^Boolean [^java.nio.IntBuffer shape-info]
    (Shape/isVector shape-info)))

(defn *get-order
  "Infer order from

  shape - the shape to infer by - `int[]`
  stride - the stride to infer by - `int[]`
  element-stride - the element stride to start at - `int`

  returns: the storage order given shape and element stride - `char`"
  (^Character [shape stride ^Integer element-stride]
    (Shape/getOrder shape stride element-stride))
  (^Character [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Shape/getOrder arr)))

(defn *shape-of
  "Get the shape from
  the given int buffer

  buffer - the buffer to get the shape information for - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/shapeOf buffer)))

(defn *hidden-dimension
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `int[]`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/hiddenDimension buffer)))

(defn *contiguous-in-buffer?
  "Are the elements in the buffer contiguous for this NDArray?

  in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray in]
    (Shape/isContiguousInBuffer in)))

(defn *to-offset-zero-copy
  "Create a copy of the ndarray where the new offset is zero, and has specified order

  arr - the array to copy to offset 0 - `org.nd4j.linalg.api.ndarray.INDArray`
  order - the order of the returned array - `char`

  returns: a copy of the array with elements set to zero offset, and with specified order - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Character order]
    (Shape/toOffsetZeroCopy arr order))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Shape/toOffsetZeroCopy arr)))

(defn *resolve-negative-shape-if-neccessary
  "new-shape - the new shape possiblycontaining a negative number - `int[]`
  shape - the shape to calculate from - `int[]`

  returns: `int[]`"
  ([new-shape shape]
    (Shape/resolveNegativeShapeIfNeccessary new-shape shape)))

(defn *get-offset
  "Get the offset of the specified [dim0,dim1,dim2,dim3] for the 4d array

  shape-information - Shape information - `java.nio.IntBuffer`
  dim-0 - Row index to get the offset for - `int`
  dim-1 - Column index to get the offset for - `int`
  dim-2 - dimension 2 index to get the offset for - `int`
  dim-3 - dimension 3 index to get the offset for - `int`

  returns: Buffer offset - `long`"
  (^Long [^java.nio.IntBuffer shape-information ^Integer dim-0 ^Integer dim-1 ^Integer dim-2 ^Integer dim-3]
    (Shape/getOffset shape-information dim-0 dim-1 dim-2 dim-3))
  (^Long [^Long base-offset shape stride ^Integer indices]
    (Shape/getOffset base-offset shape stride indices))
  (^Long [^org.nd4j.linalg.api.buffer.DataBuffer shape-information ^Integer row ^Integer col]
    (Shape/getOffset shape-information row col))
  (^Long [^java.nio.IntBuffer shape-information indices]
    (Shape/getOffset shape-information indices)))

(defn *assert-broadcastable
  "x - `long[]`
  y - `long[]`
  op-class - `java.lang.Class`"
  ([x y ^java.lang.Class op-class]
    (Shape/assertBroadcastable x y op-class))
  ([^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (Shape/assertBroadcastable x y)))

(defn *get-matrix-multiply-shape
  "Get the output shape of a matrix multiply

  left - the first matrix shape to multiply - `int[]`
  right - the second matrix shape to multiply - `int[]`

  returns: the shape of the output array (the left's rows and right's columns) - `int[]`"
  ([left right]
    (Shape/getMatrixMultiplyShape left right)))

(defn *sparse-offsets
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `int[]`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/sparseOffsets buffer)))

(defn *shape-is-scalar
  "Returns true if this shape is scalar

  shape - the shape that is scalar - `int[]`

  returns: `boolean`"
  (^Boolean [shape]
    (Shape/shapeIsScalar shape)))

(defn *element-wise-stride
  "Get the element wise stride for the
  shape info buffer

  buffer - the buffer to get the elementwise stride from - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the element wise stride for the buffer - `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/elementWiseStride buffer))
  (^Integer [shape stride ^Boolean is-f-order]
    (Shape/elementWiseStride shape stride is-f-order)))

(defn *stride-arr
  "Get array shape from the buffer, as an int[]

  buffer - Buffer to get the shape from - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: Shape array - `long[]`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (Shape/strideArr buffer)))

(defn *size-for-axes
  "Output an int array for a particular dimension

  axes - the axes - `int[]`
  shape - the current shape - `int[]`

  returns: `int[]`"
  ([axes shape]
    (Shape/sizeForAxes axes shape)))

(defn *new-shape-no-copy
  "A port of numpy's reshaping algorithm that leverages
  no copy where possible and returns
  null if the reshape
  couldn't happen without copying

  arr - the array to reshape - `org.nd4j.linalg.api.ndarray.INDArray`
  new-shape - the new shape - `long[]`
  is-f-order - whether the array will be fortran ordered or not - `boolean`

  returns: null if a reshape isn't possible, or a new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr new-shape ^Boolean is-f-order]
    (Shape/newShapeNoCopy arr new-shape is-f-order)))

(defn *sub-2-ind
  "Convert the given index (such as 1,1)
  to a linear index

  shape - the shape of the indexes to convert - `int[]`
  indices - the index to convert - `int[]`

  returns: the linear index given the shape
  and indices - `long`"
  (^Long [shape indices]
    (Shape/sub2Ind shape indices)))

(defn *length
  "Gets the rank given the shape info buffer

  buffer - the buffer to get the rank for - `java.nio.IntBuffer`

  returns: the rank for the shape buffer - `int`"
  (^Integer [^java.nio.IntBuffer buffer]
    (Shape/length buffer)))

(defn *order
  "Returns the order given the shape information

  buffer - the buffer - `java.nio.IntBuffer`

  returns: `char`"
  (^Character [^java.nio.IntBuffer buffer]
    (Shape/order buffer)))

(defn *column-vector-shape?
  "Returns true if the given shape is length 2 and
  the size at element 1 is 1

  shape - the shape to check - `int[]`

  returns: true if the above listed conditions
  hold false otherwise - `boolean`"
  (^Boolean [shape]
    (Shape/isColumnVectorShape shape)))

(defn *matrix?
  "Returns whether the passed in shape is a matrix

  shape-info - whether the passed in shape is a matrix - `java.nio.IntBuffer`

  returns: true if the shape is a matrix false otherwise - `boolean`"
  (^Boolean [^java.nio.IntBuffer shape-info]
    (Shape/isMatrix shape-info)))

(defn *placeholder-shape?
  "Returns true if any shape has a -1
  or a null or empty array is passed in

  shape - the input shape to validate - `int[]`

  returns: true if the shape is null,empty, or contains a -1 element - `boolean`"
  (^Boolean [shape]
    (Shape/isPlaceholderShape shape)))

(defn *set-element-wise-stride
  "Get the element wise stride for the
  shape info buffer

  buffer - the buffer to get the elementwise stride from - `java.nio.IntBuffer`
  element-wise-stride - `int`"
  ([^java.nio.IntBuffer buffer ^Integer element-wise-stride]
    (Shape/setElementWiseStride buffer element-wise-stride)))

(defn *to-offset-zero
  "Create a copy of the matrix
  where the new offset is zero

  arr - the array to copy to offset 0 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the same array if offset is zero
  otherwise a copy of the array with
  elements set to zero - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Shape/toOffsetZero arr)))

(defn *scalar-equals
  "Returns true if the given shapes are both scalars (0 dimension or shape[0] == 1)

  shape-1 - the first shape for comparison - `int[]`
  shape-2 - the second shape for comparison - `int[]`

  returns: whether the 2 shapes are equal based on scalar rules - `boolean`"
  (^Boolean [shape-1 shape-2]
    (Shape/scalarEquals shape-1 shape-2)))

(defn *create-sparse-information
  "flags - `int[]`
  sparse-offsets - `long[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [flags sparse-offsets hidden-dimensions ^Integer underlying-rank]
    (Shape/createSparseInformation flags sparse-offsets hidden-dimensions underlying-rank)))

(defn *stride-descending-c-ascending-f
  "Check if strides are in order suitable for non-strided mmul etc.
  Returns true if c order and strides are descending [100,10,1] etc
  Returns true if f order and strides are ascending [1,10,100] etc
  False otherwise.

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: true if c+descending, f+ascending, false otherwise - `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray array]
    (Shape/strideDescendingCAscendingF array)))

(defn *new-strides
  "strides - `int[]`
  new-length - `int`
  indexes - `org.nd4j.linalg.indexing.INDArrayIndex[]`

  returns: `int[]`"
  ([strides ^Integer new-length indexes]
    (Shape/newStrides strides new-length indexes)))

(defn *ensure-at-min-row-vector
  "If a shape array is ony 1 in length
  it returns a row vector

  shape - the shape of the array - `int`

  returns: the shape as is if its already >= 2 in length
  otherwise a row vector shape - `int[]`"
  ([^Integer shape]
    (Shape/ensureAtMinRowVector shape)))

(defn *strides-of
  "buffer - `int[]`

  returns: `int[]`"
  ([buffer]
    (Shape/stridesOf buffer)))

(defn *empty?
  "shape-info - `long[]`

  returns: `boolean`"
  (^Boolean [shape-info]
    (Shape/isEmpty shape-info)))

(defn *uniquify
  "array - `int[]`

  returns: `int[]`"
  ([array]
    (Shape/uniquify array)))

(defn *size
  "Get the size of the specified dimension. Equivalent to shape()[dimension]

  buffer - The buffer to get the - `java.nio.IntBuffer`
  dimension - The dimension to get. - `int`

  returns: The size of the specified dimension - `int`"
  (^Integer [^java.nio.IntBuffer buffer ^Integer dimension]
    (Shape/size buffer dimension)))

(defn *broadcast-output-shape
  "Get the broadcast output shape
  based on the 2 input shapes
  Result output shape based on:
  https://docs.scipy.org/doc/numpy-1.10.1/user/basics.broadcasting.html

  left - the left shape - `int[]`
  right - the right second - `int[]`

  returns: `int[]`"
  ([left right]
    (Shape/broadcastOutputShape left right)))

(defn *options
  "buffer - `long[]`

  returns: `long`"
  (^Long [buffer]
    (Shape/options buffer)))

(defn *content-equals
  "Compare the contents of a buffer and
  an array for equals

  arr - the array - `int[]`
  other - the buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: true if the content equals false otherwise - `boolean`"
  (^Boolean [arr ^org.nd4j.linalg.api.buffer.DataBuffer other]
    (Shape/contentEquals arr other)))

(defn *buffer-to-string
  "Prints the IntBuffer

  buffer - the buffer to print - `java.nio.IntBuffer`

  returns: the to string for the buffer - `java.lang.String`"
  (^java.lang.String [^java.nio.IntBuffer buffer]
    (Shape/bufferToString buffer)))

(defn *get-double
  "Get a double based on the array and given indices

  arr - the array to retrieve the double from - `org.nd4j.linalg.api.ndarray.INDArray`
  indices - the indices to iterate over - `int[]`

  returns: the double at the specified index - `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray arr indices]
    (Shape/getDouble arr indices)))

(defn *get-offset-unsafe
  "Identical to getOffset(DataBuffer, int, int, int) but without input validation on array rank

  shape-information - `org.nd4j.linalg.api.buffer.DataBuffer`
  dim-0 - `int`
  dim-1 - `int`
  dim-2 - `int`

  returns: `long`"
  (^Long [^org.nd4j.linalg.api.buffer.DataBuffer shape-information ^Integer dim-0 ^Integer dim-1 ^Integer dim-2]
    (Shape/getOffsetUnsafe shape-information dim-0 dim-1 dim-2))
  (^Long [^org.nd4j.linalg.api.buffer.DataBuffer shape-information ^Integer row ^Integer col]
    (Shape/getOffsetUnsafe shape-information row col))
  (^Long [^org.nd4j.linalg.api.buffer.DataBuffer shape-information ^Integer dim-0 ^Integer dim-1 ^Integer dim-2 ^Integer dim-3]
    (Shape/getOffsetUnsafe shape-information dim-0 dim-1 dim-2 dim-3)))

(defn *normalize-axis
  "rank - `int`
  axis - `int`

  returns: `int[]`"
  ([^Integer rank ^Integer axis]
    (Shape/normalizeAxis rank axis)))

(defn *stride
  "Get the stride of the specified dimension

  buffer - The buffer to get the stride from - `java.nio.IntBuffer`
  dimension - The dimension to get. - `int`

  returns: The stride of the specified dimension - `int`"
  (^Integer [^java.nio.IntBuffer buffer ^Integer dimension]
    (Shape/stride buffer dimension))
  (^java.nio.IntBuffer [^java.nio.IntBuffer buffer]
    (Shape/stride buffer)))

(defn *ind-2sub-c
  "Convert a linear index to
  the equivalent nd index

  shape - the shape of the dimensions - `int[]`
  index - the index to map - `long`
  num-indices - the number of total indices (typically prod of shape( - `long`

  returns: the mapped indexes along each dimension - `int[]`"
  ([shape ^Long index ^Long num-indices]
    (Shape/ind2subC shape index num-indices))
  ([shape ^Long index]
    (Shape/ind2subC shape index)))

(defn *ind-2sub
  "Convert a linear index to
  the equivalent nd index

  shape - the shape of the dimensions - `int[]`
  index - the index to map - `long`
  num-indices - the number of total indices (typically prod of shape( - `long`

  returns: the mapped indexes along each dimension - `int[]`"
  ([shape ^Long index ^Long num-indices]
    (Shape/ind2sub shape index num-indices))
  ([shape ^Long index]
    (Shape/ind2sub shape index)))

(defn *size-unsafe
  "Get the size of the specified dimension. Identical to Shape.size(...), but does not perform any input validation

  buffer - The buffer to get the shape from - `org.nd4j.linalg.api.buffer.DataBuffer`
  dimension - The dimension to get. - `int`

  returns: The size of the specified dimension - `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer dimension]
    (Shape/sizeUnsafe buffer dimension)))

