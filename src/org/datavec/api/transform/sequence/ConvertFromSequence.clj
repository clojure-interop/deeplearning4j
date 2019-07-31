(ns org.datavec.api.transform.sequence.ConvertFromSequence
  "Split up the values in sequences to a set of individual values.
 i.e., sequences are split up, such that each time step in the sequence is treated as a separate example"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence ConvertFromSequence]))

(defn ->convert-from-sequence
  "Constructor."
  (^ConvertFromSequence []
    (new ConvertFromSequence )))

(defn transform
  "schema - `org.datavec.api.transform.schema.SequenceSchema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConvertFromSequence this ^org.datavec.api.transform.schema.SequenceSchema schema]
    (-> this (.transform schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConvertFromSequence this]
    (-> this (.toString))))

