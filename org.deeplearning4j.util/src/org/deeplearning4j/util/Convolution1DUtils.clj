(ns org.deeplearning4j.util.Convolution1DUtils
  "Shape utilities for 1D convolution layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util Convolution1DUtils]))

(defn *get-output-size
  "Get the output size (height) for the given input data and CNN1D configuration

  in-h - Input size (height, or channels). - `int`
  kernel - Kernel size - `int`
  strides - Stride - `int`
  padding - Padding - `int`
  convolution-mode - Convolution mode (Same, Strict, Truncate) - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - Kernel dilation - `int`

  returns: Output size (width) - `int`"
  (^Integer [^Integer in-h ^Integer kernel ^Integer strides ^Integer padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode ^Integer dilation]
    (Convolution1DUtils/getOutputSize in-h kernel strides padding convolution-mode dilation))
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray input-data ^Integer kernel ^Integer strides ^Integer padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (Convolution1DUtils/getOutputSize input-data kernel strides padding convolution-mode)))

(defn *validate-shapes
  "input-data - `org.nd4j.linalg.api.ndarray.INDArray`
  e-kernel - `int`
  strides - `int`
  padding - `int`
  convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  dilation - `int`
  in-shape - `int`
  atrous - `boolean`"
  ([^org.nd4j.linalg.api.ndarray.INDArray input-data ^Integer e-kernel ^Integer strides ^Integer padding ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode ^Integer dilation ^Integer in-shape ^Boolean atrous]
    (Convolution1DUtils/validateShapes input-data e-kernel strides padding convolution-mode dilation in-shape atrous)))

(defn *effective-kernel-size
  "kernel - `int`
  dilation - `int`

  returns: `int`"
  (^Integer [^Integer kernel ^Integer dilation]
    (Convolution1DUtils/effectiveKernelSize kernel dilation)))

(defn *validate-convolution-mode-padding
  "Check that the convolution mode is consistent with the padding specification

  mode - `org.deeplearning4j.nn.conf.ConvolutionMode`
  padding - `int`"
  ([^org.deeplearning4j.nn.conf.ConvolutionMode mode ^Integer padding]
    (Convolution1DUtils/validateConvolutionModePadding mode padding)))

(defn *get-same-mode-top-left-padding
  "Get top padding for same mode only.

  out-size - Output size (length 2 array, height dimension first) - `int`
  in-size - Input size (length 2 array, height dimension first) - `int`
  kernel - Kernel size (length 2 array, height dimension first) - `int`
  strides - Strides (length 2 array, height dimension first) - `int`
  dilation - Dilation (length 2 array, height dimension first) - `int`

  returns: Top left padding (length 2 array, height dimension first) - `int`"
  (^Integer [^Integer out-size ^Integer in-size ^Integer kernel ^Integer strides ^Integer dilation]
    (Convolution1DUtils/getSameModeTopLeftPadding out-size in-size kernel strides dilation)))

(defn *validate-cnn-1-d-kernel-stride-padding
  "Perform validation on the CNN layer kernel/stride/padding. Expect int, with values > 0 for kernel size and
  stride, and values >= 0 for padding.

  kernel - Kernel size to check - `int`
  stride - Stride to check - `int`
  padding - Padding to check - `int`"
  ([^Integer kernel ^Integer stride ^Integer padding]
    (Convolution1DUtils/validateCnn1DKernelStridePadding kernel stride padding)))

