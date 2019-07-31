(ns org.tensorflow.framework.AttrValue$ValueCase
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValue$ValueCase]))

(def S
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/S)

(def I
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/I)

(def F
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/F)

(def B
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/B)

(def TYPE
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/TYPE)

(def SHAPE
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/SHAPE)

(def TENSOR
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/TENSOR)

(def LIST
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/LIST)

(def FUNC
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/FUNC)

(def PLACEHOLDER
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/PLACEHOLDER)

(def VALUE_NOT_SET
  "Enum Constant.

  type: org.tensorflow.framework.AttrValue$ValueCase"
  AttrValue$ValueCase/VALUE_NOT_SET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (AttrValue.ValueCase c : AttrValue.ValueCase.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.tensorflow.framework.AttrValue$ValueCase[]`"
  ([]
    (AttrValue$ValueCase/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.tensorflow.framework.AttrValue$ValueCase`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.tensorflow.framework.AttrValue$ValueCase [^java.lang.String name]
    (AttrValue$ValueCase/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `org.tensorflow.framework.AttrValue$ValueCase`"
  (^org.tensorflow.framework.AttrValue$ValueCase [^Integer value]
    (AttrValue$ValueCase/forNumber value)))

(defn get-number
  "returns: `int`"
  (^Integer [^AttrValue$ValueCase this]
    (-> this (.getNumber))))

