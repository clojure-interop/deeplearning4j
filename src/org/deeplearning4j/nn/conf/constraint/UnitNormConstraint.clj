(ns org.deeplearning4j.nn.conf.constraint.UnitNormConstraint
  "Constrain the L2 norm of the incoming weights for each unit to be 1.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.constraint UnitNormConstraint]))

(defn ->unit-norm-constraint
  "Constructor.

  Apply to weights but not biases by default

  dimensions - Dimensions to apply to. For DenseLayer, OutputLayer, RnnOutputLayer, LSTM, etc: this shouldbe dimension 1. For CNNs, this should be dimensions [1,2,3] corresponding to last 3 ofparameters which have order [depthOut, depthIn, kH, kW] - `int`"
  (^UnitNormConstraint [^Integer dimensions]
    (new UnitNormConstraint dimensions))
  (^UnitNormConstraint [^java.util.Set param-names ^Integer dimensions]
    (new UnitNormConstraint param-names dimensions)))

(defn apply
  "param - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^UnitNormConstraint this ^org.nd4j.linalg.api.ndarray.INDArray param]
    (-> this (.apply param))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.constraint.UnitNormConstraint`"
  (^org.deeplearning4j.nn.conf.constraint.UnitNormConstraint [^UnitNormConstraint this]
    (-> this (.clone))))

