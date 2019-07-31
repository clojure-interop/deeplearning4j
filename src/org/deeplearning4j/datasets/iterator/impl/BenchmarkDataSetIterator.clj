(ns org.deeplearning4j.datasets.iterator.impl.BenchmarkDataSetIterator
  "Dataset iterator for simulated inputs, or input derived from a DataSet example. Primarily
 used for benchmarking."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl BenchmarkDataSetIterator]))

(defn ->benchmark-data-set-iterator
  "Constructor.

  features-shape - `int[]`
  num-labels - `int`
  total-iterations - `int`
  grid-width - `int`
  grid-height - `int`"
  (^BenchmarkDataSetIterator [features-shape ^Integer num-labels ^Integer total-iterations ^Integer grid-width ^Integer grid-height]
    (new BenchmarkDataSetIterator features-shape num-labels total-iterations grid-width grid-height))
  (^BenchmarkDataSetIterator [features-shape ^Integer num-labels ^Integer total-iterations]
    (new BenchmarkDataSetIterator features-shape num-labels total-iterations))
  (^BenchmarkDataSetIterator [^org.nd4j.linalg.dataset.DataSet example ^Integer total-iterations]
    (new BenchmarkDataSetIterator example total-iterations)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BenchmarkDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  i - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^BenchmarkDataSetIterator this ^Integer i]
    (-> this (.next i)))
  (^org.nd4j.linalg.dataset.DataSet [^BenchmarkDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^BenchmarkDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BenchmarkDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^BenchmarkDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BenchmarkDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^BenchmarkDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(int). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^BenchmarkDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BenchmarkDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  data-set-pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^BenchmarkDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor data-set-pre-processor]
    (-> this (.setPreProcessor data-set-pre-processor))))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next(int) would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^BenchmarkDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^BenchmarkDataSetIterator this]
    (-> this (.resetSupported))))

