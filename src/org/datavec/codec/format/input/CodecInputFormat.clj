(ns org.datavec.codec.format.input.CodecInputFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.codec.format.input CodecInputFormat]))

(defn ->codec-input-format
  "Constructor."
  (^CodecInputFormat []
    (new CodecInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^CodecInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf))))

