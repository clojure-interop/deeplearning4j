(ns org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.executioner OpExecutioner$ExecutionerType]))

(def NATIVE_CPU
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType"
  OpExecutioner$ExecutionerType/NATIVE_CPU)

(def CUDA
  "Enum Constant.

  type: org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType"
  OpExecutioner$ExecutionerType/CUDA)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OpExecutioner.ExecutionerType c : OpExecutioner.ExecutionerType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType[]`"
  ([]
    (OpExecutioner$ExecutionerType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType [^java.lang.String name]
    (OpExecutioner$ExecutionerType/valueOf name)))

