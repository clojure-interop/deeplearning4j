(ns org.deeplearning4j.nn.modelimport.keras.layers.wrappers.KerasBidirectional
  "Builds a DL4J Bidirectional layer from a Keras Bidirectional layer wrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.wrappers KerasBidirectional]))

(defn ->keras-bidirectional
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasBidirectional [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasBidirectional layer-config enforce-training-config))
  (^KerasBidirectional [^java.lang.Integer keras-version]
    (new KerasBidirectional keras-version)))

(defn get-underlying-recurrent-layer
  "Return the underlying recurrent layer of this bidirectional layer

  returns: Layer, recurrent layer - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^KerasBidirectional this]
    (-> this (.getUnderlyingRecurrentLayer))))

(defn get-bidirectional-layer
  "Get DL4J Bidirectional layer.

  returns: Bidirectional Layer - `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional`"
  (^org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional [^KerasBidirectional this]
    (-> this (.getBidirectionalLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasBidirectional this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters - `int`"
  (^Integer [^KerasBidirectional this]
    (-> this (.getNumParams))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasBidirectional this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn set-weights
  "Set weights for Bidirectional layer.

  weights - Map of weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasBidirectional this ^java.util.Map weights]
    (-> this (.setWeights weights))))

