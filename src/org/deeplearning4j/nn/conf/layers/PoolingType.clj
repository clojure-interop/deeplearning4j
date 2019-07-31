(ns org.deeplearning4j.nn.conf.layers.PoolingType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers PoolingType]))

(def MAX
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.PoolingType"
  PoolingType/MAX)

(def AVG
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.PoolingType"
  PoolingType/AVG)

(def SUM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.PoolingType"
  PoolingType/SUM)

(def PNORM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.PoolingType"
  PoolingType/PNORM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (PoolingType c : PoolingType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.PoolingType[]`"
  ([]
    (PoolingType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.PoolingType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.PoolingType [^java.lang.String name]
    (PoolingType/valueOf name)))

