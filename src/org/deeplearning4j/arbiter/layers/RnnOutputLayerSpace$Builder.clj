(ns org.deeplearning4j.arbiter.layers.RnnOutputLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers RnnOutputLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^RnnOutputLayerSpace$Builder []
    (new RnnOutputLayerSpace$Builder )))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.RnnOutputLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.RnnOutputLayerSpace [^RnnOutputLayerSpace$Builder this]
    (-> this (.build))))

