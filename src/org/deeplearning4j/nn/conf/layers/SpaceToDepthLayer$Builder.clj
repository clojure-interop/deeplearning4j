(ns org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SpaceToDepthLayer$Builder]))

(defn ->builder
  "Constructor.

  block-size - `int`
  data-format - `org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer$DataFormat`"
  (^SpaceToDepthLayer$Builder [^Integer block-size ^org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer$DataFormat data-format]
    (new SpaceToDepthLayer$Builder block-size data-format))
  (^SpaceToDepthLayer$Builder [^Integer block-size]
    (new SpaceToDepthLayer$Builder block-size)))

(defn blocks
  "block-size - `int`

  returns: `T`"
  ([^SpaceToDepthLayer$Builder this ^Integer block-size]
    (-> this (.blocks block-size))))

(defn data-format
  "data-format - `org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer$DataFormat`

  returns: `T`"
  ([^SpaceToDepthLayer$Builder this ^org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer$DataFormat data-format]
    (-> this (.dataFormat data-format))))

(defn name
  "Description copied from class: Layer.Builder

  layer-name - `java.lang.String`

  returns: `T`"
  ([^SpaceToDepthLayer$Builder this ^java.lang.String layer-name]
    (-> this (.name layer-name))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer`"
  (^org.deeplearning4j.nn.conf.layers.SpaceToDepthLayer [^SpaceToDepthLayer$Builder this]
    (-> this (.build))))

