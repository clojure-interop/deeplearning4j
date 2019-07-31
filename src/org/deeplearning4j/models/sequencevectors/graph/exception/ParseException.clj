(ns org.deeplearning4j.models.sequencevectors.graph.exception.ParseException
  "Unchecked exception signifying that an error occurred during parsing of text"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.exception ParseException]))

(defn ->parse-exception
  "Constructor.

  s - `java.lang.String`
  e - `java.lang.Exception`"
  (^ParseException [^java.lang.String s ^java.lang.Exception e]
    (new ParseException s e))
  (^ParseException [^java.lang.String s]
    (new ParseException s))
  (^ParseException []
    (new ParseException )))

