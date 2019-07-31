(ns org.deeplearning4j.nn.weights.WeightInitUtil
  "Weight initialization utility"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.weights WeightInitUtil]))

(def *-default-weight-init-order
  "Static Constant.

  Default order for the arrays created by WeightInitUtil.

  type: char"
  WeightInitUtil/DEFAULT_WEIGHT_INIT_ORDER)

(defn *init-weights
  "Initializes a matrix with the given weight initialization scheme.
  Note: Defaults to fortran ('f') order arrays for the weights. Use #initWeights(long[], WeightInit, Distribution, char, INDArray)
  to control this

  fan-in - `double`
  fan-out - `double`
  shape - the shape of the matrix - `long[]`
  init-scheme - the scheme to use - `org.deeplearning4j.nn.weights.WeightInit`
  dist - `org.nd4j.linalg.api.rng.distribution.Distribution`
  param-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: a matrix of the specified dimensions with the specified
  distribution based on the initialization scheme - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Double fan-in ^Double fan-out shape ^org.deeplearning4j.nn.weights.WeightInit init-scheme ^org.nd4j.linalg.api.rng.distribution.Distribution dist ^org.nd4j.linalg.api.ndarray.INDArray param-view]
    (WeightInitUtil/initWeights fan-in fan-out shape init-scheme dist param-view))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Double fan-in ^Double fan-out shape ^org.deeplearning4j.nn.weights.WeightInit init-scheme ^org.nd4j.linalg.api.rng.distribution.Distribution dist ^Character order ^org.nd4j.linalg.api.ndarray.INDArray param-view]
    (WeightInitUtil/initWeights fan-in fan-out shape init-scheme dist order param-view))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^Float min ^Float max]
    (WeightInitUtil/initWeights shape min max)))

(defn *reshape-weights
  "Reshape the parameters view, without modifying the paramsView array values.

  shape - Shape to reshape - `int[]`
  params-view - Parameters array view - `org.nd4j.linalg.api.ndarray.INDArray`
  flattening-order - Order in which parameters are flattened/reshaped - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Character flattening-order]
    (WeightInitUtil/reshapeWeights shape params-view flattening-order))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (WeightInitUtil/reshapeWeights shape params-view)))

