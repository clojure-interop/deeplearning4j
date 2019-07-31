(ns org.deeplearning4j.nn.conf.layers.convolutional.Cropping3D
  "Cropping layer for convolutional (3d) neural networks.
 Allows cropping to be done separately for upper and lower bounds of
 depth, height and width dimensions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.convolutional Cropping3D]))

(defn ->cropping-3-d
  "Constructor.

  crop-left-d - Amount of cropping to apply to the left of the depth dimension - `int`
  crop-right-d - Amount of cropping to apply to the right of the depth dimension - `int`
  crop-left-h - Amount of cropping to apply to the left of the height dimension - `int`
  crop-right-h - Amount of cropping to apply to the right of the height dimension - `int`
  crop-left-w - Amount of cropping to apply to the left of the width dimension - `int`
  crop-right-w - Amount of cropping to apply to the right of the width dimension - `int`"
  (^Cropping3D [^Integer crop-left-d ^Integer crop-right-d ^Integer crop-left-h ^Integer crop-right-h ^Integer crop-left-w ^Integer crop-right-w]
    (new Cropping3D crop-left-d crop-right-d crop-left-h crop-right-h crop-left-w crop-right-w))
  (^Cropping3D [^Integer crop-depth ^Integer crop-height ^Integer crop-width]
    (new Cropping3D crop-depth crop-height crop-width))
  (^Cropping3D [cropping]
    (new Cropping3D cropping)))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  iteration-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^Cropping3D this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection iteration-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf iteration-listeners layer-index layer-params-view initialize-params))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Cropping3D this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^Cropping3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^Cropping3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

