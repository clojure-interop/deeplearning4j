(ns org.datavec.api.records.reader.impl.misc.LibSvmRecordReader
  "Record reader for libsvm format, which is closely
 related to SVMLight format. Similar to scikit-learn
 we use a single reader for both formats, so this class
 is a subclass of SVMLightRecordReader."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.misc LibSvmRecordReader]))

(defn ->lib-svm-record-reader
  "Constructor."
  (^LibSvmRecordReader []
    (new LibSvmRecordReader )))

(defn set-conf
  "Description copied from class: SVMLightRecordReader

  conf - DataVec configuration - `org.datavec.api.conf.Configuration`"
  ([^LibSvmRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

