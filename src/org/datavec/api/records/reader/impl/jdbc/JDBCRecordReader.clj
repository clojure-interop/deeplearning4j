(ns org.datavec.api.records.reader.impl.jdbc.JDBCRecordReader
  "Iterate on rows from a JDBC datasource and return corresponding records"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.jdbc JDBCRecordReader]))

(defn ->jdbc-record-reader
  "Constructor.

  Same as JDBCRecordReader(String query, DataSource dataSource) but also provides a query and column indices to use
  for saving metadata (see loadFromMetaData(RecordMetaData))

  query - Query to execute and on which the reader will iterate. - `java.lang.String`
  data-source - Initialized DataSource to use for iteration. - `javax.sql.DataSource`
  metadata-query - Query to execute when recovering a single record from metadata - `java.lang.String`
  metadata-indices - Column indices of which values will be saved in each record's metadata - `int[]`"
  (^JDBCRecordReader [^java.lang.String query ^javax.sql.DataSource data-source ^java.lang.String metadata-query metadata-indices]
    (new JDBCRecordReader query data-source metadata-query metadata-indices))
  (^JDBCRecordReader [^java.lang.String query ^javax.sql.DataSource data-source]
    (new JDBCRecordReader query data-source))
  (^JDBCRecordReader [^java.lang.String query]
    (new JDBCRecordReader query)))

(def *-trim-strings
  "Static Constant.

  type: java.lang.String"
  JDBCRecordReader/TRIM_STRINGS)

(def *-jdbc-url
  "Static Constant.

  type: java.lang.String"
  JDBCRecordReader/JDBC_URL)

(def *-jdbc-driver-class-name
  "Static Constant.

  type: java.lang.String"
  JDBCRecordReader/JDBC_DRIVER_CLASS_NAME)

(def *-jdbc-username
  "Static Constant.

  type: java.lang.String"
  JDBCRecordReader/JDBC_USERNAME)

(def *-jdbc-password
  "Static Constant.

  type: java.lang.String"
  JDBCRecordReader/JDBC_PASSWORD)

(def *-jdbc-resultset-type
  "Static Constant.

  type: java.lang.String"
  JDBCRecordReader/JDBC_RESULTSET_TYPE)

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^JDBCRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^JDBCRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^JDBCRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^JDBCRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Depending on the jdbc driver implementation, this will probably fail if the resultset was created with ResultSet.TYPE_FORWARD_ONLY"
  ([^JDBCRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Get next record with metadata. See loadFromMetaData(RecordMetaData) for details on metadata structure.

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^JDBCRecordReader this]
    (-> this (.nextRecord))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^JDBCRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^JDBCRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Record metadata for this reader consist in two elements :
  - a parametrized query used to retrieve one item
  - a set a values to use to prepare the statement
  The parametrized query is passed at construction time and it should fit the main record's reader query. For
  instance, one could have to following reader query : \"SELECT * FROM Items\", and a corresponding metadata query
  could be \"SELECT * FROM Items WHERE id = ?\". For each record, the columns indicated in metadataIndices
  will be stored. For instance, one could set metadataIndices = {0} so the value of the first column of each record
  is stored in the metadata.

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^JDBCRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^JDBCRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "Expected to be called by the user. JDBC connections will not be closed automatically.

  throws: java.io.IOException"
  ([^JDBCRecordReader this]
    (-> this (.close))))

(defn initialize
  "Initialize all required jdbc elements and make the reader ready for iteration.
  Possible configuration keys :

  JDBCRecordReader.TRIM_STRINGS : Whether or not read strings should be trimmed before being returned. False by default
  JDBCRecordReader.JDBC_URL : Jdbc url to use for datastource configuration (see JDBCRecordReaderTest for examples)
  JDBCRecordReader.JDBC_DRIVER_CLASS_NAME : Driver class to use for datasource configuration
  JDBCRecordReader.JDBC_USERNAME && JDBC_PASSWORD : Username and password to use for datasource configuration
  JDBCRecordReader.JDBC_RESULTSET_TYPE : ResultSet type to use (int value defined in jdbc doc)

  Url and driver class name are not mandatory. If one of them is specified, the other must be specified as well. If
  they are set and there already is a DataSource set in the reader, it will be discarded and replaced with the
  newly created one.

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - not handled yet, will be discarded - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^JDBCRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^JDBCRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

