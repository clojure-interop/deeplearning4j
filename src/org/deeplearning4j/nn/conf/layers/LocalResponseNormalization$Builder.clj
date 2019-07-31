(ns org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers LocalResponseNormalization$Builder]))

(defn ->builder
  "Constructor.

  k - `double`
  alpha - `double`
  beta - `double`"
  (^LocalResponseNormalization$Builder [^Double k ^Double alpha ^Double beta]
    (new LocalResponseNormalization$Builder k alpha beta))
  (^LocalResponseNormalization$Builder []
    (new LocalResponseNormalization$Builder )))

(defn k
  "LRN scaling constant k. Default: 2

  k - `double`

  returns: `org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder [^LocalResponseNormalization$Builder this ^Double k]
    (-> this (.k k))))

(defn n
  "Number of adjacent kernel maps to use when doing LRN. default: 5

  n - Number of adjacent kernel maps - `double`

  returns: `org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder [^LocalResponseNormalization$Builder this ^Double n]
    (-> this (.n n))))

(defn alpha
  "LRN scaling constant alpha. Default: 1e-4

  alpha - Scaling constant - `double`

  returns: `org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder [^LocalResponseNormalization$Builder this ^Double alpha]
    (-> this (.alpha alpha))))

(defn beta
  "Scaling constant beta. Default: 0.75

  beta - Scaling constant - `double`

  returns: `org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LocalResponseNormalization$Builder [^LocalResponseNormalization$Builder this ^Double beta]
    (-> this (.beta beta))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.LocalResponseNormalization`"
  (^org.deeplearning4j.nn.conf.layers.LocalResponseNormalization [^LocalResponseNormalization$Builder this]
    (-> this (.build))))

