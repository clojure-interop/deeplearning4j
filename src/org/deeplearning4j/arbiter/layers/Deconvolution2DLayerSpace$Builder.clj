(ns org.deeplearning4j.arbiter.layers.Deconvolution2DLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers Deconvolution2DLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^Deconvolution2DLayerSpace$Builder []
    (new Deconvolution2DLayerSpace$Builder )))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.Deconvolution2DLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.Deconvolution2DLayerSpace [^Deconvolution2DLayerSpace$Builder this]
    (-> this (.build))))

