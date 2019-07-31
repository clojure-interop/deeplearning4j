(ns org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator
  "Sequence record reader data set iterator
 Given a record reader (and optionally another record reader for the labels) generate time series (sequence) data sets.
 Supports padding for one-to-many and many-to-one type data loading (i.e., with different number of inputs vs.
 labels via the SequenceRecordReaderDataSetIterator.AlignmentMode mode."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.datavec SequenceRecordReaderDataSetIterator]))

(defn ->sequence-record-reader-data-set-iterator
  "Constructor.

  Constructor where features and labels come from different RecordReaders (for example, different files)

  features-reader - `org.datavec.api.records.reader.SequenceRecordReader`
  labels - `org.datavec.api.records.reader.SequenceRecordReader`
  mini-batch-size - `int`
  num-possible-labels - `int`
  regression - `boolean`
  alignment-mode - `org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode`"
  (^SequenceRecordReaderDataSetIterator [^org.datavec.api.records.reader.SequenceRecordReader features-reader ^org.datavec.api.records.reader.SequenceRecordReader labels ^Integer mini-batch-size ^Integer num-possible-labels ^Boolean regression ^org.deeplearning4j.datasets.datavec.SequenceRecordReaderDataSetIterator$AlignmentMode alignment-mode]
    (new SequenceRecordReaderDataSetIterator features-reader labels mini-batch-size num-possible-labels regression alignment-mode))
  (^SequenceRecordReaderDataSetIterator [^org.datavec.api.records.reader.SequenceRecordReader features-reader ^org.datavec.api.records.reader.SequenceRecordReader labels ^Integer mini-batch-size ^Integer num-possible-labels ^Boolean regression]
    (new SequenceRecordReaderDataSetIterator features-reader labels mini-batch-size num-possible-labels regression))
  (^SequenceRecordReaderDataSetIterator [^org.datavec.api.records.reader.SequenceRecordReader features-reader ^org.datavec.api.records.reader.SequenceRecordReader labels ^Integer mini-batch-size ^Integer num-possible-labels]
    (new SequenceRecordReaderDataSetIterator features-reader labels mini-batch-size num-possible-labels)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SequenceRecordReaderDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^SequenceRecordReaderDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^SequenceRecordReaderDataSetIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SequenceRecordReaderDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^SequenceRecordReaderDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SequenceRecordReaderDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^SequenceRecordReaderDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^SequenceRecordReaderDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SequenceRecordReaderDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^SequenceRecordReaderDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^SequenceRecordReaderDataSetIterator this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Load a single sequence example to a DataSet, using the provided RecordMetaData.
  Note that it is more efficient to load multiple instances at once, using loadFromMetaData(List)

  record-meta-data - RecordMetaData to load from. Should have been produced by the given record reader - `org.datavec.api.records.metadata.RecordMetaData`

  returns: DataSet with the specified example - `org.nd4j.linalg.dataset.DataSet`

  throws: java.io.IOException - If an error occurs during loading of the data"
  (^org.nd4j.linalg.dataset.DataSet [^SequenceRecordReaderDataSetIterator this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^SequenceRecordReaderDataSetIterator this]
    (-> this (.resetSupported))))

