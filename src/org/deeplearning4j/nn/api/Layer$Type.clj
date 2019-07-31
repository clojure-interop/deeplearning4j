(ns org.deeplearning4j.nn.api.Layer$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api Layer$Type]))

(def FEED_FORWARD
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/FEED_FORWARD)

(def RECURRENT
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/RECURRENT)

(def CONVOLUTIONAL
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/CONVOLUTIONAL)

(def CONVOLUTIONAL3D
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/CONVOLUTIONAL3D)

(def SUBSAMPLING
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/SUBSAMPLING)

(def UPSAMPLING
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/UPSAMPLING)

(def RECURSIVE
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/RECURSIVE)

(def MULTILAYER
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/MULTILAYER)

(def NORMALIZATION
  "Enum Constant.

  type: org.deeplearning4j.nn.api.Layer$Type"
  Layer$Type/NORMALIZATION)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Layer.Type c : Layer.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.api.Layer$Type[]`"
  ([]
    (Layer$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.api.Layer$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.api.Layer$Type [^java.lang.String name]
    (Layer$Type/valueOf name)))

