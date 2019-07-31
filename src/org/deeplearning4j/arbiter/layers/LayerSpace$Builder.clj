(ns org.deeplearning4j.arbiter.layers.LayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers LayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^LayerSpace$Builder []
    (new LayerSpace$Builder )))

(defn drop-out
  "drop-out - `double`

  returns: `T`"
  ([^LayerSpace$Builder this ^Double drop-out]
    (-> this (.dropOut drop-out))))

(defn i-drop-out
  "drop-out - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `T`"
  ([^LayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace drop-out]
    (-> this (.iDropOut drop-out))))

(defn build
  "returns: `<E extends org.deeplearning4j.arbiter.layers.LayerSpace> E`"
  ([^LayerSpace$Builder this]
    (-> this (.build))))

