(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasConvolution
  "Keras Convolution base layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasConvolution]))

(defn ->keras-convolution
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasConvolution [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasConvolution layer-config enforce-training-config))
  (^KerasConvolution [^java.lang.Integer keras-version]
    (new KerasConvolution keras-version)))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters (2) - `int`"
  (^Integer [^KerasConvolution this]
    (-> this (.getNumParams))))

(defn set-weights
  "Set weights for layer.

  weights - Map from parameter name to INDArray. - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasConvolution this ^java.util.Map weights]
    (-> this (.setWeights weights))))

(defn get-conv-parameter-values
  "Return processed parameter values obtained from Keras convolutional layers.

  keras-param-value - INDArray containing raw Keras weights to be processed - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Processed weights, according to which backend was used. - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception."
  (^org.nd4j.linalg.api.ndarray.INDArray [^KerasConvolution this ^org.nd4j.linalg.api.ndarray.INDArray keras-param-value]
    (-> this (.getConvParameterValues keras-param-value))))

