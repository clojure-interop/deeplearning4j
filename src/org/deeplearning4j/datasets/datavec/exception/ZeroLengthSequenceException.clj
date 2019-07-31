(ns org.deeplearning4j.datasets.datavec.exception.ZeroLengthSequenceException
  "Unchecked exception, thrown to signify that a zero-length sequence data set was encountered."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.datavec.exception ZeroLengthSequenceException]))

(defn ->zero-length-sequence-exception
  "Constructor.

  type - `java.lang.String`"
  (^ZeroLengthSequenceException [^java.lang.String type]
    (new ZeroLengthSequenceException type))
  (^ZeroLengthSequenceException []
    (new ZeroLengthSequenceException )))

