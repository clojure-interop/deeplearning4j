(ns org.nd4j.linalg.dataset.MiniBatchFileDataSetIterator
  "Mini batch file datasetiterator
 auto partitions a dataset in to mini batches"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset MiniBatchFileDataSetIterator]))

(defn ->mini-batch-file-data-set-iterator
  "Constructor.

  base-data - the base dataset - `org.nd4j.linalg.dataset.DataSet`
  batch-size - the batch size to split by - `int`
  delete - `boolean`
  root-dir - `java.io.File`

  throws: java.io.IOException"
  (^MiniBatchFileDataSetIterator [^org.nd4j.linalg.dataset.DataSet base-data ^Integer batch-size ^Boolean delete ^java.io.File root-dir]
    (new MiniBatchFileDataSetIterator base-data batch-size delete root-dir))
  (^MiniBatchFileDataSetIterator [^org.nd4j.linalg.dataset.DataSet base-data ^Integer batch-size ^Boolean delete]
    (new MiniBatchFileDataSetIterator base-data batch-size delete))
  (^MiniBatchFileDataSetIterator [^org.nd4j.linalg.dataset.DataSet base-data ^Integer batch-size]
    (new MiniBatchFileDataSetIterator base-data batch-size)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^MiniBatchFileDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^MiniBatchFileDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^MiniBatchFileDataSetIterator this]
    (-> this (.next))))

(defn set-root-dir
  "root-dir - `java.io.File`"
  ([^MiniBatchFileDataSetIterator this ^java.io.File root-dir]
    (-> this (.setRootDir root-dir))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^MiniBatchFileDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^MiniBatchFileDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^MiniBatchFileDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^MiniBatchFileDataSetIterator this]
    (-> this (.batch))))

(defn get-root-dir
  "returns: `java.io.File`"
  (^java.io.File [^MiniBatchFileDataSetIterator this]
    (-> this (.getRootDir))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^MiniBatchFileDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^MiniBatchFileDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MiniBatchFileDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^MiniBatchFileDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^MiniBatchFileDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^MiniBatchFileDataSetIterator this]
    (-> this (.resetSupported))))

