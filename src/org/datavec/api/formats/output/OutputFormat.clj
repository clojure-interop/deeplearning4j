(ns org.datavec.api.formats.output.OutputFormat
  "Create a record writer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.output OutputFormat]))

(defn create-writer
  "Create a record writer

  conf - `org.datavec.api.conf.Configuration`

  returns: the created writer - `org.datavec.api.records.writer.RecordWriter`

  throws: org.datavec.api.exceptions.DataVecException"
  (^org.datavec.api.records.writer.RecordWriter [^OutputFormat this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createWriter conf))))

