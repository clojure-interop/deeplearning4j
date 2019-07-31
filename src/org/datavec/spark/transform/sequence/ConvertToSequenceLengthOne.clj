(ns org.datavec.spark.transform.sequence.ConvertToSequenceLengthOne
  "Very simple function to convert an example to sequence of length 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sequence ConvertToSequenceLengthOne]))

(defn ->convert-to-sequence-length-one
  "Constructor."
  (^ConvertToSequenceLengthOne []
    (new ConvertToSequenceLengthOne )))

(defn call
  "writables - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^ConvertToSequenceLengthOne this ^java.util.List writables]
    (-> this (.call writables))))

