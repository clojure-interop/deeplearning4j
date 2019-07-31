(ns org.deeplearning4j.arbiter.scoring.RegressionValue
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring RegressionValue]))

(def MSE
  "Enum Constant.

  Deprecated.

  type: org.deeplearning4j.arbiter.scoring.RegressionValue"
  RegressionValue/MSE)

(def MAE
  "Enum Constant.

  Deprecated.

  type: org.deeplearning4j.arbiter.scoring.RegressionValue"
  RegressionValue/MAE)

(def RMSE
  "Enum Constant.

  Deprecated.

  type: org.deeplearning4j.arbiter.scoring.RegressionValue"
  RegressionValue/RMSE)

(def RSE
  "Enum Constant.

  Deprecated.

  type: org.deeplearning4j.arbiter.scoring.RegressionValue"
  RegressionValue/RSE)

(def CorrCoeff
  "Enum Constant.

  Deprecated.

  type: org.deeplearning4j.arbiter.scoring.RegressionValue"
  RegressionValue/CorrCoeff)

(defn *values
  "Deprecated.

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.arbiter.scoring.RegressionValue[]`"
  ([]
    (RegressionValue/values )))

(defn *value-of
  "Deprecated.

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.arbiter.scoring.RegressionValue`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.arbiter.scoring.RegressionValue [^java.lang.String name]
    (RegressionValue/valueOf name)))

