(ns org.deeplearning4j.arbiter.layers.FeedForwardLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers FeedForwardLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^FeedForwardLayerSpace$Builder []
    (new FeedForwardLayerSpace$Builder )))

(defn n-in
  "n-in - `int`

  returns: `T`"
  ([^FeedForwardLayerSpace$Builder this ^Integer n-in]
    (-> this (.nIn n-in))))

(defn n-out
  "n-out - `int`

  returns: `T`"
  ([^FeedForwardLayerSpace$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn constrain-weights
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^FeedForwardLayerSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainWeights constraints))))

(defn constrain-bias
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^FeedForwardLayerSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainBias constraints))))

(defn constrain-all-params
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^FeedForwardLayerSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainAllParams constraints))))

