(ns org.deeplearning4j.util.Convolution3DUtils
  "Shape utilities for 3D convolution layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util Convolution3DUtils]))

(defn *get-3-d-output-size
  "Get the output size (depth/height/width) for the given input data and CNN3D configuration

  input-data - Input data - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - Kernel size (depth/height/width) - `int[]`
  strides - Strides (depth/height/width) - `int[]`
  padding - Padding (depth/height/width) - `int[]`
  convolution-mode - Convolution mode (Same, Strict, Truncate) - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - Kernel dilation (depth/height/width) - `int[]`
  is-ncdhw - `boolean`

  returns: Output size: int[3] with output depth/height/width - `int[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray input-data kernel strides padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode dilation ^Boolean is-ncdhw]
    (Convolution3DUtils/get3DOutputSize input-data kernel strides padding convolution-mode dilation is-ncdhw)))

(defn *get-3-d-same-mode-top-left-padding
  "Get top and left padding for same mode only for 3d convolutions

  out-size - `int[]`
  in-size - `int[]`
  kernel - `int[]`
  strides - `int[]`
  dilation - `int[]`

  returns: `int[]`"
  ([out-size in-size kernel strides dilation]
    (Convolution3DUtils/get3DSameModeTopLeftPadding out-size in-size kernel strides dilation)))

(defn *validate-cnn-3-d-kernel-stride-padding
  "Perform validation on the CNN3D layer kernel/stride/padding. Expect 3d int[], with values > 0 for kernel size and
  stride, and values >= 0 for padding.

  kernel-size - Kernel size array to check - `int[]`
  stride - Stride array to check - `int[]`
  padding - Padding array to check - `int[]`"
  ([kernel-size stride padding]
    (Convolution3DUtils/validateCnn3DKernelStridePadding kernel-size stride padding)))

