(ns org.deeplearning4j.nn.modelimport.keras.layers.pooling.KerasPooling2D
  "Imports a Keras 2D Pooling layer as a DL4J Subsampling layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.pooling KerasPooling2D]))

(defn ->keras-pooling-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasPooling2D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasPooling2D layer-config enforce-training-config))
  (^KerasPooling2D [^java.util.Map layer-config]
    (new KerasPooling2D layer-config)))

(defn get-subsampling-2-d-layer
  "Get DL4J SubsamplingLayer.

  returns: SubsamplingLayer - `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^KerasPooling2D this]
    (-> this (.getSubsampling2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasPooling2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

