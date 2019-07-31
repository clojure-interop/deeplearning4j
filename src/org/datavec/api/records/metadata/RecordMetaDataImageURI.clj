(ns org.datavec.api.records.metadata.RecordMetaDataImageURI
  "A RecordMetaDataURI that also keeps track of the number of channels,
 the width, and the height of the original image."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.metadata RecordMetaDataImageURI]))

(defn ->record-meta-data-image-uri
  "Constructor.

  uri - `java.net.URI`
  reader-class - `java.lang.Class`
  orig-c - `int`
  orig-h - `int`
  orig-w - `int`"
  (^RecordMetaDataImageURI [^java.net.URI uri ^java.lang.Class reader-class ^Integer orig-c ^Integer orig-h ^Integer orig-w]
    (new RecordMetaDataImageURI uri reader-class orig-c orig-h orig-w)))

