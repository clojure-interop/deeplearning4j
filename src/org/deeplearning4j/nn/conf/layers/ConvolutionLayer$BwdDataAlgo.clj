(ns org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ConvolutionLayer$BwdDataAlgo]))

(def ALGO_0
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo"
  ConvolutionLayer$BwdDataAlgo/ALGO_0)

(def ALGO_1
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo"
  ConvolutionLayer$BwdDataAlgo/ALGO_1)

(def FFT
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo"
  ConvolutionLayer$BwdDataAlgo/FFT)

(def FFT_TILING
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo"
  ConvolutionLayer$BwdDataAlgo/FFT_TILING)

(def WINOGRAD
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo"
  ConvolutionLayer$BwdDataAlgo/WINOGRAD)

(def WINOGRAD_NONFUSED
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo"
  ConvolutionLayer$BwdDataAlgo/WINOGRAD_NONFUSED)

(def COUNT
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo"
  ConvolutionLayer$BwdDataAlgo/COUNT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ConvolutionLayer.BwdDataAlgo c : ConvolutionLayer.BwdDataAlgo.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo[]`"
  ([]
    (ConvolutionLayer$BwdDataAlgo/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo [^java.lang.String name]
    (ConvolutionLayer$BwdDataAlgo/valueOf name)))

