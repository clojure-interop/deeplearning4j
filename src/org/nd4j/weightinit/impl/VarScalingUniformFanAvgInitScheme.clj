(ns org.nd4j.weightinit.impl.VarScalingUniformFanAvgInitScheme
  "Initialize the weight to:
 range = = 3.0 / Math.sqrt((fanIn  fanOut) / 2)
 U(-range,range)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl VarScalingUniformFanAvgInitScheme]))

(defn ->var-scaling-uniform-fan-avg-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`
  fan-out - `double`"
  (^VarScalingUniformFanAvgInitScheme [^Character order ^Double fan-in ^Double fan-out]
    (new VarScalingUniformFanAvgInitScheme order fan-in fan-out)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VarScalingUniformFanAvgInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^VarScalingUniformFanAvgInitScheme this]
    (-> this (.type))))

