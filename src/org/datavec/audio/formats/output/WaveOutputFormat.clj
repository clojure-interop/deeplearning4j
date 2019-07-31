(ns org.datavec.audio.formats.output.WaveOutputFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.formats.output WaveOutputFormat]))

(defn ->wave-output-format
  "Constructor."
  (^WaveOutputFormat []
    (new WaveOutputFormat )))

(defn create-writer
  "Description copied from interface: OutputFormat

  conf - `org.datavec.api.conf.Configuration`

  returns: the created writer - `org.datavec.api.records.writer.RecordWriter`

  throws: org.datavec.api.exceptions.DataVecException"
  (^org.datavec.api.records.writer.RecordWriter [^WaveOutputFormat this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createWriter conf))))

