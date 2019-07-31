(ns org.datavec.api.transform.transform.nlp.TextToCharacterIndexTransform
  "Convert each text value in a sequence to a longer sequence of integer indices.
 For example, \"abc\" would be converted to [1, 2, 3]. Values in other columns will be duplicated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.nlp TextToCharacterIndexTransform]))

(defn ->text-to-character-index-transform
  "Constructor.

  column-name - Name of the text column - `java.lang.String`
  new-column-name - Name of the column after expansion - `java.lang.String`
  character-index-map - Character to integer index map - `java.util.Map`
  exception-on-unknown - If true: throw an exception on unknown characters. False: skip unknown characters. - `boolean`"
  (^TextToCharacterIndexTransform [^java.lang.String column-name ^java.lang.String new-column-name ^java.util.Map character-index-map ^Boolean exception-on-unknown]
    (new TextToCharacterIndexTransform column-name new-column-name character-index-map exception-on-unknown)))

