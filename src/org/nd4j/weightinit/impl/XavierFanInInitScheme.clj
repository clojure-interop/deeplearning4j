(ns org.nd4j.weightinit.impl.XavierFanInInitScheme
  "Initialize the weight to:
 randn(shape) //N(0, 2/nIn);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl XavierFanInInitScheme]))

(defn ->xavier-fan-in-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`"
  (^XavierFanInInitScheme [^Character order ^Double fan-in]
    (new XavierFanInInitScheme order fan-in)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^XavierFanInInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^XavierFanInInitScheme this]
    (-> this (.type))))

