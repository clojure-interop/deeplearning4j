(ns org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers CenterLossOutputLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^CenterLossOutputLayerSpace$Builder []
    (new CenterLossOutputLayerSpace$Builder )))

(defn alpha
  "alpha - `double`

  returns: `org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace$Builder [^CenterLossOutputLayerSpace$Builder this ^Double alpha]
    (-> this (.alpha alpha))))

(defn lambda
  "lambda - `double`

  returns: `org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace$Builder [^CenterLossOutputLayerSpace$Builder this ^Double lambda]
    (-> this (.lambda lambda))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace [^CenterLossOutputLayerSpace$Builder this]
    (-> this (.build))))

