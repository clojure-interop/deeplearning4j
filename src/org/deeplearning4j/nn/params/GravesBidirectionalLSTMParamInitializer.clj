(ns org.deeplearning4j.nn.params.GravesBidirectionalLSTMParamInitializer
  "LSTM Parameter initializer, for LSTM based on
 Graves: Supervised Sequence Labelling with Recurrent Neural Networks
 http://www.cs.toronto.edu/~graves/phd.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.params GravesBidirectionalLSTMParamInitializer]))

(defn ->graves-bidirectional-lstm-param-initializer
  "Constructor."
  (^GravesBidirectionalLSTMParamInitializer []
    (new GravesBidirectionalLSTMParamInitializer )))

(def *-recurrent-weight-key-forwards
  "Static Constant.

  Weights for previous time step -> current time step connections

  type: java.lang.String"
  GravesBidirectionalLSTMParamInitializer/RECURRENT_WEIGHT_KEY_FORWARDS)

(def *-bias-key-forwards
  "Static Constant.

  type: java.lang.String"
  GravesBidirectionalLSTMParamInitializer/BIAS_KEY_FORWARDS)

(def *-input-weight-key-forwards
  "Static Constant.

  type: java.lang.String"
  GravesBidirectionalLSTMParamInitializer/INPUT_WEIGHT_KEY_FORWARDS)

(def *-recurrent-weight-key-backwards
  "Static Constant.

  type: java.lang.String"
  GravesBidirectionalLSTMParamInitializer/RECURRENT_WEIGHT_KEY_BACKWARDS)

(def *-bias-key-backwards
  "Static Constant.

  type: java.lang.String"
  GravesBidirectionalLSTMParamInitializer/BIAS_KEY_BACKWARDS)

(def *-input-weight-key-backwards
  "Static Constant.

  type: java.lang.String"
  GravesBidirectionalLSTMParamInitializer/INPUT_WEIGHT_KEY_BACKWARDS)

(defn *get-instance
  "returns: `org.deeplearning4j.nn.params.GravesBidirectionalLSTMParamInitializer`"
  (^org.deeplearning4j.nn.params.GravesBidirectionalLSTMParamInitializer []
    (GravesBidirectionalLSTMParamInitializer/getInstance )))

(defn num-params
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `long`"
  (^Long [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.numParams conf))))

(defn param-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: All parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.paramKeys layer))))

(defn weight-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Weight parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.weightKeys layer))))

(defn bias-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Bias parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.biasKeys layer))))

(defn weight-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a weight - `boolean`"
  (^Boolean [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isWeightParam layer key))))

(defn bias-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a bias - `boolean`"
  (^Boolean [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isBiasParam layer key))))

(defn init
  "Description copied from interface: ParamInitializer

  conf - the configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  params-view - a view of the full network (backprop) parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - if true: initialize the parameters according to the configuration. If false: don't modify thevalues in the paramsView array (but do select out the appropriate subset, reshape etc as required) - `boolean`

  returns: Map of parameters keyed by type (view of the 'paramsView' array) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.init conf params-view initialize-params))))

(defn get-gradients-from-flattened
  "Description copied from interface: ParamInitializer

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^GravesBidirectionalLSTMParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))

