(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasDense
  "Imports a Dense layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasDense]))

(defn ->keras-dense
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasDense [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasDense layer-config enforce-training-config))
  (^KerasDense [^java.lang.Integer keras-version]
    (new KerasDense keras-version)))

(defn get-dense-layer
  "Get DL4J DenseLayer.

  returns: DenseLayer - `org.deeplearning4j.nn.conf.layers.DenseLayer`"
  (^org.deeplearning4j.nn.conf.layers.DenseLayer [^KerasDense this]
    (-> this (.getDenseLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasDense this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters (2) - `int`"
  (^Integer [^KerasDense this]
    (-> this (.getNumParams))))

(defn set-weights
  "Set weights for layer.

  weights - Dense layer weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasDense this ^java.util.Map weights]
    (-> this (.setWeights weights))))

