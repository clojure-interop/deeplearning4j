(ns org.datavec.api.records.metadata.RecordMetaDataComposableMap
  "A RecordMetaData instance that combines multiple individual RecordMetaData instances, via a Map<String,RecordMetaData>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataComposableMap]))

(defn ->record-meta-data-composable-map
  "Constructor.

  reader-class - `java.lang.Class`
  record-meta-datas - `java.util.Map`"
  (^RecordMetaDataComposableMap [^java.lang.Class reader-class ^java.util.Map record-meta-datas]
    (new RecordMetaDataComposableMap reader-class record-meta-datas))
  (^RecordMetaDataComposableMap [^java.util.Map record-meta-datas]
    (new RecordMetaDataComposableMap record-meta-datas)))

(defn get-location
  "Description copied from interface: RecordMetaData

  returns: `java.lang.String`"
  (^java.lang.String [^RecordMetaDataComposableMap this]
    (-> this (.getLocation))))

(defn get-uri
  "Description copied from interface: RecordMetaData

  returns: The URI for the record (file, etc) - or null otherwise - `java.net.URI`"
  (^java.net.URI [^RecordMetaDataComposableMap this]
    (-> this (.getURI))))

(defn get-reader-class
  "Description copied from interface: RecordMetaData

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^RecordMetaDataComposableMap this]
    (-> this (.getReaderClass))))

