(ns org.nd4j.weightinit.impl.VarScalingNormalUniformFanInInitScheme
  "Initialize the weight to:
 range = = 3.0 / Math.sqrt(fanIn)
 U(-range,range)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl VarScalingNormalUniformFanInInitScheme]))

(defn ->var-scaling-normal-uniform-fan-in-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`"
  (^VarScalingNormalUniformFanInInitScheme [^Character order ^Double fan-in]
    (new VarScalingNormalUniformFanInInitScheme order fan-in)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VarScalingNormalUniformFanInInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^VarScalingNormalUniformFanInInitScheme this]
    (-> this (.type))))

