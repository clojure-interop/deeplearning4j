(ns org.deeplearning4j.nn.conf.layers.variational.VariationalAutoencoder
  "Variational Autoencoder layer

 See: Kingma & Welling, 2013: Auto-Encoding Variational Bayes - https://arxiv.org/abs/1312.6114

 This implementation allows multiple encoder and decoder layers, the number and sizes of which can be set independently.

 A note on scores during pretraining: This implementation minimizes the negative of the variational lower bound objective
 as described in Kingma & Welling; the mathematics in that paper is based on maximization of the variational lower bound instead.
 Thus, scores reported during pretraining in DL4J are the negative of the variational lower bound equation in the paper.
 The backpropagation and learning procedure is otherwise as described there."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.variational VariationalAutoencoder]))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^VariationalAutoencoder this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^VariationalAutoencoder this]
    (-> this (.initializer))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^VariationalAutoencoder this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^VariationalAutoencoder this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^VariationalAutoencoder this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^VariationalAutoencoder this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

