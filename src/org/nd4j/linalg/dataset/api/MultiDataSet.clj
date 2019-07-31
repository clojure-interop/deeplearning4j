(ns org.nd4j.linalg.dataset.api.MultiDataSet
  "MultiDataSet is an interface for representing complex data sets, that have (potentially) multiple inputs and outputs
 For example, some complex neural network architectures may have multiple independent inputs, and multiple independent
 outputs. These inputs and outputs need not even be the same opType of data: for example, images in and sequences out, etc"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api MultiDataSet]))

(defn set-labels
  "Set a single labels array (by index) for the MultiDataSet

  idx - `int`
  labels - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels idx labels)))
  ([^MultiDataSet this labels]
    (-> this (.setLabels labels))))

(defn get-memory-footprint
  "This method returns memory amount occupied by this MultiDataSet.

  returns: value in bytes - `long`"
  (^Long [^MultiDataSet this]
    (-> this (.getMemoryFootprint))))

(defn save
  "Save this MultiDataSet to the specified stream. Stream will be closed after saving.

  to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^MultiDataSet this ^java.io.OutputStream to]
    (-> this (.save to))))

(defn get-example-meta-data
  "Get the example metadata, or null if no metadata has been set
  Note: this method results in an unchecked cast - care should be taken when using this!

  meta-data-type - Class of the metadata (used for opType information) - `java.lang.Class`

  returns: List of metadata objects - `<T extends java.io.Serializable> java.util.List<T>`"
  ([^MultiDataSet this ^java.lang.Class meta-data-type]
    (-> this (.getExampleMetaData meta-data-type)))
  (^java.util.List [^MultiDataSet this]
    (-> this (.getExampleMetaData))))

(defn num-labels-arrays
  "Number of arrays of label/output data in the MultiDataSet

  returns: `int`"
  (^Integer [^MultiDataSet this]
    (-> this (.numLabelsArrays))))

(defn copy
  "Clone the dataset

  returns: a clone of the dataset - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^MultiDataSet this]
    (-> this (.copy))))

(defn migrate
  "This method migrates this MultiDataSet into current Workspace (if any)"
  ([^MultiDataSet this]
    (-> this (.migrate))))

(defn as-list
  "SplitV the MultiDataSet into a list of individual examples.

  returns: List of MultiDataSets, each with 1 example - `java.util.List<org.nd4j.linalg.dataset.api.MultiDataSet>`"
  (^java.util.List [^MultiDataSet this]
    (-> this (.asList))))

(defn load
  "Load the contents of this MultiDataSet from the specified stream. Stream will be closed after loading.

  from - `java.io.InputStream`

  throws: java.io.IOException"
  ([^MultiDataSet this ^java.io.InputStream from]
    (-> this (.load from))))

(defn num-feature-arrays
  "Number of arrays of features/input data in the MultiDataSet

  returns: `int`"
  (^Integer [^MultiDataSet this]
    (-> this (.numFeatureArrays))))

(defn detach
  "This method detaches this MultiDataSet from current Workspace (if any)"
  ([^MultiDataSet this]
    (-> this (.detach))))

(defn shuffle
  "Shuffle the order of the examples in the MultiDataSet. Note that this generally won't make any difference in
  practice unless the MultiDataSet is later split."
  ([^MultiDataSet this]
    (-> this (.shuffle))))

(defn get-labels-mask-arrays
  "Get the labels mask arrays. May return null if no labels mask arrays are present; otherwise,
  any entry in the array may be null if no mask array is present for that particular label

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataSet this]
    (-> this (.getLabelsMaskArrays))))

(defn set-features-mask-arrays
  "Set the feature mask arrays

  mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataSet this mask-arrays]
    (-> this (.setFeaturesMaskArrays mask-arrays))))

(defn set-features-mask-array
  "Set a single feature mask array by index

  idx - `int`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setFeaturesMaskArray idx mask-array))))

(defn get-labels-mask-array
  "Get the specified label mask array. Returns null if no label mask is present for that particular feature/input

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getLabelsMaskArray index))))

(defn get-labels
  "Get a single label/output array

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getLabels index)))
  ([^MultiDataSet this]
    (-> this (.getLabels))))

(defn set-features
  "Set a single features array (by index) for the MultiDataSet

  idx - `int`
  features - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.setFeatures idx features)))
  ([^MultiDataSet this features]
    (-> this (.setFeatures features))))

(defn set-labels-mask-array
  "Set a single labels mask array by index

  idx - `int`
  labels-mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray labels-mask-array]
    (-> this (.setLabelsMaskArray idx labels-mask-array)))
  ([^MultiDataSet this labels]
    (-> this (.setLabelsMaskArray labels))))

(defn get-features-mask-arrays
  "Get the feature mask arrays. May return null if no feature mask arrays are present; otherwise,
  any entry in the array may be null if no mask array is present for that particular feature

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataSet this]
    (-> this (.getFeaturesMaskArrays))))

(defn empty?
  "returns: True if the MultiDataSet is empty (all features/labels arrays are empty) - `boolean`"
  (^Boolean [^MultiDataSet this]
    (-> this (.isEmpty))))

(defn get-features-mask-array
  "Get the specified feature mask array. Returns null if no feature mask is present for that particular feature/input

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getFeaturesMaskArray index))))

(defn get-features
  "Get a single feature/input array

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getFeatures index)))
  ([^MultiDataSet this]
    (-> this (.getFeatures))))

(defn has-mask-arrays?
  "Whether there are any mask arrays (features or labels) present for this MultiDataSet

  returns: `boolean`"
  (^Boolean [^MultiDataSet this]
    (-> this (.hasMaskArrays))))

(defn set-example-meta-data
  "Set the metadata for this MultiDataSet
  By convention: the metadata can be any serializable object, one per example in the MultiDataSet

  example-meta-data - Example metadata to set - `java.util.List`"
  ([^MultiDataSet this ^java.util.List example-meta-data]
    (-> this (.setExampleMetaData example-meta-data))))

