(ns org.deeplearning4j.nn.conf.constraint.MinMaxNormConstraint
  "Constrain the minimum AND maximum L2 norm of the incoming weights for each unit to be between the specified values.
 If the L2 norm exceeds the specified max value, the weights will be scaled down to satisfy the constraint; if the
 L2 norm is less than the specified min value, the weights will be scaled up
 Note that this constraint supports a rate parameter (default: 1.0, which is equivalent to a strict constraint).
 If rate < 1.0, the applied norm2 constraint will be (1-rate)*norm2  rate*clippedNorm2, where clippedNorm2 is the
 norm2 value after applying clipping to min/max values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.constraint MinMaxNormConstraint]))

(defn ->min-max-norm-constraint
  "Constructor.

  Apply to weights but not biases by default

  min - Minimum L2 value - `double`
  max - Maximum L2 value - `double`
  rate - Constraint rate - `double`
  dimensions - Dimensions to apply to. For DenseLayer, OutputLayer, RnnOutputLayer, LSTM, etc: this shouldbe dimension 1. For CNNs, this should be dimensions [1,2,3] corresponding to last 3 ofparameters which have order [depthOut, depthIn, kH, kW] - `int`"
  (^MinMaxNormConstraint [^Double min ^Double max ^Double rate ^Integer dimensions]
    (new MinMaxNormConstraint min max rate dimensions))
  (^MinMaxNormConstraint [^Double min ^Double max ^Integer dimensions]
    (new MinMaxNormConstraint min max dimensions))
  (^MinMaxNormConstraint [^Double min ^Double max ^Double rate ^java.util.Set param-names ^Integer dimensions]
    (new MinMaxNormConstraint min max rate param-names dimensions)))

(def *-default-rate
  "Static Constant.

  type: double"
  MinMaxNormConstraint/DEFAULT_RATE)

(defn apply
  "param - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MinMaxNormConstraint this ^org.nd4j.linalg.api.ndarray.INDArray param]
    (-> this (.apply param))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.constraint.MinMaxNormConstraint`"
  (^org.deeplearning4j.nn.conf.constraint.MinMaxNormConstraint [^MinMaxNormConstraint this]
    (-> this (.clone))))

