(ns org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer
  "Center loss is similar to triplet loss except that it enforces
 intraclass consistency and doesn't require feed forward of multiple
 examples. Center loss typically converges faster for training
 ImageNet-based convolutional networks.
 \"If example x is in class Y, ensure that embedding(x) is close to
 average(embedding(y)) for all examples y in Y\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers CenterLossOutputLayer]))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^CenterLossOutputLayer this]
    (-> this (.initializer))))

(defn get-lambda
  "returns: `double`"
  (^Double [^CenterLossOutputLayer this]
    (-> this (.getLambda))))

(defn get-updater-by-param
  "Description copied from class: BaseLayer

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^CenterLossOutputLayer this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn get-gradient-check?
  "returns: `boolean`"
  (^Boolean [^CenterLossOutputLayer this]
    (-> this (.getGradientCheck))))

(defn get-alpha
  "returns: `double`"
  (^Double [^CenterLossOutputLayer this]
    (-> this (.getAlpha))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^CenterLossOutputLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^CenterLossOutputLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^CenterLossOutputLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^CenterLossOutputLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

