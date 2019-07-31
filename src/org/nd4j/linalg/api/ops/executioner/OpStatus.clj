(ns org.nd4j.linalg.api.ops.executioner.OpStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.executioner OpStatus]))

(def ND4J_STATUS_OK
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_OK)

(def ND4J_STATUS_BAD_INPUT
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_INPUT)

(def ND4J_STATUS_BAD_SHAPE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_SHAPE)

(def ND4J_STATUS_BAD_RANK
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_RANK)

(def ND4J_STATUS_BAD_PARAMS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_PARAMS)

(def ND4J_STATUS_BAD_OUTPUT
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_OUTPUT)

(def ND4J_STATUS_BAD_RNG
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_RNG)

(def ND4J_STATUS_BAD_EPSILON
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_EPSILON)

(def ND4J_STATUS_BAD_GRADIENTS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_GRADIENTS)

(def ND4J_STATUS_BAD_BIAS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_BIAS)

(def ND4J_STATUS_BAD_GRAPH
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_GRAPH)

(def ND4J_STATUS_BAD_LENGTH
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_LENGTH)

(def ND4J_STATUS_BAD_DIMENSIONS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_DIMENSIONS)

(def ND4J_STATUS_BAD_ORDER
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_ORDER)

(def ND4J_STATUS_BAD_ARGUMENTS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpStatus"
  OpStatus/ND4J_STATUS_BAD_ARGUMENTS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OpStatus c : OpStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.executioner.OpStatus[]`"
  ([]
    (OpStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.executioner.OpStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.executioner.OpStatus [^java.lang.String name]
    (OpStatus/valueOf name)))

(defn *by-number
  "val - `int`

  returns: `org.nd4j.linalg.api.ops.executioner.OpStatus`"
  (^org.nd4j.linalg.api.ops.executioner.OpStatus [^Integer val]
    (OpStatus/byNumber val)))

