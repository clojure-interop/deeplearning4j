(ns org.deeplearning4j.nn.conf.constraint.MaxNormConstraint
  "Constrain the maximum L2 norm of the incoming weights for each unit to be less than or equal to the specified value.
 If the L2 norm exceeds the specified value, the weights will be scaled down to satisfy the constraint."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.constraint MaxNormConstraint]))

(defn ->max-norm-constraint
  "Constructor.

  Apply to weights but not biases by default

  max-norm - Maximum L2 value - `double`
  dimensions - Dimensions to apply to. For DenseLayer, OutputLayer, RnnOutputLayer, LSTM, etc: this shouldbe dimension 1. For CNNs, this should be dimensions [1,2,3] corresponding to last 3 ofparameters which have order [depthOut, depthIn, kH, kW] - `int`"
  (^MaxNormConstraint [^Double max-norm ^Integer dimensions]
    (new MaxNormConstraint max-norm dimensions))
  (^MaxNormConstraint [^Double max-norm ^java.util.Set param-names ^Integer dimensions]
    (new MaxNormConstraint max-norm param-names dimensions)))

(defn apply
  "param - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MaxNormConstraint this ^org.nd4j.linalg.api.ndarray.INDArray param]
    (-> this (.apply param))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.constraint.MaxNormConstraint`"
  (^org.deeplearning4j.nn.conf.constraint.MaxNormConstraint [^MaxNormConstraint this]
    (-> this (.clone))))

