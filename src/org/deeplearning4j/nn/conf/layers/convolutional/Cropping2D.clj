(ns org.deeplearning4j.nn.conf.layers.convolutional.Cropping2D
  "Cropping layer for convolutional (2d) neural networks.
 Allows cropping to be done separately for top/bottom/left/right"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.convolutional Cropping2D]))

(defn ->cropping-2-d
  "Constructor.

  crop-top - Amount of cropping to apply to the top of the input activations - `int`
  crop-bottom - Amount of cropping to apply to the bottom of the input activations - `int`
  crop-left - Amount of cropping to apply to the left of the input activations - `int`
  crop-right - Amount of cropping to apply to the right of the input activations - `int`"
  (^Cropping2D [^Integer crop-top ^Integer crop-bottom ^Integer crop-left ^Integer crop-right]
    (new Cropping2D crop-top crop-bottom crop-left crop-right))
  (^Cropping2D [^Integer crop-top-bottom ^Integer crop-left-right]
    (new Cropping2D crop-top-bottom crop-left-right))
  (^Cropping2D [cropping]
    (new Cropping2D cropping)))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^Cropping2D this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Cropping2D this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^Cropping2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^Cropping2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

