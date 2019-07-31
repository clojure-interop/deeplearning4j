(ns org.deeplearning4j.nn.layers.convolution.ConvolutionHelper
  "Helper for the convolution layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.convolution ConvolutionHelper]))

(defn check-supported
  "returns: `boolean`"
  (^Boolean [^ConvolutionHelper this]
    (-> this (.checkSupported))))

(defn backprop-gradient
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  weights - `org.nd4j.linalg.api.ndarray.INDArray`
  delta - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - `int[]`
  strides - `int[]`
  pad - `int[]`
  bias-grad-view - `org.nd4j.linalg.api.ndarray.INDArray`
  weight-grad-view - `org.nd4j.linalg.api.ndarray.INDArray`
  afn - `org.nd4j.linalg.activations.IActivation`
  mode - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode`
  bwd-filter-algo - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdFilterAlgo`
  bwd-data-algo - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - `int[]`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ConvolutionHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray weights ^org.nd4j.linalg.api.ndarray.INDArray delta kernel strides pad ^org.nd4j.linalg.api.ndarray.INDArray bias-grad-view ^org.nd4j.linalg.api.ndarray.INDArray weight-grad-view ^org.nd4j.linalg.activations.IActivation afn ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode mode ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdFilterAlgo bwd-filter-algo ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo bwd-data-algo ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient input weights delta kernel strides pad bias-grad-view weight-grad-view afn mode bwd-filter-algo bwd-data-algo convolution-mode dilation workspace-mgr))))

(defn pre-output
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  weights - `org.nd4j.linalg.api.ndarray.INDArray`
  bias - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - `int[]`
  strides - `int[]`
  pad - `int[]`
  mode - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode`
  fwd-algo - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - `int[]`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ConvolutionHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray weights ^org.nd4j.linalg.api.ndarray.INDArray bias kernel strides pad ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode mode ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo fwd-algo ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preOutput input weights bias kernel strides pad mode fwd-algo convolution-mode dilation workspace-mgr))))

(defn activate
  "z - `org.nd4j.linalg.api.ndarray.INDArray`
  afn - `org.nd4j.linalg.activations.IActivation`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ConvolutionHelper this ^org.nd4j.linalg.api.ndarray.INDArray z ^org.nd4j.linalg.activations.IActivation afn]
    (-> this (.activate z afn))))

