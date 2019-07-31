(ns org.nd4j.linalg.api.shape.options.ArrayType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.shape.options ArrayType]))

(def DENSE
  "Enum Constant.

  type: org.nd4j.linalg.api.shape.options.ArrayType"
  ArrayType/DENSE)

(def SPARSE
  "Enum Constant.

  type: org.nd4j.linalg.api.shape.options.ArrayType"
  ArrayType/SPARSE)

(def COMPRESSED
  "Enum Constant.

  type: org.nd4j.linalg.api.shape.options.ArrayType"
  ArrayType/COMPRESSED)

(def EMPTY
  "Enum Constant.

  type: org.nd4j.linalg.api.shape.options.ArrayType"
  ArrayType/EMPTY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ArrayType c : ArrayType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.shape.options.ArrayType[]`"
  ([]
    (ArrayType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.shape.options.ArrayType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.shape.options.ArrayType [^java.lang.String name]
    (ArrayType/valueOf name)))

