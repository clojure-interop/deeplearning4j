(ns org.deeplearning4j.arbiter.layers.BaseConvolutionLayerSpace
  "Layer space for convolutional layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BaseConvolutionLayerSpace]))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^BaseConvolutionLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^BaseConvolutionLayerSpace this]
    (-> this (.toString))))

