(ns org.deeplearning4j.nn.params.Convolution3DParamInitializer
  "Initialize 3D convolution parameters."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.params Convolution3DParamInitializer]))

(defn ->convolution-3-d-param-initializer
  "Constructor."
  (^Convolution3DParamInitializer []
    (new Convolution3DParamInitializer )))

(def *-weight-key
  "Static Constant.

  type: java.lang.String"
  Convolution3DParamInitializer/WEIGHT_KEY)

(def *-bias-key
  "Static Constant.

  type: java.lang.String"
  Convolution3DParamInitializer/BIAS_KEY)

(defn *get-instance
  "returns: `org.deeplearning4j.nn.params.Convolution3DParamInitializer`"
  (^org.deeplearning4j.nn.params.Convolution3DParamInitializer []
    (Convolution3DParamInitializer/getInstance )))

(defn num-params
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `long`"
  (^Long [^Convolution3DParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.numParams conf))))

(defn init
  "Description copied from interface: ParamInitializer

  conf - the configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  params-view - a view of the full network (backprop) parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - if true: initialize the parameters according to the configuration. If false: don't modify thevalues in the paramsView array (but do select out the appropriate subset, reshape etc as required) - `boolean`

  returns: Map of parameters keyed by type (view of the 'paramsView' array) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^Convolution3DParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.init conf params-view initialize-params))))

(defn get-gradients-from-flattened
  "Description copied from interface: ParamInitializer

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^Convolution3DParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))

