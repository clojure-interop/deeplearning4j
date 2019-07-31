(ns org.deeplearning4j.ui.weights.beans.CompactModelAndGradient
  "Slightly modified version of ModelAndGradient, with binned params/gradients, suitable for fast network transfers for HistogramIterationListener"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.weights.beans CompactModelAndGradient]))

(defn ->compact-model-and-gradient
  "Constructor."
  (^CompactModelAndGradient []
    (new CompactModelAndGradient )))

(defn set-scores
  "scores - `java.util.List`"
  ([^CompactModelAndGradient this ^java.util.List scores]
    (-> this (.setScores scores))))

(defn set-parameters
  "parameters - `java.util.Map`"
  ([^CompactModelAndGradient this ^java.util.Map parameters]
    (-> this (.setParameters parameters))))

(defn set-layer-names
  "layer-names - `java.util.List`"
  ([^CompactModelAndGradient this ^java.util.List layer-names]
    (-> this (.setLayerNames layer-names))))

(defn set-gradients
  "gradients - `java.util.Map`"
  ([^CompactModelAndGradient this ^java.util.Map gradients]
    (-> this (.setGradients gradients))))

(defn get-gradients
  "returns: `java.util.Map<java.lang.String,java.util.Map>`"
  (^java.util.Map [^CompactModelAndGradient this]
    (-> this (.getGradients))))

(defn set-path
  "path - `java.lang.String`"
  ([^CompactModelAndGradient this ^java.lang.String path]
    (-> this (.setPath path))))

(defn set-last-update-time
  "last-update-time - `long`"
  ([^CompactModelAndGradient this ^Long last-update-time]
    (-> this (.setLastUpdateTime last-update-time))))

(defn get-update-magnitudes
  "returns: `java.util.List<java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>`"
  (^java.util.List [^CompactModelAndGradient this]
    (-> this (.getUpdateMagnitudes))))

(defn get-layer-names
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CompactModelAndGradient this]
    (-> this (.getLayerNames))))

(defn set-param-magnitudes
  "param-magnitudes - `java.util.List`"
  ([^CompactModelAndGradient this ^java.util.List param-magnitudes]
    (-> this (.setParamMagnitudes param-magnitudes))))

(defn get-parameters
  "returns: `java.util.Map<java.lang.String,java.util.Map>`"
  (^java.util.Map [^CompactModelAndGradient this]
    (-> this (.getParameters))))

(defn get-last-update-time
  "returns: `long`"
  (^Long [^CompactModelAndGradient this]
    (-> this (.getLastUpdateTime))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^CompactModelAndGradient this]
    (-> this (.getPath))))

(defn set-update-magnitudes
  "update-magnitudes - `java.util.List`"
  ([^CompactModelAndGradient this ^java.util.List update-magnitudes]
    (-> this (.setUpdateMagnitudes update-magnitudes))))

(defn set-score
  "score - `double`"
  ([^CompactModelAndGradient this ^Double score]
    (-> this (.setScore score))))

(defn get-score
  "returns: `double`"
  (^Double [^CompactModelAndGradient this]
    (-> this (.getScore))))

(defn get-param-magnitudes
  "returns: `java.util.List<java.util.Map<java.lang.String,java.util.List<java.lang.Double>>>`"
  (^java.util.List [^CompactModelAndGradient this]
    (-> this (.getParamMagnitudes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CompactModelAndGradient this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CompactModelAndGradient this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-scores
  "returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^CompactModelAndGradient this]
    (-> this (.getScores))))

