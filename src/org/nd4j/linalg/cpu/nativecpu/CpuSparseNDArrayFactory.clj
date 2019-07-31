(ns org.nd4j.linalg.cpu.nativecpu.CpuSparseNDArrayFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu CpuSparseNDArrayFactory]))

(defn ->cpu-sparse-nd-array-factory
  "Constructor."
  (^CpuSparseNDArrayFactory []
    (new CpuSparseNDArrayFactory )))

(defn to-flattened
  "Description copied from interface: NDArrayFactory

  order - the order in which the ndarray values should be flattened - `char`
  matrices - the ndarrays to flatten - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^Character order ^java.util.Collection matrices]
    (-> this (.toFlattened order matrices))))

(defn create-lapack
  "Description copied from interface: NDArrayFactory"
  ([^CpuSparseNDArrayFactory this]
    (-> this (.createLapack))))

(defn create-level-2
  "Description copied from interface: NDArrayFactory"
  ([^CpuSparseNDArrayFactory this]
    (-> this (.createLevel2))))

(defn average
  "Description copied from interface: NDArrayFactory

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray target arrays]
    (-> this (.average target arrays)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this arrays]
    (-> this (.average arrays))))

(defn create-from-npy-pointer
  "Description copied from interface: NDArrayFactory

  pointer - the pointer to thenumpy array - `org.bytedeco.javacpp.Pointer`

  returns: an ndarray created from the in memory
  numpy pointer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.createFromNpyPointer pointer))))

(defn special-concat
  "Description copied from interface: NDArrayFactory

  dimension - the dimension to concatneate along - `int`
  to-concat - the ndarrays to concateneate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the concatneated ndarrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (-> this (.specialConcat dimension to-concat))))

(defn create-from-npy-file
  "Description copied from interface: NDArrayFactory

  file - the file to create the ndarray from - `java.io.File`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^java.io.File file]
    (-> this (.createFromNpyFile file))))

(defn shuffle
  "Description copied from interface: NDArrayFactory

  array - the ndarray to shuffle - `org.nd4j.linalg.api.ndarray.INDArray`
  rnd - `java.util.Random`
  dimension - the dimension to do the shuffle - `int`"
  ([^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray array ^java.util.Random rnd ^Integer dimension]
    (-> this (.shuffle array rnd dimension))))

(defn sort
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  descending - `boolean`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean descending ^Integer dimension]
    (-> this (.sort x descending dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean descending]
    (-> this (.sort x descending))))

(defn true-scalar
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^java.lang.Number value]
    (-> this (.trueScalar value))))

(defn sort-coo-indices
  "x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.sortCooIndices x))))

(defn tear
  "tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray tensor ^Integer dimensions]
    (-> this (.tear tensor dimensions))))

(defn pull-rows
  "Description copied from interface: NDArrayFactory

  source - `org.nd4j.linalg.api.ndarray.INDArray`
  destination - `org.nd4j.linalg.api.ndarray.INDArray`
  source-dimension - `int`
  indexes - `int[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^org.nd4j.linalg.api.ndarray.INDArray destination ^Integer source-dimension indexes]
    (-> this (.pullRows source destination source-dimension indexes)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes]
    (-> this (.pullRows source source-dimension indexes))))

(defn convert-data-ex
  "type-src - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`
  source - `org.bytedeco.javacpp.Pointer`
  type-dst - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`
  target - `org.bytedeco.javacpp.Pointer`
  length - `long`"
  ([^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.bytedeco.javacpp.Pointer source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst ^org.bytedeco.javacpp.Pointer target ^Long length]
    (-> this (.convertDataEx type-src source type-dst target length)))
  ([^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.nd4j.linalg.api.buffer.DataBuffer source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst ^org.nd4j.linalg.api.buffer.DataBuffer target]
    (-> this (.convertDataEx type-src source type-dst target)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.nd4j.linalg.api.ndarray.INDArray source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst]
    (-> this (.convertDataEx type-src source type-dst))))

(defn empty
  "type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (-> this (.empty type))))

(defn accumulate
  "Description copied from interface: NDArrayFactory

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray target ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.accumulate target arrays))))

(defn convert-to-numpy
  "Description copied from interface: NDArrayFactory

  array - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.convertToNumpy array))))

(defn create
  "Description copied from interface: NDArrayFactory

  data - the data to use with the ndarray - `org.nd4j.linalg.api.buffer.DataBuffer`
  rows - the rows of the ndarray - `long`
  columns - the columns of the ndarray - `long`
  stride - the stride for the ndarray - `int[]`
  offset - the offset of the ndarray - `long`

  returns: the instance - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer data ^Long rows ^Long columns stride ^Long offset]
    (-> this (.create data rows columns stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this data shape stride ^Long offset]
    (-> this (.create data shape stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^java.util.List list shape]
    (-> this (.create list shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this data]
    (-> this (.create data)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this data ^Long rows ^Long columns stride ^Long offset ^Character ordering]
    (-> this (.create data rows columns stride offset ordering)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^java.util.List list shape ^Character ordering]
    (-> this (.create list shape ordering))))

(defn create-uninitialized-detached
  "Description copied from interface: NDArrayFactory

  shape - `int[]`
  ordering - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this shape ^Character ordering]
    (-> this (.createUninitializedDetached shape ordering))))

(defn create-uninitialized
  "shape - `long[]`
  ordering - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this shape ^Character ordering]
    (-> this (.createUninitialized shape ordering))))

(defn create-level-1
  "Description copied from interface: NDArrayFactory"
  ([^CpuSparseNDArrayFactory this]
    (-> this (.createLevel1))))

(defn create-level-3
  "Description copied from interface: NDArrayFactory"
  ([^CpuSparseNDArrayFactory this]
    (-> this (.createLevel3))))

(defn create-sparse-csr
  "data - `double[]`
  columns - `int[]`
  pointer-b - `int[]`
  pointer-e - `int[]`
  shape - `long[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this data columns pointer-b pointer-e shape]
    (-> this (.createSparseCSR data columns pointer-b pointer-e shape))))

(defn create-blas
  "Description copied from interface: NDArrayFactory"
  ([^CpuSparseNDArrayFactory this]
    (-> this (.createBlas))))

(defn create-sparse-coo
  "values - `org.nd4j.linalg.api.buffer.DataBuffer`
  indices - `org.nd4j.linalg.api.buffer.DataBuffer`
  sparse-offsets - `long[]`
  flags - `int[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`
  shape - `long[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices sparse-offsets flags hidden-dimensions ^Integer underlying-rank shape]
    (-> this (.createSparseCOO values indices sparse-offsets flags hidden-dimensions underlying-rank shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices ^org.nd4j.linalg.api.buffer.DataBuffer sparse-information shape]
    (-> this (.createSparseCOO values indices sparse-information shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this values indices shape]
    (-> this (.createSparseCOO values indices shape))))

(defn create-from-npy-header-pointer
  "Description copied from interface: NDArrayFactory

  pointer - the pointer to thenumpy header - `org.bytedeco.javacpp.Pointer`

  returns: an ndarray created from the in memory
  numpy pointer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuSparseNDArrayFactory this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.createFromNpyHeaderPointer pointer))))

