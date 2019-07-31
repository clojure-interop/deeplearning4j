(ns org.datavec.api.records.metadata.RecordMetaDataURI
  "A standard RecordMetaData instance that contains a URI only"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataURI]))

(defn ->record-meta-data-uri
  "Constructor.

  uri - `java.net.URI`"
  (^RecordMetaDataURI [^java.net.URI uri]
    (new RecordMetaDataURI uri)))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataURI this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataURI this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataURI this]
    (-> this (.getReaderClass))))

