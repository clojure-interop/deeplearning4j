(ns org.nd4j.linalg.jcublas.JCublasNDArray
  "Created by mjk on 8/23/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas JCublasNDArray]))

(defn ->j-cublas-nd-array
  "Constructor.

  Construct an JCublasNDArray of the specified shape, with optional initialization

  shape - the shape of the JCublasNDArray - `int[]`
  stride - the stride of the JCublasNDArray - `int[]`
  offset - the desired offset - `long`
  ordering - the ordering of the JCublasNDArray - `char`
  initialize - Whether to initialize the INDArray. If true: initialize. If false: don't. - `boolean`"
  (^JCublasNDArray [shape stride ^Long offset ^Character ordering ^Boolean initialize]
    (new JCublasNDArray shape stride offset ordering initialize))
  (^JCublasNDArray [shape stride ^Long offset ^Character ordering]
    (new JCublasNDArray shape stride offset ordering))
  (^JCublasNDArray [data shape ^Character ordering]
    (new JCublasNDArray data shape ordering))
  (^JCublasNDArray [data shape]
    (new JCublasNDArray data shape))
  (^JCublasNDArray [data]
    (new JCublasNDArray data))
  (^JCublasNDArray []
    (new JCublasNDArray )))

(defn migrate
  "This method pulls this INDArray into current Workspace.
  PLEASE NOTE: If there's no current Workspace - INDArray returned as is

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this]
    (-> this (.migrate))))

(defn permutei
  "Description copied from class: BaseNDArray

  rearrange - the dimensions to swap to - `int`

  returns: the current array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this ^Integer rearrange]
    (-> this (.permutei rearrange))))

(defn to-string
  "Generate string representation of the matrix.

  returns: `java.lang.String`"
  (^java.lang.String [^JCublasNDArray this]
    (-> this (.toString))))

(defn set-shape-info-data-buffer
  "PLEASE NOTE: Never use this method, unless you 100% have to

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^JCublasNDArray this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.setShapeInfoDataBuffer buffer))))

(defn leverage-to
  "Description copied from class: BaseNDArray

  id - ID of the workspace to leverage to - `java.lang.String`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this ^java.lang.String id]
    (-> this (.leverageTo id))))

(defn convert-to-doubles
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this]
    (-> this (.convertToDoubles))))

(defn dup
  "Description copied from interface: INDArray

  order - order of the NDArray. 'f' or 'c' - `char`

  returns: copy of ndarray with specified order - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this ^Character order]
    (-> this (.dup order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this]
    (-> this (.dup))))

(defn convert-to-halfs
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this]
    (-> this (.convertToHalfs))))

(defn equals
  "Description copied from class: BaseNDArray

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JCublasNDArray this ^java.lang.Object o]
    (-> this (.equals o))))

(defn convert-to-floats
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this]
    (-> this (.convertToFloats))))

(defn unsafe-duplication
  "Description copied from interface: INDArray

  blocking - `boolean`

  returns: Unsafe duplicate of array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this ^Boolean blocking]
    (-> this (.unsafeDuplication blocking)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^JCublasNDArray this]
    (-> this (.unsafeDuplication))))

