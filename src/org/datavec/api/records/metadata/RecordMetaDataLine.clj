(ns org.datavec.api.records.metadata.RecordMetaDataLine
  "A RecordMetaData instance for a line number, generall in a file"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataLine]))

(defn ->record-meta-data-line
  "Constructor."
  (^RecordMetaDataLine []
    (new RecordMetaDataLine )))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataLine this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataLine this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataLine this]
    (-> this (.getReaderClass))))

