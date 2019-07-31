(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasSpaceToDepth
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasSpaceToDepth]))

(defn ->keras-space-to-depth
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^KerasSpaceToDepth [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasSpaceToDepth layer-config enforce-training-config))
  (^KerasSpaceToDepth [^java.util.Map layer-config]
    (new KerasSpaceToDepth layer-config)))

(defn get-space-to-depth-layer
  "Get DL4J SpaceToDepth layer.

  returns: SpaceToDepth layer - `org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer`"
  (^org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer [^KerasSpaceToDepth this]
    (-> this (.getSpaceToDepthLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasSpaceToDepth this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

