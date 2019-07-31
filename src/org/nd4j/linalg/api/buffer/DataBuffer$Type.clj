(ns org.nd4j.linalg.api.buffer.DataBuffer$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer DataBuffer$Type]))

(def DOUBLE
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$Type"
  DataBuffer$Type/DOUBLE)

(def FLOAT
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$Type"
  DataBuffer$Type/FLOAT)

(def INT
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$Type"
  DataBuffer$Type/INT)

(def HALF
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$Type"
  DataBuffer$Type/HALF)

(def COMPRESSED
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$Type"
  DataBuffer$Type/COMPRESSED)

(def LONG
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$Type"
  DataBuffer$Type/LONG)

(def UNKNOWN
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$Type"
  DataBuffer$Type/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (DataBuffer.Type c : DataBuffer.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.buffer.DataBuffer$Type[]`"
  ([]
    (DataBuffer$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^java.lang.String name]
    (DataBuffer$Type/valueOf name)))

