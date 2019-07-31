(ns org.nd4j.weightinit.impl.VarScalingNormalFanAvgInitScheme
  "Initialize the weight to:
 U / sqrt((fanin _ fanout) / 2)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl VarScalingNormalFanAvgInitScheme]))

(defn ->var-scaling-normal-fan-avg-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`
  fan-out - `double`"
  (^VarScalingNormalFanAvgInitScheme [^Character order ^Double fan-in ^Double fan-out]
    (new VarScalingNormalFanAvgInitScheme order fan-in fan-out)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VarScalingNormalFanAvgInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^VarScalingNormalFanAvgInitScheme this]
    (-> this (.type))))

