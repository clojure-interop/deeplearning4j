(ns org.nd4j.weightinit.impl.VarScalingNormalFanInInitScheme
  "Initialize the weight to:
 U / fanIn"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl VarScalingNormalFanInInitScheme]))

(defn ->var-scaling-normal-fan-in-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`"
  (^VarScalingNormalFanInInitScheme [^Character order ^Double fan-in]
    (new VarScalingNormalFanInInitScheme order fan-in)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VarScalingNormalFanInInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^VarScalingNormalFanInInitScheme this]
    (-> this (.type))))

