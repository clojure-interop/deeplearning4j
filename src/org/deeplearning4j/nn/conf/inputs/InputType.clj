(ns org.deeplearning4j.nn.conf.inputs.InputType
  "The InputType class is used to track and define the types of activations etc used in a ComputationGraph.
 This is most useful for automatically adding preprocessors between layers, and automatically setting nIn values.
 See: ComputationGraphConfiguration.GraphBuilder.setInputTypes(InputType...) and
 ComputationGraphConfiguration.addPreProcessors(InputType...)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.inputs InputType]))

(defn ->input-type
  "Constructor."
  (^InputType []
    (new InputType )))

(defn *feed-forward
  "InputType for feed forward network data

  size - The size of the activations - `long`

  returns: InputTypeFeedForward - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Long size]
    (InputType/feedForward size)))

(defn *recurrent
  "InputType for recurrent neural network (time series) data

  size - The size of the activations - `long`
  time-series-length - Length of the input time series - `long`

  returns: InputTypeRecurrent - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Long size ^Long time-series-length]
    (InputType/recurrent size time-series-length))
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Long size]
    (InputType/recurrent size)))

(defn *convolutional
  "Input type for convolutional (CNN) data, that is 4d with shape [miniBatchSize, channels, height, width].
  For CNN data that has been flattened, use convolutionalFlat(long, long, long)

  height - height of the input - `long`
  width - Width of the input - `long`
  depth - Depth, or number of channels - `long`

  returns: InputTypeConvolutional - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Long height ^Long width ^Long depth]
    (InputType/convolutional height width depth)))

(defn *convolutional-3-d
  "Input type for 3D convolutional (CNN3D) data, that is 5d with shape
  [miniBatchSize, channels, height, width, channels].

  depth - Depth of the input - `long`
  height - height of the input - `long`
  width - Width of the input - `long`
  channels - Number of channels of the input - `long`

  returns: InputTypeConvolutional3D - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Long depth ^Long height ^Long width ^Long channels]
    (InputType/convolutional3D depth height width channels)))

(defn *convolutional-flat
  "Input type for convolutional (CNN) data, where the data is in flattened (row vector) format.
  Expect data with shape [miniBatchSize, height * width * channels]. For CNN data in 4d format,
  use convolutional(long, long, long)

  height - Height of the (unflattened) data represented by this input type - `long`
  width - Width of the (unflattened) data represented by this input type - `long`
  depth - Depth of the (unflattened) data represented by this input type - `long`

  returns: InputTypeConvolutionalFlat - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Long height ^Long width ^Long depth]
    (InputType/convolutionalFlat height width depth)))

(defn *infer-input-type
  "input-array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^org.nd4j.linalg.api.ndarray.INDArray input-array]
    (InputType/inferInputType input-array)))

(defn *infer-input-types
  "input-arrays - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.deeplearning4j.nn.conf.inputs.InputType[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray input-arrays]
    (InputType/inferInputTypes input-arrays)))

(defn get-type
  "returns: `org.deeplearning4j.nn.conf.inputs.InputType$Type`"
  (^org.deeplearning4j.nn.conf.inputs.InputType$Type [^InputType this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InputType this]
    (-> this (.toString))))

(defn array-elements-per-example
  "returns: `long`"
  (^Long [^InputType this]
    (-> this (.arrayElementsPerExample))))

(defn get-shape
  "Returns the shape of this InputType

  include-batch-dim - Whether to include minibatch in the return shape array - `boolean`

  returns: int[] - `long[]`"
  ([^InputType this ^Boolean include-batch-dim]
    (-> this (.getShape include-batch-dim)))
  ([^InputType this]
    (-> this (.getShape))))

