(ns org.datavec.api.formats.output.impl.CSVOutputFormat
  "Creates an @link{CSVRecordWriter}"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.output.impl CSVOutputFormat]))

(defn ->csv-output-format
  "Constructor."
  (^CSVOutputFormat []
    (new CSVOutputFormat )))

(defn create-writer
  "Description copied from interface: OutputFormat

  conf - `org.datavec.api.conf.Configuration`

  returns: the created writer - `org.datavec.api.records.writer.RecordWriter`

  throws: org.datavec.api.exceptions.DataVecException"
  (^org.datavec.api.records.writer.RecordWriter [^CSVOutputFormat this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createWriter conf))))

