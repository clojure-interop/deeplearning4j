(ns org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Subsampling3DLayer$PoolingType]))

(def MAX
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType"
  Subsampling3DLayer$PoolingType/MAX)

(def AVG
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType"
  Subsampling3DLayer$PoolingType/AVG)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Subsampling3DLayer.PoolingType c : Subsampling3DLayer.PoolingType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType[]`"
  ([]
    (Subsampling3DLayer$PoolingType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType [^java.lang.String name]
    (Subsampling3DLayer$PoolingType/valueOf name)))

(defn to-pooling-type
  "returns: `org.deeplearning4j.nn.conf.layers.PoolingType`"
  (^org.deeplearning4j.nn.conf.layers.PoolingType [^Subsampling3DLayer$PoolingType this]
    (-> this (.toPoolingType))))

