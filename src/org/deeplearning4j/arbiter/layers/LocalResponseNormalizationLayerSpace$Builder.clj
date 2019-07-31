(ns org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers LocalResponseNormalizationLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^LocalResponseNormalizationLayerSpace$Builder []
    (new LocalResponseNormalizationLayerSpace$Builder )))

(defn n
  "n - `double`

  returns: `org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder [^LocalResponseNormalizationLayerSpace$Builder this ^Double n]
    (-> this (.n n))))

(defn k
  "k - `double`

  returns: `org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder [^LocalResponseNormalizationLayerSpace$Builder this ^Double k]
    (-> this (.k k))))

(defn alpha
  "alpha - `double`

  returns: `org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder [^LocalResponseNormalizationLayerSpace$Builder this ^Double alpha]
    (-> this (.alpha alpha))))

(defn beta
  "beta - `double`

  returns: `org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace$Builder [^LocalResponseNormalizationLayerSpace$Builder this ^Double beta]
    (-> this (.beta beta))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace [^LocalResponseNormalizationLayerSpace$Builder this]
    (-> this (.build))))

