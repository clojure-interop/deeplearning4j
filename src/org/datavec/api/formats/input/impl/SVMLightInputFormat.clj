(ns org.datavec.api.formats.input.impl.SVMLightInputFormat
  "SVMLight input format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input.impl SVMLightInputFormat]))

(defn ->svm-light-input-format
  "Constructor."
  (^SVMLightInputFormat []
    (new SVMLightInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^SVMLightInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^SVMLightInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

