(ns org.deeplearning4j.nn.conf.layers.EmbeddingLayer
  "Embedding layer: feed-forward layer that expects single integers per example as input (class numbers, in range 0 to numClass-1)
 as input. This input has shape [numExamples,1] instead of [numExamples,numClasses] for the equivalent one-hot representation.
 Mathematically, EmbeddingLayer is equivalent to using a DenseLayer with a one-hot representation for the input; however,
 it can be much more efficient with a large number of classes (as a dense layer  one-hot input does a matrix multiply
 with all but one value being zero).
 Note: can only be used as the first layer for a network
 Note 2: For a given example index i, the output is activationFunction(weights.getRow(i)  bias), hence the
 weight rows can be considered a vector/embedding for each example."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers EmbeddingLayer]))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^EmbeddingLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^EmbeddingLayer this]
    (-> this (.initializer))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^EmbeddingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn has-bias?
  "returns: `boolean`"
  (^Boolean [^EmbeddingLayer this]
    (-> this (.hasBias))))

