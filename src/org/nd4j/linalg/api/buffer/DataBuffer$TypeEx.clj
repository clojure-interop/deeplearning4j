(ns org.nd4j.linalg.api.buffer.DataBuffer$TypeEx
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer DataBuffer$TypeEx]))

(def FLOAT8
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/FLOAT8)

(def INT8
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/INT8)

(def UINT8
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/UINT8)

(def FLOAT16
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/FLOAT16)

(def INT16
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/INT16)

(def UINT16
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/UINT16)

(def FLOAT
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/FLOAT)

(def DOUBLE
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/DOUBLE)

(def THRESHOLD
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/THRESHOLD)

(def FTHRESHOLD
  "Enum Constant.

  type: org.nd4j.linalg.api.buffer.DataBuffer$TypeEx"
  DataBuffer$TypeEx/FTHRESHOLD)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (DataBuffer.TypeEx c : DataBuffer.TypeEx.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx[]`"
  ([]
    (DataBuffer$TypeEx/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx [^java.lang.String name]
    (DataBuffer$TypeEx/valueOf name)))

