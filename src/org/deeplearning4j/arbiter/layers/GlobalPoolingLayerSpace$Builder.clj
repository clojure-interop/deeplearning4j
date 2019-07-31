(ns org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers GlobalPoolingLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^GlobalPoolingLayerSpace$Builder []
    (new GlobalPoolingLayerSpace$Builder )))

(defn pooling-dimensions
  "pooling-dimensions - `int`

  returns: `org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder [^GlobalPoolingLayerSpace$Builder this ^Integer pooling-dimensions]
    (-> this (.poolingDimensions pooling-dimensions))))

(defn collapse-dimensions
  "collapse-dimensions - `boolean`

  returns: `org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder [^GlobalPoolingLayerSpace$Builder this ^Boolean collapse-dimensions]
    (-> this (.collapseDimensions collapse-dimensions))))

(defn pooling-type
  "pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`

  returns: `org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder [^GlobalPoolingLayerSpace$Builder this ^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type]
    (-> this (.poolingType pooling-type))))

(defn p-norm
  "p-norm - `int`

  returns: `org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace$Builder [^GlobalPoolingLayerSpace$Builder this ^Integer p-norm]
    (-> this (.pNorm p-norm))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace [^GlobalPoolingLayerSpace$Builder this]
    (-> this (.build))))

