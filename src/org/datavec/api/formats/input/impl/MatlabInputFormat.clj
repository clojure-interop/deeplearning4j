(ns org.datavec.api.formats.input.impl.MatlabInputFormat
  "Matlab input format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input.impl MatlabInputFormat]))

(defn ->matlab-input-format
  "Constructor."
  (^MatlabInputFormat []
    (new MatlabInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^MatlabInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^MatlabInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

