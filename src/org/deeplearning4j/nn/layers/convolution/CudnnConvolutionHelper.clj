(ns org.deeplearning4j.nn.layers.convolution.CudnnConvolutionHelper
  "cuDNN-based helper for the convolution layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.convolution CudnnConvolutionHelper]))

(defn ->cudnn-convolution-helper
  "Constructor."
  (^CudnnConvolutionHelper []
    (new CudnnConvolutionHelper )))

(defn *get-cudnn-forward-args
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - `int[]`
  strides - `int[]`
  padding - `int[]`
  dilation - `int[]`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  pooling-type - Used when preparing data for subsampling layers ONLY. Null for convolution layers - `org.deeplearning4j.nn.conf.layers.PoolingType`

  returns: `org.deeplearning4j.nn.layers.convolution.CudnnConvolutionHelper$CudnnForwardArgs`"
  (^org.deeplearning4j.nn.layers.convolution.CudnnConvolutionHelper$CudnnForwardArgs [^org.nd4j.linalg.api.ndarray.INDArray input kernel strides padding dilation ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode ^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type]
    (CudnnConvolutionHelper/getCudnnForwardArgs input kernel strides padding dilation convolution-mode pooling-type)))

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
  (^org.nd4j.linalg.primitives.Pair [^CudnnConvolutionHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray weights ^org.nd4j.linalg.api.ndarray.INDArray delta kernel strides pad ^org.nd4j.linalg.api.ndarray.INDArray bias-grad-view ^org.nd4j.linalg.api.ndarray.INDArray weight-grad-view ^org.nd4j.linalg.activations.IActivation afn ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode mode ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdFilterAlgo bwd-filter-algo ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo bwd-data-algo ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
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
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudnnConvolutionHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray weights ^org.nd4j.linalg.api.ndarray.INDArray bias kernel strides pad ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode mode ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo fwd-algo ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preOutput input weights bias kernel strides pad mode fwd-algo convolution-mode dilation workspace-mgr))))

(defn activate
  "z - `org.nd4j.linalg.api.ndarray.INDArray`
  afn - `org.nd4j.linalg.activations.IActivation`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudnnConvolutionHelper this ^org.nd4j.linalg.api.ndarray.INDArray z ^org.nd4j.linalg.activations.IActivation afn]
    (-> this (.activate z afn))))

(defn helper-memory-use
  "Description copied from interface: LayerHelper

  returns: Map of memory, may be null if none is used. - `java.util.Map<java.lang.String,java.lang.Long>`"
  (^java.util.Map [^CudnnConvolutionHelper this]
    (-> this (.helperMemoryUse))))

