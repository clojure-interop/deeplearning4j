(ns org.nd4j.weightinit.impl.DistributionInitScheme
  "Initialize the weights based on a given Distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.weightinit.impl DistributionInitScheme]))

(defn ->distribution-init-scheme
  "Constructor.

  order - `char`
  distribution - `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^DistributionInitScheme [^Character order ^org.nd4j.linalg.api.rng.distribution.Distribution distribution]
    (new DistributionInitScheme order distribution)))

(defn do-create
  "shape - `long[]`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DistributionInitScheme this shape ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (-> this (.doCreate shape params-view))))

(defn type
  "Description copied from interface: WeightInitScheme

  returns: `org.nd4j.weightinit.WeightInit`"
  (^org.nd4j.weightinit.WeightInit [^DistributionInitScheme this]
    (-> this (.type))))

