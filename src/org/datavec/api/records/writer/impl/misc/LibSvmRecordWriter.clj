(ns org.datavec.api.records.writer.impl.misc.LibSvmRecordWriter
  "Record writer for libsvm format, which is closely
 related to SVMLight format. Similar to scikit-learn
 we use a single writer for both formats, so this class
 is a subclass of SVMLightRecordWriter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer.impl.misc LibSvmRecordWriter]))

(defn ->lib-svm-record-writer
  "Constructor."
  (^LibSvmRecordWriter []
    (new LibSvmRecordWriter )))

