(ns org.nd4j.nativeblas.Nd4jCuda$FloatNDArray
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatNDArray]))

(defn ->float-nd-array
  "Constructor.

  This constructor creates new array with elements copied from data and using shape information stored in shape
  PLEASE NOTE: data will be copied AS IS, without respect to specified order. You must ensure order match here.

  shape - `org.bytedeco.javacpp.LongPointer`
  data - `org.bytedeco.javacpp.FloatPointer`
  workspace - `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^Nd4jCuda$FloatNDArray [^org.bytedeco.javacpp.LongPointer shape ^org.bytedeco.javacpp.FloatPointer data ^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (new Nd4jCuda$FloatNDArray shape data workspace))
  (^Nd4jCuda$FloatNDArray [^org.bytedeco.javacpp.LongPointer shape-info ^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (new Nd4jCuda$FloatNDArray shape-info workspace))
  (^Nd4jCuda$FloatNDArray [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatNDArray p))
  (^Nd4jCuda$FloatNDArray []
    (new Nd4jCuda$FloatNDArray )))

(defn *create-empty
  "workspace - `org.nd4j.nativeblas.Nd4jCuda$Workspace`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^org.nd4j.nativeblas.Nd4jCuda$Workspace workspace]
    (Nd4jCuda$FloatNDArray/createEmpty workspace))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray []
    (Nd4jCuda$FloatNDArray/createEmpty )))

(defn *value-of
  "shape - `org.bytedeco.javacpp.LongPointer`
  value - `float`
  order - `char`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^org.bytedeco.javacpp.LongPointer shape ^Float value ^Character order]
    (Nd4jCuda$FloatNDArray/valueOf shape value order))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^org.bytedeco.javacpp.LongPointer shape ^Float value]
    (Nd4jCuda$FloatNDArray/valueOf shape value)))

(defn *linspace
  "num-elements - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray linspace(float from, float to, @`"
  ([^Long num-elements]
    (Nd4jCuda$FloatNDArray/linspace num-elements)))

(defn *scalar
  "value - `float`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Float value]
    (Nd4jCuda$FloatNDArray/scalar value)))

(defn *quantize
  "This method returns quantized copy of given array

  array - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (Nd4jCuda$FloatNDArray/quantize array)))

(defn has-infs
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.hasInfs))))

(defn swap-unsafe
  "swaps the contents of tow arrays,
  PLEASE NOTE: method doesn't take into account the shapes of arrays, shapes may be different except one condition: arrays lengths must be the same

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.swapUnsafe other))))

(defn mean-number
  "returns mean number of array

  returns: `float`"
  (^Float [^Nd4jCuda$FloatNDArray this]
    (-> this (.meanNumber))))

(defn is-unitary
  "check whether array is unitary matrix

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isUnitary))))

(defn is-same-shape
  "other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.isSameShape other))))

(defn get-indexed-scalar
  "returns array element with given index, takes into account offset between elements (element-wise-stride)
  i - element index in array

  i - `long`

  returns: `float`"
  (^Float [^Nd4jCuda$FloatNDArray this ^Long i]
    (-> this (.getIndexedScalar i))))

(defn transp
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this]
    (-> this (.transp))))

(defn is-same-shape-strict
  "returns true if these two NDArrays have same rank, dimensions, strides, ews and order

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.isSameShapeStrict other))))

(defn get-view
  "creates array which is view of this array

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this]
    (-> this (.getView))))

(defn enforce
  "This method explicitly enforces new shape for this NDArray, old shape/stride information is lost

  dimensions - `org.bytedeco.javacpp.LongPointer`
  order - `char`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer dimensions ^Character order]
    (-> this (.enforce dimensions order)))
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer dimensions]
    (-> this (.enforce dimensions))))

(defn assign
  "this method assigns elements of other array to the sub-array of this array defined by given intervals
  other - input array to assign elements from
  idx - intervals of indexes which define the sub-array

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`
  idx - `org.nd4j.nativeblas.Nd4jCuda$Intervals`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other ^org.nd4j.nativeblas.Nd4jCuda$Intervals idx]
    (-> this (.assign other idx)))
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.assign other))))

(defn subarray
  "creates array which points on certain sub-range of this array, sub-range is defined by given indices

  indices - `org.nd4j.nativeblas.Nd4jCuda$IndicesList`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$IndicesList indices]
    (-> this (.subarray indices))))

(defn get-buffer
  "returns _buffer

  returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^Nd4jCuda$FloatNDArray this]
    (-> this (.getBuffer))))

(defn multiple-tensors-along-dimension
  "indices - `org.bytedeco.javacpp.IntPointer`
  dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatResultSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatResultSet [^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer indices ^org.bytedeco.javacpp.IntPointer dimensions]
    (-> this (.multipleTensorsAlongDimension indices dimensions))))

(defn get-shape-info-as-vector
  "returns: `(value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.getShapeInfoAsVector))))

(defn print-indexed-buffer
  "prints buffer elements, takes into account offset between elements (element-wise-stride)
  msg - message to print out
  limit - number of array elements to print out

  limit - `long`

  returns: `void printIndexedBuffer((value="char*") java.lang.String msg, @`"
  ([^Nd4jCuda$FloatNDArray this ^Long limit]
    (-> this (.printIndexedBuffer limit)))
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.printIndexedBuffer))))

(defn size-of-t
  "returns size of array elements type

  returns: `int`"
  (^Integer [^Nd4jCuda$FloatNDArray this]
    (-> this (.sizeOfT))))

(defn get-trace
  "calculates the trace of an array, that is sum of elements on main diagonal = sum array[i, i, i, ...]

  returns: `float`"
  (^Float [^Nd4jCuda$FloatNDArray this]
    (-> this (.getTrace))))

(defn tensors-along-dimension
  "returns the number of arrays pointing on specified dimension(s)
  dimensions - array of dimensions to point on

  dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions]
    (-> this (.tensorsAlongDimension dimensions))))

(defn addi-row-vector
  "add given row vector to all rows of this array
  row - row vector to add

  row - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray row]
    (-> this (.addiRowVector row))))

(defn cast
  "cast array elements to given dtype

  dtype - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^Integer dtype]
    (-> this (.cast dtype))))

(defn set-shape-info
  "set _shapeInfo

  shape-info - `org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer shape-info]
    (-> this (.setShapeInfo shape-info))))

(defn set-value-in-diag-matrix
  "fill matrix with given value starting from specified diagonal in given direction, works only with 2D matrix
  diag - diagonal starting from matrix is filled.
  diag = 0 corresponds to main diagonal,
  diag < 0 below main diagonal
  diag > 0 above main diagonal
  direction - in what direction to fill matrix. There are 2 possible directions:
  'u' - fill up, mathematically this corresponds to lower triangular matrix
  'l' - fill down, mathematically this corresponds to upper triangular matrix

  value - `float`
  diag - `int`
  direction - `char`"
  ([^Nd4jCuda$FloatNDArray this ^Float value ^Integer diag ^Character direction]
    (-> this (.setValueInDiagMatrix value diag direction))))

(defn get-shape-info-as-flat-vector
  "returns: `(value="int64_t*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.getShapeInfoAsFlatVector))))

(defn set-identity
  "makes array to be identity matrix (not necessarily square), that is set all diagonal elements = 1, rest = 0"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.setIdentity))))

(defn subtract-put
  "subtraction unary operator array -= other
  other - input array to add

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator -=")  void`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.subtractPut other))))

(defn is-identity-matrix
  "check whether array is identity matrix

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isIdentityMatrix))))

(defn multiply-put
  "pairwise multiplication unary operator array *= other
  other - input array to multiply on

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator *=")  void`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.multiplyPut other))))

(defn columns
  "returns number of columns in array

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.columns))))

(defn permutei
  "permutes (in-place) the dimensions in array according to \"dimensions\" array

  dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions]
    (-> this (.permutei dimensions)))
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions ^Integer rank]
    (-> this (.permutei dimensions rank))))

(defn put-scalar
  "assigns given scalar to array element by given index, regards array buffer as linear
  i - element index in array
  value - scalar value to assign

  i - `long`
  value - `float`"
  ([^Nd4jCuda$FloatNDArray this ^Long i ^Float value]
    (-> this (.putScalar i value))))

(defn multiply
  "pairwise multiplication operator: array * other
  other - input array to multiply on

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator *")  org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.multiply other))))

(defn is-row-vector
  "returns true if array is row vector

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isRowVector))))

(defn tensor-along-dimension
  "return array pointing on certain range of this array
  index - the number of array to be returned among set of possible arrays
  dimensions - array of dimensions to point on

  index - `long`
  dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^Long index ^org.bytedeco.javacpp.IntPointer dimensions]
    (-> this (.tensorAlongDimension index dimensions))))

(defn as-indexed-string
  "limit - `long`

  returns: `org.bytedeco.javacpp.BytePointer`"
  (^org.bytedeco.javacpp.BytePointer [^Nd4jCuda$FloatNDArray this ^Long limit]
    (-> this (.asIndexedString limit)))
  (^org.bytedeco.javacpp.BytePointer [^Nd4jCuda$FloatNDArray this]
    (-> this (.asIndexedString))))

(defn is-attached
  "inline accessing operator for 4D array, i - height, j - width, k - depth

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isAttached))))

(defn get-shape-info
  "returns: `(value="Nd4jLong*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.getShapeInfo))))

(defn put
  "copy assignment operator

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator =")  org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.put other))))

(defn sum
  "calculates sum along dimension(s) in this array and save it to created reduced array
  dimensions - array of dimensions to calculate sum over
  keepDims - if true then put unities in place of reduced dimensions

  dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions]
    (-> this (.sum dimensions))))

(defn length-of
  "returns length of array

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.lengthOf))))

(defn is-column-vector
  "returns true if array is column vector

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isColumnVector))))

(defn repeat
  "fill target array by repeating current array
  dimension - dimension along which to repeat elements

  dimension - `int`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^Integer dimension ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.repeat dimension target)))
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer repeats]
    (-> this (.repeat repeats))))

(defn detach
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this]
    (-> this (.detach))))

(defn linspace
  "fill array linearly as follows: arr[0] = from, arr[1] = from+step, arr[2] = from+2*step, ...

  from - `float`
  step - `float`"
  ([^Nd4jCuda$FloatNDArray this ^Float from ^Float step]
    (-> this (.linspace from step)))
  ([^Nd4jCuda$FloatNDArray this ^Float from]
    (-> this (.linspace from))))

(defn diagonal
  "return vector with buffer which points on corresponding diagonal elements of array
  type - means of vector to be returned: column ('c') or row ('r')

  type - `char`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^Character type]
    (-> this (.diagonal type))))

(defn sub-row-vector
  "subtract given row vector from all rows of this array, store result in target
  row - row vector to subtract
  target - where to store result

  row - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray row ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.subRowVector row target))))

(defn shape-info
  "returns _shapeInfo

  returns: `(value="Nd4jLong*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.shapeInfo))))

(defn tile-to-shape
  "change an array by repeating it the number of times in order to acquire new shape equal to the input shape
  shape - contains new shape to broadcast array to
  target - optional argument, if target != nullptr the resulting array will be placed in target, in opposite case tile operation is done in place

  shape - `org.bytedeco.javacpp.LongPointer`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer shape ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.tileToShape shape target)))
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer shape]
    (-> this (.tileToShape shape))))

(defn permute
  "permutes the dimensions in array according to \"dimensions\" array, new array points on _buffer of this array

  dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions]
    (-> this (.permute dimensions)))
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions ^Integer rank ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.permute dimensions rank target)))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions ^Integer rank]
    (-> this (.permute dimensions rank))))

(defn addi-column-vector
  "add given column vector to all columns of this array, this array becomes affected (in-place operation)
  column - column vector to add

  column - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray column]
    (-> this (.addiColumnVector column))))

(defn get-shape-as-vector
  "returns: `(value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.getShapeAsVector))))

(defn is-vector
  "returns true if array is vector

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isVector))))

(defn ordering
  "returns order of array

  returns: `char`"
  (^Character [^Nd4jCuda$FloatNDArray this]
    (-> this (.ordering))))

(defn delete
  "p - `org.bytedeco.javacpp.Pointer`

  returns: `(value="operator delete")  void`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.Pointer p]
    (-> this (._delete p))))

(defn replace-pointers
  "method replaces existing buffer/shapeinfo, AND releases original pointers (if releaseExisting TRUE)

  release-existing - `boolean`

  returns: `void replacePointers(org.bytedeco.javacpp.FloatPointer buffer, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer shapeInfo, @`"
  ([^Nd4jCuda$FloatNDArray this ^Boolean release-existing]
    (-> this (.replacePointers release-existing))))

(defn shape-of
  "returns shape portion of shapeInfo

  returns: `(value="Nd4jLong*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.shapeOf))))

(defn add-row-vector
  "add given row vector to all rows of this array, store result in target
  row - row vector to add
  target - where to store result

  row - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray row ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.addRowVector row target))))

(defn apply
  "operator returns sub-array with buffer pointing at this->_buffer with offset defined by given intervals
  idx - intervals of indexes which define the sub-arrays to point on
  keepUnitiesInShape - if false then eliminate unities from resulting array shape, for example {1,a,1,b} -> {a,b}

  keep-unities-in-shape - `boolean`

  returns: `(value="operator ()")  org.nd4j.nativeblas.Nd4jCuda$FloatNDArray apply(  org.nd4j.nativeblas.Nd4jCuda$Intervals idx, @`"
  ([^Nd4jCuda$FloatNDArray this ^Boolean keep-unities-in-shape]
    (-> this (.apply keep-unities-in-shape))))

(defn size-at
  "returns the value of \"dim\" dimension

  dim - `int`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this ^Integer dim]
    (-> this (.sizeAt dim))))

(defn buffer
  "returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^Nd4jCuda$FloatNDArray this]
    (-> this (.buffer))))

(defn reshape
  "creates new array with corresponding order and shape, new array will point on _buffer of this array
  order - order to set
  shape - shape to set
  if permute have been applied before or there are weird strides, then new buffer is allocated for new array

  shape - `org.bytedeco.javacpp.LongPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray reshape(char order, @`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer shape]
    (-> this (.reshape shape))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^Long position]
    (-> this (.position position))))

(defn get-buffer-as-vector
  "these methods suited for FlatBuffers use

  returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^Nd4jCuda$FloatNDArray this]
    (-> this (.getBufferAsVector))))

(defn set-special-buffers
  "set values for _bufferD and _shapeInfoD

  shape - `org.bytedeco.javacpp.LongPointer`

  returns: `void setSpecialBuffers(org.bytedeco.javacpp.FloatPointer buffer, @`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer shape]
    (-> this (.setSpecialBuffers shape))))

(defn tile
  "change an array by repeating it the number of times given by reps (in-place operation)
  repeats - contains numbers of repetitions
  target - where to store result

  repeats - `org.bytedeco.javacpp.LongPointer`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer repeats ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.tile repeats target)))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer repeats]
    (-> this (.tile repeats))))

(defn broadcast
  "returns an array which is result of broadcasting of this and other arrays
  other - input array

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.broadcast other))))

(defn subtract
  "subtraction operator: array - other
  other - input array to subtract

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator -")  org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.subtract other)))
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.subtract))))

(defn trigger-allocation-flag
  "set _isBuffAlloc and _isShapeAlloc

  shape-allocated - `boolean`

  returns: `void triggerAllocationFlag((value="bool") boolean bufferAllocated, @`"
  ([^Nd4jCuda$FloatNDArray this ^Boolean shape-allocated]
    (-> this (.triggerAllocationFlag shape-allocated))))

(defn special-buffer
  "if _bufferD==nullptr return _buffer, else return _bufferD

  returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^Nd4jCuda$FloatNDArray this]
    (-> this (.specialBuffer))))

(defn non-null
  "returns true if buffer && shapeInfo were defined (non nullptr)

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.nonNull))))

(defn has-orthonormal-basis
  "check whether array's rows (arg=0) or columns (arg=1) create orthogonal basis
  arg - 0 -> row, 1 -> column

  arg - `int`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this ^Integer arg]
    (-> this (.hasOrthonormalBasis arg))))

(defn divide-put
  "pairwise division unary operator: array /= other
  other - input array to divide on

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator /=")  void`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.dividePut other))))

(defn set-buffer
  "set _buffer

  buffer - `org.bytedeco.javacpp.FloatPointer`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.FloatPointer buffer]
    (-> this (.setBuffer buffer))))

(defn is-scalar
  "returns true if array is scalar

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isScalar))))

(defn sum-number
  "returns sum of all elements of array

  returns: `float`"
  (^Float [^Nd4jCuda$FloatNDArray this]
    (-> this (.sumNumber))))

(defn special-shape-info
  "if _shapeInfoD==nullptr return _shapeInfo, else return _shapeInfoD

  returns: `(value="Nd4jLong*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.specialShapeInfo))))

(defn all-tensors-along-dimension
  "dimensions - `org.bytedeco.javacpp.IntPointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatResultSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatResultSet [^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.IntPointer dimensions]
    (-> this (.allTensorsAlongDimension dimensions))))

(defn mul-row-vector
  "multiply all rows of this array on given row vector, store result in target
  row - row vector to multiply on
  target - where to store result

  row - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray row ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.mulRowVector row target))))

(defn data-type
  "return _dataType;

  returns: `(value="nd4j::DataType")  int`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.dataType))))

(defn is-matrix
  "returns true if array is 2D

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isMatrix))))

(defn streamline
  "This method streamlines given view or permuted array, and reallocates buffer

  order - `char`"
  ([^Nd4jCuda$FloatNDArray this ^Character order]
    (-> this (.streamline order)))
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.streamline))))

(defn arg-max
  "returns index of max element in a given array (optionally: along given dimension(s))
  dimensions - optional vector with dimensions

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.argMax))))

(defn divide
  "pairwise division operator: array / other
  other - input array to divide on

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator /")  org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.divide other))))

(defn new
  "operators for memory allocation and deletion

  i - `long`

  returns: `(value="operator new")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$FloatNDArray this ^Long i]
    (-> this (._new i))))

(defn is-finite
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isFinite))))

(defn add-put
  "addition unary operator array = other
  other - input array to add

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator =")  void`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.addPut other))))

(defn div-row-vector
  "divide all rows of this array on given row vector, store result in target
  row - row vector to divide on
  target - where to store result

  row - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray row ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.divRowVector row target))))

(defn transposei
  "apply in-place transpose operation to this array, so this array becomes transposed"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.transposei))))

(defn add
  "addition operator: array  other
  other - input array to add

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="operator ")  org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.add other))))

(defn get-scalar
  "returns array element with given index from linear buffer
  i - element index in array

  i - `long`

  returns: `float`"
  (^Float [^Nd4jCuda$FloatNDArray this ^Long i]
    (-> this (.getScalar i))))

(defn create-uninitialized
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this]
    (-> this (.createUninitialized))))

(defn print-buffer
  "prints buffer elements
  msg - message to print out
  limit - number of array elements to print out

  limit - `long`

  returns: `void printBuffer((value="char*") java.lang.String msg, @`"
  ([^Nd4jCuda$FloatNDArray this ^Long limit]
    (-> this (.printBuffer limit)))
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.printBuffer))))

(defn update-strides
  "calculate strides and set given order
  order - order to set

  order - `char`"
  ([^Nd4jCuda$FloatNDArray this ^Character order]
    (-> this (.updateStrides order))))

(defn strides-of
  "returns strides portion of shapeInfo

  returns: `(value="Nd4jLong*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.stridesOf))))

(defn is-empty
  "Returns True if it's legally empty NDArray, or false otherwise

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isEmpty))))

(defn ews
  "returns element-wise-stride

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.ews))))

(defn rows
  "returns number of rows in array

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.rows))))

(defn is-view
  "return _isView

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isView))))

(defn add-column-vector
  "add given column vector to all columns of this array, store result in target
  column - column vector to add
  target - where to store result

  column - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`
  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray column ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.addColumnVector column target))))

(defn dup
  "returns new copy of this array, optionally in different order

  new-order - `char`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this ^Character new-order]
    (-> this (.dup new-order)))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this]
    (-> this (.dup))))

(defn all-examples
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatResultSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatResultSet [^Nd4jCuda$FloatNDArray this]
    (-> this (.allExamples))))

(defn reshapei
  "set new order and shape in case of suitable array length (in-place operation)
  order - order to set
  shape - shape to set
  if there was permute applied before or there are weird strides, then new buffer is allocated for array

  shape - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="bool")  boolean reshapei(char order, @`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer shape]
    (-> this (.reshapei shape))))

(defn memory-footprint
  "returns number of bytes used by _buffer & _shapeInfo

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.memoryFootprint))))

(defn as-byte-vector
  "return vector containing _buffer as flat binary array

  returns: `org.bytedeco.javacpp.BytePointer`"
  (^org.bytedeco.javacpp.BytePointer [^Nd4jCuda$FloatNDArray this]
    (-> this (.asByteVector))))

(defn equals-to
  "returns true if elements of two arrays are equal to within given epsilon value
  other - input array to compare
  eps - epsilon, this value defines the precision of elements comparison

  other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`
  eps - `float`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other ^Float eps]
    (-> this (.equalsTo other eps)))
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.equalsTo other))))

(defn tilei
  "change an array by repeating it the number of times given by reps (in-place operation)
  repeats - contains numbers of repetitions

  repeats - `org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$FloatNDArray this ^org.bytedeco.javacpp.LongPointer repeats]
    (-> this (.tilei repeats))))

(defn muli-column-vector
  "multiply all columns of this array on given column vector, this array becomes affected (in-place operation)
  column - column vector to multiply on

  column - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray column]
    (-> this (.muliColumnVector column))))

(defn print-shape-info
  "prints information about array shape
  msg - message to print out

  msg - `java.lang.String`"
  ([^Nd4jCuda$FloatNDArray this ^java.lang.String msg]
    (-> this (.printShapeInfo msg)))
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.printShapeInfo))))

(defn rank-of
  "returns rank of array

  returns: `int`"
  (^Integer [^Nd4jCuda$FloatNDArray this]
    (-> this (.rankOf))))

(defn equals
  "other - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `(value="bool") (value="operator ==")  boolean`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray other]
    (-> this (.equals other))))

(defn transpose
  "perform transpose operation and store result in target, this array remains unaffected
  target - where to store result

  target - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArray this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray target]
    (-> this (.transpose target)))
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArray this]
    (-> this (.transpose))))

(defn put-indexed-scalar
  "assigns given scalar to array element by given index, takes into account offset between elements (element-wise-stride)
  i - element index in array
  value - scalar value to assign

  i - `long`
  value - `float`"
  ([^Nd4jCuda$FloatNDArray this ^Long i ^Float value]
    (-> this (.putIndexedScalar i value))))

(defn as-string
  "limit - `long`

  returns: `org.bytedeco.javacpp.BytePointer`"
  (^org.bytedeco.javacpp.BytePointer [^Nd4jCuda$FloatNDArray this ^Long limit]
    (-> this (.asString limit)))
  (^org.bytedeco.javacpp.BytePointer [^Nd4jCuda$FloatNDArray this]
    (-> this (.asString))))

(defn get-workspace
  "returns _workspace

  returns: `org.nd4j.nativeblas.Nd4jCuda$Workspace`"
  (^org.nd4j.nativeblas.Nd4jCuda$Workspace [^Nd4jCuda$FloatNDArray this]
    (-> this (.getWorkspace))))

(defn is-contiguous
  "check whether array is contiguous in memory

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.isContiguous))))

(defn has-na-ns
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$FloatNDArray this]
    (-> this (.hasNaNs))))

