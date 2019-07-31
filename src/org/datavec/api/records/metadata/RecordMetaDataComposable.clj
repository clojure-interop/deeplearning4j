(ns org.datavec.api.records.metadata.RecordMetaDataComposable
  "A RecordMetaData instance that combines multiple individual RecordMetaData instances"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataComposable]))

(defn ->record-meta-data-composable
  "Constructor.

  reader-class - `java.lang.Class`
  record-meta-datas - `org.datavec.api.records.metadata.RecordMetaData`"
  (^RecordMetaDataComposable [^java.lang.Class reader-class ^org.datavec.api.records.metadata.RecordMetaData record-meta-datas]
    (new RecordMetaDataComposable reader-class record-meta-datas))
  (^RecordMetaDataComposable [^org.datavec.api.records.metadata.RecordMetaData record-meta-datas]
    (new RecordMetaDataComposable record-meta-datas)))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataComposable this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataComposable this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataComposable this]
    (-> this (.getReaderClass))))

