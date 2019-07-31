(ns org.deeplearning4j.nn.conf.layers.misc.FrozenLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.misc FrozenLayer$Builder]))

(defn ->builder
  "Constructor."
  (^FrozenLayer$Builder []
    (new FrozenLayer$Builder )))

(defn layer
  "layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: `org.deeplearning4j.nn.conf.layers.misc.FrozenLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.misc.FrozenLayer$Builder [^FrozenLayer$Builder this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.layer layer))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.misc.FrozenLayer`"
  (^org.deeplearning4j.nn.conf.layers.misc.FrozenLayer [^FrozenLayer$Builder this]
    (-> this (.build))))

