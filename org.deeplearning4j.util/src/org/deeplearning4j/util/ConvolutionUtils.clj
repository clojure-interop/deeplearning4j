(ns org.deeplearning4j.util.ConvolutionUtils
  "Convolutional shape utilities"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util ConvolutionUtils]))

(defn *get-same-mode-top-left-padding
  "Get top and left padding for same mode only.

  out-size - Output size (length 2 array, height dimension first) - `int[]`
  in-size - Input size (length 2 array, height dimension first) - `int[]`
  kernel - Kernel size (length 2 array, height dimension first) - `int[]`
  strides - Strides (length 2 array, height dimension first) - `int[]`
  dilation - Dilation (length 2 array, height dimension first) - `int[]`

  returns: Top left padding (length 2 array, height dimension first) - `int[]`"
  ([out-size in-size kernel strides dilation]
    (ConvolutionUtils/getSameModeTopLeftPadding out-size in-size kernel strides dilation)))

(defn *validate-shapes
  "input-data - `org.nd4j.linalg.api.ndarray.INDArray`
  e-kernel - `int[]`
  strides - `int[]`
  padding - `int[]`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - `int[]`
  in-shape - `int[]`
  atrous - `boolean`"
  ([^org.nd4j.linalg.api.ndarray.INDArray input-data e-kernel strides padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation in-shape ^Boolean atrous]
    (ConvolutionUtils/validateShapes input-data e-kernel strides padding convolution-mode dilation in-shape atrous)))

(defn *validate-cnn-kernel-stride-padding
  "Perform validation on the CNN layer kernel/stride/padding. Expect 2d int[], with values > 0 for kernel size and
  stride, and values >= 0 for padding.

  kernel-size - Kernel size array to check - `int[]`
  stride - Stride array to check - `int[]`
  padding - Padding array to check - `int[]`"
  ([kernel-size stride padding]
    (ConvolutionUtils/validateCnnKernelStridePadding kernel-size stride padding)))

(defn *num-feature-map
  "conf - the configuration to getthe number of kernels from - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: the number of kernels/filters to apply - `long`"
  (^Long [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (ConvolutionUtils/numFeatureMap conf)))

(defn *get-deconvolution-output-size
  "Get the output size of a deconvolution operation for given input data. In deconvolution, we compute the inverse
  of the shape computation of a convolution.

  input-data - Input data - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - Kernel size (height/width) - `int[]`
  strides - Strides (height/width) - `int[]`
  padding - Padding (height/width) - `int[]`
  convolution-mode - Convolution mode (Same, Strict, Truncate) - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - Kernel dilation (height/width) - `int[]`

  returns: Output size: int[2] with output height/width - `int[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray input-data kernel strides padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation]
    (ConvolutionUtils/getDeconvolutionOutputSize input-data kernel strides padding convolution-mode dilation)))

(defn *cnn-1d-mask-reduction
  "Given a mask array for a 1D CNN layer of shape [minibatch, sequenceLength], reduce the mask according to the 1D CNN layer configuration.
  Unlike RNN layers, 1D CNN layers may down-sample the data; consequently, we need to down-sample the mask array
  in the same way, to maintain the correspondence between the masks and the output activations

  in - Input size - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - Kernel size - `int`
  stride - Stride - `int`
  padding - Padding - `int`
  dilation - Dilation - `int`
  cm - Convolution mode - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: Reduced mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Integer kernel ^Integer stride ^Integer padding ^Integer dilation ^org.deeplearning4j.nn.conf.ConvolutionMode cm]
    (ConvolutionUtils/cnn1dMaskReduction in kernel stride padding dilation cm)))

(defn *effective-kernel-size
  "kernel - `int[]`
  dilation - `int[]`

  returns: `int[]`"
  ([kernel dilation]
    (ConvolutionUtils/effectiveKernelSize kernel dilation)))

(defn *reshape-mask-if-required
  "mask - `org.nd4j.linalg.api.ndarray.INDArray`
  output - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray mask ^org.nd4j.linalg.api.ndarray.INDArray output ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType type]
    (ConvolutionUtils/reshapeMaskIfRequired mask output workspace-mgr type)))

(defn *validate-convolution-mode-padding
  "Check that the convolution mode is consistent with the padding specification

  mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  padding - `int[]`"
  ([^org.deeplearning4j.nn.conf.ConvolutionMode mode padding]
    (ConvolutionUtils/validateConvolutionModePadding mode padding)))

(defn *get-height-and-width
  "Get the height and width
  from the configuration

  conf - the configuration to get height and width from - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: the configuration to get height and width from - `int[]`"
  ([^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (ConvolutionUtils/getHeightAndWidth conf)))

(defn *reshape-4d-to-2d
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType type]
    (ConvolutionUtils/reshape4dTo2d in workspace-mgr type)))

(defn *reshape-2d-to-4d
  "in-2d - `org.nd4j.linalg.api.ndarray.INDArray`
  to-shape - `int[]`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in-2d to-shape ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType type]
    (ConvolutionUtils/reshape2dTo4d in-2d to-shape workspace-mgr type)))

(defn *adapt-2d-mask
  "mask - `org.nd4j.linalg.api.ndarray.INDArray`
  output - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray mask ^org.nd4j.linalg.api.ndarray.INDArray output ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType type]
    (ConvolutionUtils/adapt2dMask mask output workspace-mgr type)))

(defn *get-same-mode-bottom-right-padding
  "Get bottom and right padding for same mode only.

  out-size - Output size (length 2 array, height dimension first) - `int[]`
  in-size - Input size (length 2 array, height dimension first) - `int[]`
  kernel - Kernel size (length 2 array, height dimension first) - `int[]`
  strides - Strides (length 2 array, height dimension first) - `int[]`
  dilation - Dilation (length 2 array, height dimension first) - `int[]`

  returns: Bottom right padding (length 2 array, height dimension first) - `int[]`"
  ([out-size in-size kernel strides dilation]
    (ConvolutionUtils/getSameModeBottomRightPadding out-size in-size kernel strides dilation)))

(defn *reshape-3d-mask
  "mask - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray mask ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType type]
    (ConvolutionUtils/reshape3dMask mask workspace-mgr type)))

(defn *reshape-4d-mask
  "mask - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`
  array-type - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray mask ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr ^org.deeplearning4j.nn.workspace.ArrayType array-type]
    (ConvolutionUtils/reshape4dMask mask workspace-mgr array-type)))

(defn *num-channels
  "Returns the number of
  feature maps for a given shape (must be at least 3 dimensions

  shape - the shape to get thenumber of feature maps for - `int[]`

  returns: the number of feature maps
  for a particular shape - `int`"
  (^Integer [shape]
    (ConvolutionUtils/numChannels shape)))

(defn *cnn-2d-mask-reduction
  "Reduce a 2d CNN layer mask array (of 0s and 1s) according to the layer configuration. Note that when a CNN layer
  changes the shape of the activations (for example, stride > 1) the corresponding mask array needs to change shape
  also (as there is a correspondence between the two). This method performs the forward pass for the mask.

  in-mask - Input mask array - rank 4, shape [mb,c,h,1] or [mb,c,w,1] or [mb,c,h,w] - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - Kernel configuration for the layer - `int[]`
  stride - Stride - `int[]`
  padding - Padding - `int[]`
  dilation - Dilation - `int[]`
  convolution-mode - Convolution mode - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: The mask array corresponding to the network output - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in-mask kernel stride padding dilation ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (ConvolutionUtils/cnn2dMaskReduction in-mask kernel stride padding dilation convolution-mode)))

(defn *get-output-size
  "Get the output size (height/width) for the given input data and CNN configuration

  input-data - Input data - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - Kernel size (height/width) - `int[]`
  strides - Strides (height/width) - `int[]`
  padding - Padding (height/width) - `int[]`
  convolution-mode - Convolution mode (Same, Strict, Truncate) - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - Kernel dilation (height/width) - `int[]`

  returns: Output size: int[2] with output height/width - `int[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray input-data kernel strides padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation]
    (ConvolutionUtils/getOutputSize input-data kernel strides padding convolution-mode dilation))
  ([^org.nd4j.linalg.api.ndarray.INDArray input-data kernel strides padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (ConvolutionUtils/getOutputSize input-data kernel strides padding convolution-mode)))

(defn *get-hwd-from-input-type
  "Get heigh/width/channels as length 3 int[] from the InputType

  input-type - Input type to get - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Length - `int[]`"
  ([^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (ConvolutionUtils/getHWDFromInputType input-type)))

