(ns org.nd4j.weightinit.impl.VarScalingNormalFanOutInitScheme
  "Initialize the weight to:
 U / sqrt(fanout)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl VarScalingNormalFanOutInitScheme]))

(defn ->var-scaling-normal-fan-out-init-scheme
  "Constructor.

  order - `char`
  fan-out - `double`"
  (^VarScalingNormalFanOutInitScheme [^Character order ^Double fan-out]
    (new VarScalingNormalFanOutInitScheme order fan-out)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VarScalingNormalFanOutInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^VarScalingNormalFanOutInitScheme this]
    (-> this (.type))))

