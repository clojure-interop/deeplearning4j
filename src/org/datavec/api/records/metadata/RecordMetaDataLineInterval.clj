(ns org.datavec.api.records.metadata.RecordMetaDataLineInterval
  "A RecordMetaData instance for an interval of line numbers, generally in a file"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataLineInterval]))

(defn ->record-meta-data-line-interval
  "Constructor."
  (^RecordMetaDataLineInterval []
    (new RecordMetaDataLineInterval )))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataLineInterval this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataLineInterval this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataLineInterval this]
    (-> this (.getReaderClass))))

