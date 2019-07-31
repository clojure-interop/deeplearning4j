(ns org.datavec.local.transforms.sequence.ConvertToSequenceLengthOne
  "Very simple function to convert an example to sequence of length 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.sequence ConvertToSequenceLengthOne]))

(defn ->convert-to-sequence-length-one
  "Constructor."
  (^ConvertToSequenceLengthOne []
    (new ConvertToSequenceLengthOne )))

(defn apply
  "Description copied from interface: Function

  writables - Input - `java.util.List`

  returns: Result - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ConvertToSequenceLengthOne this ^java.util.List writables]
    (-> this (.apply writables))))

