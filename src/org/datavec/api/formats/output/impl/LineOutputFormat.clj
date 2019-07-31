(ns org.datavec.api.formats.output.impl.LineOutputFormat
  "Line output format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.output.impl LineOutputFormat]))

(defn ->line-output-format
  "Constructor."
  (^LineOutputFormat []
    (new LineOutputFormat )))

(defn create-writer
  "Description copied from interface: OutputFormat

  conf - `org.datavec.api.conf.Configuration`

  returns: the created writer - `org.datavec.api.records.writer.RecordWriter`

  throws: org.datavec.api.exceptions.DataVecException"
  (^org.datavec.api.records.writer.RecordWriter [^LineOutputFormat this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createWriter conf))))

