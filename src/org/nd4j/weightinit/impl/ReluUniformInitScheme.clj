(ns org.nd4j.weightinit.impl.ReluUniformInitScheme
  "Initialize the weight to:
 U(-sqrt(6/fanIn), sqrt(6/fanIn)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl ReluUniformInitScheme]))

(defn ->relu-uniform-init-scheme
  "Constructor.

  order - `char`
  fan-in - `double`"
  (^ReluUniformInitScheme [^Character order ^Double fan-in]
    (new ReluUniformInitScheme order fan-in)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ReluUniformInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^ReluUniformInitScheme this]
    (-> this (.type))))

