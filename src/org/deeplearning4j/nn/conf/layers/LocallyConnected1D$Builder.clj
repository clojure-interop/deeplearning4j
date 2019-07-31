(ns org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers LocallyConnected1D$Builder]))

(defn ->builder
  "Constructor."
  (^LocallyConnected1D$Builder []
    (new LocallyConnected1D$Builder )))

(defn activation
  "activation - `org.nd4j.linalg.activations.Activation`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^org.nd4j.linalg.activations.Activation activation]
    (-> this (.activation activation))))

(defn n-in
  "n-in - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Integer n-in]
    (-> this (.nIn n-in))))

(defn padding
  "p - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Integer p]
    (-> this (.padding p))))

(defn n-out
  "n-out - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn has-bias
  "has-bias - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D [^LocallyConnected1D$Builder this]
    (-> this (.build))))

(defn dilation
  "d - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Integer d]
    (-> this (.dilation d))))

(defn convolution-mode
  "cm - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode cm]
    (-> this (.convolutionMode cm))))

(defn set-input-size
  "Set input filter size for this locally connected 1D layer

  input-size - height of the input filters - `int`

  returns: Builder - `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Integer input-size]
    (-> this (.setInputSize input-size))))

(defn kernel-size
  "k - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Integer k]
    (-> this (.kernelSize k))))

(defn stride
  "s - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D$Builder [^LocallyConnected1D$Builder this ^Integer s]
    (-> this (.stride s))))

