(ns org.datavec.api.records.metadata.RecordMetaDataJdbc
  "Record metadata to use with JDBCRecordReader. To uniquely identify and recover a record, we use a parameterized
 request which will be prepared with the values stored in the params attribute."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataJdbc]))

(defn ->record-meta-data-jdbc
  "Constructor.

  uri - `java.net.URI`
  request - `java.lang.String`
  params - `java.util.List`
  reader-class - `java.lang.Class`"
  (^RecordMetaDataJdbc [^java.net.URI uri ^java.lang.String request ^java.util.List params ^java.lang.Class reader-class]
    (new RecordMetaDataJdbc uri request params reader-class)))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataJdbc this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataJdbc this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataJdbc this]
    (-> this (.getReaderClass))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataJdbc this]
    (-> this (.toString))))

