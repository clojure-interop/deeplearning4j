(ns org.nd4j.weightinit.impl.OneInitScheme
  "Initialize the weight to one."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl OneInitScheme]))

(defn ->one-init-scheme
  "Constructor.

  order - `char`"
  (^OneInitScheme [^Character order]
    (new OneInitScheme order)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^OneInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^OneInitScheme this]
    (-> this (.type))))

