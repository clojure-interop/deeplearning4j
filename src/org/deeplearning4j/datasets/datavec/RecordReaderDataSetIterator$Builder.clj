(ns org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder
  "Builder class for RecordReaderDataSetIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.datavec RecordReaderDataSetIterator$Builder]))

(defn ->builder
  "Constructor.

  rr - Underlying record reader to source data from - `org.datavec.api.records.reader.RecordReader`
  batch-size - Batch size to use - `int`"
  (^RecordReaderDataSetIterator$Builder [^org.datavec.api.records.reader.RecordReader rr ^Integer batch-size]
    (new RecordReaderDataSetIterator$Builder rr batch-size)))

(defn writable-converter
  "converter - `org.datavec.api.io.WritableConverter`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder [^RecordReaderDataSetIterator$Builder this ^org.datavec.api.io.WritableConverter converter]
    (-> this (.writableConverter converter))))

(defn max-num-batches
  "Optional argument, usually not used. If set, can be used to limit the maximum number of minibatches that
  will be returned (between resets). If not set, will always return as many minibatches as there is data
  available.

  max-num-batches - Maximum number of minibatches per epoch / reset - `int`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder [^RecordReaderDataSetIterator$Builder this ^Integer max-num-batches]
    (-> this (.maxNumBatches max-num-batches))))

(defn regression
  "Use this for multiple output regression (1 or more output/regression targets). Note that all regression
  targets must be contiguous (i.e., positions x to y, without gaps)

  label-index-from - Column index of the first regression target (indexes start at 0) - `int`
  label-index-to - Column index of the last regression target (inclusive) - `int`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder [^RecordReaderDataSetIterator$Builder this ^Integer label-index-from ^Integer label-index-to]
    (-> this (.regression label-index-from label-index-to)))
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder [^RecordReaderDataSetIterator$Builder this ^Integer label-index]
    (-> this (.regression label-index))))

(defn classification
  "Use this for classification

  label-index - Index that contains the label index. Column (indexes start from 0) be an integer value,and contain values 0 to numClasses-1 - `int`
  num-classes - Number of label classes (i.e., number of categories/classes in the dataset) - `int`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder [^RecordReaderDataSetIterator$Builder this ^Integer label-index ^Integer num-classes]
    (-> this (.classification label-index num-classes))))

(defn pre-processor
  "Optional arg. Allows the preprocessor to be set

  pre-processor - Preprocessor to use - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder [^RecordReaderDataSetIterator$Builder this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.preProcessor pre-processor))))

(defn collect-meta-data
  "When set to true: metadata for the current examples will be present in the returned DataSet.
  Disabled by default.

  collect-meta-data - Whether metadata should be collected or not - `boolean`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator$Builder [^RecordReaderDataSetIterator$Builder this ^Boolean collect-meta-data]
    (-> this (.collectMetaData collect-meta-data))))

(defn build
  "returns: `org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator [^RecordReaderDataSetIterator$Builder this]
    (-> this (.build))))

