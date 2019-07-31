(ns org.nd4j.linalg.dataset.api.DataSet
  "Created by agibsonccc on 8/26/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api DataSet]))

(defn sort-and-batch-by-num-labels
  "returns: `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this]
    (-> this (.sortAndBatchByNumLabels))))

(defn get-label-names-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSet this]
    (-> this (.getLabelNamesList))))

(defn set-labels
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels labels))))

(defn filter-by
  "labels - `int[]`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this labels]
    (-> this (.filterBy labels))))

(defn get-memory-footprint
  "This method returns memory used by this DataSet

  returns: `long`"
  (^Long [^DataSet this]
    (-> this (.getMemoryFootprint))))

(defn save
  "Write the contents of this DataSet to the specified OutputStream

  to - OutputStream to save the DataSet to - `java.io.OutputStream`"
  ([^DataSet this ^java.io.OutputStream to]
    (-> this (.save to))))

(defn normalize
  "Normalize this DataSet to mean 0, stdev 1 per input.
  This calculates statistics based on the values in a single DataSet only.
  For normalization over multiple DataSet objects, use NormalizerStandardize"
  ([^DataSet this]
    (-> this (.normalize))))

(defn scale-min-and-max
  "min - `double`
  max - `double`"
  ([^DataSet this ^Double min ^Double max]
    (-> this (.scaleMinAndMax min max))))

(defn get-example-meta-data
  "Get the example metadata, or null if no metadata has been set
  Note: this method results in an unchecked cast - care should be taken when using this!

  meta-data-type - Class of the metadata (used for opType information) - `java.lang.Class`

  returns: List of metadata objects - `<T extends java.io.Serializable> java.util.List<T>`"
  ([^DataSet this ^java.lang.Class meta-data-type]
    (-> this (.getExampleMetaData meta-data-type)))
  (^java.util.List [^DataSet this]
    (-> this (.getExampleMetaData))))

(defn copy
  "Create a copy of the DataSet

  returns: Copy of the DataSet - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this]
    (-> this (.copy))))

(defn migrate
  "This method migrates this DataSet into current Workspace (if any)"
  ([^DataSet this]
    (-> this (.migrate))))

(defn num-examples
  "Number of examples in the DataSet

  returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.numExamples))))

(defn scale
  ""
  ([^DataSet this]
    (-> this (.scale))))

(defn as-list
  "Extract each example in the DataSet into its own DataSet object, and return all of them as a list

  returns: List of DataSet objects, each with 1 example only - `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this]
    (-> this (.asList))))

(defn load
  "Load the contents of the DataSet from the specified InputStream. The current contents of the DataSet (if any) will be replaced.
  The InputStream should contain a DataSet that has been serialized with save(OutputStream)

  from - InputStream to load the DataSet from - `java.io.InputStream`"
  ([^DataSet this ^java.io.InputStream from]
    (-> this (.load from))))

(defn binarize
  "cutoff - `double`"
  ([^DataSet this ^Double cutoff]
    (-> this (.binarize cutoff)))
  ([^DataSet this]
    (-> this (.binarize))))

(defn validate
  ""
  ([^DataSet this]
    (-> this (.validate))))

(defn get-column-names
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSet this]
    (-> this (.getColumnNames))))

(defn detach
  "This method detaches this DataSet from current Workspace (if any)"
  ([^DataSet this]
    (-> this (.detach))))

(defn filter-and-strip
  "labels - `int[]`"
  ([^DataSet this labels]
    (-> this (.filterAndStrip labels))))

(defn id
  "returns: `java.lang.String`"
  (^java.lang.String [^DataSet this]
    (-> this (.id))))

(defn add-feature-vector
  "feature - `org.nd4j.linalg.api.ndarray.INDArray`
  example - `int`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray feature ^Integer example]
    (-> this (.addFeatureVector feature example)))
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray to-add]
    (-> this (.addFeatureVector to-add))))

(defn multiply-by
  "Multiply the features by a scalar

  num - `double`"
  ([^DataSet this ^Double num]
    (-> this (.multiplyBy num))))

(defn shuffle
  "Shuffle the order of the rows in the DataSet. Note that this generally won't make any difference in practice
  unless the DataSet is later split."
  ([^DataSet this]
    (-> this (.shuffle))))

(defn sort-by-label
  ""
  ([^DataSet this]
    (-> this (.sortByLabel))))

(defn iterator
  "returns: `java.util.Iterator<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.Iterator [^DataSet this]
    (-> this (.iterator))))

(defn apply
  "condition - `org.nd4j.linalg.indexing.conditions.Condition`
  function - `com.google.common.base.Function`"
  ([^DataSet this ^org.nd4j.linalg.indexing.conditions.Condition condition ^com.google.common.base.Function function]
    (-> this (.apply condition function))))

(defn reshape
  "rows - `int`
  cols - `int`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer rows ^Integer cols]
    (-> this (.reshape rows cols))))

(defn example-sums
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.exampleSums))))

(defn batch-by-num-labels
  "returns: `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this]
    (-> this (.batchByNumLabels))))

(defn iterate-with-mini-batches
  "Deprecated.

  returns: `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIterator [^DataSet this]
    (-> this (.iterateWithMiniBatches))))

(defn data-set-batches
  "Deprecated. prefer batchBy(int)

  num - `int`

  returns: `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this ^Integer num]
    (-> this (.dataSetBatches num))))

(defn get-label-name
  "idx - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^DataSet this ^Integer idx]
    (-> this (.getLabelName idx))))

(defn set-features-mask-array
  "Set the features mask array in this DataSet

  input-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray input-mask]
    (-> this (.setFeaturesMaskArray input-mask))))

(defn get-labels-mask-array
  "Labels (output) mask array: a mask array for input, where each value is in {0,1} in order to specify whether an
  output is actually present or not. Typically used for situations such as RNNs with variable length inputs or many-
  to-one situations.

  returns: Labels (output) mask array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getLabelsMaskArray))))

(defn num-outcomes
  "Returns the number of outcomes (size of the labels array for each example)

  returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.numOutcomes))))

(defn example-maxs
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.exampleMaxs))))

(defn get-labels
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getLabels))))

(defn get-range
  "from - `int`
  to - `int`

  returns: `org.nd4j.linalg.dataset.api.DataSet`"
  (^org.nd4j.linalg.dataset.api.DataSet [^DataSet this ^Integer from ^Integer to]
    (-> this (.getRange from to))))

(defn set-outcome
  "example - `int`
  label - `int`"
  ([^DataSet this ^Integer example ^Integer label]
    (-> this (.setOutcome example label))))

(defn set-features
  "Set the features array for the DataSet

  features - Features to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.setFeatures features))))

(defn set-labels-mask-array
  "Set the labels mask array in this data set

  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.setLabelsMaskArray labels-mask))))

(defn split-test-and-train
  "SplitV the DataSet into two DataSets randomly

  fraction-train - Fraction (in range 0 to 1) of examples to be returned in the training DataSet object - `double`

  returns: `org.nd4j.linalg.dataset.SplitTestAndTrain`"
  (^org.nd4j.linalg.dataset.SplitTestAndTrain [^DataSet this ^Double fraction-train]
    (-> this (.splitTestAndTrain fraction-train)))
  (^org.nd4j.linalg.dataset.SplitTestAndTrain [^DataSet this ^Integer num-holdout ^java.util.Random rnd]
    (-> this (.splitTestAndTrain num-holdout rnd))))

(defn num-inputs
  "Number of input values - i.e., size of the features INDArray per example

  returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.numInputs))))

(defn label-counts
  "Calculate and return a count of each label, by index.
  Assumes labels are a one-hot INDArray, for classification

  returns: Map of countsn - `java.util.Map<java.lang.Integer,java.lang.Double>`"
  (^java.util.Map [^DataSet this]
    (-> this (.labelCounts))))

(defn set-column-names
  "column-names - `java.util.List`"
  ([^DataSet this ^java.util.List column-names]
    (-> this (.setColumnNames column-names))))

(defn set-label-names
  "label-names - `java.util.List`"
  ([^DataSet this ^java.util.List label-names]
    (-> this (.setLabelNames label-names))))

(defn empty?
  "returns: true if the DataSet object is empty (no features, labels, or masks) - `boolean`"
  (^Boolean [^DataSet this]
    (-> this (.isEmpty))))

(defn squish-to-range
  "min - `double`
  max - `double`"
  ([^DataSet this ^Double min ^Double max]
    (-> this (.squishToRange min max))))

(defn example-means
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.exampleMeans))))

(defn get-features-mask-array
  "Input mask array: a mask array for input, where each value is in {0,1} in order to specify whether an input is
  actually present or not. Typically used for situations such as RNNs with variable length inputs

  returns: Input mask array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getFeaturesMaskArray))))

(defn get-label-names
  "idxs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray idxs]
    (-> this (.getLabelNames idxs)))
  (^java.util.List [^DataSet this]
    (-> this (.getLabelNames))))

(defn get-features
  "Returns the features array for the DataSet

  returns: features array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getFeatures))))

(defn set-new-number-of-labels
  "labels - `int`"
  ([^DataSet this ^Integer labels]
    (-> this (.setNewNumberOfLabels labels))))

(defn batch-by
  "num - `int`

  returns: `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this ^Integer num]
    (-> this (.batchBy num))))

(defn has-mask-arrays?
  "Whether the labels or input (features) mask arrays are present for this DataSet

  returns: `boolean`"
  (^Boolean [^DataSet this]
    (-> this (.hasMaskArrays))))

(defn get
  "i - `int`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer i]
    (-> this (.get i))))

(defn outcome
  "returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.outcome))))

(defn add-row
  "d - `org.nd4j.linalg.dataset.DataSet`
  i - `int`"
  ([^DataSet this ^org.nd4j.linalg.dataset.DataSet d ^Integer i]
    (-> this (.addRow d i))))

(defn normalize-zero-mean-zero-unit-variance
  "Deprecated. Use NormalizerStandardize"
  ([^DataSet this]
    (-> this (.normalizeZeroMeanZeroUnitVariance))))

(defn set-example-meta-data
  "Set the metadata for this DataSet
  By convention: the metadata can be any serializable object, one per example in the DataSet

  example-meta-data - Example metadata to set - `java.util.List`"
  ([^DataSet this ^java.util.List example-meta-data]
    (-> this (.setExampleMetaData example-meta-data))))

(defn divide-by
  "Divide the features by a scalar

  num - `int`"
  ([^DataSet this ^Integer num]
    (-> this (.divideBy num))))

(defn round-to-the-nearest
  "round-to - `int`"
  ([^DataSet this ^Integer round-to]
    (-> this (.roundToTheNearest round-to))))

(defn sample
  "num-samples - `int`
  rng - `org.nd4j.linalg.api.rng.Random`
  with-replacement - `boolean`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer num-samples ^org.nd4j.linalg.api.rng.Random rng ^Boolean with-replacement]
    (-> this (.sample num-samples rng with-replacement)))
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer num-samples ^org.nd4j.linalg.api.rng.Random rng]
    (-> this (.sample num-samples rng)))
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer num-samples]
    (-> this (.sample num-samples))))

