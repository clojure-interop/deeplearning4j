(ns org.nd4j.linalg.dataset.DataSet
  "A data transform (example/outcome pairs)
 The outcomes are specifically for neural network encoding such that
 any labels that are considered true are 1s. The rest are zeros."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset DataSet]))

(defn ->data-set
  "Constructor.

  Create a dataset with the specified input INDArray and labels (output) INDArray, plus (optionally) mask arrays
  for the features and labels

  features - Features (input) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - Labels (output) - `org.nd4j.linalg.api.ndarray.INDArray`
  features-mask - Mask array for features, may be null - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - Mask array for labels, may be null - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^DataSet [^org.nd4j.linalg.api.ndarray.INDArray features ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray features-mask ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (new DataSet features labels features-mask labels-mask))
  (^DataSet [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray second]
    (new DataSet first second))
  (^DataSet []
    (new DataSet )))

(defn *empty
  "Returns a single dataset (all fields are null)

  returns: an empty dataset (all fields are null) - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet []
    (DataSet/empty )))

(defn *merge
  "Merge the list of datasets in to one list.
  All the rows are merged in to one dataset

  data - the data to merge - `java.util.List`

  returns: a single dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^java.util.List data]
    (DataSet/merge data)))

(defn sort-and-batch-by-num-labels
  "Sorts the dataset by label:
  Splits the data transform such that examples are sorted by their labels.
  A ten label dataset would produce lists with batches like the following:
  x1 y = 1
  x2 y = 2
  ...
  x10 y = 10

  returns: a list of data sets partitioned by outcomes - `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this]
    (-> this (.sortAndBatchByNumLabels))))

(defn get-label-names-list
  "Gets the optional label names

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSet this]
    (-> this (.getLabelNamesList))))

(defn set-labels
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels labels))))

(defn filter-by
  "Strips the data transform of all but the passed in labels

  labels - strips the data transform of all but the passed in labels - `int[]`

  returns: the dataset with only the specified labels - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this labels]
    (-> this (.filterBy labels))))

(defn get-memory-footprint
  "This method returns memory used by this DataSet

  returns: `long`"
  (^Long [^DataSet this]
    (-> this (.getMemoryFootprint))))

(defn save
  "Description copied from interface: DataSet

  to - OutputStream to save the DataSet to - `java.io.OutputStream`"
  ([^DataSet this ^java.io.OutputStream to]
    (-> this (.save to))))

(defn normalize
  "Description copied from interface: DataSet"
  ([^DataSet this]
    (-> this (.normalize))))

(defn scale-min-and-max
  "min - `double`
  max - `double`"
  ([^DataSet this ^Double min ^Double max]
    (-> this (.scaleMinAndMax min max))))

(defn get-example-meta-data
  "Description copied from interface: DataSet

  meta-data-type - Class of the metadata (used for opType information) - `java.lang.Class`

  returns: List of metadata objects - `<T extends java.io.Serializable> java.util.List<T>`"
  ([^DataSet this ^java.lang.Class meta-data-type]
    (-> this (.getExampleMetaData meta-data-type)))
  (^java.util.List [^DataSet this]
    (-> this (.getExampleMetaData))))

(defn copy
  "Clone the dataset

  returns: a clone of the dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this]
    (-> this (.copy))))

(defn migrate
  "This method migrates this DataSet into current Workspace (if any)"
  ([^DataSet this]
    (-> this (.migrate))))

(defn num-examples
  "Description copied from interface: DataSet

  returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.numExamples))))

(defn scale
  "Divides the input data transform
  by the max number in each row"
  ([^DataSet this]
    (-> this (.scale))))

(defn as-list
  "Description copied from interface: DataSet

  returns: List of DataSet objects, each with 1 example only - `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this]
    (-> this (.asList))))

(defn load
  "Description copied from interface: DataSet

  from - InputStream to load the DataSet from - `java.io.InputStream`"
  ([^DataSet this ^java.io.InputStream from]
    (-> this (.load from))))

(defn binarize
  "Binarizes the dataset such that any number greater than cutoff is 1 otherwise zero

  cutoff - the cutoff point - `double`"
  ([^DataSet this ^Double cutoff]
    (-> this (.binarize cutoff)))
  ([^DataSet this]
    (-> this (.binarize))))

(defn validate
  ""
  ([^DataSet this]
    (-> this (.validate))))

(defn get-column-names
  "Deprecated.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSet this]
    (-> this (.getColumnNames))))

(defn detach
  "This method migrates this DataSet into current Workspace (if any)"
  ([^DataSet this]
    (-> this (.detach))))

(defn filter-and-strip
  "Strips the dataset down to the specified labels
  and remaps them

  labels - the labels to strip down to - `int[]`"
  ([^DataSet this labels]
    (-> this (.filterAndStrip labels))))

(defn id
  "returns: `java.lang.String`"
  (^java.lang.String [^DataSet this]
    (-> this (.id))))

(defn add-feature-vector
  "The feature to add, and the example/row number

  feature - the feature vector to add - `org.nd4j.linalg.api.ndarray.INDArray`
  example - the number of the example to append to - `int`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray feature ^Integer example]
    (-> this (.addFeatureVector feature example)))
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray to-add]
    (-> this (.addFeatureVector to-add))))

(defn multiply-by
  "Description copied from interface: DataSet

  num - `double`"
  ([^DataSet this ^Double num]
    (-> this (.multiplyBy num))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DataSet this]
    (-> this (.toString))))

(defn shuffle
  "Shuffles the dataset in place, given a seed for a random number generator. For reproducibility
  This will modify the dataset in place!!

  seed - Seed to use for the random Number Generator - `long`"
  ([^DataSet this ^Long seed]
    (-> this (.shuffle seed)))
  ([^DataSet this]
    (-> this (.shuffle))))

(defn sort-by-label
  "Organizes the dataset to minimize sampling error
  while still allowing efficient batching."
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
  "Reshapes the input in to the given rows and columns

  rows - the row size - `int`
  cols - the column size - `int`

  returns: a copy of this data op with the input resized - `org.nd4j.linalg.dataset.DataSet`"
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
  "returns: `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIterator [^DataSet this]
    (-> this (.iterateWithMiniBatches))))

(defn data-set-batches
  "Partitions the data transform by the specified number.

  num - the number to split by - `int`

  returns: the partitioned data transform - `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this ^Integer num]
    (-> this (.dataSetBatches num))))

(defn get-label-name
  "idx - the index to pullRows the string label value out of the list if it exists - `int`

  returns: the label opName - `java.lang.String`"
  (^java.lang.String [^DataSet this ^Integer idx]
    (-> this (.getLabelName idx))))

(defn set-features-mask-array
  "Description copied from interface: DataSet

  features-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray features-mask]
    (-> this (.setFeaturesMaskArray features-mask))))

(defn get-labels-mask-array
  "Description copied from interface: DataSet

  returns: Labels (output) mask array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getLabelsMaskArray))))

(defn mark-as-pre-processed
  ""
  ([^DataSet this]
    (-> this (.markAsPreProcessed))))

(defn num-outcomes
  "Description copied from interface: DataSet

  returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.numOutcomes))))

(defn example-maxs
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.exampleMaxs))))

(defn get-labels
  "Returns the labels for the dataset

  returns: the labels for the dataset - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getLabels))))

(defn get-range
  "from - `int`
  to - `int`

  returns: `org.nd4j.linalg.dataset.api.DataSet`"
  (^org.nd4j.linalg.dataset.api.DataSet [^DataSet this ^Integer from ^Integer to]
    (-> this (.getRange from to))))

(defn set-outcome
  "Sets the outcome of a particular example

  example - the example to transform - `int`
  label - the label of the outcome - `int`"
  ([^DataSet this ^Integer example ^Integer label]
    (-> this (.setOutcome example label))))

(defn set-features
  "Description copied from interface: DataSet

  features - Features to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray features]
    (-> this (.setFeatures features))))

(defn set-labels-mask-array
  "Description copied from interface: DataSet

  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.setLabelsMaskArray labels-mask))))

(defn split-test-and-train
  "Splits a dataset in to test and train randomly.
  This will modify the dataset in place to shuffle it before splitting into test/train!

  num-holdout - the number to hold out for training - `int`
  rng - Random Number Generator to use to shuffle the dataset - `java.util.Random`

  returns: the pair of datasets for the train test split - `org.nd4j.linalg.dataset.SplitTestAndTrain`"
  (^org.nd4j.linalg.dataset.SplitTestAndTrain [^DataSet this ^Integer num-holdout ^java.util.Random rng]
    (-> this (.splitTestAndTrain num-holdout rng)))
  (^org.nd4j.linalg.dataset.SplitTestAndTrain [^DataSet this ^Integer num-holdout]
    (-> this (.splitTestAndTrain num-holdout))))

(defn num-inputs
  "The number of inputs in the feature matrix

  returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.numInputs))))

(defn pre-processed?
  "returns: `boolean`"
  (^Boolean [^DataSet this]
    (-> this (.isPreProcessed))))

(defn label-counts
  "Description copied from interface: DataSet

  returns: Map of countsn - `java.util.Map<java.lang.Integer,java.lang.Double>`"
  (^java.util.Map [^DataSet this]
    (-> this (.labelCounts))))

(defn set-column-names
  "Deprecated.

  column-names - `java.util.List`"
  ([^DataSet this ^java.util.List column-names]
    (-> this (.setColumnNames column-names))))

(defn set-label-names
  "Sets the label names, will throw an exception if the passed
  in label names doesn't equal the number of outcomes

  label-names - the label names to use - `java.util.List`"
  ([^DataSet this ^java.util.List label-names]
    (-> this (.setLabelNames label-names))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.hashCode))))

(defn empty?
  "returns: true if the DataSet object is empty (no features, labels, or masks) - `boolean`"
  (^Boolean [^DataSet this]
    (-> this (.isEmpty))))

(defn squish-to-range
  "Squeezes input data to a max and a min

  min - the min value to occur in the dataset - `double`
  max - the max value to ccur in the dataset - `double`"
  ([^DataSet this ^Double min ^Double max]
    (-> this (.squishToRange min max))))

(defn example-means
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.exampleMeans))))

(defn get-features-mask-array
  "Description copied from interface: DataSet

  returns: Input mask array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getFeaturesMaskArray))))

(defn get-label-names
  "idxs - list of index to pullRows the string label value out of the list if it exists - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the label opName - `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSet this ^org.nd4j.linalg.api.ndarray.INDArray idxs]
    (-> this (.getLabelNames idxs)))
  (^java.util.List [^DataSet this]
    (-> this (.getLabelNames))))

(defn get-features
  "Description copied from interface: DataSet

  returns: features array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DataSet this]
    (-> this (.getFeatures))))

(defn set-new-number-of-labels
  "Clears the outcome matrix setting a new number of labels

  labels - the number of labels/columns in the outcome matrixNote that this clears the labels for each example - `int`"
  ([^DataSet this ^Integer labels]
    (-> this (.setNewNumberOfLabels labels))))

(defn batch-by
  "Partitions a dataset in to mini batches where
  each dataset in each list is of the specified number of examples

  num - the number to split by - `int`

  returns: the partitioned datasets - `java.util.List<org.nd4j.linalg.dataset.DataSet>`"
  (^java.util.List [^DataSet this ^Integer num]
    (-> this (.batchBy num))))

(defn has-mask-arrays?
  "Description copied from interface: DataSet

  returns: `boolean`"
  (^Boolean [^DataSet this]
    (-> this (.hasMaskArrays))))

(defn get
  "Gets a copy of example i

  i - the example to getFromOrigin - `int`

  returns: the example at i (one example) - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer i]
    (-> this (.get i))))

(defn outcome
  "returns: `int`"
  (^Integer [^DataSet this]
    (-> this (.outcome))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DataSet this ^java.lang.Object o]
    (-> this (.equals o))))

(defn add-row
  "d - `org.nd4j.linalg.dataset.DataSet`
  i - `int`"
  ([^DataSet this ^org.nd4j.linalg.dataset.DataSet d ^Integer i]
    (-> this (.addRow d i))))

(defn normalize-zero-mean-zero-unit-variance
  "Deprecated."
  ([^DataSet this]
    (-> this (.normalizeZeroMeanZeroUnitVariance))))

(defn set-example-meta-data
  "Description copied from interface: DataSet

  example-meta-data - Example metadata to set - `java.util.List`"
  ([^DataSet this ^java.util.List example-meta-data]
    (-> this (.setExampleMetaData example-meta-data))))

(defn divide-by
  "Description copied from interface: DataSet

  num - `int`"
  ([^DataSet this ^Integer num]
    (-> this (.divideBy num))))

(defn round-to-the-nearest
  "round-to - `int`"
  ([^DataSet this ^Integer round-to]
    (-> this (.roundToTheNearest round-to))))

(defn sample
  "Sample a dataset

  num-samples - the number of samples to getFromOrigin - `int`
  rng - the rng to use - `org.nd4j.linalg.api.rng.Random`
  with-replacement - whether to allow duplicates (only tracked by example row number) - `boolean`

  returns: the sample dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer num-samples ^org.nd4j.linalg.api.rng.Random rng ^Boolean with-replacement]
    (-> this (.sample num-samples rng with-replacement)))
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer num-samples ^org.nd4j.linalg.api.rng.Random rng]
    (-> this (.sample num-samples rng)))
  (^org.nd4j.linalg.dataset.DataSet [^DataSet this ^Integer num-samples]
    (-> this (.sample num-samples))))

