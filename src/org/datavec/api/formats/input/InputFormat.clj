(ns org.datavec.api.formats.input.InputFormat
  "Create an input format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input InputFormat]))

(defn create-reader
  "Creates a reader from an input split

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^InputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^InputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

