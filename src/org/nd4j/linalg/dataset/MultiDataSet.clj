(ns org.nd4j.linalg.dataset.MultiDataSet
  "Implementation of MultiDataSet"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset MultiDataSet]))

(defn ->multi-data-set
  "Constructor.

  MultiDataSet constructor with single features/labels input, single mask arrays

  features - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^MultiDataSet [^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray features-mask ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (new MultiDataSet features labels features-mask labels-mask))
  (^MultiDataSet [^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (new MultiDataSet features labels))
  (^MultiDataSet []
    (new MultiDataSet )))

(defn *merge
  "Merge a collection of MultiDataSet objects into a single MultiDataSet.
  Merging is done by concatenating along dimension 0 (example number in batch)
  Merging operation may introduce mask arrays (when necessary) for time series data that has different lengths;
  if mask arrays already exist, these will be merged also.

  to-merge - Collection of MultiDataSet objects to merge - `java.util.Collection`

  returns: a single MultiDataSet object, containing the arrays of - `org.nd4j.linalg.dataset.MultiDataSet`"
  (^org.nd4j.linalg.dataset.MultiDataSet [^java.util.Collection to-merge]
    (MultiDataSet/merge to-merge)))

(defn set-labels
  "Description copied from interface: MultiDataSet

  idx - `int`
  labels - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels idx labels)))
  ([^MultiDataSet this labels]
    (-> this (.setLabels labels))))

(defn get-memory-footprint
  "This method returns memory used by this DataSet

  returns: `long`"
  (^Long [^MultiDataSet this]
    (-> this (.getMemoryFootprint))))

(defn save
  "Description copied from interface: MultiDataSet

  to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^MultiDataSet this ^java.io.OutputStream to]
    (-> this (.save to))))

(defn get-example-meta-data
  "Description copied from interface: MultiDataSet

  meta-data-type - Class of the metadata (used for opType information) - `java.lang.Class`

  returns: List of metadata objects - `<T extends java.io.Serializable> java.util.List<T>`"
  ([^MultiDataSet this ^java.lang.Class meta-data-type]
    (-> this (.getExampleMetaData meta-data-type)))
  (^java.util.List [^MultiDataSet this]
    (-> this (.getExampleMetaData))))

(defn num-labels-arrays
  "Description copied from interface: MultiDataSet

  returns: `int`"
  (^Integer [^MultiDataSet this]
    (-> this (.numLabelsArrays))))

(defn copy
  "Clone the dataset

  returns: a clone of the dataset - `org.nd4j.linalg.dataset.MultiDataSet`"
  (^org.nd4j.linalg.dataset.MultiDataSet [^MultiDataSet this]
    (-> this (.copy))))

(defn migrate
  "Description copied from interface: MultiDataSet"
  ([^MultiDataSet this]
    (-> this (.migrate))))

(defn as-list
  "Description copied from interface: MultiDataSet

  returns: List of MultiDataSets, each with 1 example - `java.util.List<org.nd4j.linalg.dataset.api.MultiDataSet>`"
  (^java.util.List [^MultiDataSet this]
    (-> this (.asList))))

(defn load
  "Description copied from interface: MultiDataSet

  from - `java.io.InputStream`

  throws: java.io.IOException"
  ([^MultiDataSet this ^java.io.InputStream from]
    (-> this (.load from))))

(defn num-feature-arrays
  "Description copied from interface: MultiDataSet

  returns: `int`"
  (^Integer [^MultiDataSet this]
    (-> this (.numFeatureArrays))))

(defn detach
  "This method migrates this DataSet into current Workspace (if any)"
  ([^MultiDataSet this]
    (-> this (.detach))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MultiDataSet this]
    (-> this (.toString))))

(defn shuffle
  "Description copied from interface: MultiDataSet"
  ([^MultiDataSet this]
    (-> this (.shuffle))))

(defn get-labels-mask-arrays
  "Description copied from interface: MultiDataSet

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataSet this]
    (-> this (.getLabelsMaskArrays))))

(defn set-features-mask-arrays
  "Description copied from interface: MultiDataSet

  mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataSet this mask-arrays]
    (-> this (.setFeaturesMaskArrays mask-arrays))))

(defn set-features-mask-array
  "Description copied from interface: MultiDataSet

  idx - `int`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setFeaturesMaskArray idx mask-array))))

(defn get-labels-mask-array
  "Description copied from interface: MultiDataSet

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getLabelsMaskArray index))))

(defn get-labels
  "Description copied from interface: MultiDataSet

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getLabels index)))
  ([^MultiDataSet this]
    (-> this (.getLabels))))

(defn set-features
  "Description copied from interface: MultiDataSet

  idx - `int`
  features - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.setFeatures idx features)))
  ([^MultiDataSet this features]
    (-> this (.setFeatures features))))

(defn set-labels-mask-array
  "Description copied from interface: MultiDataSet

  idx - `int`
  labels-mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MultiDataSet this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray labels-mask-array]
    (-> this (.setLabelsMaskArray idx labels-mask-array)))
  ([^MultiDataSet this labels-mask-arrays]
    (-> this (.setLabelsMaskArray labels-mask-arrays))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MultiDataSet this]
    (-> this (.hashCode))))

(defn get-features-mask-arrays
  "Description copied from interface: MultiDataSet

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^MultiDataSet this]
    (-> this (.getFeaturesMaskArrays))))

(defn empty?
  "returns: True if the MultiDataSet is empty (all features/labels arrays are empty) - `boolean`"
  (^Boolean [^MultiDataSet this]
    (-> this (.isEmpty))))

(defn get-features-mask-array
  "Description copied from interface: MultiDataSet

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getFeaturesMaskArray index))))

(defn get-features
  "Description copied from interface: MultiDataSet

  index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MultiDataSet this ^Integer index]
    (-> this (.getFeatures index)))
  ([^MultiDataSet this]
    (-> this (.getFeatures))))

(defn has-mask-arrays?
  "Description copied from interface: MultiDataSet

  returns: `boolean`"
  (^Boolean [^MultiDataSet this]
    (-> this (.hasMaskArrays))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MultiDataSet this ^java.lang.Object o]
    (-> this (.equals o))))

(defn set-example-meta-data
  "Description copied from interface: MultiDataSet

  example-meta-data - Example metadata to set - `java.util.List`"
  ([^MultiDataSet this ^java.util.List example-meta-data]
    (-> this (.setExampleMetaData example-meta-data))))

