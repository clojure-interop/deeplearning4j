(ns org.datavec.image.format.ImageInputFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.format ImageInputFormat]))

(defn ->image-input-format
  "Constructor."
  (^ImageInputFormat []
    (new ImageInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^ImageInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^ImageInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

