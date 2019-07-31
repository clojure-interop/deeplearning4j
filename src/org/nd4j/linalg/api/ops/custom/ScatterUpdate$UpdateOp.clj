(ns org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.custom ScatterUpdate$UpdateOp]))

(def ADD
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp"
  ScatterUpdate$UpdateOp/ADD)

(def SUBTRACT
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp"
  ScatterUpdate$UpdateOp/SUBTRACT)

(def MILTIPLY
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp"
  ScatterUpdate$UpdateOp/MILTIPLY)

(def DIVIDE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp"
  ScatterUpdate$UpdateOp/DIVIDE)

(def RSUBTRACT
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp"
  ScatterUpdate$UpdateOp/RSUBTRACT)

(def RDIVIDE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp"
  ScatterUpdate$UpdateOp/RDIVIDE)

(def ASSIGN
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp"
  ScatterUpdate$UpdateOp/ASSIGN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ScatterUpdate.UpdateOp c : ScatterUpdate.UpdateOp.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp[]`"
  ([]
    (ScatterUpdate$UpdateOp/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp [^java.lang.String name]
    (ScatterUpdate$UpdateOp/valueOf name)))

