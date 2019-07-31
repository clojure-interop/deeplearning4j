(ns org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ConvolutionLayer$AlgoMode]))

(def NO_WORKSPACE
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode"
  ConvolutionLayer$AlgoMode/NO_WORKSPACE)

(def PREFER_FASTEST
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode"
  ConvolutionLayer$AlgoMode/PREFER_FASTEST)

(def USER_SPECIFIED
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode"
  ConvolutionLayer$AlgoMode/USER_SPECIFIED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ConvolutionLayer.AlgoMode c : ConvolutionLayer.AlgoMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode[]`"
  ([]
    (ConvolutionLayer$AlgoMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode [^java.lang.String name]
    (ConvolutionLayer$AlgoMode/valueOf name)))

