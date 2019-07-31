(ns org.deeplearning4j.nn.conf.layers.recurrent.LastTimeStep
  "LastTimeStep is a \"wrapper\" layer: it wraps any RNN layer, and extracts out the last time step during forward pass,
 and returns it as a row vector (per example). That is, for 3d (time series) input (with shape [minibatch, layerSize,
 timeSeriesLength]), we take the last time step and return it as a 2d array with shape [minibatch, layerSize].
 Note that the last time step operation takes into account any mask arrays, if present: thus, variable length time
 series (in the same minibatch) are handled as expected here."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.recurrent LastTimeStep]))

(defn ->last-time-step
  "Constructor.

  underlying - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^LastTimeStep [^org.deeplearning4j.nn.conf.layers.Layer underlying]
    (new LastTimeStep underlying)))

(defn get-underlying
  "returns: `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^LastTimeStep this]
    (-> this (.getUnderlying))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^LastTimeStep this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^LastTimeStep this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

