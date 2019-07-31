(ns org.nd4j.linalg.api.ops.Op$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops Op$Type]))

(def SCALAR
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/SCALAR)

(def TRANSFORM
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/TRANSFORM)

(def PAIRWISE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/PAIRWISE)

(def SPECIAL
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/SPECIAL)

(def BROADCAST
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/BROADCAST)

(def REDUCE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/REDUCE)

(def INDEXREDUCE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/INDEXREDUCE)

(def VARIANCE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/VARIANCE)

(def REDUCE3
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/REDUCE3)

(def GRID
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/GRID)

(def META
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/META)

(def AGGREGATION
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/AGGREGATION)

(def CUSTOM
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/CUSTOM)

(def GRADIENT
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/GRADIENT)

(def SHAPE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/SHAPE)

(def CONDITIONAL
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/CONDITIONAL)

(def LOOP
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/LOOP)

(def LOOP_COND
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/LOOP_COND)

(def IF
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/IF)

(def RETURN
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/RETURN)

(def ENTER
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/ENTER)

(def EXIT
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/EXIT)

(def NEXT_ITERATION
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/NEXT_ITERATION)

(def RANDOM
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/RANDOM)

(def MERGE
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/MERGE)

(def SUMMARYSTATS
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.Op$Type"
  Op$Type/SUMMARYSTATS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Op.Type c : Op.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.Op$Type[]`"
  ([]
    (Op$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.Op$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.Op$Type [^java.lang.String name]
    (Op$Type/valueOf name)))

