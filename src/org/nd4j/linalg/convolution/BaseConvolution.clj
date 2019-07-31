(ns org.nd4j.linalg.convolution.BaseConvolution
  "Base convolution implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.convolution BaseConvolution]))

(defn ->base-convolution
  "Constructor."
  (^BaseConvolution []
    (new BaseConvolution )))

(defn conv-2d
  "2d convolution (aka the last 2 dimensions

  input - the input to op - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - the kernel to convolve with - `org.nd4j.linalg.api.ndarray.INDArray`
  type - `org.nd4j.linalg.convolution.Convolution$Type`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseConvolution this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray kernel ^org.nd4j.linalg.convolution.Convolution$Type type]
    (-> this (.conv2d input kernel type))))

(defn convn
  "ND Convolution

  input - the input to transform - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - the kernel to transform with - `org.nd4j.linalg.api.ndarray.INDArray`
  type - the opType of convolution - `org.nd4j.linalg.convolution.Convolution$Type`

  returns: the convolution of the given input and kernel - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseConvolution this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray kernel ^org.nd4j.linalg.convolution.Convolution$Type type]
    (-> this (.convn input kernel type))))

