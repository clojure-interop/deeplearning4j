(ns org.nd4j.linalg.util.NioUtil$BufferType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util NioUtil$BufferType]))

(def INT
  "Enum Constant.

  type: org.nd4j.linalg.util.NioUtil$BufferType"
  NioUtil$BufferType/INT)

(def FLOAT
  "Enum Constant.

  type: org.nd4j.linalg.util.NioUtil$BufferType"
  NioUtil$BufferType/FLOAT)

(def DOUBLE
  "Enum Constant.

  type: org.nd4j.linalg.util.NioUtil$BufferType"
  NioUtil$BufferType/DOUBLE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (NioUtil.BufferType c : NioUtil.BufferType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.util.NioUtil$BufferType[]`"
  ([]
    (NioUtil$BufferType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.util.NioUtil$BufferType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.util.NioUtil$BufferType [^java.lang.String name]
    (NioUtil$BufferType/valueOf name)))

