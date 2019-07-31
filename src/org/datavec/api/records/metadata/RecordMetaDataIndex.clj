(ns org.datavec.api.records.metadata.RecordMetaDataIndex
  "A general-purpose RecordMetaData implementation, with an index (long value)
 Used for example in CollectionRecordReader and
 CollectionSequenceRecordReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataIndex]))

(defn ->record-meta-data-index
  "Constructor."
  (^RecordMetaDataIndex []
    (new RecordMetaDataIndex )))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataIndex this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataIndex this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataIndex this]
    (-> this (.getReaderClass))))

