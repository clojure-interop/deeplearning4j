(ns org.deeplearning4j.arbiter.conf.updater.BaseUpdaterSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater BaseUpdaterSpace]))

(defn ->base-updater-space
  "Constructor."
  (^BaseUpdaterSpace []
    (new BaseUpdaterSpace )))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^BaseUpdaterSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^BaseUpdaterSpace this]
    (-> this (.collectLeaves))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^BaseUpdaterSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^BaseUpdaterSpace this ^Integer indices]
    (-> this (.setIndices indices))))

