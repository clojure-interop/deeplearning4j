(ns org.datavec.hadoop.records.reader.mapfile.MapFileSequenceRecordReader
  "A SequenceRecordReader implementation for reading from a Hadoop MapFile

 A typical use case is with TransformProcess executed on Spark (perhaps Spark
 local), followed by non-distributed training on a single machine. For example:


   JavaRDD<List<List<Writable>>> myRDD = ...;
   String mapFilePath = ...;
   SparkStorageUtils.saveMapFileSequences( mapFilePath, myRDD );

   SequenceRecordReader rr = new MapFileSequenceRecordReader();
   rr.initialize( new FileSplit( new File( mapFilePath ) ) );
   //Pass to DataSetIterator or similar
 Alternatively, use MapFileSequenceRecordWriter.
 Note that this sequence record reader supports optional randomisation of order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.reader.mapfile MapFileSequenceRecordReader]))

(defn ->map-file-sequence-record-reader
  "Constructor.

  Create a MapFileSequenceRecordReader with optional randomisation, with a custom IndexToKey instance to
  handle MapFile keys

  index-to-key - Handles conversion between long indices and key values (see for example LongIndexToKey - `org.datavec.hadoop.records.reader.mapfile.IndexToKey`
  rng - If non-null, will be used to randomize the order of examples - `java.util.Random`"
  (^MapFileSequenceRecordReader [^org.datavec.hadoop.records.reader.mapfile.IndexToKey index-to-key ^java.util.Random rng]
    (new MapFileSequenceRecordReader index-to-key rng))
  (^MapFileSequenceRecordReader [^java.util.Random rng]
    (new MapFileSequenceRecordReader rng))
  (^MapFileSequenceRecordReader []
    (new MapFileSequenceRecordReader )))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^MapFileSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^MapFileSequenceRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^MapFileSequenceRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^MapFileSequenceRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^MapFileSequenceRecordReader this]
    (-> this (.nextSequence))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^MapFileSequenceRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^MapFileSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^MapFileSequenceRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^MapFileSequenceRecordReader this]
    (-> this (.nextRecord))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^MapFileSequenceRecordReader this]
    (-> this (.batchesSupported))))

(defn set-listeners
  "Description copied from interface: RecordReader

  listeners - `org.datavec.api.records.listener.RecordListener`"
  ([^MapFileSequenceRecordReader this ^org.datavec.api.records.listener.RecordListener listeners]
    (-> this (.setListeners listeners))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MapFileSequenceRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^MapFileSequenceRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^MapFileSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^MapFileSequenceRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^MapFileSequenceRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^MapFileSequenceRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^MapFileSequenceRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn get-listeners
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.records.listener.RecordListener>`"
  (^java.util.List [^MapFileSequenceRecordReader this]
    (-> this (.getListeners))))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^MapFileSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^MapFileSequenceRecordReader this]
    (-> this (.sequenceRecord))))

