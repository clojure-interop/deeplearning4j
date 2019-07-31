(ns org.deeplearning4j.nn.modelimport.keras.layers.normalization.KerasBatchNormalization
  "Imports a BatchNormalization layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.normalization KerasBatchNormalization]))

(defn ->keras-batch-normalization
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasBatchNormalization [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasBatchNormalization layer-config enforce-training-config))
  (^KerasBatchNormalization [^java.lang.Integer keras-version]
    (new KerasBatchNormalization keras-version)))

(defn get-batch-normalization-layer
  "Get DL4J BatchNormalizationLayer.

  returns: BatchNormalizationLayer - `org.deeplearning4j.nn.conf.layers.BatchNormalization`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization [^KerasBatchNormalization this]
    (-> this (.getBatchNormalizationLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasBatchNormalization this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters (4) - `int`"
  (^Integer [^KerasBatchNormalization this]
    (-> this (.getNumParams))))

(defn set-weights
  "Set weights for layer.

  weights - Map from parameter name to INDArray. - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasBatchNormalization this ^java.util.Map weights]
    (-> this (.setWeights weights))))

