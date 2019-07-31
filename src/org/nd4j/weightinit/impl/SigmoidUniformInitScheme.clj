(ns org.nd4j.weightinit.impl.SigmoidUniformInitScheme
  "Initialize the weight to:
 range = 4.0 * Math.sqrt(6.0 / (fanIn  fanOut))
 U(-range,range)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl SigmoidUniformInitScheme]))

(defn ->sigmoid-uniform-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`
  fan-out - `double`"
  (^SigmoidUniformInitScheme [^Character order ^Double fan-in ^Double fan-out]
    (new SigmoidUniformInitScheme order fan-in fan-out)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SigmoidUniformInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^SigmoidUniformInitScheme this]
    (-> this (.type))))

