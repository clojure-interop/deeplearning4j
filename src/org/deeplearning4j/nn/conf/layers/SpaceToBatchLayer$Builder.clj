(ns org.deeplearning4j.nn.conf.layers.SpaceToBatchLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SpaceToBatchLayer$Builder]))

(defn ->builder
  "Constructor.

  blocks - `int[]`
  padding - `int[][]`"
  (^SpaceToBatchLayer$Builder [blocks padding]
    (new SpaceToBatchLayer$Builder blocks padding))
  (^SpaceToBatchLayer$Builder [blocks]
    (new SpaceToBatchLayer$Builder blocks)))

(defn blocks
  "blocks - `int[]`

  returns: `T`"
  ([^SpaceToBatchLayer$Builder this blocks]
    (-> this (.blocks blocks))))

(defn padding
  "padding - `int[][]`

  returns: `T`"
  ([^SpaceToBatchLayer$Builder this padding]
    (-> this (.padding padding))))

(defn name
  "Description copied from class: Layer.Builder

  layer-name - `java.lang.String`

  returns: `T`"
  ([^SpaceToBatchLayer$Builder this ^java.lang.String layer-name]
    (-> this (.name layer-name))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.SpaceToBatchLayer`"
  (^org.deeplearning4j.nn.conf.layers.SpaceToBatchLayer [^SpaceToBatchLayer$Builder this]
    (-> this (.build))))

