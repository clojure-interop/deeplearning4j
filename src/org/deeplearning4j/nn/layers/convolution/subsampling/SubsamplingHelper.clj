(ns org.deeplearning4j.nn.layers.convolution.subsampling.SubsamplingHelper
  "Helper for the subsampling layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.convolution.subsampling SubsamplingHelper]))

(defn check-supported
  "returns: `boolean`"
  (^Boolean [^SubsamplingHelper this]
    (-> this (.checkSupported))))

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
  (^org.nd4j.linalg.primitives.Pair [^SubsamplingHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray epsilon kernel strides pad ^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
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
  (^org.nd4j.linalg.api.ndarray.INDArray [^SubsamplingHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training kernel strides pad ^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training kernel strides pad pooling-type convolution-mode dilation workspace-mgr))))

