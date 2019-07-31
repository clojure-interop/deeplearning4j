(ns org.datavec.api.records.metadata.RecordMetaData
  "RecordMetaData includes details on the record itself - for example, the source file or line number.
 It is used in conjunction with org.datavec.api.records.reader.RecordReaderMeta.
 There are two primary uses:
 (a) Tracking where a record has come from, for debugging purposes for example
 (b) Loading the raw data again later, from the record reader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaData]))

(defn get-location
  "Get a human-readable location for the data

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaData this]
    (-> this (.getLocation))))

(defn get-uri
  "Return the URI for the source of the record

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaData this]
    (-> this (.getURI))))

(defn get-reader-class
  "Get the class that was used to generate the record

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaData this]
    (-> this (.getReaderClass))))

