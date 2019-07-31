(ns org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator
  "RecordReaderMultiDataSetIterator: A MultiDataSetIterator for data from one or more RecordReaders and SequenceRecordReaders
 The idea: generate multiple inputs and multiple outputs from one or more Sequence/RecordReaders. Inputs and outputs
 may be obtained from subsets of the RecordReader and SequenceRecordReaders columns (for examples, some inputs and outputs
 as different columns in the same record/sequence); it is also possible to mix different types of data (for example, using both
 RecordReaders and SequenceRecordReaders in the same RecordReaderMultiDataSetIterator).
 Uses a builder pattern (RecordReaderMultiDataSetIterator.Builder to specify the various
 inputs and subsets."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.datavec RecordReaderMultiDataSetIterator]))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^RecordReaderMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^RecordReaderMultiDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^RecordReaderMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn next-multi-data-set
  "next-rr-vals - `java.util.Map`
  next-rr-vals-batched - `java.util.Map`
  next-seq-rr-vals - `java.util.Map`
  next-metas - `java.util.List`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^RecordReaderMultiDataSetIterator this ^java.util.Map next-rr-vals ^java.util.Map next-rr-vals-batched ^java.util.Map next-seq-rr-vals ^java.util.List next-metas]
    (-> this (.nextMultiDataSet next-rr-vals next-rr-vals-batched next-seq-rr-vals next-metas))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^RecordReaderMultiDataSetIterator this]
    (-> this (.reset))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^RecordReaderMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^RecordReaderMultiDataSetIterator this]
    (-> this (.remove))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^RecordReaderMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^RecordReaderMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Load a single example to a DataSet, using the provided RecordMetaData.
  Note that it is more efficient to load multiple instances at once, using loadFromMetaData(List)

  record-meta-data - RecordMetaData to load from. Should have been produced by the given record reader - `org.datavec.api.records.metadata.RecordMetaData`

  returns: DataSet with the specified example - `org.nd4j.linalg.dataset.api.MultiDataSet`

  throws: java.io.IOException - If an error occurs during loading of the data"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^RecordReaderMultiDataSetIterator this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^RecordReaderMultiDataSetIterator this]
    (-> this (.resetSupported))))

