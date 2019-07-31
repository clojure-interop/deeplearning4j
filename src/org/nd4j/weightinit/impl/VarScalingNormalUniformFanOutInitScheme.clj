(ns org.nd4j.weightinit.impl.VarScalingNormalUniformFanOutInitScheme
  "Initialize the weight to:
 randn(shape) //N(0, 2/nIn);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl VarScalingNormalUniformFanOutInitScheme]))

(defn ->var-scaling-normal-uniform-fan-out-init-scheme
  "Constructor.

  order - `char`
  fan-out - `double`"
  (^VarScalingNormalUniformFanOutInitScheme [^Character order ^Double fan-out]
    (new VarScalingNormalUniformFanOutInitScheme order fan-out)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VarScalingNormalUniformFanOutInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^VarScalingNormalUniformFanOutInitScheme this]
    (-> this (.type))))

