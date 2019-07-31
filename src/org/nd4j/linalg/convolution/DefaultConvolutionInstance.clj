(ns org.nd4j.linalg.convolution.DefaultConvolutionInstance
  "Default convolution instance (FFT based)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.convolution DefaultConvolutionInstance]))

(defn ->default-convolution-instance
  "Constructor."
  (^DefaultConvolutionInstance []
    (new DefaultConvolutionInstance )))

(defn convn
  "ND Convolution

  input - the input to op - `org.nd4j.linalg.api.ndarray.INDArray`
  kernel - the kernel to op with - `org.nd4j.linalg.api.ndarray.INDArray`
  type - the opType of convolution - `org.nd4j.linalg.convolution.Convolution$Type`
  axes - the axes to do the convolution along - `int[]`

  returns: the convolution of the given input and kernel - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultConvolutionInstance this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray kernel ^org.nd4j.linalg.convolution.Convolution$Type type axes]
    (-> this (.convn input kernel type axes))))

