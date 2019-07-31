(ns org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc ROCScoreCalculator$ROCType]))

(def ROC
  "Enum Constant.

  type: org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType"
  ROCScoreCalculator$ROCType/ROC)

(def BINARY
  "Enum Constant.

  type: org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType"
  ROCScoreCalculator$ROCType/BINARY)

(def MULTICLASS
  "Enum Constant.

  type: org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType"
  ROCScoreCalculator$ROCType/MULTICLASS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ROCScoreCalculator.ROCType c : ROCScoreCalculator.ROCType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType[]`"
  ([]
    (ROCScoreCalculator$ROCType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType [^java.lang.String name]
    (ROCScoreCalculator$ROCType/valueOf name)))

