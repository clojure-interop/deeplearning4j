(ns org.deeplearning4j.zoo.ZooType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo ZooType]))

(def CNN
  "Enum Constant.

  type: org.deeplearning4j.zoo.ZooType"
  ZooType/CNN)

(def RNN
  "Enum Constant.

  type: org.deeplearning4j.zoo.ZooType"
  ZooType/RNN)

(def TEXTGENLSTM
  "Enum Constant.

  type: org.deeplearning4j.zoo.ZooType"
  ZooType/TEXTGENLSTM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ZooType c : ZooType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.zoo.ZooType[]`"
  ([]
    (ZooType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.zoo.ZooType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.zoo.ZooType [^java.lang.String name]
    (ZooType/valueOf name)))

