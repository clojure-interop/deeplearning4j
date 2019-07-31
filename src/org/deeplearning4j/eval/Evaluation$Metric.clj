(ns org.deeplearning4j.eval.Evaluation$Metric
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval Evaluation$Metric]))

(def ACCURACY
  "Enum Constant.

  type: org.deeplearning4j.eval.Evaluation$Metric"
  Evaluation$Metric/ACCURACY)

(def F1
  "Enum Constant.

  type: org.deeplearning4j.eval.Evaluation$Metric"
  Evaluation$Metric/F1)

(def PRECISION
  "Enum Constant.

  type: org.deeplearning4j.eval.Evaluation$Metric"
  Evaluation$Metric/PRECISION)

(def RECALL
  "Enum Constant.

  type: org.deeplearning4j.eval.Evaluation$Metric"
  Evaluation$Metric/RECALL)

(def GMEASURE
  "Enum Constant.

  type: org.deeplearning4j.eval.Evaluation$Metric"
  Evaluation$Metric/GMEASURE)

(def MCC
  "Enum Constant.

  type: org.deeplearning4j.eval.Evaluation$Metric"
  Evaluation$Metric/MCC)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Evaluation.Metric c : Evaluation.Metric.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.eval.Evaluation$Metric[]`"
  ([]
    (Evaluation$Metric/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.eval.Evaluation$Metric`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.eval.Evaluation$Metric [^java.lang.String name]
    (Evaluation$Metric/valueOf name)))

