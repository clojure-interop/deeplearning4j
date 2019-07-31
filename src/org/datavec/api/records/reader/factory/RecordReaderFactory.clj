(ns org.datavec.api.records.reader.factory.RecordReaderFactory
  "Factory for creating RecordReader instance"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.factory RecordReaderFactory]))

(defn create
  "Creates instance of RecordReader

  uri - `java.net.URI`

  returns: record reader instance - `org.datavec.api.records.reader.RecordReader`

  throws: org.datavec.api.exceptions.UnknownFormatException"
  (^org.datavec.api.records.reader.RecordReader [^RecordReaderFactory this ^java.net.URI uri]
    (-> this (.create uri))))

