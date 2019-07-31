(ns org.deeplearning4j.nn.params.VariationalAutoencoderParamInitializer
  "Parameter initializer for the Variational Autoencoder model.
 See: Kingma & Welling, 2013: Auto-Encoding Variational Bayes - https://arxiv.org/abs/1312.6114"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.params VariationalAutoencoderParamInitializer]))

(defn ->variational-autoencoder-param-initializer
  "Constructor."
  (^VariationalAutoencoderParamInitializer []
    (new VariationalAutoencoderParamInitializer )))

(def *-weight-key-suffix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/WEIGHT_KEY_SUFFIX)

(def *-bias-key-suffix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/BIAS_KEY_SUFFIX)

(def *-pzx-prefix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PZX_PREFIX)

(def *-pzx-mean-prefix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PZX_MEAN_PREFIX)

(def *-pzx-logstd-2-prefix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PZX_LOGSTD2_PREFIX)

(def *-encoder-prefix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/ENCODER_PREFIX)

(def *-decoder-prefix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/DECODER_PREFIX)

(def *-pzx-mean-w
  "Static Constant.

  Key for weight parameters connecting the last encoder layer and the mean values for p(z|data)

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PZX_MEAN_W)

(def *-pzx-mean-b
  "Static Constant.

  Key for bias parameters for the mean values for p(z|data)

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PZX_MEAN_B)

(def *-pzx-logstd-2-w
  "Static Constant.

  Key for weight parameters connecting the last encoder layer and the log(sigma^2) values for p(z|data)

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PZX_LOGSTD2_W)

(def *-pzx-logstd-2-b
  "Static Constant.

  Key for bias parameters for log(sigma^2) in p(z|data)

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PZX_LOGSTD2_B)

(def *-pxz-prefix
  "Static Constant.

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PXZ_PREFIX)

(def *-pxz-w
  "Static Constant.

  Key for weight parameters connecting the last decoder layer and p(data|z) (according to whatever
  ReconstructionDistribution is set for the VAE)

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PXZ_W)

(def *-pxz-b
  "Static Constant.

  Key for bias parameters connecting the last decoder layer and p(data|z) (according to whatever
  ReconstructionDistribution is set for the VAE)

  type: java.lang.String"
  VariationalAutoencoderParamInitializer/PXZ_B)

(defn *get-instance
  "returns: `org.deeplearning4j.nn.params.VariationalAutoencoderParamInitializer`"
  (^org.deeplearning4j.nn.params.VariationalAutoencoderParamInitializer []
    (VariationalAutoencoderParamInitializer/getInstance )))

(defn num-params
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `long`"
  (^Long [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.numParams conf))))

(defn param-keys
  "Description copied from interface: ParamInitializer

  l - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: All parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer l]
    (-> this (.paramKeys l))))

(defn weight-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Weight parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.weightKeys layer))))

(defn bias-keys
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Bias parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.biasKeys layer))))

(defn weight-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a weight - `boolean`"
  (^Boolean [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isWeightParam layer key))))

(defn bias-param?
  "Description copied from interface: ParamInitializer

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a bias - `boolean`"
  (^Boolean [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isBiasParam layer key))))

(defn init
  "Description copied from interface: ParamInitializer

  conf - the configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  params-view - a view of the full network (backprop) parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - if true: initialize the parameters according to the configuration. If false: don't modify thevalues in the paramsView array (but do select out the appropriate subset, reshape etc as required) - `boolean`

  returns: Map of parameters keyed by type (view of the 'paramsView' array) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.init conf params-view initialize-params))))

(defn get-gradients-from-flattened
  "Description copied from interface: ParamInitializer

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^VariationalAutoencoderParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))

