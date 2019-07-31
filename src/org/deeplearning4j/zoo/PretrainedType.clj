(ns org.deeplearning4j.zoo.PretrainedType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo PretrainedType]))

(def IMAGENET
  "Enum Constant.

  type: org.deeplearning4j.zoo.PretrainedType"
  PretrainedType/IMAGENET)

(def IMAGENETLARGE
  "Enum Constant.

  type: org.deeplearning4j.zoo.PretrainedType"
  PretrainedType/IMAGENETLARGE)

(def MNIST
  "Enum Constant.

  type: org.deeplearning4j.zoo.PretrainedType"
  PretrainedType/MNIST)

(def CIFAR10
  "Enum Constant.

  type: org.deeplearning4j.zoo.PretrainedType"
  PretrainedType/CIFAR10)

(def VGGFACE
  "Enum Constant.

  type: org.deeplearning4j.zoo.PretrainedType"
  PretrainedType/VGGFACE)

(def SEGMENT
  "Enum Constant.

  type: org.deeplearning4j.zoo.PretrainedType"
  PretrainedType/SEGMENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (PretrainedType c : PretrainedType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.zoo.PretrainedType[]`"
  ([]
    (PretrainedType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.zoo.PretrainedType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.zoo.PretrainedType [^java.lang.String name]
    (PretrainedType/valueOf name)))

