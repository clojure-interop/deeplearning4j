(ns org.deeplearning4j.eval.curves.BaseHistogram
  "Created by Alex on 06/07/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.curves BaseHistogram]))

(defn ->base-histogram
  "Constructor."
  (^BaseHistogram []
    (new BaseHistogram )))

(defn *from-json
  "json - JSON representation - `java.lang.String`
  curve-class - Class for the curve - `java.lang.Class`

  returns: Instance of the curve - `<T extends org.deeplearning4j.eval.curves.BaseHistogram> T`"
  ([^java.lang.String json ^java.lang.Class curve-class]
    (BaseHistogram/fromJson json curve-class)))

(defn *from-yaml
  "yaml - YAML representation - `java.lang.String`
  curve-class - Class for the curve - `java.lang.Class`

  returns: Instance of the curve - `<T extends org.deeplearning4j.eval.curves.BaseHistogram> T`"
  ([^java.lang.String yaml ^java.lang.Class curve-class]
    (BaseHistogram/fromYaml yaml curve-class)))

(defn get-title
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseHistogram this]
    (-> this (.getTitle))))

(defn num-points
  "returns: `int`"
  (^Integer [^BaseHistogram this]
    (-> this (.numPoints))))

(defn get-bin-counts
  "returns: `int[]`"
  ([^BaseHistogram this]
    (-> this (.getBinCounts))))

(defn get-bin-lower-bounds
  "returns: `double[]`"
  ([^BaseHistogram this]
    (-> this (.getBinLowerBounds))))

(defn get-bin-upper-bounds
  "returns: `double[]`"
  ([^BaseHistogram this]
    (-> this (.getBinUpperBounds))))

(defn get-bin-mid-values
  "returns: `double[]`"
  ([^BaseHistogram this]
    (-> this (.getBinMidValues))))

(defn to-json
  "returns: JSON representation of the curve - `java.lang.String`"
  (^java.lang.String [^BaseHistogram this]
    (-> this (.toJson))))

(defn to-yaml
  "returns: YAML representation of the curve - `java.lang.String`"
  (^java.lang.String [^BaseHistogram this]
    (-> this (.toYaml))))

