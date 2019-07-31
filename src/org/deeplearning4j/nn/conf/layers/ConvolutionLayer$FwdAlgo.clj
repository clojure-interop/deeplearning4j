(ns org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ConvolutionLayer$FwdAlgo]))

(def IMPLICIT_GEMM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/IMPLICIT_GEMM)

(def IMPLICIT_PRECOMP_GEMM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/IMPLICIT_PRECOMP_GEMM)

(def GEMM
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/GEMM)

(def DIRECT
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/DIRECT)

(def FFT
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/FFT)

(def FFT_TILING
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/FFT_TILING)

(def WINOGRAD
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/WINOGRAD)

(def WINOGRAD_NONFUSED
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/WINOGRAD_NONFUSED)

(def COUNT
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo"
  ConvolutionLayer$FwdAlgo/COUNT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ConvolutionLayer.FwdAlgo c : ConvolutionLayer.FwdAlgo.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo[]`"
  ([]
    (ConvolutionLayer$FwdAlgo/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo [^java.lang.String name]
    (ConvolutionLayer$FwdAlgo/valueOf name)))

