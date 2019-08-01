(ns org.deeplearning4j.util.MaskedReductionUtil
  "This is a TEMPORARY class for implementing global pooling with masking. Note that it may be removed in a future release,
 if and when these approaches are formally implemented as native operations in ND4J. Consequently, this should not
 be considered part of the public API."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util MaskedReductionUtil]))

(defn *masked-pooling-time-series
  "pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`
  to-reduce - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`
  pnorm - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.nd4j.linalg.api.ndarray.INDArray to-reduce ^org.nd4j.linalg.api.ndarray.INDArray mask ^Integer pnorm]
    (MaskedReductionUtil/maskedPoolingTimeSeries pooling-type to-reduce mask pnorm)))

(defn *masked-pooling-epsilon-time-series
  "pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`
  input - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon-2d - `org.nd4j.linalg.api.ndarray.INDArray`
  pnorm - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray mask ^org.nd4j.linalg.api.ndarray.INDArray epsilon-2d ^Integer pnorm]
    (MaskedReductionUtil/maskedPoolingEpsilonTimeSeries pooling-type input mask epsilon-2d pnorm)))

(defn *masked-pooling-convolution
  "pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`
  to-reduce - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`
  pnorm - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.nd4j.linalg.api.ndarray.INDArray to-reduce ^org.nd4j.linalg.api.ndarray.INDArray mask ^Integer pnorm]
    (MaskedReductionUtil/maskedPoolingConvolution pooling-type to-reduce mask pnorm)))

(defn *masked-pooling-epsilon-cnn
  "pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`
  input - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon-2d - `org.nd4j.linalg.api.ndarray.INDArray`
  pnorm - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray mask ^org.nd4j.linalg.api.ndarray.INDArray epsilon-2d ^Integer pnorm]
    (MaskedReductionUtil/maskedPoolingEpsilonCnn pooling-type input mask epsilon-2d pnorm)))

