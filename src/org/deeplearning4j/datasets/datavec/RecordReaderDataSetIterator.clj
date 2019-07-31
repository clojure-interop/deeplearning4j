(ns org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator
  "Record reader dataset iterator. Takes a DataVec RecordReader as input, and handles the conversion to ND4J
 DataSet objects as well as producing minibatches from individual records.

 Multiple constructors are available, though a RecordReaderDataSetIterator.Builder class is also available.

 Example 1: Image classification, batch size 32, 10 classes


   RecordReader rr = new ImageRecordReader(28,28,3); //28x28 RGB images
   rr.initialize(new FileSplit(new File(\"/path/to/directory\")));

   DataSetIterator iter = new RecordReaderDataSetIterator.Builder(rr, 32)
        //Label index (first arg): Always value 1 when using ImageRecordReader. For CSV etc: use index of the column
        //  that contains the label (should contain an integer value, 0 to nClasses-1 inclusive). Column indexes start
        // at 0. Number of classes (second arg): number of label classes (i.e., 10 for MNIST - 10 digits)
        .classification(1, nClasses)
        .preProcessor(new ImagePreProcessingScaler())      //For normalization of image values 0-255 to 0-1
        .build()


 Example 2: Multi-output regression from CSV, batch size 128


   RecordReader rr = new CsvRecordReader(0, ','); //Skip 0 header lines, comma separated
   rr.initialize(new FileSplit(new File(\"/path/to/myCsv.txt\")));

   DataSetIterator iter = new RecordReaderDataSetIterator.Builder(rr, 128)
        //Specify the columns that the regression labels/targets appear in. Note that all other columns will be
        // treated as features. Columns indexes start at 0
        .regression(labelColFrom, labelColTo)
        .build()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.datavec RecordReaderDataSetIterator]))

(defn ->record-reader-data-set-iterator
  "Constructor.

  Main constructor

  record-reader - the recordreader to use - `org.datavec.api.records.reader.RecordReader`
  converter - Converter. May be null. - `org.datavec.api.io.WritableConverter`
  batch-size - Minibatch size - number of examples returned for each call of .next() - `int`
  label-index-from - the index of the label (for classification), or the first index of the labels for multi-output regression - `int`
  label-index-to - only used if regression == true. The last index inclusive of the multi-output regression - `int`
  num-possible-labels - the number of possible labels for classification. Not used if regression == true - `int`
  max-num-batches - Maximum number of batches to return - `int`
  regression - if true: regression. If false: classification (assume labelIndexFrom is the class it belongs to) - `boolean`"
  (^RecordReaderDataSetIterator [^org.datavec.api.records.reader.RecordReader record-reader ^org.datavec.api.io.WritableConverter converter ^Integer batch-size ^Integer label-index-from ^Integer label-index-to ^Integer num-possible-labels ^Integer max-num-batches ^Boolean regression]
    (new RecordReaderDataSetIterator record-reader converter batch-size label-index-from label-index-to num-possible-labels max-num-batches regression))
  (^RecordReaderDataSetIterator [^org.datavec.api.records.reader.RecordReader record-reader ^Integer batch-size ^Integer label-index ^Integer num-possible-labels ^Integer max-num-batches]
    (new RecordReaderDataSetIterator record-reader batch-size label-index num-possible-labels max-num-batches))
  (^RecordReaderDataSetIterator [^org.datavec.api.records.reader.RecordReader record-reader ^Integer batch-size ^Integer label-index ^Integer num-possible-labels]
    (new RecordReaderDataSetIterator record-reader batch-size label-index num-possible-labels))
  (^RecordReaderDataSetIterator [^org.datavec.api.records.reader.RecordReader record-reader ^Integer batch-size]
    (new RecordReaderDataSetIterator record-reader batch-size)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^RecordReaderDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^RecordReaderDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^RecordReaderDataSetIterator this]
    (-> this (.next))))

(defn set-collect-meta-data
  "When set to true: metadata for the current examples will be present in the returned DataSet.
  Disabled by default.

  collect-meta-data - Whether to collect metadata or not - `boolean`"
  ([^RecordReaderDataSetIterator this ^Boolean collect-meta-data]
    (-> this (.setCollectMetaData collect-meta-data))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^RecordReaderDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^RecordReaderDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^RecordReaderDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^RecordReaderDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^RecordReaderDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RecordReaderDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^RecordReaderDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^RecordReaderDataSetIterator this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Load a single example to a DataSet, using the provided RecordMetaData.
  Note that it is more efficient to load multiple instances at once, using loadFromMetaData(List)

  record-meta-data - RecordMetaData to load from. Should have been produced by the given record reader - `org.datavec.api.records.metadata.RecordMetaData`

  returns: DataSet with the specified example - `org.nd4j.linalg.dataset.DataSet`

  throws: java.io.IOException - If an error occurs during loading of the data"
  (^org.nd4j.linalg.dataset.DataSet [^RecordReaderDataSetIterator this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^RecordReaderDataSetIterator this]
    (-> this (.resetSupported))))

