(ns org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams
  "SDLayerParams is used to define the parameters for a Deeplearning4j SameDiff layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SDLayerParams]))

(defn ->sd-layer-params
  "Constructor.

  weight-params - `java.util.Map`
  bias-params - `java.util.Map`"
  (^SDLayerParams [^java.util.Map weight-params ^java.util.Map bias-params]
    (new SDLayerParams weight-params bias-params)))

(defn get-parameter-keys
  "returns: Get a list of parameter names / keys (previously added via addWeightParam(String, long...) and
  addBiasParam(String, long...) - `java.util.List<java.lang.String>`"
  (^java.util.List [^SDLayerParams this]
    (-> this (.getParameterKeys))))

(defn add-weight-param
  "Add a weight parameter to the layer, with the specified shape. For example, a standard fully connected layer
  could have weight parameters with shape [numInputs, layerSize]

  param-key - The parameter key (name) for the weight parameter - `java.lang.String`
  param-shape - Shape of the weight parameter array - `long`"
  ([^SDLayerParams this ^java.lang.String param-key ^Long param-shape]
    (-> this (.addWeightParam param-key param-shape))))

(defn get-weight-parameter-keys
  "returns: Get a list of parameter names / keys for weight parameters only, previously added via
  addWeightParam(String, long...) - `java.util.List<java.lang.String>`"
  (^java.util.List [^SDLayerParams this]
    (-> this (.getWeightParameterKeys))))

(defn get-param-shapes
  "Get the parameter shapes for all parameters

  returns: Map of parameter shapes, by parameter - `java.util.Map<java.lang.String,long[]>`"
  ([^SDLayerParams this]
    (-> this (.getParamShapes))))

(defn get-bias-parameter-keys
  "returns: Get a list of parameter names / keys for weight parameters only, previously added via
  addWeightParam(String, long...) - `java.util.List<java.lang.String>`"
  (^java.util.List [^SDLayerParams this]
    (-> this (.getBiasParameterKeys))))

(defn bias-param?
  "param - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SDLayerParams this ^java.lang.String param]
    (-> this (.isBiasParam param))))

(defn add-bias-param
  "Add a bias parameter to the layer, with the specified shape. For example, a standard fully connected layer
  could have bias parameters with shape [1, layerSize]

  param-key - The parameter key (name) for the bias parameter - `java.lang.String`
  param-shape - Shape of the bias parameter array - `long`"
  ([^SDLayerParams this ^java.lang.String param-key ^Long param-shape]
    (-> this (.addBiasParam param-key param-shape))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SDLayerParams this]
    (-> this (.hashCode))))

(defn clear
  "Clear any previously set weight/bias parameters (including their shapes)"
  ([^SDLayerParams this]
    (-> this (.clear))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SDLayerParams this ^java.lang.Object o]
    (-> this (.equals o))))

(defn weight-param?
  "param - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^SDLayerParams this ^java.lang.String param]
    (-> this (.isWeightParam param))))

