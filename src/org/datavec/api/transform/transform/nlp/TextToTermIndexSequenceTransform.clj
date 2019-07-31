(ns org.datavec.api.transform.transform.nlp.TextToTermIndexSequenceTransform
  "Convert each text value in a sequence to a longer sequence of integer indices.
 For example, \"zero one two\" would be converted to [0, 1, 2]. Values in other
 columns will be duplicated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.nlp TextToTermIndexSequenceTransform]))

(defn ->text-to-term-index-sequence-transform
  "Constructor.

  column-name - Name of the text column - `java.lang.String`
  new-column-name - Name of the column after expansion - `java.lang.String`
  vocabulary - Vocabulary - `java.util.List`
  delimiter - Delimiter - `java.lang.String`
  exception-on-unknown - If true: throw an exception on unknown characters. False: skip unknown characters. - `boolean`"
  (^TextToTermIndexSequenceTransform [^java.lang.String column-name ^java.lang.String new-column-name ^java.util.List vocabulary ^java.lang.String delimiter ^Boolean exception-on-unknown]
    (new TextToTermIndexSequenceTransform column-name new-column-name vocabulary delimiter exception-on-unknown)))

