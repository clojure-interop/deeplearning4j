(ns org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers SeparableConvolution2DLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^SeparableConvolution2DLayerSpace$Builder []
    (new SeparableConvolution2DLayerSpace$Builder )))

(defn constrain-point-wise
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace$Builder [^SeparableConvolution2DLayerSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainPointWise constraints))))

(defn depth-multiplier
  "depth-multiplier - `int`

  returns: `org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace$Builder [^SeparableConvolution2DLayerSpace$Builder this ^Integer depth-multiplier]
    (-> this (.depthMultiplier depth-multiplier))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace [^SeparableConvolution2DLayerSpace$Builder this]
    (-> this (.build))))

