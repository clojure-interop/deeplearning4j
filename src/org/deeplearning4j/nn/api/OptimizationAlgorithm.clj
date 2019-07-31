(ns org.deeplearning4j.nn.api.OptimizationAlgorithm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api OptimizationAlgorithm]))

(def LINE_GRADIENT_DESCENT
  "Enum Constant.

  type: org.deeplearning4j.nn.api.OptimizationAlgorithm"
  OptimizationAlgorithm/LINE_GRADIENT_DESCENT)

(def CONJUGATE_GRADIENT
  "Enum Constant.

  type: org.deeplearning4j.nn.api.OptimizationAlgorithm"
  OptimizationAlgorithm/CONJUGATE_GRADIENT)

(def LBFGS
  "Enum Constant.

  type: org.deeplearning4j.nn.api.OptimizationAlgorithm"
  OptimizationAlgorithm/LBFGS)

(def STOCHASTIC_GRADIENT_DESCENT
  "Enum Constant.

  type: org.deeplearning4j.nn.api.OptimizationAlgorithm"
  OptimizationAlgorithm/STOCHASTIC_GRADIENT_DESCENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OptimizationAlgorithm c : OptimizationAlgorithm.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.api.OptimizationAlgorithm[]`"
  ([]
    (OptimizationAlgorithm/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.api.OptimizationAlgorithm`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.api.OptimizationAlgorithm [^java.lang.String name]
    (OptimizationAlgorithm/valueOf name)))

