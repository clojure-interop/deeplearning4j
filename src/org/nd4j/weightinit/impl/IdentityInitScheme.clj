(ns org.nd4j.weightinit.impl.IdentityInitScheme
  "Initialize the weight to one."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl IdentityInitScheme]))

(defn ->identity-init-scheme
  "Constructor.

  order - `char`"
  (^IdentityInitScheme [^Character order]
    (new IdentityInitScheme order)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IdentityInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^IdentityInitScheme this]
    (-> this (.type))))

