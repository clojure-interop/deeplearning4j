(ns org.deeplearning4j.nn.conf.BackpropType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf BackpropType]))

(def Standard
  "Enum Constant.

  Default option. Used for training most networks, including MLP, DBNs, CNNs etc.

  type: org.deeplearning4j.nn.conf.BackpropType"
  BackpropType/Standard)

(def TruncatedBPTT
  "Enum Constant.

  Truncated BackPropagation Through Time. Only applicable in context of
  training networks with recurrent neural network layers such as GravesLSTM

  type: org.deeplearning4j.nn.conf.BackpropType"
  BackpropType/TruncatedBPTT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (BackpropType c : BackpropType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.BackpropType[]`"
  ([]
    (BackpropType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.BackpropType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.BackpropType [^java.lang.String name]
    (BackpropType/valueOf name)))

