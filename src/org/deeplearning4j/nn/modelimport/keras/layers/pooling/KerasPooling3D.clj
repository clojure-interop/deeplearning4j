(ns org.deeplearning4j.nn.modelimport.keras.layers.pooling.KerasPooling3D
  "Imports a Keras 3D Pooling layer as a DL4J Subsampling3D layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.pooling KerasPooling3D]))

(defn ->keras-pooling-3-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasPooling3D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasPooling3D layer-config enforce-training-config))
  (^KerasPooling3D [^java.util.Map layer-config]
    (new KerasPooling3D layer-config)))

(defn get-subsampling-3-d-layer
  "Get DL4J Subsampling3DLayer.

  returns: Subsampling3DLayer - `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer [^KerasPooling3D this]
    (-> this (.getSubsampling3DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasPooling3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

