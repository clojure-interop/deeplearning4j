(ns org.nd4j.weightinit.impl.UniformInitScheme
  "Initialize the weight to:
 range = 1.0 / Math.sqrt(fanIn)
 U(-range,range)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl UniformInitScheme]))

(defn ->uniform-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`"
  (^UniformInitScheme [^Character order ^Double fan-in]
    (new UniformInitScheme order fan-in)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^UniformInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^UniformInitScheme this]
    (-> this (.type))))

