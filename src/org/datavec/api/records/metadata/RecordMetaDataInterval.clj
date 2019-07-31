(ns org.datavec.api.records.metadata.RecordMetaDataInterval
  "A general-purpose RecordMetaData implementation, with two indices (long values), generally forming an interval"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataInterval]))

(defn ->record-meta-data-interval
  "Constructor.

  from - `long`
  to - `long`
  uri - `java.net.URI`"
  (^RecordMetaDataInterval [^Long from ^Long to ^java.net.URI uri]
    (new RecordMetaDataInterval from to uri)))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataInterval this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataInterval this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataInterval this]
    (-> this (.getReaderClass))))

