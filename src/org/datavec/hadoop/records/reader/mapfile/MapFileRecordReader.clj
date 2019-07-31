(ns org.datavec.hadoop.records.reader.mapfile.MapFileRecordReader
  "A RecordReader implementation for reading from a Hadoop MapFile

 A typical use case is with TransformProcess executed on Spark (perhaps Spark
 local), followed by non-distributed training on a single machine. For example:


   JavaRDD<List<Writable>> myRDD = ...;
   String mapFilePath = ...;
   SparkStorageUtils.saveMapFile( mapFilePath, myRDD );

   RecordReader rr = new MapFileRecordReader();
   rr.initialize( new FileSplit( new File( mapFilePath ) ) );
   //Pass to DataSetIterator or similar
 Alternatively, use MapFileRecordWriter.
 Note that this record reader supports optional randomisation of order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.reader.mapfile MapFileRecordReader]))

(defn ->map-file-record-reader
  "Constructor.

  Create a MapFileRecordReader with optional randomisation, with a custom IndexToKey instance to
  handle MapFile keys

  index-to-key - Handles conversion between long indices and key values (see for example LongIndexToKey - `org.datavec.hadoop.records.reader.mapfile.IndexToKey`
  rng - If non-null, will be used to randomize the order of examples - `java.util.Random`"
  (^MapFileRecordReader [^org.datavec.hadoop.records.reader.mapfile.IndexToKey index-to-key ^java.util.Random rng]
    (new MapFileRecordReader index-to-key rng))
  (^MapFileRecordReader [^java.util.Random rng]
    (new MapFileRecordReader rng))
  (^MapFileRecordReader []
    (new MapFileRecordReader )))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^MapFileRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^MapFileRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^MapFileRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^MapFileRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^MapFileRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^MapFileRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^MapFileRecordReader this]
    (-> this (.nextRecord))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^MapFileRecordReader this]
    (-> this (.batchesSupported))))

(defn set-listeners
  "Description copied from interface: RecordReader

  listeners - `org.datavec.api.records.listener.RecordListener`"
  ([^MapFileRecordReader this ^org.datavec.api.records.listener.RecordListener listeners]
    (-> this (.setListeners listeners))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MapFileRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^MapFileRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^MapFileRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^MapFileRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^MapFileRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^MapFileRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^MapFileRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn get-listeners
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.records.listener.RecordListener>`"
  (^java.util.List [^MapFileRecordReader this]
    (-> this (.getListeners))))

