(ns org.nd4j.linalg.factory.Nd4j
  "Creation of ndarrays via classpath discovery."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory Nd4j]))

(defn ->nd-4j
  "Constructor."
  (^Nd4j []
    (new Nd4j )))

(def *-numerical-stability
  "Static Constant.

  type: java.lang.String"
  Nd4j/NUMERICAL_STABILITY)

(def *-data-buffer-ops
  "Static Constant.

  type: java.lang.String"
  Nd4j/DATA_BUFFER_OPS)

(def *-convolution-ops
  "Static Constant.

  type: java.lang.String"
  Nd4j/CONVOLUTION_OPS)

(def *-dtype
  "Static Constant.

  Deprecated. Use ND4JSystemProperties.DTYPE

  type: java.lang.String"
  Nd4j/DTYPE)

(def *-blas-ops
  "Static Constant.

  type: java.lang.String"
  Nd4j/BLAS_OPS)

(def *-sparse-blas-ops
  "Static Constant.

  type: java.lang.String"
  Nd4j/SPARSE_BLAS_OPS)

(def *-native-ops
  "Static Constant.

  type: java.lang.String"
  Nd4j/NATIVE_OPS)

(def *-order-key
  "Static Constant.

  type: java.lang.String"
  Nd4j/ORDER_KEY)

(def *-ndarray-factory-class
  "Static Constant.

  type: java.lang.String"
  Nd4j/NDARRAY_FACTORY_CLASS)

(def *-sparse-ndarray-factory-class
  "Static Constant.

  type: java.lang.String"
  Nd4j/SPARSE_NDARRAY_FACTORY_CLASS)

(def *-copy-ops
  "Static Constant.

  type: java.lang.String"
  Nd4j/COPY_OPS)

(def *-op-executioner
  "Static Constant.

  type: java.lang.String"
  Nd4j/OP_EXECUTIONER)

(def *-op-factory
  "Static Constant.

  type: java.lang.String"
  Nd4j/OP_FACTORY)

(def *-distribution
  "Static Constant.

  type: java.lang.String"
  Nd4j/DISTRIBUTION)

(def *-instrumentation
  "Static Constant.

  type: java.lang.String"
  Nd4j/INSTRUMENTATION)

(def *-instrumentation-class
  "Static Constant.

  type: java.lang.String"
  Nd4j/INSTRUMENTATION_CLASS)

(def *-resource-manger-on
  "Static Constant.

  type: java.lang.String"
  Nd4j/RESOURCE_MANGER_ON)

(def *-execution-mode
  "Static Constant.

  type: java.lang.String"
  Nd4j/EXECUTION_MODE)

(def *-shapeinfo-provider
  "Static Constant.

  type: java.lang.String"
  Nd4j/SHAPEINFO_PROVIDER)

(def *-sparseinfo-provider
  "Static Constant.

  type: java.lang.String"
  Nd4j/SPARSEINFO_PROVIDER)

(def *-constant-provider
  "Static Constant.

  type: java.lang.String"
  Nd4j/CONSTANT_PROVIDER)

(def *-affinity-manager
  "Static Constant.

  type: java.lang.String"
  Nd4j/AFFINITY_MANAGER)

(def *-compression-debug
  "Static Constant.

  type: java.lang.String"
  Nd4j/COMPRESSION_DEBUG)

(def *-memory-manager
  "Static Constant.

  type: java.lang.String"
  Nd4j/MEMORY_MANAGER)

(def *-workspace-manager
  "Static Constant.

  type: java.lang.String"
  Nd4j/WORKSPACE_MANAGER)

(def *-random-provider
  "Static Constant.

  type: java.lang.String"
  Nd4j/RANDOM_PROVIDER)

(def *-log-init-env-property
  "Static Constant.

  Deprecated. Use ND4JSystemProperties.LOG_INITIALIZATION

  type: java.lang.String"
  Nd4j/LOG_INIT_ENV_PROPERTY)

(defn *-execution-mode
  "Static Field.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode"
  []
  Nd4j/executionMode)

(defn *-alloc
  "Static Field.

  type: org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode"
  []
  Nd4j/alloc)

(defn *-order
  "Static Field.

  type: char"
  []
  Nd4j/ORDER)

(defn *-eps-threshold
  "Static Field.

  type: double"
  []
  Nd4j/EPS_THRESHOLD)

(defn *-max-elements-per-slice
  "Static Field.

  type: int"
  []
  Nd4j/MAX_ELEMENTS_PER_SLICE)

(defn *-max-slices-to-print
  "Static Field.

  type: int"
  []
  Nd4j/MAX_SLICES_TO_PRINT)

(defn *-enforce-numerical-stability
  "Static Field.

  type: boolean"
  []
  Nd4j/ENFORCE_NUMERICAL_STABILITY)

(defn *-copy-on-ops
  "Static Field.

  type: boolean"
  []
  Nd4j/copyOnOps)

(defn *-should-instrument
  "Static Field.

  type: boolean"
  []
  Nd4j/shouldInstrument)

(defn *-resource-manager-on
  "Static Field.

  type: boolean"
  []
  Nd4j/resourceManagerOn)

(defn *-compress-debug
  "Static Field.

  type: boolean"
  []
  Nd4j/compressDebug)

(defn *-prevent-unpack
  "Static Field.

  type: volatile boolean"
  []
  Nd4j/preventUnpack)

(defn *-backend
  "Static Field.

  type: org.nd4j.linalg.factory.Nd4jBackend"
  []
  Nd4j/backend)

(defn *-random-factory
  "Static Field.

  type: org.nd4j.linalg.factory.RandomFactory"
  []
  Nd4j/randomFactory)

(defn *read-numpy
  "Read line via input streams

  file-path - the input stream ndarray - `java.io.InputStream`
  split - the split separator - `java.lang.String`

  returns: the read txt method - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.io.InputStream file-path ^java.lang.String split]
    (Nd4j/readNumpy file-path split))
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.String file-path]
    (Nd4j/readNumpy file-path)))

(defn *arg-min
  "arr - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (Nd4j/argMin arr dimension)))

(defn *to-flattened
  "Create a long row vector of all of the given ndarrays

  order - the order in which to flatten the matrices - `char`
  matrices - the matrices to create the flattened ndarray for - `java.util.Collection`

  returns: the flattened representation of
  these ndarrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Character order ^java.util.Collection matrices]
    (Nd4j/toFlattened order matrices))
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.Collection matrices]
    (Nd4j/toFlattened matrices)))

(defn *get-complex-strides
  "Get the strides for the given order and shape

  shape - the shape of the ndarray - `int[]`
  order - the order to getScalar the strides for - `char`

  returns: the strides for the given shape and order - `int[]`"
  ([shape ^Character order]
    (Nd4j/getComplexStrides shape order))
  ([shape]
    (Nd4j/getComplexStrides shape)))

(defn *diag
  "Creates a new matrix where the values of the given vector are the diagonal values of
  the matrix if a vector is passed in, if a matrix is returns the kth diagonal
  in the matrix

  x - the diagonal values - `org.nd4j.linalg.api.ndarray.INDArray`
  k - the kth diagonal to get - `int`

  returns: new matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x ^Integer k]
    (Nd4j/diag x k))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x]
    (Nd4j/diag x)))

(defn *random-binomial
  "Generate an array with random values generated according to a binomial distribution with the specified
  number of trials and probability

  n-trials - Number of trials. Must be >= 0 - `int`
  p - Probability. Must be in range 0 to 1 - `double`
  shape - Shape of the result array - `long`

  returns: Result array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer n-trials ^Double p ^Long shape]
    (Nd4j/randomBinomial n-trials p shape)))

(defn *min
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/min compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/min compute)))

(defn *zeros
  "Creates a row vector with the specified number of columns

  rows - the rows of the sndarray - `long`
  columns - the columns of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Long rows ^Long columns]
    (Nd4j/zeros rows columns))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer columns]
    (Nd4j/zeros columns))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer rows ^Integer columns stride ^Long offset ^Character ordering]
    (Nd4j/zeros rows columns stride offset ordering))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer rows ^Integer columns stride ^Long offset]
    (Nd4j/zeros rows columns stride offset))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape stride ^Long offset]
    (Nd4j/zeros shape stride offset)))

(defn *set-num-threads
  "This method sets maximal allowed number of threads for Nd4j

  numthreads - `int`"
  ([^Integer numthreads]
    (Nd4j/setNumThreads numthreads)))

(defn *type-conversion
  "array - `org.nd4j.linalg.api.ndarray.INDArray`
  target-type - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx target-type]
    (Nd4j/typeConversion array target-type)))

(defn *sparse-factory
  "returns: `org.nd4j.linalg.factory.NDArrayFactory`"
  (^org.nd4j.linalg.factory.NDArrayFactory []
    (Nd4j/sparseFactory )))

(defn *pad
  "Pad the given ndarray to the size along each dimension

  to-pad - the ndarray to pad - `org.nd4j.linalg.api.ndarray.INDArray`
  pad-width - the width to pad along each dimension - `int[][]`
  constant-values - the values to append for each dimension - `java.util.List`
  pad-mode - the mode to pad in - `org.nd4j.linalg.factory.Nd4j$PadMode`

  returns: the padded ndarray
  based on the specified mode - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-pad pad-width ^java.util.List constant-values ^org.nd4j.linalg.factory.Nd4j$PadMode pad-mode]
    (Nd4j/pad to-pad pad-width constant-values pad-mode))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-pad pad-width ^org.nd4j.linalg.factory.Nd4j$PadMode pad-mode]
    (Nd4j/pad to-pad pad-width pad-mode)))

(defn *factory
  "The factory used for creating ndarrays

  returns: the factory instance used for creating ndarrays - `org.nd4j.linalg.factory.NDArrayFactory`"
  (^org.nd4j.linalg.factory.NDArrayFactory []
    (Nd4j/factory )))

(defn *std
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/std compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/std compute)))

(defn *ones
  "Creates a row vector with the specified number of columns

  rows - the number of rows in the matrix - `int`
  columns - the columns of the ndarray - `int`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer rows ^Integer columns]
    (Nd4j/ones rows columns))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer columns]
    (Nd4j/ones columns)))

(defn *squeeze
  "Squeeze : removes a dimension of size 1

  input - the input array - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to remove - `int`

  returns: the array with dimension removed - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray input ^Integer dimension]
    (Nd4j/squeeze input dimension)))

(defn *write-txt
  "Deprecated. custom col separators are no longer supported; uses \",\"

  write - `org.nd4j.linalg.api.ndarray.INDArray`
  file-path - `java.lang.String`
  split - the split separator, defaults to \",\" - `java.lang.String`
  precision - digits after the decimal point - `int`"
  ([^org.nd4j.linalg.api.ndarray.INDArray write ^java.lang.String file-path ^java.lang.String split ^Integer precision]
    (Nd4j/writeTxt write file-path split precision))
  ([^org.nd4j.linalg.api.ndarray.INDArray write ^java.lang.String file-path ^Integer precision]
    (Nd4j/writeTxt write file-path precision))
  ([^org.nd4j.linalg.api.ndarray.INDArray write ^java.lang.String file-path]
    (Nd4j/writeTxt write file-path)))

(defn *read-binary
  "Read a binary ndarray from the given file

  read - the nd array to read - `java.io.File`

  returns: the loaded ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.io.File read]
    (Nd4j/readBinary read)))

(defn *allows-specify-ordering
  "Backend specific:
  Returns whether specifying the order
  for the blas impl is allowed (cblas)

  returns: true if the blas impl
  can support specifying array order - `boolean`"
  (^Boolean []
    (Nd4j/allowsSpecifyOrdering )))

(defn *read-txt-string
  "Read line via input streams

  ndarray - the input stream ndarray - `java.io.InputStream`

  returns: NDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.io.InputStream ndarray]
    (Nd4j/readTxtString ndarray)))

(defn *copy
  "Copy a to b

  a - the origin matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  b - the destination matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (Nd4j/copy a b)))

(defn *prepend
  "Append the given
  array with the specified value size
  along a particular axis

  arr - the array to append to - `org.nd4j.linalg.api.ndarray.INDArray`
  pad-amount - the pad amount of the array to be returned - `int`
  val - the value to append - `double`
  axis - the axis to append to - `int`

  returns: the newly created array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer pad-amount ^Double val ^Integer axis]
    (Nd4j/prepend arr pad-amount val axis)))

(defn *shape
  "Returns the shape of the ndarray

  arr - the array to get the shape of - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the shape of tihs ndarray - `long[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4j/shape arr)))

(defn *scalar
  "Create a scalar ndarray with the specified offset

  value - the value to initialize the scalar with - `java.lang.Number`
  offset - the offset of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.Number value ^Long offset]
    (Nd4j/scalar value offset))
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.Number value]
    (Nd4j/scalar value)))

(defn *save-binary
  "Save an ndarray to the given file

  arr - the array to save - `org.nd4j.linalg.api.ndarray.INDArray`
  save-to - the file to save to - `java.io.File`

  throws: java.io.IOException"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^java.io.File save-to]
    (Nd4j/saveBinary arr save-to)))

(defn *set-data-type
  "This method sets dataType for the current JVM runtime

  d-type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer$Type d-type]
    (Nd4j/setDataType d-type)))

(defn *get-random
  "Get the current random generator

  returns: the current random generator - `org.nd4j.linalg.api.rng.Random`"
  (^org.nd4j.linalg.api.rng.Random []
    (Nd4j/getRandom )))

(defn *mean
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/mean compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/mean compute)))

(defn *var
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/var compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/var compute)))

(defn *prod
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/prod compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/prod compute)))

(defn *sum
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/sum compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/sum compute)))

(defn *reverse
  "Reverses the passed in matrix such that m[0] becomes m[m.length - 1] etc

  reverse - the matrix to reverse - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the reversed matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray reverse]
    (Nd4j/reverse reverse)))

(defn *rand
  "Generates a random matrix between min and max

  rows - the number of rows of the matrix - `int`
  columns - the number of columns in the matrix - `int`
  min - the minimum number - `double`
  max - the maximum number - `double`
  rng - the rng to use - `org.nd4j.linalg.api.rng.Random`

  returns: a drandom matrix of the specified shape and range - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer rows ^Integer columns ^Double min ^Double max ^org.nd4j.linalg.api.rng.Random rng]
    (Nd4j/rand rows columns min max rng))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^Double min ^Double max ^org.nd4j.linalg.api.rng.Random rng]
    (Nd4j/rand shape min max rng))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Character order ^Integer rows ^Integer columns]
    (Nd4j/rand order rows columns))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Character order shape]
    (Nd4j/rand order shape))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape]
    (Nd4j/rand shape)))

(defn *create-from-npy-pointer
  "Create from an in memory numpy pointer

  pointer - the pointer to thenumpy array - `org.bytedeco.javacpp.Pointer`

  returns: an ndarray created from the in memory
  numpy pointer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.bytedeco.javacpp.Pointer pointer]
    (Nd4j/createFromNpyPointer pointer)))

(defn *create-buffer
  "Creates a buffer of the specified opType
  and length with the given byte buffer.
  This will wrap the buffer as a reference (no copy)
  if the allocation opType is the same.

  buffer - the buffer to create from - `java.nio.ByteBuffer`
  type - the opType of buffer to create - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  length - the length of the buffer - `int`
  offset - `long`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^java.nio.ByteBuffer buffer ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Integer length ^Long offset]
    (Nd4j/createBuffer buffer type length offset))
  (^org.nd4j.linalg.api.buffer.DataBuffer [^org.nd4j.linalg.api.buffer.DataBuffer underlying-buffer ^Long offset ^Long length]
    (Nd4j/createBuffer underlying-buffer offset length))
  (^org.nd4j.linalg.api.buffer.DataBuffer [data ^Long offset]
    (Nd4j/createBuffer data offset))
  (^org.nd4j.linalg.api.buffer.DataBuffer [data]
    (Nd4j/createBuffer data)))

(defn *repeat
  "Create an n x (shape)
  ndarray where the ndarray is repeated num times

  n - the ndarray to replicate - `org.nd4j.linalg.api.ndarray.INDArray`
  num - the number of copies to repeat - `int`

  returns: the repeated ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray n ^Integer num]
    (Nd4j/repeat n num)))

(defn *num-threads
  "This method returns maximal allowed number of threads for Nd4j.
  If value wasn't set in advance, max(1, availableProcessor) will be returned

  returns: `int`"
  (^Integer []
    (Nd4j/numThreads )))

(defn *roll-axis
  "Roll the specified axis backwards,
  until it lies in a given position.
  See numpy's rollaxis

  a - the array to roll - `org.nd4j.linalg.api.ndarray.INDArray`
  axis - the axis to roll backwards - `int`
  start - the starting point - `int`

  returns: the rolled ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^Integer axis ^Integer start]
    (Nd4j/rollAxis a axis start))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^Integer axis]
    (Nd4j/rollAxis a axis)))

(defn *skip-thread-safety-checks
  "really-skip - `boolean`"
  ([^Boolean really-skip]
    (Nd4j/skipThreadSafetyChecks really-skip)))

(defn *max
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/max compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/max compute)))

(defn *linspace
  "Generate a linearly spaced vector

  lower - upper bound - `long`
  upper - lower bound - `long`
  num - the step size - `long`

  returns: the linearly spaced vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Long lower ^Long upper ^Long num]
    (Nd4j/linspace lower upper num)))

(defn *are-thread-safety-checks-skipped
  "returns: `boolean`"
  (^Boolean []
    (Nd4j/areThreadSafetyChecksSkipped )))

(defn *ones-like
  "Ones like

  arr - the array to create the ones like - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: ones in the shape of the given array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4j/onesLike arr)))

(defn *special-concat
  "Concatneate ndarrays along a dimension
  PLEASE NOTE: This method is special for GPU backend, it works on HOST side only.

  dimension - `int`
  to-concat - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (Nd4j/specialConcat dimension to-concat)))

(defn *sort-columns
  "Sort (shuffle) the columns of a 2d array according to the value at a specified row.
  Other than the order of the columns, each column is unmodified. Copy operation: original
  INDArray is unmodified
  So if sorting the following on values of row 1 (ascending):
  [a b c]
  [1 -1 0]
  [d e f]
  Then output is
  [b c a]
  [-1 0 1]
  [e f d]

  in - 2d array to sort - `org.nd4j.linalg.api.ndarray.INDArray`
  row-idx - The row to sort on - `int`
  ascending - true if smallest-to-largest; false if largest-to-smallest - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Integer row-idx ^Boolean ascending]
    (Nd4j/sortColumns in row-idx ascending)))

(defn *gemm
  "Matrix multiply: Implements c = alpha*op(a)*op(b)  beta*c where op(X) means transpose X (or not)
  depending on setting of arguments transposeA and transposeB.
  Note that matrix c MUST be fortran order, have zero offset and have c.data().length == c.length().
  An exception will be thrown otherwise.
  Don't use this unless you know about level 3 blas and NDArray storage orders.

  a - First matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  b - Second matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  c - result matrix. Used in calculation (assuming beta != 0) and result is stored in this. f order,zero offset and length == data.length only - `org.nd4j.linalg.api.ndarray.INDArray`
  transpose-a - if true: transpose matrix a before mmul - `boolean`
  transpose-b - if true: transpose matrix b before mmul - `boolean`
  alpha - `double`
  beta - `double`

  returns: result, i.e., matrix c is returned for convenience - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^Boolean transpose-a ^Boolean transpose-b ^Double alpha ^Double beta]
    (Nd4j/gemm a b c transpose-a transpose-b alpha beta))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Boolean transpose-a ^Boolean transpose-b]
    (Nd4j/gemm a b transpose-a transpose-b)))

(defn *create-from-npy-file
  "Create from a given numpy file.

  file - the file to create the ndarray from - `java.io.File`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.io.File file]
    (Nd4j/createFromNpyFile file)))

(defn *shuffle
  "In place shuffle of an ndarray
  along a specified set of dimensions

  to-shuffle - the ndarray to shuffle - `org.nd4j.linalg.api.ndarray.INDArray`
  random - the random to use - `java.util.Random`
  dimension - the dimension to do the shuffle - `int`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to-shuffle ^java.util.Random random ^Integer dimension]
    (Nd4j/shuffle to-shuffle random dimension))
  ([^org.nd4j.linalg.api.ndarray.INDArray to-shuffle ^Integer dimension]
    (Nd4j/shuffle to-shuffle dimension)))

(defn *read
  "Raad an ndarray from an input stream

  reader - the input stream to use - `java.io.InputStream`

  returns: the given ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.io.InputStream reader]
    (Nd4j/read reader)))

(defn *random-bernoulli
  "Generate a random array according to a binomial distribution with probability p: i.e., values 0 with probability
  (1-p) or value 1 with probability p

  p - Probability. Must be in range 0 to 1 - `double`
  shape - Shape of the result array - `long`

  returns: Result array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Double p ^Long shape]
    (Nd4j/randomBernoulli p shape)))

(defn *create-array-from-shape-buffer
  "data - `org.nd4j.linalg.api.buffer.DataBuffer`
  shape-info - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.buffer.DataBuffer data ^org.nd4j.linalg.api.buffer.DataBuffer shape-info]
    (Nd4j/createArrayFromShapeBuffer data shape-info)))

(defn *get-instrumentation
  "Gets the instrumentation instance

  returns: the instrumentation instance - `org.nd4j.linalg.api.instrumentation.Instrumentation`"
  (^org.nd4j.linalg.api.instrumentation.Instrumentation []
    (Nd4j/getInstrumentation )))

(defn *append-bias
  "vectors - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray vectors]
    (Nd4j/appendBias vectors)))

(defn *fallback-mode-enabled?
  "This method checks, if fallback mode was enabled.

  returns: `boolean`"
  (^Boolean []
    (Nd4j/isFallbackModeEnabled )))

(defn *get-sparse-blas-wrapper
  "returns: `org.nd4j.linalg.factory.BlasWrapper`"
  (^org.nd4j.linalg.factory.BlasWrapper []
    (Nd4j/getSparseBlasWrapper )))

(defn *size-of-data-type
  "This method returns size of element for specified dataType, in bytes

  dtype - number of bytes per element - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.buffer.DataBuffer$Type dtype]
    (Nd4j/sizeOfDataType dtype))
  (^Integer []
    (Nd4j/sizeOfDataType )))

(defn *strip-ones
  "Reshapes an ndarray to remove leading 1s

  to-strip - the ndarray to newShapeNoCopy - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the reshaped ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-strip]
    (Nd4j/stripOnes to-strip)))

(defn *get-nd-array-factory
  "returns: `org.nd4j.linalg.factory.NDArrayFactory`"
  (^org.nd4j.linalg.factory.NDArrayFactory []
    (Nd4j/getNDArrayFactory )))

(defn *sort
  "Sort an ndarray along a particular dimension
  Note that the input array is modified in-place.

  ndarray - the ndarray to sort - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to sort - `int`
  ascending - `boolean`

  returns: the sorted ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray ndarray ^Integer dimension ^Boolean ascending]
    (Nd4j/sort ndarray dimension ascending))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray ndarray ^Boolean ascending]
    (Nd4j/sort ndarray ascending)))

(defn *get-convolution
  "Get the convolution singleton

  returns: the convolution singleton - `org.nd4j.linalg.convolution.ConvolutionInstance`"
  (^org.nd4j.linalg.convolution.ConvolutionInstance []
    (Nd4j/getConvolution )))

(defn *rot
  "Reverses the passed in matrix such that m[0] becomes m[m.length - 1] etc

  reverse - the matrix to reverse - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the reversed matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray reverse]
    (Nd4j/rot reverse)))

(defn *set-convolution
  "Set a convolution instance

  convolution-instance - `org.nd4j.linalg.convolution.ConvolutionInstance`"
  ([^org.nd4j.linalg.convolution.ConvolutionInstance convolution-instance]
    (Nd4j/setConvolution convolution-instance)))

(defn *zeros-like
  "Empty like

  arr - the array to create the ones like - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: ones in the shape of the given array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4j/zerosLike arr)))

(defn *bilinear-products
  "Returns a column vector where each entry is the nth bilinear
  product of the nth slices of the two tensors.

  curr - `org.nd4j.linalg.api.ndarray.INDArray`
  in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray curr ^org.nd4j.linalg.api.ndarray.INDArray in]
    (Nd4j/bilinearProducts curr in)))

(defn *read-txt
  "Read line via input streams

  file-path - the input stream ndarray - `java.lang.String`

  returns: NDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.String file-path]
    (Nd4j/readTxt file-path)))

(defn *true-scalar
  "This method creates new 0D INDArray, aka scalar.
  PLEASE NOTE: Temporary method, added to ensure backward compatibility

  scalar - `java.lang.Number`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.Number scalar]
    (Nd4j/trueScalar scalar)))

(defn *get-sparse-info-provider
  "returns: `org.nd4j.linalg.api.ndarray.SparseInfoProvider`"
  (^org.nd4j.linalg.api.ndarray.SparseInfoProvider []
    (Nd4j/getSparseInfoProvider )))

(defn *set-factory
  "factory - `org.nd4j.linalg.factory.NDArrayFactory`"
  ([^org.nd4j.linalg.factory.NDArrayFactory factory]
    (Nd4j/setFactory factory)))

(defn *norm-1
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/norm1 compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/norm1 compute)))

(defn *create-npy-from-input-stream
  "Create a numpy array based on the passed in
  input stream

  is - the input stream to read - `java.io.InputStream`

  returns: the loaded ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.io.InputStream is]
    (Nd4j/createNpyFromInputStream is)))

(defn *create-from-flat-array
  "Create an INDArray
  from a flatbuffers FlatArray

  array - the array to create the INDArray from - `org.nd4j.graph.FlatArray`

  returns: the created INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.graph.FlatArray array]
    (Nd4j/createFromFlatArray array)))

(defn *to-npy-byte-array
  "Converts an INDArray
  to a byte array

  input - the input array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the INDArray as a byte array
  with the numpy format.
  For more on the format, see: https://docs.scipy.org/doc/numpy-1.14.0/neps/npy-format.html - `byte[]`

  throws: java.io.IOException"
  ([^org.nd4j.linalg.api.ndarray.INDArray input]
    (Nd4j/toNpyByteArray input)))

(defn *tile
  "An alias for repmat

  tile - the ndarray to tile - `org.nd4j.linalg.api.ndarray.INDArray`
  repeat - the shape to repeat - `int`

  returns: the tiled ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray tile ^Integer repeat]
    (Nd4j/tile tile repeat)))

(defn *set-nd-array-factory-clazz
  "clazz - `java.lang.Class`"
  ([^java.lang.Class clazz]
    (Nd4j/setNdArrayFactoryClazz clazz)))

(defn *tear
  "This method does the opposite to pile/vstack/hstack - it returns independent TAD copies along given dimensions

  tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray tensor ^Integer dimensions]
    (Nd4j/tear tensor dimensions)))

(defn *pull-rows
  "This method produces concatenated array,
  that consist from tensors,
  fetched from source array,
  against some dimension and specified indexes

  source - source tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  source-dimension - dimension of source tensor - `int`
  indexes - indexes from source array - `int[]`
  order - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes ^Character order]
    (Nd4j/pullRows source source-dimension indexes order))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes]
    (Nd4j/pullRows source source-dimension indexes)))

(defn *from-byte-array
  "Read an ndarray from a byte array

  arr - the array to read from - `byte[]`

  returns: the deserialized ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [arr]
    (Nd4j/fromByteArray arr)))

(defn *get-blas-wrapper
  "returns: `org.nd4j.linalg.factory.BlasWrapper`"
  (^org.nd4j.linalg.factory.BlasWrapper []
    (Nd4j/getBlasWrapper )))

(defn *get-backend
  "returns: `org.nd4j.linalg.factory.Nd4jBackend`"
  (^org.nd4j.linalg.factory.Nd4jBackend []
    (Nd4j/getBackend )))

(defn *eye
  "Create the identity ndarray

  n - the number for the identity - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Long n]
    (Nd4j/eye n)))

(defn *check-shape-values
  "shape - `long[]`"
  ([shape]
    (Nd4j/checkShapeValues shape)))

(defn *set-params
  "Given a sequence of Iterators over a transform of matrices, fill in all of
  the matrices with the entries in the theta vector. Errors are
  thrown if the theta vector does not exactly fill the matrices.

  theta - `org.nd4j.linalg.api.ndarray.INDArray`
  matrices - `java.util.Collection`"
  ([^org.nd4j.linalg.api.ndarray.INDArray theta ^java.util.Collection matrices]
    (Nd4j/setParams theta matrices)))

(defn *get-distributions
  "Get the primary distributions
  factory

  returns: the primary distributions - `org.nd4j.linalg.api.rng.distribution.factory.DistributionFactory`"
  (^org.nd4j.linalg.api.rng.distribution.factory.DistributionFactory []
    (Nd4j/getDistributions )))

(defn *get-compressor
  "This method returns BasicNDArrayCompressor instance,
  suitable for NDArray compression/decompression
  at runtime

  returns: `org.nd4j.linalg.compression.BasicNDArrayCompressor`"
  (^org.nd4j.linalg.compression.BasicNDArrayCompressor []
    (Nd4j/getCompressor )))

(defn *get-shape-info-provider
  "returns: `org.nd4j.linalg.api.ndarray.ShapeInfoProvider`"
  (^org.nd4j.linalg.api.ndarray.ShapeInfoProvider []
    (Nd4j/getShapeInfoProvider )))

(defn *ref-queue
  "The reference queue used for cleaning up
  ndarrays

  returns: the reference queue for cleaning up ndarrays - `java.lang.ref.ReferenceQueue<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.lang.ref.ReferenceQueue []
    (Nd4j/refQueue )))

(defn *do-along-diagonal
  "Perform an operation along a diagonal

  x - the ndarray to perform the operation on - `org.nd4j.linalg.api.ndarray.INDArray`
  func - the operation to perform - `com.google.common.base.Function`"
  ([^org.nd4j.linalg.api.ndarray.INDArray x ^com.google.common.base.Function func]
    (Nd4j/doAlongDiagonal x func)))

(defn *get-op-factory
  "Get the operation factory

  returns: the operation factory - `org.nd4j.linalg.api.ops.factory.OpFactory`"
  (^org.nd4j.linalg.api.ops.factory.OpFactory []
    (Nd4j/getOpFactory )))

(defn *get-affinity-manager
  "returns: `org.nd4j.linalg.api.concurrency.AffinityManager`"
  (^org.nd4j.linalg.api.concurrency.AffinityManager []
    (Nd4j/getAffinityManager )))

(defn *concat
  "Concatneate ndarrays along a dimension

  dimension - the dimension to concatneate along - `int`
  to-concat - the ndarrays to concat - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the merged ndarrays with an output shape of
  the ndarray shapes save the dimension shape specified
  which is then the sum of the sizes along that dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (Nd4j/concat dimension to-concat)))

(defn *empty
  "This method creates \"empty\" INDArray
  PLEASE NOTE: this feature isn't production ready yet

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray []
    (Nd4j/empty ))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (Nd4j/empty type)))

(defn *true-vector
  "data - `float[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [data]
    (Nd4j/trueVector data)))

(defn *norm-2
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/norm2 compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/norm2 compute)))

(defn *write-as-numpy
  "Write an INDArray
  to a File

  arr - the array to write - `org.nd4j.linalg.api.ndarray.INDArray`
  file - the file to write - `java.io.File`

  throws: java.io.IOException - if an error occurs when writing the file"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^java.io.File file]
    (Nd4j/writeAsNumpy arr file)))

(defn *order
  "Returns the ordering of the ndarrays

  returns: the ordering of the ndarrays - `java.lang.Character`"
  (^java.lang.Character []
    (Nd4j/order )))

(defn *set-sparse-factory
  "factory - `org.nd4j.linalg.factory.NDArrayFactory`"
  ([^org.nd4j.linalg.factory.NDArrayFactory factory]
    (Nd4j/setSparseFactory factory)))

(defn *randn
  "Random normal N(0,1) with the specified shape and array order

  order - the order of the output array - `char`
  rows - the number of rows in the matrix - `long`
  columns - the number of columns in the matrix - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Character order ^Long rows ^Long columns]
    (Nd4j/randn order rows columns))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Character order shape]
    (Nd4j/randn order shape))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray target]
    (Nd4j/randn target)))

(defn *data-type
  "Returns the data opType used for the runtime

  returns: the datatype used for the runtime - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type []
    (Nd4j/dataType )))

(defn *expand-dims
  "Expand the array dimensions.
  This is equivalent to
  adding a new axis dimension

  input - the input array - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to add thenew axis at - `int`

  returns: the array with the new axis dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray input ^Integer dimension]
    (Nd4j/expandDims input dimension)))

(defn *set-sparse-nd-array-clazz
  "clazz - `java.lang.Class`"
  ([^java.lang.Class clazz]
    (Nd4j/setSparseNDArrayClazz clazz)))

(defn *write-txt-string
  "Deprecated. custom col separators are no longer supported; uses \",\"

  write - `org.nd4j.linalg.api.ndarray.INDArray`
  os - the outputstream stream ndarray - `java.io.OutputStream`
  split - `java.lang.String`
  precision - `int`"
  ([^org.nd4j.linalg.api.ndarray.INDArray write ^java.io.OutputStream os ^java.lang.String split ^Integer precision]
    (Nd4j/writeTxtString write os split precision))
  ([^org.nd4j.linalg.api.ndarray.INDArray write ^java.io.OutputStream os]
    (Nd4j/writeTxtString write os))
  ([^org.nd4j.linalg.api.ndarray.INDArray write ^java.io.OutputStream os ^Integer precision]
    (Nd4j/writeTxtString write os precision)))

(defn *accumulate
  "This method sums given arrays and stores them to a given target array

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray target ^java.util.Collection arrays]
    (Nd4j/accumulate target arrays))
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.Collection arrays]
    (Nd4j/accumulate arrays)))

(defn *convert-to-numpy
  "Converts an INDArray
  to a numpy struct.

  arr - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: a pointer to the numpy struct - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4j/convertToNumpy arr)))

(defn *arange
  "Array of evenly spaced values.

  begin - the begin of the range - `double`
  end - the end of the range - `double`

  returns: the range vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Double begin ^Double end]
    (Nd4j/arange begin end))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Double end]
    (Nd4j/arange end)))

(defn *vstack
  "Concatenates two matrices vertically. Matrices must have identical
  numbers of columns.

  arrs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arrs]
    (Nd4j/vstack arrs)))

(defn *arg-max
  "arr - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (Nd4j/argMax arr dimension)))

(defn *enable-fallback-mode
  "This method enables fallback to safe-mode for specific operations. Use of this method will reduce performance.
  Currently supported operations are:
  1) CPU GEMM
  PLEASE NOTE: Do not use this method, unless you have too.

  really-enable - `boolean`"
  ([^Boolean really-enable]
    (Nd4j/enableFallbackMode really-enable)))

(defn *append
  "Append the given
  array with the specified value size
  along a particular axis

  arr - the array to append to - `org.nd4j.linalg.api.ndarray.INDArray`
  pad-amount - the pad amount of the array to be returned - `int`
  val - the value to append - `double`
  axis - the axis to append to - `int`

  returns: the newly created array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer pad-amount ^Double val ^Integer axis]
    (Nd4j/append arr pad-amount val axis)))

(defn *create
  "Creates an ndarray with the specified shape

  data - the data to use with the ndarray - `float[]`
  rows - the rows of the ndarray - `int`
  columns - the columns of the ndarray - `int`
  stride - the stride for the ndarray - `int[]`
  offset - the offset of the ndarray - `long`
  ordering - `char`

  returns: the instance - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [data ^Integer rows ^Integer columns stride ^Long offset ^Character ordering]
    (Nd4j/create data rows columns stride offset ordering))
  (^org.nd4j.linalg.api.ndarray.INDArray [data ^Integer rows ^Integer columns stride ^Long offset]
    (Nd4j/create data rows columns stride offset))
  (^org.nd4j.linalg.api.ndarray.INDArray [data shape stride ^Long offset]
    (Nd4j/create data shape stride offset))
  (^org.nd4j.linalg.api.ndarray.INDArray [data shape ^Long offset]
    (Nd4j/create data shape offset))
  (^org.nd4j.linalg.api.ndarray.INDArray [slice-shape arrays]
    (Nd4j/create slice-shape arrays))
  (^org.nd4j.linalg.api.ndarray.INDArray [data]
    (Nd4j/create data)))

(defn *tensor-mmul
  "Tensor matrix multiplication.
  Both tensors must be the same rank

  a - the left tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  b - the right tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result array - `org.nd4j.linalg.api.ndarray.INDArray`
  axes - the axes for each array to do matrix multiply along - `int[][]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray result axes]
    (Nd4j/tensorMmul a b result axes))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b axes]
    (Nd4j/tensorMmul a b axes)))

(defn *pile
  "This method stacks vertically examples with the same shape, increasing result dimensionality. I.e. if you provide bunch of 3D tensors, output will be 4D tensor. Alignment is always applied to axis 0.

  arrays - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (Nd4j/pile arrays)))

(defn *create-uninitialized-detached
  "Cretes uninitialized INDArray detached from any (if any) workspace

  shape - `int[]`
  ordering - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^Character ordering]
    (Nd4j/createUninitializedDetached shape ordering))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape]
    (Nd4j/createUninitializedDetached shape)))

(defn *get-data-buffer-factory
  "returns: `org.nd4j.linalg.api.buffer.factory.DataBufferFactory`"
  (^org.nd4j.linalg.api.buffer.factory.DataBufferFactory []
    (Nd4j/getDataBufferFactory )))

(defn *buffer-ref-queue
  "The reference queue used for cleaning up
  databuffers

  returns: the reference queue for cleaning up databuffers - `java.lang.ref.ReferenceQueue<org.nd4j.linalg.api.buffer.DataBuffer>`"
  (^java.lang.ref.ReferenceQueue []
    (Nd4j/bufferRefQueue )))

(defn *create-uninitialized
  "This method returns uninitialized 2D array of rows x columns
  PLEASE NOTE: memory of underlying array will be NOT initialized, and won't be set to 0.0

  rows - `long`
  columns - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Long rows ^Long columns]
    (Nd4j/createUninitialized rows columns))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape]
    (Nd4j/createUninitialized shape)))

(defn *clear-nans
  "Clear nans from an ndarray

  arr - the array to clear - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4j/clearNans arr)))

(defn *create-buffer-detached
  "Create a buffer equal of length prod(shape). This method is NOT affected by workspaces

  data - `int[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [data]
    (Nd4j/createBufferDetached data))
  (^org.nd4j.linalg.api.buffer.DataBuffer [shape ^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (Nd4j/createBufferDetached shape type)))

(defn *get-random-factory
  "This method returns RandomFactory instance

  returns: `org.nd4j.linalg.factory.RandomFactory`"
  (^org.nd4j.linalg.factory.RandomFactory []
    (Nd4j/getRandomFactory )))

(defn *get-executioner
  "Get the operation executioner instance

  returns: the operation executioner instance - `org.nd4j.linalg.api.ops.executioner.OpExecutioner`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner []
    (Nd4j/getExecutioner )))

(defn *rot-90
  "Rotate a matrix 90 degrees

  to-rotate - the matrix to rotate - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to-rotate]
    (Nd4j/rot90 to-rotate)))

(defn *value-array-of
  "Creates a row vector with the specified number of columns
  Some people may know this as np.full

  rows - the number of rows in the matrix - `long`
  columns - the columns of the ndarray - `long`
  value - the value to assign - `double`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Long rows ^Long columns ^Double value]
    (Nd4j/valueArrayOf rows columns value))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^Double value]
    (Nd4j/valueArrayOf shape value)))

(defn *create-npy-from-byte-array
  "Create an INDArray from
  the given numpy input.
  The numpy input follows the format:
  https://docs.scipy.org/doc/numpy-1.14.0/neps/npy-format.html

  input - the input byte array with the npy format - `byte[]`

  returns: the equivalent INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [input]
    (Nd4j/createNpyFromByteArray input)))

(defn *cumsum
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/cumsum compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/cumsum compute)))

(defn *create-sparse-csr
  "data - `double[]`
  columns - `int[]`
  pointer-b - `int[]`
  pointer-e - `int[]`
  shape - `long[]`

  returns: a INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [data columns pointer-b pointer-e shape]
    (Nd4j/createSparseCSR data columns pointer-b pointer-e shape)))

(defn *write
  "Y
  Write an ndarray to a writer

  writer - the writer to write to - `java.io.OutputStream`
  write - the ndarray to write - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  ([^java.io.OutputStream writer ^org.nd4j.linalg.api.ndarray.INDArray write]
    (Nd4j/write writer write)))

(defn *random-exponential
  "Exponential distribution: P(x) = lambda * exp(-lambda * x)

  lambda - Must be > 0 - `double`
  shape - Shape of the array to generate - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Double lambda ^Long shape]
    (Nd4j/randomExponential lambda shape)))

(defn *triu
  "Upper triangle of an array.
  Return a copy of a matrix with the elements below the `k`-th diagonal
  zeroed.
  Please refer to the documentation for `tril` for further details.

  m - `org.nd4j.linalg.api.ndarray.INDArray`
  k - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray m ^Integer k]
    (Nd4j/triu m k)))

(defn *get-memory-manager
  "This method returns backend-specific MemoryManager implementation, for low-level memory management

  returns: `org.nd4j.linalg.memory.MemoryManager`"
  (^org.nd4j.linalg.memory.MemoryManager []
    (Nd4j/getMemoryManager )))

(defn *sort-with-indices
  "Sort an ndarray along a particular dimension.
  Note that the input array is modified in-place.

  ndarray - the ndarray to sort - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to sort - `int`
  ascending - `boolean`

  returns: the indices and the sorted ndarray (the original array, modified in-place) - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray ndarray ^Integer dimension ^Boolean ascending]
    (Nd4j/sortWithIndices ndarray dimension ascending)))

(defn *hstack
  "Concatenates two matrices horizontally. Matrices must have identical
  numbers of rows.

  arrs - the first matrix to concat - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arrs]
    (Nd4j/hstack arrs)))

(defn *to-byte-array
  "Convert an ndarray to a byte array

  arr - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the converted byte array - `byte[]`

  throws: java.io.IOException"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4j/toByteArray arr)))

(defn *average-and-propagate
  "This method averages input arrays, and returns averaged array.
  On top of that, averaged array is propagated to all input arrays

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray target arrays]
    (Nd4j/averageAndPropagate target arrays))
  (^org.nd4j.linalg.api.ndarray.INDArray [arrays]
    (Nd4j/averageAndPropagate arrays)))

(defn *sort-rows
  "Sort (shuffle) the rows of a 2d array according to the value at a specified column.
  Other than the order of the rows, each row is unmodified. Copy operation: original
  INDArray is unmodified
  So if sorting the following on values of column 2 (ascending):
  [a b 2]
  [c d 0]
  [e f -3]
  Then output is
  [e f -3]
  [c d 0]
  [a b 2]

  in - 2d array to sort - `org.nd4j.linalg.api.ndarray.INDArray`
  col-idx - The column to sort on - `int`
  ascending - true if smallest-to-largest; false if largest-to-smallest - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Integer col-idx ^Boolean ascending]
    (Nd4j/sortRows in col-idx ascending)))

(defn *get-constant-handler
  "returns: `org.nd4j.linalg.cache.ConstantHandler`"
  (^org.nd4j.linalg.cache.ConstantHandler []
    (Nd4j/getConstantHandler )))

(defn *normmax
  "compute - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute ^Integer dimension]
    (Nd4j/normmax compute dimension))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray compute]
    (Nd4j/normmax compute)))

(defn *tri
  "Like the scipy function tri.
  From the scipy documentation:
  An array with ones at and below the given diagonal and zeros elsewhere.

  n - number of rows in the array - `int`
  m - number of columns in the array ( can be just equal to n) - `int`
  k - The sub-diagonal at and below which the array is filled.`k` = 0 is the main diagonal, while `k` < 0 is below it,and `k` > 0 is above. The default is 0. - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer n ^Integer m ^Integer k]
    (Nd4j/tri n m k))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer n ^Integer k]
    (Nd4j/tri n k))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Integer n]
    (Nd4j/tri n)))

(defn *set-blas-wrapper
  "Sets the global blas wrapper

  factory - `org.nd4j.linalg.factory.BlasWrapper`"
  ([^org.nd4j.linalg.factory.BlasWrapper factory]
    (Nd4j/setBlasWrapper factory)))

(defn *create-sparse-coo
  "values - a DataBuffer with the sparse non-null values - `org.nd4j.linalg.api.buffer.DataBuffer`
  indices - a DataBuffer with the indexes of the values - `org.nd4j.linalg.api.buffer.DataBuffer`
  sparse-offsets - the sparse - `long[]`
  flags - an array that define the inactive dimension - `int[]`
  shape - `long[]`
  hidden-dimensions - an array containing the position of the hidden dimensions - `int[]`
  underlying-rank - the rank of the original ndarray - `int`

  returns: a INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices sparse-offsets flags shape hidden-dimensions ^Integer underlying-rank]
    (Nd4j/createSparseCOO values indices sparse-offsets flags shape hidden-dimensions underlying-rank))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices ^org.nd4j.linalg.api.buffer.DataBuffer sparse-information shape]
    (Nd4j/createSparseCOO values indices sparse-information shape))
  (^org.nd4j.linalg.api.ndarray.INDArray [data indices shape]
    (Nd4j/createSparseCOO data indices shape)))

(defn *meshgrid
  "Meshgrid op. Returns a pair of arrays where values are broadcast on a 2d grid.
  For example, if x = [1,2,3,4] and y = [5,6,7], then:
  out[0] =
  [1,2,3,4]
  [1,2,3,4]
  [1,2,3,4]

  out[1] =
  [5,5,5,5]
  [6,6,6,6]
  [7,7,7,7]

  x - X array input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - Y array input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: INDArray[] of length 2, shape [y.length, x.length] - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (Nd4j/meshgrid x y)))

(defn *empty-like
  "Empty like

  arr - the array to create the ones like - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: ones in the shape of the given array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Nd4j/emptyLike arr)))

(defn *choice
  "This method samples value from Source array to Target, with probabilites provided in Probs argument

  source - `org.nd4j.linalg.api.ndarray.INDArray`
  probs - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`
  rng - `org.nd4j.linalg.api.rng.Random`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray source ^org.nd4j.linalg.api.ndarray.INDArray probs ^org.nd4j.linalg.api.ndarray.INDArray target ^org.nd4j.linalg.api.rng.Random rng]
    (Nd4j/choice source probs target rng))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray source ^org.nd4j.linalg.api.ndarray.INDArray probs ^org.nd4j.linalg.api.ndarray.INDArray target]
    (Nd4j/choice source probs target)))

(defn *get-strides
  "Get the strides for the given order and shape

  shape - the shape of the ndarray - `int[]`
  order - the order to getScalar the strides for - `char`

  returns: the strides for the given shape and order - `int[]`"
  ([shape ^Character order]
    (Nd4j/getStrides shape order))
  ([shape]
    (Nd4j/getStrides shape)))

(defn *get-workspace-manager
  "This method returns WorkspaceManager implementation to be used within this JVM process

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspaceManager`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspaceManager []
    (Nd4j/getWorkspaceManager )))

(defn init-context
  "Initializes nd4j"
  ([^Nd4j this]
    (-> this (.initContext))))

(defn init-with-backend
  "Initialize with the specific backend

  backend - the backend to initialize with - `org.nd4j.linalg.factory.Nd4jBackend`"
  ([^Nd4j this ^org.nd4j.linalg.factory.Nd4jBackend backend]
    (-> this (.initWithBackend backend))))

