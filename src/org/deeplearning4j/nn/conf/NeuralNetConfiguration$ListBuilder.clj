(ns org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder
  "Fluent interface for building a list of configurations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf NeuralNetConfiguration$ListBuilder]))

(defn ->list-builder
  "Constructor.

  global-config - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`
  layer-map - `java.util.Map`"
  (^NeuralNetConfiguration$ListBuilder [^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder global-config ^java.util.Map layer-map]
    (new NeuralNetConfiguration$ListBuilder global-config layer-map))
  (^NeuralNetConfiguration$ListBuilder [^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder global-config]
    (new NeuralNetConfiguration$ListBuilder global-config)))

(defn backprop
  "Description copied from class: MultiLayerConfiguration.Builder

  backprop - whether to do back prop or not - `boolean`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder [^NeuralNetConfiguration$ListBuilder this ^Boolean backprop]
    (-> this (.backprop backprop))))

(defn pretrain
  "Description copied from class: MultiLayerConfiguration.Builder

  pretrain - whether to do pre train or not - `boolean`

  returns: builder pattern - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder [^NeuralNetConfiguration$ListBuilder this ^Boolean pretrain]
    (-> this (.pretrain pretrain))))

(defn layer
  "ind - `int`
  layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder [^NeuralNetConfiguration$ListBuilder this ^Integer ind ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.layer ind layer)))
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder [^NeuralNetConfiguration$ListBuilder this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.layer layer))))

(defn get-layerwise
  "returns: `java.util.Map<java.lang.Integer,org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder>`"
  (^java.util.Map [^NeuralNetConfiguration$ListBuilder this]
    (-> this (.getLayerwise))))

(defn set-input-type
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder [^NeuralNetConfiguration$ListBuilder this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.setInputType input-type))))

(defn input-type
  "A convenience method for setting input types: note that for example .inputType().convolutional(h,w,d)
  is equivalent to .setInputType(InputType.convolutional(h,w,d))

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder$InputTypeBuilder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder$InputTypeBuilder [^NeuralNetConfiguration$ListBuilder this]
    (-> this (.inputType))))

(defn get-layer-activation-types
  "For the (perhaps partially constructed) network configuration, return a list of activation sizes for each
  layer in the network.
  Note: To use this method, the network input type must have been set using setInputType(InputType) first

  returns: A list of activation types for the network, indexed by layer number - `java.util.List<org.deeplearning4j.nn.conf.inputs.InputType>`"
  (^java.util.List [^NeuralNetConfiguration$ListBuilder this]
    (-> this (.getLayerActivationTypes))))

(defn build
  "Build the multi layer network
  based on this neural network and
  overr ridden parameters

  returns: the configuration to build - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^NeuralNetConfiguration$ListBuilder this]
    (-> this (.build))))

