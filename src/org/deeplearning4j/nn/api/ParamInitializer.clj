(ns org.deeplearning4j.nn.api.ParamInitializer
  "Param initializer for a layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api ParamInitializer]))

(defn num-params
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `long`"
  (^Long [^ParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.numParams conf))))

(defn param-keys
  "Get a list of all parameter keys given the layer configuration

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: All parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^ParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.paramKeys layer))))

(defn weight-keys
  "Weight parameter keys given the layer configuration

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Weight parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^ParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.weightKeys layer))))

(defn bias-keys
  "Bias parameter keys given the layer configuration

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Bias parameter keys - `java.util.List<java.lang.String>`"
  (^java.util.List [^ParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.biasKeys layer))))

(defn weight-param?
  "Is the specified parameter a weight?

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a weight - `boolean`"
  (^Boolean [^ParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isWeightParam layer key))))

(defn bias-param?
  "Is the specified parameter a bias?

  layer - Layer - `org.deeplearning4j.nn.conf.layers.Layer`
  key - Key to check - `java.lang.String`

  returns: True if parameter is a bias - `boolean`"
  (^Boolean [^ParamInitializer this ^org.deeplearning4j.nn.conf.layers.Layer layer ^java.lang.String key]
    (-> this (.isBiasParam layer key))))

(defn init
  "Initialize the parameters

  conf - the configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  params-view - a view of the full network (backprop) parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - if true: initialize the parameters according to the configuration. If false: don't modify thevalues in the paramsView array (but do select out the appropriate subset, reshape etc as required) - `boolean`

  returns: Map of parameters keyed by type (view of the 'paramsView' array) - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.init conf params-view initialize-params))))

(defn get-gradients-from-flattened
  "Return a map of gradients (in their standard non-flattened representation), taken from the flattened (row vector) gradientView array.
  The idea is that operates in exactly the same way as the the paramsView does in #init(Map, NeuralNetConfiguration, INDArray);
  thus the position in the view (and, the array orders) must match those of the parameters

  conf - Configuration - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gradient-view - The flattened gradients array, as a view of the larger array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: A map containing an array by parameter type, that is a view of the full network gradients array - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^ParamInitializer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray gradient-view]
    (-> this (.getGradientsFromFlattened conf gradient-view))))

