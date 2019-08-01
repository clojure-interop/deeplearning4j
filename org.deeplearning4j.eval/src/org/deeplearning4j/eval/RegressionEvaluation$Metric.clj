(ns org.deeplearning4j.eval.RegressionEvaluation$Metric
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval RegressionEvaluation$Metric]))

(def MSE
  "Enum Constant.

  type: org.deeplearning4j.eval.RegressionEvaluation$Metric"
  RegressionEvaluation$Metric/MSE)

(def MAE
  "Enum Constant.

  type: org.deeplearning4j.eval.RegressionEvaluation$Metric"
  RegressionEvaluation$Metric/MAE)

(def RMSE
  "Enum Constant.

  type: org.deeplearning4j.eval.RegressionEvaluation$Metric"
  RegressionEvaluation$Metric/RMSE)

(def RSE
  "Enum Constant.

  type: org.deeplearning4j.eval.RegressionEvaluation$Metric"
  RegressionEvaluation$Metric/RSE)

(def PC
  "Enum Constant.

  type: org.deeplearning4j.eval.RegressionEvaluation$Metric"
  RegressionEvaluation$Metric/PC)

(def R2
  "Enum Constant.

  type: org.deeplearning4j.eval.RegressionEvaluation$Metric"
  RegressionEvaluation$Metric/R2)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (RegressionEvaluation.Metric c : RegressionEvaluation.Metric.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.eval.RegressionEvaluation$Metric[]`"
  ([]
    (RegressionEvaluation$Metric/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.eval.RegressionEvaluation$Metric`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.eval.RegressionEvaluation$Metric [^java.lang.String name]
    (RegressionEvaluation$Metric/valueOf name)))

(defn minimize
  "returns: True if the metric should be minimized, or false if the metric should be maximized.
  For example, MSE of 0 is best, but R^2 of 1.0 is best - `boolean`"
  (^Boolean [^RegressionEvaluation$Metric this]
    (-> this (.minimize))))

