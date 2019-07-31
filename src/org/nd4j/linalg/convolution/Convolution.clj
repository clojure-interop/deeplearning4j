(ns org.nd4j.linalg.convolution.Convolution
  "Convolution is the
 code for applying
 the convolution operator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.convolution Convolution]))

(defn *col-2im
  "Rearrange matrix
  columns into blocks

  col - the columntransposed image to convert - `org.nd4j.linalg.api.ndarray.INDArray`
  s-h - stride height - `int`
  s-w - stride width - `int`
  ph - padding height - `int`
  p-w - padding width - `int`
  k-h - height - `int`
  k-w - width - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray col ^Integer s-h ^Integer s-w ^Integer ph ^Integer p-w ^Integer k-h ^Integer k-w]
    (Convolution/col2im col s-h s-w ph p-w k-h k-w))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray col ^org.nd4j.linalg.api.ndarray.INDArray z ^Integer s-h ^Integer s-w ^Integer p-h ^Integer p-w ^Integer k-h ^Integer k-w ^Integer d-h ^Integer d-w]
    (Convolution/col2im col z s-h s-w p-h p-w k-h k-w d-h d-w))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray col stride padding ^Integer height ^Integer width]
    (Convolution/col2im col stride padding height width)))

(defn *im-2col
  "Implement column formatted images

  img - the image to process - `org.nd4j.linalg.api.ndarray.INDArray`
  kh - the kernel height - `int`
  kw - the kernel width - `int`
  sy - the stride along y - `int`
  sx - the stride along x - `int`
  ph - the padding width - `int`
  pw - the padding height - `int`
  pval - the padding value (not used) - `int`
  is-same-mode - whether padding mode is 'same' - `boolean`

  returns: the column formatted image - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img ^Integer kh ^Integer kw ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Integer pval ^Boolean is-same-mode]
    (Convolution/im2col img kh kw sy sx ph pw pval is-same-mode))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img ^Integer kh ^Integer kw ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Boolean is-same-mode]
    (Convolution/im2col img kh kw sy sx ph pw is-same-mode))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img ^Integer kh ^Integer kw ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Integer d-h ^Integer d-w ^Boolean is-same-mode ^org.nd4j.linalg.api.ndarray.INDArray out]
    (Convolution/im2col img kh kw sy sx ph pw d-h d-w is-same-mode out))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img ^Integer kh ^Integer kw ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Integer dh ^Integer dw ^Boolean is-same-mode]
    (Convolution/im2col img kh kw sy sx ph pw dh dw is-same-mode))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img kernel stride padding]
    (Convolution/im2col img kernel stride padding)))

(defn *pooling-2-d
  "Pooling 2d implementation

  img - `org.nd4j.linalg.api.ndarray.INDArray`
  kh - `int`
  kw - `int`
  sy - `int`
  sx - `int`
  ph - `int`
  pw - `int`
  dh - `int`
  dw - `int`
  is-same-mode - `boolean`
  type - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Pooling2DType`
  divisor - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor`
  extra - optional argument. I.e. used in pnorm pooling. - `double`
  virtual-height - `int`
  virtual-width - `int`
  out - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img ^Integer kh ^Integer kw ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Integer dh ^Integer dw ^Boolean is-same-mode ^org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Pooling2DType type ^org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D$Divisor divisor ^Double extra ^Integer virtual-height ^Integer virtual-width ^org.nd4j.linalg.api.ndarray.INDArray out]
    (Convolution/pooling2D img kh kw sy sx ph pw dh dw is-same-mode type divisor extra virtual-height virtual-width out)))

(defn *out-size
  "Deprecated.

  size - `int`
  k - `int`
  s - `int`
  p - `int`
  dilation - `int`
  cover-all - `boolean`

  returns: `int`"
  (^Integer [^Integer size ^Integer k ^Integer s ^Integer p ^Integer dilation ^Boolean cover-all]
    (Convolution/outSize size k s p dilation cover-all)))

(defn *output-size
  "size - `int`
  k - `int`
  s - `int`
  p - `int`
  dilation - `int`
  is-same-mode - `boolean`

  returns: `int`"
  (^Integer [^Integer size ^Integer k ^Integer s ^Integer p ^Integer dilation ^Boolean is-same-mode]
    (Convolution/outputSize size k s p dilation is-same-mode)))

(defn *effective-kernel-size
  "kernel - `int`
  dilation - `int`

  returns: `int`"
  (^Integer [^Integer kernel ^Integer dilation]
    (Convolution/effectiveKernelSize kernel dilation)))

(defn *conv-2d
  "2d convolution (aka the last 2 dimensions

  input - the input to op - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - the kernel to convolve with - `org.nd4j.linalg.api.ndarray.INDArray`
  type - `org.nd4j.linalg.convolution.Convolution$Type`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray kernel ^org.nd4j.linalg.convolution.Convolution$Type type]
    (Convolution/conv2d input kernel type)))

(defn *convn
  "ND Convolution

  input - the input to op - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - the kerrnel to op with - `org.nd4j.linalg.api.ndarray.INDArray`
  type - the opType of convolution - `org.nd4j.linalg.convolution.Convolution$Type`
  axes - the axes to do the convolution along - `int[]`

  returns: the convolution of the given input and kernel - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray kernel ^org.nd4j.linalg.convolution.Convolution$Type type axes]
    (Convolution/convn input kernel type axes))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray kernel ^org.nd4j.linalg.convolution.Convolution$Type type]
    (Convolution/convn input kernel type)))

