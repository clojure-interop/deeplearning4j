(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasSpatialDropout
  "Keras wrapper for DL4J dropout layer with SpatialDropout, works 1D-3D."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasSpatialDropout]))

(defn ->keras-spatial-dropout
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasSpatialDropout [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasSpatialDropout layer-config enforce-training-config))
  (^KerasSpatialDropout [^java.lang.Integer keras-version]
    (new KerasSpatialDropout keras-version)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasSpatialDropout this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-spatial-dropout-layer
  "Get DL4J DropoutLayer with spatial dropout.

  returns: DropoutLayer - `org.deeplearning4j.nn.conf.layers.DropoutLayer`"
  (^org.deeplearning4j.nn.conf.layers.DropoutLayer [^KerasSpatialDropout this]
    (-> this (.getSpatialDropoutLayer))))

