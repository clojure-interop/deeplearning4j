(ns org.datavec.api.formats.output.impl.SVMLightOutputFormat
  "Created by agibsonccc on 1/11/15."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.output.impl SVMLightOutputFormat]))

(defn ->svm-light-output-format
  "Constructor."
  (^SVMLightOutputFormat []
    (new SVMLightOutputFormat )))

(defn create-writer
  "Description copied from interface: OutputFormat

  conf - `org.datavec.api.conf.Configuration`

  returns: the created writer - `org.datavec.api.records.writer.RecordWriter`

  throws: org.datavec.api.exceptions.DataVecException"
  (^org.datavec.api.records.writer.RecordWriter [^SVMLightOutputFormat this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createWriter conf))))

