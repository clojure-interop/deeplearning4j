(ns org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BatchNormalizationSpace$Builder]))

(defn ->builder
  "Constructor."
  (^BatchNormalizationSpace$Builder []
    (new BatchNormalizationSpace$Builder )))

(defn gamma
  "gamma - `double`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^Double gamma]
    (-> this (.gamma gamma))))

(defn eps
  "eps - `double`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^Double eps]
    (-> this (.eps eps))))

(defn constrain-gamma
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainGamma constraints))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace [^BatchNormalizationSpace$Builder this]
    (-> this (.build))))

(defn lock-gamma-beta
  "lock-gamma-beta - `boolean`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^Boolean lock-gamma-beta]
    (-> this (.lockGammaBeta lock-gamma-beta))))

(defn constrain-beta
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainBeta constraints))))

(defn decay
  "decay - `double`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^Double decay]
    (-> this (.decay decay))))

(defn minibatch
  "minibatch - `boolean`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^Boolean minibatch]
    (-> this (.minibatch minibatch))))

(defn beta
  "beta - `double`

  returns: `org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.BatchNormalizationSpace$Builder [^BatchNormalizationSpace$Builder this ^Double beta]
    (-> this (.beta beta))))

