(ns org.deeplearning4j.nn.conf.inputs.InputType$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InputType$Type]))

(def FF
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.inputs.InputType$Type"
  InputType$Type/FF)

(def RNN
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.inputs.InputType$Type"
  InputType$Type/RNN)

(def CNN
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.inputs.InputType$Type"
  InputType$Type/CNN)

(def CNNFlat
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.inputs.InputType$Type"
  InputType$Type/CNNFlat)

(def CNN3D
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.inputs.InputType$Type"
  InputType$Type/CNN3D)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (InputType.Type c : InputType.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.inputs.InputType$Type[]`"
  ([]
    (InputType$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.inputs.InputType$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.inputs.InputType$Type [^java.lang.String name]
    (InputType$Type/valueOf name)))

