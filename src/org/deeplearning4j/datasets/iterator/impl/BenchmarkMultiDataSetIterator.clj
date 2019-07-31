(ns org.deeplearning4j.datasets.iterator.impl.BenchmarkMultiDataSetIterator
  "MultiDataset iterator for simulated inputs, or input derived from a MultiDataSet example. Primarily
 used for benchmarking."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl BenchmarkMultiDataSetIterator]))

(defn ->benchmark-multi-data-set-iterator
  "Constructor.

  features-shape - `int[][]`
  num-labels - `int[]`
  total-iterations - `int`"
  (^BenchmarkMultiDataSetIterator [features-shape num-labels ^Integer total-iterations]
    (new BenchmarkMultiDataSetIterator features-shape num-labels total-iterations))
  (^BenchmarkMultiDataSetIterator [^org.nd4j.linalg.dataset.MultiDataSet example ^Integer total-iterations]
    (new BenchmarkMultiDataSetIterator example total-iterations)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  i - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.MultiDataSet`"
  (^org.nd4j.linalg.dataset.MultiDataSet [^BenchmarkMultiDataSetIterator this ^Integer i]
    (-> this (.next i)))
  (^org.nd4j.linalg.dataset.MultiDataSet [^BenchmarkMultiDataSetIterator this]
    (-> this (.next))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^BenchmarkMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^BenchmarkMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^BenchmarkMultiDataSetIterator this]
    (-> this (.reset))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  data-set-pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^BenchmarkMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor data-set-pre-processor]
    (-> this (.setPreProcessor data-set-pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^BenchmarkMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next(int) would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^BenchmarkMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(int). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^BenchmarkMultiDataSetIterator this]
    (-> this (.remove))))

