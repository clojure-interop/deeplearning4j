(ns org.deeplearning4j.nn.layers.convolution.subsampling.CudnnSubsamplingHelper
  "cuDNN-based helper for the subsampling layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.convolution.subsampling CudnnSubsamplingHelper]))

(defn ->cudnn-subsampling-helper
  "Constructor."
  (^CudnnSubsamplingHelper []
    (new CudnnSubsamplingHelper )))

(defn backprop-gradient
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - `int[]`
  strides - `int[]`
  pad - `int[]`
  pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - `int[]`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^CudnnSubsamplingHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray epsilon kernel strides pad ^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient input epsilon kernel strides pad pooling-type convolution-mode dilation workspace-mgr))))

(defn activate
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  kernel - `int[]`
  strides - `int[]`
  pad - `int[]`
  pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - `int[]`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudnnSubsamplingHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training kernel strides pad ^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training kernel strides pad pooling-type convolution-mode dilation workspace-mgr))))

(defn helper-memory-use
  "Description copied from interface: LayerHelper

  returns: Map of memory, may be null if none is used. - `java.util.Map<java.lang.String,java.lang.Long>`"
  (^java.util.Map [^CudnnSubsamplingHelper this]
    (-> this (.helperMemoryUse))))

