(ns org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer DataBuffer$AllocationMode]))

(def DIRECT
  "Enum Constant.

  Deprecated.

  type: org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode"
  DataBuffer$AllocationMode/DIRECT)

(def HEAP
  "Enum Constant.

  Deprecated.

  type: org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode"
  DataBuffer$AllocationMode/HEAP)

(def JAVACPP
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode"
  DataBuffer$AllocationMode/JAVACPP)

(def LONG_SHAPE
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode"
  DataBuffer$AllocationMode/LONG_SHAPE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (DataBuffer.AllocationMode c : DataBuffer.AllocationMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode[]`"
  ([]
    (DataBuffer$AllocationMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode [^java.lang.String name]
    (DataBuffer$AllocationMode/valueOf name)))

