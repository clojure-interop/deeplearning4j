(ns org.nd4j.linalg.cpu.nativecpu.CpuNDArrayFactory
  "NDArrayFactory
 for cpus and the nd4j-native backend."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu CpuNDArrayFactory]))

(defn ->cpu-nd-array-factory
  "Constructor.

  dtype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  order - `java.lang.Character`"
  (^CpuNDArrayFactory [^org.nd4j.linalg.api.buffer.DataBuffer$Type dtype ^java.lang.Character order]
    (new CpuNDArrayFactory dtype order))
  (^CpuNDArrayFactory []
    (new CpuNDArrayFactory )))

(defn to-flattened
  "Description copied from interface: NDArrayFactory

  order - the order in which the ndarray values should be flattened - `char`
  matrices - the ndarrays to flatten - `java.util.Collection`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^Character order ^java.util.Collection matrices]
    (-> this (.toFlattened order matrices))))

(defn create-lapack
  "Description copied from interface: NDArrayFactory"
  ([^CpuNDArrayFactory this]
    (-> this (.createLapack))))

(defn create-level-2
  "Description copied from interface: NDArrayFactory"
  ([^CpuNDArrayFactory this]
    (-> this (.createLevel2))))

(defn average
  "This method averages input arrays, and returns averaged array

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray target arrays]
    (-> this (.average target arrays)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this arrays]
    (-> this (.average arrays))))

(defn special-concat
  "For CPU backend this method is equal to concat()

  dimension - the dimension to concatneate along - `int`
  to-concat - the ndarrays to concateneate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (-> this (.specialConcat dimension to-concat))))

(defn shuffle
  "In place shuffle of an ndarray
  along a specified set of dimensions

  array - the ndarray to shuffle - `org.nd4j.linalg.api.ndarray.INDArray`
  rnd - `java.util.Random`
  dimension - the dimension to do the shuffle - `int`"
  ([^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray array ^java.util.Random rnd ^Integer dimension]
    (-> this (.shuffle array rnd dimension))))

(defn sort
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  descending - `boolean`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean descending ^Integer dimension]
    (-> this (.sort x descending dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean descending]
    (-> this (.sort x descending))))

(defn sort-coo-indices
  "x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.sortCooIndices x))))

(defn tear
  "tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray tensor ^Integer dimensions]
    (-> this (.tear tensor dimensions))))

(defn pull-rows
  "This method produces concatenated array, that consist from tensors, fetched from source array, against some dimension and specified indexes

  source - source tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  source-dimension - dimension of source tensor - `int`
  indexes - indexes from source array - `long[]`
  order - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes ^Character order]
    (-> this (.pullRows source source-dimension indexes order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes]
    (-> this (.pullRows source source-dimension indexes))))

(defn convert-data-ex
  "This method converts Single/Double precision databuffer to Half-precision databuffer

  type-src - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`
  source - `org.nd4j.linalg.api.ndarray.INDArray`
  type-dst - @return - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.nd4j.linalg.api.ndarray.INDArray source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst]
    (-> this (.convertDataEx type-src source type-dst)))
  ([^CpuNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.bytedeco.javacpp.Pointer source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst ^org.bytedeco.javacpp.Pointer target ^Long length]
    (-> this (.convertDataEx type-src source type-dst target length)))
  ([^CpuNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.bytedeco.javacpp.Pointer source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.convertDataEx type-src source type-dst buffer))))

(defn concat
  "concatenate ndarrays along a dimension

  dimension - the dimension to concatenate along - `int`
  to-concat - the ndarrays to concatenate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the concatenate ndarrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (-> this (.concat dimension to-concat))))

(defn empty
  "type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (-> this (.empty type))))

(defn accumulate
  "Description copied from interface: NDArrayFactory

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray target ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.accumulate target arrays))))

(defn create
  "Description copied from interface: NDArrayFactory

  data - the data to use with the ndarray - `org.nd4j.linalg.api.buffer.DataBuffer`
  rows - the rows of the ndarray - `long`
  columns - the columns of the ndarray - `long`
  stride - the stride for the ndarray - `int[]`
  offset - the offset of the ndarray - `long`

  returns: the instance - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer data ^Long rows ^Long columns stride ^Long offset]
    (-> this (.create data rows columns stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this data shape stride ^Long offset]
    (-> this (.create data shape stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this shape ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.create shape buffer)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this data]
    (-> this (.create data)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this data ^Long rows ^Long columns stride ^Long offset ^Character ordering]
    (-> this (.create data rows columns stride offset ordering)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this data shape ^Character ordering]
    (-> this (.create data shape ordering))))

(defn create-uninitialized-detached
  "Description copied from interface: NDArrayFactory

  shape - `int[]`
  ordering - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this shape ^Character ordering]
    (-> this (.createUninitializedDetached shape ordering))))

(defn create-uninitialized
  "shape - `int[]`
  ordering - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this shape ^Character ordering]
    (-> this (.createUninitialized shape ordering))))

(defn create-level-1
  "Description copied from interface: NDArrayFactory"
  ([^CpuNDArrayFactory this]
    (-> this (.createLevel1))))

(defn create-level-3
  "Description copied from interface: NDArrayFactory"
  ([^CpuNDArrayFactory this]
    (-> this (.createLevel3))))

(defn create-sparse-csr
  "data - `double[]`
  columns - `int[]`
  pointer-b - `int[]`
  pointer-e - `int[]`
  shape - `long[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this data columns pointer-b pointer-e shape]
    (-> this (.createSparseCSR data columns pointer-b pointer-e shape))))

(defn create-blas
  "Description copied from interface: NDArrayFactory"
  ([^CpuNDArrayFactory this]
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
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices sparse-offsets flags hidden-dimensions ^Integer underlying-rank shape]
    (-> this (.createSparseCOO values indices sparse-offsets flags hidden-dimensions underlying-rank shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices ^org.nd4j.linalg.api.buffer.DataBuffer sparse-information shape]
    (-> this (.createSparseCOO values indices sparse-information shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CpuNDArrayFactory this values indices shape]
    (-> this (.createSparseCOO values indices shape))))

