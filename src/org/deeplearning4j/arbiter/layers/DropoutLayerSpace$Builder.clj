(ns org.deeplearning4j.arbiter.layers.DropoutLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers DropoutLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^DropoutLayerSpace$Builder []
    (new DropoutLayerSpace$Builder )))

(defn drop-out
  "d - `double`

  returns: `org.deeplearning4j.arbiter.layers.DropoutLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.DropoutLayerSpace$Builder [^DropoutLayerSpace$Builder this ^Double d]
    (-> this (.dropOut d))))

(defn i-drop-out
  "dropout - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.layers.DropoutLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.DropoutLayerSpace$Builder [^DropoutLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace dropout]
    (-> this (.iDropOut dropout))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.DropoutLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.DropoutLayerSpace [^DropoutLayerSpace$Builder this]
    (-> this (.build))))

