(ns org.deeplearning4j.nn.modelimport.keras.layers.noise.KerasGaussianDropout
  "Keras wrapper for DL4J dropout layer with GaussianDropout."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.noise KerasGaussianDropout]))

(defn ->keras-gaussian-dropout
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasGaussianDropout [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasGaussianDropout layer-config enforce-training-config))
  (^KerasGaussianDropout [^java.lang.Integer keras-version]
    (new KerasGaussianDropout keras-version)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasGaussianDropout this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-gaussian-dropout-layer
  "Get DL4J DropoutLayer with Gaussian dropout.

  returns: DropoutLayer - `org.deeplearning4j.nn.conf.layers.DropoutLayer`"
  (^org.deeplearning4j.nn.conf.layers.DropoutLayer [^KerasGaussianDropout this]
    (-> this (.getGaussianDropoutLayer))))

