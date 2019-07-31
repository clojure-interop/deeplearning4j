(ns org.datavec.api.records.reader.impl.jackson.JacksonReaderUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.jackson JacksonReaderUtils]))

(defn *parse-record
  "line - `java.lang.String`
  selection - `org.datavec.api.records.reader.impl.jackson.FieldSelection`
  mapper - `org.nd4j.shade.jackson.databind.ObjectMapper`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^java.lang.String line ^org.datavec.api.records.reader.impl.jackson.FieldSelection selection ^org.nd4j.shade.jackson.databind.ObjectMapper mapper]
    (JacksonReaderUtils/parseRecord line selection mapper)))

