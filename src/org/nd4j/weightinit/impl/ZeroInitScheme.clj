(ns org.nd4j.weightinit.impl.ZeroInitScheme
  "Initialize the weight to zero."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl ZeroInitScheme]))

(defn ->zero-init-scheme
  "Constructor.

  order - `char`"
  (^ZeroInitScheme [^Character order]
    (new ZeroInitScheme order)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ZeroInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^ZeroInitScheme this]
    (-> this (.type))))

