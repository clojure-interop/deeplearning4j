(ns org.deeplearning4j.arbiter.optimize.parameter.math.Op
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter.math Op]))

(def ADD
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.parameter.math.Op"
  Op/ADD)

(def SUB
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.parameter.math.Op"
  Op/SUB)

(def MUL
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.parameter.math.Op"
  Op/MUL)

(def DIV
  "Enum Constant.

  type: org.deeplearning4j.arbiter.optimize.parameter.math.Op"
  Op/DIV)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Op c : Op.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.arbiter.optimize.parameter.math.Op[]`"
  ([]
    (Op/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.arbiter.optimize.parameter.math.Op`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.arbiter.optimize.parameter.math.Op [^java.lang.String name]
    (Op/valueOf name)))

