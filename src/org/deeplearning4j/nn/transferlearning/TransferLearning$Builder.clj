(ns org.deeplearning4j.nn.transferlearning.TransferLearning$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.transferlearning TransferLearning$Builder]))

(defn ->builder
  "Constructor.

  Multilayer Network to tweak for transfer learning

  orig-model - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^TransferLearning$Builder [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork orig-model]
    (new TransferLearning$Builder orig-model)))

(defn fine-tune-configuration
  "Fine tune configurations specified will overwrite the existing configuration if any
  Usage example: specify a learning rate will set specified learning rate on all layers
  Refer to the fineTuneConfiguration class for more details

  finetune-configuration - `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$Builder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this ^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration finetune-configuration]
    (-> this (.fineTuneConfiguration finetune-configuration))))

(defn set-feature-extractor
  "Specify a layer to set as a \"feature extractor\"
  The specified layer and the layers preceding it will be \"frozen\" with parameters staying constant

  layer-num - `int`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$Builder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this ^Integer layer-num]
    (-> this (.setFeatureExtractor layer-num))))

(defn n-out-replace
  "Modify the architecture of a layer by changing nOut
  Note this will also affect the layer that follows the layer specified, unless it is the output layer
  Can specify different weight init schemes for the specified layer and the layer that follows it.

  layer-num - The index of the layer to change nOut of - `int`
  n-out - Value of nOut to change to - `int`
  scheme - Weight Init scheme to use for params in the layerNum - `org.deeplearning4j.nn.weights.WeightInit`
  scheme-next - Weight Init scheme to use for params in the layerNum+1 - `org.deeplearning4j.nn.weights.WeightInit`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$Builder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this ^Integer layer-num ^Integer n-out ^org.deeplearning4j.nn.weights.WeightInit scheme ^org.deeplearning4j.nn.weights.WeightInit scheme-next]
    (-> this (.nOutReplace layer-num n-out scheme scheme-next)))
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this ^Integer layer-num ^Integer n-out ^org.deeplearning4j.nn.weights.WeightInit scheme]
    (-> this (.nOutReplace layer-num n-out scheme))))

(defn remove-output-layer
  "Helper method to remove the outputLayer of the net.
  Only one of the two - removeOutputLayer() or removeLayersFromOutput(layerNum) - can be specified
  When removing layers at the very least an output layer should be added with .addLayer(...)

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$Builder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this]
    (-> this (.removeOutputLayer))))

(defn remove-layers-from-output
  "Remove last \"n\" layers of the net
  At least an output layer must be added back in

  layer-num - number of layers to remove - `int`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$Builder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this ^Integer layer-num]
    (-> this (.removeLayersFromOutput layer-num))))

(defn add-layer
  "Add layers to the net
  Required if layers are removed. Can be called multiple times and layers will be added in the order with which they were called.
  At the very least an outputLayer must be added (output layer should be added last - as per the note on order)
  Learning configs (like updaters, learning rate etc) specified with the layer here will be honored

  layer - layer conf to add (similar to the NeuralNetConfiguration .list().layer(...) - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$Builder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.addLayer layer))))

(defn set-input-pre-processor
  "Specify the preprocessor for the added layers
  for cases where they cannot be inferred automatically.

  layer - `int`
  processor - to be used on the data - `org.deeplearning4j.nn.conf.InputPreProcessor`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.TransferLearning$Builder`"
  (^org.deeplearning4j.nn.transferlearning.TransferLearning$Builder [^TransferLearning$Builder this ^Integer layer ^org.deeplearning4j.nn.conf.InputPreProcessor processor]
    (-> this (.setInputPreProcessor layer processor))))

(defn build
  "Returns a model with the fine tune configuration and specified architecture changes.
  .init() need not be called. Can be directly fit.

  returns: MultiLayerNetwork - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^org.deeplearning4j.nn.multilayer.MultiLayerNetwork [^TransferLearning$Builder this]
    (-> this (.build))))

