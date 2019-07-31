(ns org.datavec.api.records.reader.factory.RecordWriterFactory
  "Factory for creating RecordWriter instance"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.factory RecordWriterFactory]))

(defn create
  "uri - destination for saving model - `java.net.URI`

  returns: record writer instance - `org.datavec.api.records.writer.RecordWriter`

  throws: java.lang.Exception"
  (^org.datavec.api.records.writer.RecordWriter [^RecordWriterFactory this ^java.net.URI uri]
    (-> this (.create uri))))

