(ns org.deeplearning4j.nn.modelimport.keras.layers.recurrent.KerasLstm
  "Imports a Keras LSTM layer as a DL4J LSTM layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.recurrent KerasLstm]))

(defn ->keras-lstm
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`
  previous-layers - - dictionary containing the previous layers in the topology - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasLstm [^java.util.Map layer-config ^Boolean enforce-training-config ^java.util.Map previous-layers]
    (new KerasLstm layer-config enforce-training-config previous-layers))
  (^KerasLstm [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasLstm layer-config enforce-training-config))
  (^KerasLstm [^java.lang.Integer keras-version]
    (new KerasLstm keras-version)))

(defn get-lstm-layer
  "Get DL4J Layer. If returnSequences is true, this can be casted to an \"LSTM\" layer, otherwise it can be casted
  to a \"LastTimeStep\" layer.

  returns: LSTM Layer - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^KerasLstm this]
    (-> this (.getLSTMLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasLstm this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters (12) - `int`"
  (^Integer [^KerasLstm this]
    (-> this (.getNumParams))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasLstm this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn set-weights
  "Set weights for layer.

  weights - LSTM layer weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasLstm this ^java.util.Map weights]
    (-> this (.setWeights weights))))

(defn get-unroll?
  "Get whether LSTM layer should be unrolled (for truncated BPTT).

  returns: whether to unroll the LSTM - `boolean`"
  (^Boolean [^KerasLstm this]
    (-> this (.getUnroll))))

(defn get-gate-activation-from-config
  "Get LSTM gate activation function from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`

  returns: LSTM inner activation function - `org.nd4j.linalg.activations.IActivation`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.nd4j.linalg.activations.IActivation [^KerasLstm this ^java.util.Map layer-config]
    (-> this (.getGateActivationFromConfig layer-config))))

(defn get-forget-bias-init-from-config
  "Get LSTM forget gate bias initialization from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  train - `boolean`

  returns: LSTM forget gate bias init - `double`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Unsupported Keras config"
  (^Double [^KerasLstm this ^java.util.Map layer-config ^Boolean train]
    (-> this (.getForgetBiasInitFromConfig layer-config train))))

