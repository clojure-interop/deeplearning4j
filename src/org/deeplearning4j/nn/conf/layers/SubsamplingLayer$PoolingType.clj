(ns org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SubsamplingLayer$PoolingType]))

(def MAX
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType"
  SubsamplingLayer$PoolingType/MAX)

(def AVG
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType"
  SubsamplingLayer$PoolingType/AVG)

(def SUM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType"
  SubsamplingLayer$PoolingType/SUM)

(def PNORM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType"
  SubsamplingLayer$PoolingType/PNORM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SubsamplingLayer.PoolingType c : SubsamplingLayer.PoolingType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType[]`"
  ([]
    (SubsamplingLayer$PoolingType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType [^java.lang.String name]
    (SubsamplingLayer$PoolingType/valueOf name)))

(defn to-pooling-type
  "returns: `org.deeplearning4j.nn.conf.layers.PoolingType`"
  (^org.deeplearning4j.nn.conf.layers.PoolingType [^SubsamplingLayer$PoolingType this]
    (-> this (.toPoolingType))))

