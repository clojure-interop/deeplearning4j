(ns org.deeplearning4j.zoo.model.helper.FaceNetHelper
  "Inception is based on GoogleLeNet configuration of convolutional layers for optimization of
 resources and learning. You can use this module to add Inception to your own custom models.
 The GoogleLeNet paper: https://arxiv.org/abs/1409.4842
 This module is based on the Inception GraphBuilderModule built for Torch and
 a Scala implementation of GoogleLeNet.
 https://github.com/Element-Research/dpnn/blob/master/Inception.lua
 https://gist.github.com/antikantian/f77e91f924614348ea8f64731437930d"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model.helper FaceNetHelper]))

(defn ->face-net-helper
  "Constructor."
  (^FaceNetHelper []
    (new FaceNetHelper )))

(defn *c-3x-3reduce
  "in - `int`
  out - `int`
  bias - `double`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer in ^Integer out ^Double bias]
    (FaceNetHelper/c3x3reduce in out bias)))

(defn *conv-3x-3
  "in - `int`
  out - `int`
  bias - `double`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer in ^Integer out ^Double bias]
    (FaceNetHelper/conv3x3 in out bias)))

(defn *conv-nx-n
  "reduce-size - `int`
  output-size - `int`
  kernel-size - `int`
  kernel-stride - `int`
  padding - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer reduce-size ^Integer output-size ^Integer kernel-size ^Integer kernel-stride ^Boolean padding]
    (FaceNetHelper/convNxN reduce-size output-size kernel-size kernel-stride padding)))

(defn *max-pool-3x-3
  "stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^Integer stride]
    (FaceNetHelper/maxPool3x3 stride)))

(defn *avg-pool-7x-7
  "stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^Integer stride]
    (FaceNetHelper/avgPool7x7 stride)))

(defn *append-graph
  "Appends inception layer configurations a GraphBuilder object, based on the concept of
  Inception via the GoogleLeNet paper: https://arxiv.org/abs/1409.4842

  graph - An existing computation graph GraphBuilder object. - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`
  module-layer-name - The numerical order of inception (like 2, 2a, 3e, etc.) - `java.lang.String`
  input-size - `int`
  kernel-size - `int[]`
  kernel-stride - `int[]`
  output-size - `int[]`
  reduce-size - `int[]`
  pooling-type - `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType`
  p-norm - `int`
  pool-size - `int`
  pool-stride - `int`
  transfer-function - `org.nd4j.linalg.activations.Activation`
  input-layer - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph ^java.lang.String module-layer-name ^Integer input-size kernel-size kernel-stride output-size reduce-size ^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type ^Integer p-norm ^Integer pool-size ^Integer pool-stride ^org.nd4j.linalg.activations.Activation transfer-function ^java.lang.String input-layer]
    (FaceNetHelper/appendGraph graph module-layer-name input-size kernel-size kernel-stride output-size reduce-size pooling-type p-norm pool-size pool-stride transfer-function input-layer))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph ^java.lang.String module-layer-name ^Integer input-size kernel-size kernel-stride output-size reduce-size ^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type ^Integer pool-size ^Integer pool-stride ^org.nd4j.linalg.activations.Activation transfer-function ^java.lang.String input-layer]
    (FaceNetHelper/appendGraph graph module-layer-name input-size kernel-size kernel-stride output-size reduce-size pooling-type pool-size pool-stride transfer-function input-layer))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph ^java.lang.String module-layer-name ^Integer input-size kernel-size kernel-stride output-size reduce-size ^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type ^Integer p-norm ^org.nd4j.linalg.activations.Activation transfer-function ^java.lang.String input-layer]
    (FaceNetHelper/appendGraph graph module-layer-name input-size kernel-size kernel-stride output-size reduce-size pooling-type p-norm transfer-function input-layer))
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder graph ^java.lang.String module-layer-name ^Integer input-size kernel-size kernel-stride output-size reduce-size ^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type ^org.nd4j.linalg.activations.Activation transfer-function ^java.lang.String input-layer]
    (FaceNetHelper/appendGraph graph module-layer-name input-size kernel-size kernel-stride output-size reduce-size pooling-type transfer-function input-layer)))

(defn *conv-7x-7
  "in - `int`
  out - `int`
  bias - `double`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer in ^Integer out ^Double bias]
    (FaceNetHelper/conv7x7 in out bias)))

(defn *get-module-name
  "layer-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String layer-name]
    (FaceNetHelper/getModuleName layer-name))
  (^java.lang.String []
    (FaceNetHelper/getModuleName )))

(defn *p-norm-nx-n
  "p-norm - `int`
  size - `int`
  stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^Integer p-norm ^Integer size ^Integer stride]
    (FaceNetHelper/pNormNxN p-norm size stride)))

(defn *conv-nx-nreduce
  "input-size - `int`
  reduce-size - `int`
  reduce-stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer input-size ^Integer reduce-size ^Integer reduce-stride]
    (FaceNetHelper/convNxNreduce input-size reduce-size reduce-stride)))

(defn *fully-connected
  "in - `int`
  out - `int`
  drop-out - `double`

  returns: `org.deeplearning4j.nn.conf.layers.DenseLayer`"
  (^org.deeplearning4j.nn.conf.layers.DenseLayer [^Integer in ^Integer out ^Double drop-out]
    (FaceNetHelper/fullyConnected in out drop-out)))

(defn *max-pool-nx-n
  "size - `int`
  stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^Integer size ^Integer stride]
    (FaceNetHelper/maxPoolNxN size stride)))

(defn *conv-1x-1
  "in - `int`
  out - `int`
  bias - `double`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer in ^Integer out ^Double bias]
    (FaceNetHelper/conv1x1 in out bias)))

(defn *c-5x-5reduce
  "in - `int`
  out - `int`
  bias - `double`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer in ^Integer out ^Double bias]
    (FaceNetHelper/c5x5reduce in out bias)))

(defn *conv-5x-5
  "in - `int`
  out - `int`
  bias - `double`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^Integer in ^Integer out ^Double bias]
    (FaceNetHelper/conv5x5 in out bias)))

(defn *avg-pool-nx-n
  "size - `int`
  stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^Integer size ^Integer stride]
    (FaceNetHelper/avgPoolNxN size stride)))

(defn *batch-norm
  "in - `int`
  out - `int`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization [^Integer in ^Integer out]
    (FaceNetHelper/batchNorm in out)))

