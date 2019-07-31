(ns org.nd4j.weightinit.impl.ConstantInitScheme
  "Initialize the weight to zero."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl ConstantInitScheme]))

(defn ->constant-init-scheme
  "Constructor.

  order - `char`
  constant - `double`"
  (^ConstantInitScheme [^Character order ^Double constant]
    (new ConstantInitScheme order constant)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ConstantInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^ConstantInitScheme this]
    (-> this (.type))))

