(ns org.deeplearning4j.nn.modelimport.keras.layers.recurrent.KerasSimpleRnn
  "Imports a Keras SimpleRNN layer as a DL4J SimpleRnn layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.recurrent KerasSimpleRnn]))

(defn ->keras-simple-rnn
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasSimpleRnn [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasSimpleRnn layer-config enforce-training-config))
  (^KerasSimpleRnn [^java.lang.Integer keras-version]
    (new KerasSimpleRnn keras-version)))

(defn get-simple-rnn-layer
  "Get DL4J SimpleRnn layer.

  returns: SimpleRnn Layer - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^KerasSimpleRnn this]
    (-> this (.getSimpleRnnLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasSimpleRnn this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters (12) - `int`"
  (^Integer [^KerasSimpleRnn this]
    (-> this (.getNumParams))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasSimpleRnn this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn get-unroll?
  "Get whether SimpleRnn layer should be unrolled (for truncated BPTT).

  returns: whether RNN should be unrolled (boolean) - `boolean`"
  (^Boolean [^KerasSimpleRnn this]
    (-> this (.getUnroll))))

(defn set-weights
  "Set weights for layer.

  weights - Simple RNN weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  ([^KerasSimpleRnn this ^java.util.Map weights]
    (-> this (.setWeights weights))))

