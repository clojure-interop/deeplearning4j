(ns org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.ipc NDArrayMessage$MessageValidity]))

(def VALID
  "Enum Constant.

  type: org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity"
  NDArrayMessage$MessageValidity/VALID)

(def NULL_VALUE
  "Enum Constant.

  type: org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity"
  NDArrayMessage$MessageValidity/NULL_VALUE)

(def INCONSISTENT_DIMENSIONS
  "Enum Constant.

  type: org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity"
  NDArrayMessage$MessageValidity/INCONSISTENT_DIMENSIONS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (NDArrayMessage.MessageValidity c : NDArrayMessage.MessageValidity.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity[]`"
  ([]
    (NDArrayMessage$MessageValidity/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.aeron.ipc.NDArrayMessage$MessageValidity [^java.lang.String name]
    (NDArrayMessage$MessageValidity/valueOf name)))

