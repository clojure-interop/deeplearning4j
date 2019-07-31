(ns org.deeplearning4j.nn.conf.layers.misc.FrozenLayerWithBackprop
  "Frozen layer freezes parameters of the layer it wraps, but allows the backpropagation to continue.
 Created by Ugljesa Jovanovic ([email protected]) on 06/05/2018."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.misc FrozenLayerWithBackprop]))

(defn ->frozen-layer-with-backprop
  "Constructor.

  layer - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^FrozenLayerWithBackprop [^org.deeplearning4j.nn.conf.layers.Layer layer]
    (new FrozenLayerWithBackprop layer)))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^FrozenLayerWithBackprop this]
    (-> this (.initializer))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^FrozenLayerWithBackprop this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^FrozenLayerWithBackprop this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn set-layer-name
  "layer-name - `java.lang.String`"
  ([^FrozenLayerWithBackprop this ^java.lang.String layer-name]
    (-> this (.setLayerName layer-name))))

(defn get-inner-conf
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^FrozenLayerWithBackprop this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.getInnerConf conf))))

(defn set-constraints
  "constraints - `java.util.List`"
  ([^FrozenLayerWithBackprop this ^java.util.List constraints]
    (-> this (.setConstraints constraints))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^FrozenLayerWithBackprop this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^FrozenLayerWithBackprop this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^FrozenLayerWithBackprop this]
    (-> this (.clone))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^FrozenLayerWithBackprop this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

