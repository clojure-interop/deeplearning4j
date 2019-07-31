(ns org.datavec.api.formats.input.impl.LibSvmInputFormat
  "Lib svm input format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input.impl LibSvmInputFormat]))

(defn ->lib-svm-input-format
  "Constructor."
  (^LibSvmInputFormat []
    (new LibSvmInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^LibSvmInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf))))

