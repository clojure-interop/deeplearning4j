(ns org.deeplearning4j.nn.params.LSTMParamInitializer
  "LSTM Parameter initializer, for LSTM based on
 Graves: Supervised Sequence Labelling with Recurrent Neural Networks
 http://www.cs.toronto.edu/~graves/phd.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.params LSTMParamInitializer]))

(defn ->lstm-param-initializer
  "Constructor."
  (^LSTMParamInitializer []
    (new LSTMParamInitializer )))

(def *-recurrent-weight-key
  "Static Constant.

  Weights for previous time step -> current time step connections

  type: java.lang.String"
  LSTMParamInitializer/RECURRENT_WEIGHT_KEY)

(def *-bias-key
  "Static Constant.

  type: java.lang.String"
  LSTMParamInitializer/BIAS_KEY)

(def *-input-weight-key
  "Static Constant.

  type: java.lang.String"
  LSTMParamInitializer/INPUT_WEIGHT_KEY)

(defn *get-instance
  "returns: `org.deeplearning4j.nn.params.LSTMParamInitializer`"
  (^org.deeplearning4j.nn.params.LSTMParamInitializer []
    (LSTMParamInitializer/getInstance )))

(defn num-params
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `long`"
  (^Long [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.numParams conf))))

(defn param-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: All parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.paramKeys layer))))

(defn weight-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Weight parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.weightKeys layer))))

(defn bias-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Bias parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.biasKeys layer))))

(defn weight-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a weight - `boolean`"
  (^Boolean [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isWeightParam layer key))))

(defn bias-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a bias - `boolean`"
  (^Boolean [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isBiasParam layer key))))

(defn init
  "Description copied from interface: ParamInitializer

  conf - the configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  params-view - a view of the full network (backprop) parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - if true: initialize the parameters according to the configuration. If false: don't modify thevalues in the paramsView array (but do select out the appropriate subset, reshape etc as required) - `boolean`

  returns: Map of parameters keyed by type (view of the 'paramsView' array) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.init conf params-view initialize-params))))

(defn get-gradients-from-flattened
  "Description copied from interface: ParamInitializer

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^LSTMParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))

