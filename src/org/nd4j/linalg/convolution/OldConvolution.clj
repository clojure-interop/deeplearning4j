(ns org.nd4j.linalg.convolution.OldConvolution
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.convolution OldConvolution]))

(defn *col-2im
  "Rearrange matrix
  columns into blocks

  col - the columntransposed image to convert - `org.nd4j.linalg.api.ndarray.INDArray`
  sy - stride y - `int`
  sx - stride x - `int`
  ph - padding height - `int`
  pw - padding width - `int`
  h - height - `int`
  w - width - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray col ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Integer h ^Integer w]
    (OldConvolution/col2im col sy sx ph pw h w))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray col stride padding ^Integer height ^Integer width]
    (OldConvolution/col2im col stride padding height width)))

(defn *im-2col
  "Implement column formatted images

  img - the image to process - `org.nd4j.linalg.api.ndarray.INDArray`
  kh - the kernel height - `int`
  kw - the kernel width - `int`
  sy - the stride along y - `int`
  sx - the stride along x - `int`
  ph - the padding width - `int`
  pw - the padding height - `int`
  pval - the padding value - `int`
  cover-all - whether to cover the whole image or not - `boolean`

  returns: the column formatted image - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img ^Integer kh ^Integer kw ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Integer pval ^Boolean cover-all]
    (OldConvolution/im2col img kh kw sy sx ph pw pval cover-all))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray img kernel stride padding]
    (OldConvolution/im2col img kernel stride padding)))

(defn *out-size
  "The out size for a convolution

  size - `int`
  k - `int`
  s - `int`
  p - `int`
  cover-all - `boolean`

  returns: `int`"
  (^Integer [^Integer size ^Integer k ^Integer s ^Integer p ^Boolean cover-all]
    (OldConvolution/outSize size k s p cover-all)))

