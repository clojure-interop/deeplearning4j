(ns org.nd4j.weightinit.impl.XavierInitScheme
  "Initialize the weight to:
 range = = U * sqrt(2.0 / (fanIn  fanOut)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl XavierInitScheme]))

(defn ->xavier-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`
  fan-out - `double`"
  (^XavierInitScheme [^Character order ^Double fan-in ^Double fan-out]
    (new XavierInitScheme order fan-in fan-out)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^XavierInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^XavierInitScheme this]
    (-> this (.type))))

