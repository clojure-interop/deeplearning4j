(ns org.deeplearning4j.nn.modelimport.keras.layers.KerasLoss
  "Builds a DL4J LossLayer from a Keras training loss function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers KerasLoss]))

(defn ->keras-loss
  "Constructor.

  Constructor from layer name and input shape.

  layer-name - layer name - `java.lang.String`
  inbound-layer-name - name of inbound layer - `java.lang.String`
  keras-loss - name of Keras loss function - `java.lang.String`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasLoss [^java.lang.String layer-name ^java.lang.String inbound-layer-name ^java.lang.String keras-loss ^Boolean enforce-training-config]
    (new KerasLoss layer-name inbound-layer-name keras-loss enforce-training-config))
  (^KerasLoss [^java.lang.String layer-name ^java.lang.String inbound-layer-name ^java.lang.String keras-loss]
    (new KerasLoss layer-name inbound-layer-name keras-loss)))

(defn get-loss-layer
  "Get DL4J LossLayer.

  type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: LossLayer - `org.deeplearning4j.nn.conf.layers.FeedForwardLayer`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.deeplearning4j.nn.conf.layers.FeedForwardLayer [^KerasLoss this ^org.deeplearning4j.nn.conf.inputs.InputType type]
    (-> this (.getLossLayer type))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasLoss this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

