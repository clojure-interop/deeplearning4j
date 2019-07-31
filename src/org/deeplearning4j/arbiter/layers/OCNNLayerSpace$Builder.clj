(ns org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers OCNNLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^OCNNLayerSpace$Builder []
    (new OCNNLayerSpace$Builder )))

(defn nu
  "nu-space - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder [^OCNNLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace nu-space]
    (-> this (.nu nu-space))))

(defn num-hidden
  "Deprecated.

  num-hidden-space - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder [^OCNNLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace num-hidden-space]
    (-> this (.numHidden num-hidden-space))))

(defn hidden-layer-size
  "hidden-layer-size - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder [^OCNNLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace hidden-layer-size]
    (-> this (.hiddenLayerSize hidden-layer-size))))

(defn initial-r-value
  "initial-r-value - `double`

  returns: `org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder [^OCNNLayerSpace$Builder this ^Double initial-r-value]
    (-> this (.initialRValue initial-r-value))))

(defn window-size
  "window-size - `int`

  returns: `org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder [^OCNNLayerSpace$Builder this ^Integer window-size]
    (-> this (.windowSize window-size))))

(defn configure-r
  "configure-r - `boolean`

  returns: `org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.OCNNLayerSpace$Builder [^OCNNLayerSpace$Builder this ^Boolean configure-r]
    (-> this (.configureR configure-r))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.OCNNLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.OCNNLayerSpace [^OCNNLayerSpace$Builder this]
    (-> this (.build))))

