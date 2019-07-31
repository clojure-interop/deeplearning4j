(ns org.nd4j.weightinit.WeightInit
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit WeightInit]))

(def DISTRIBUTION
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/DISTRIBUTION)

(def ZERO
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/ZERO)

(def ONES
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/ONES)

(def SIGMOID_UNIFORM
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/SIGMOID_UNIFORM)

(def NORMAL
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/NORMAL)

(def LECUN_NORMAL
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/LECUN_NORMAL)

(def UNIFORM
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/UNIFORM)

(def XAVIER
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/XAVIER)

(def XAVIER_UNIFORM
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/XAVIER_UNIFORM)

(def XAVIER_FAN_IN
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/XAVIER_FAN_IN)

(def XAVIER_LEGACY
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/XAVIER_LEGACY)

(def RELU
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/RELU)

(def RELU_UNIFORM
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/RELU_UNIFORM)

(def IDENTITY
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/IDENTITY)

(def LECUN_UNIFORM
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/LECUN_UNIFORM)

(def VAR_SCALING_NORMAL_FAN_IN
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/VAR_SCALING_NORMAL_FAN_IN)

(def VAR_SCALING_NORMAL_FAN_OUT
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/VAR_SCALING_NORMAL_FAN_OUT)

(def VAR_SCALING_NORMAL_FAN_AVG
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/VAR_SCALING_NORMAL_FAN_AVG)

(def VAR_SCALING_UNIFORM_FAN_IN
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/VAR_SCALING_UNIFORM_FAN_IN)

(def VAR_SCALING_UNIFORM_FAN_OUT
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/VAR_SCALING_UNIFORM_FAN_OUT)

(def VAR_SCALING_UNIFORM_FAN_AVG
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/VAR_SCALING_UNIFORM_FAN_AVG)

(def SUPPLIED
  "Enum Constant.

  type: org.nd4j.weightinit.WeightInit"
  WeightInit/SUPPLIED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (WeightInit c : WeightInit.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.weightinit.WeightInit[]`"
  ([]
    (WeightInit/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.weightinit.WeightInit`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.weightinit.WeightInit [^java.lang.String name]
    (WeightInit/valueOf name)))

