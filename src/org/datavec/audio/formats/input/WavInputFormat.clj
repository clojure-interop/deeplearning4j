(ns org.datavec.audio.formats.input.WavInputFormat
  "Wave file input format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.formats.input WavInputFormat]))

(defn ->wav-input-format
  "Constructor."
  (^WavInputFormat []
    (new WavInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^WavInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^WavInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

