(ns org.datavec.api.formats.output.impl.LibSvmOutputFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.output.impl LibSvmOutputFormat]))

(defn ->lib-svm-output-format
  "Constructor."
  (^LibSvmOutputFormat []
    (new LibSvmOutputFormat )))

(defn create-writer
  "Description copied from interface: OutputFormat

  conf - `org.datavec.api.conf.Configuration`

  returns: the created writer - `org.datavec.api.records.writer.RecordWriter`

  throws: org.datavec.api.exceptions.DataVecException"
  (^org.datavec.api.records.writer.RecordWriter [^LibSvmOutputFormat this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createWriter conf))))

