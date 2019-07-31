(ns org.deeplearning4j.nn.conf.layers.misc.ElementWiseMultiplicationLayer
  "Elementwise multiplication layer with weights: implements out = activationFn(input .* w  b) where:
 - w is a learnable weight vector of length nOut
 - \".*\" is element-wise multiplication
 - b is a bias vector

 Note that the input and output sizes of the element-wise layer are the same for this layer

 created by jingshu"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.misc ElementWiseMultiplicationLayer]))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.misc.ElementWiseMultiplicationLayer`"
  (^org.deeplearning4j.nn.conf.layers.misc.ElementWiseMultiplicationLayer [^ElementWiseMultiplicationLayer this]
    (-> this (.clone))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^ElementWiseMultiplicationLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^ElementWiseMultiplicationLayer this]
    (-> this (.initializer))))

(defn get-memory-report
  "This is a report of the estimated memory consumption for the given layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^ElementWiseMultiplicationLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

