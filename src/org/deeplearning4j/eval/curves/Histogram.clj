(ns org.deeplearning4j.eval.curves.Histogram
  "A simple histogram used in evaluation classes, such as EvaluationCalibration"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.curves Histogram]))

(defn ->histogram
  "Constructor.

  title - `java.lang.String`
  lower - `double`
  upper - `double`
  bin-counts - `int[]`"
  (^Histogram [^java.lang.String title ^Double lower ^Double upper bin-counts]
    (new Histogram title lower upper bin-counts)))

(defn *from-json
  "json - JSON representation - `java.lang.String`

  returns: Instance of the histogram - `org.deeplearning4j.eval.curves.Histogram`"
  (^org.deeplearning4j.eval.curves.Histogram [^java.lang.String json]
    (Histogram/fromJson json)))

(defn *from-yaml
  "yaml - YAML representation - `java.lang.String`

  returns: Instance of the histogram - `org.deeplearning4j.eval.curves.Histogram`"
  (^org.deeplearning4j.eval.curves.Histogram [^java.lang.String yaml]
    (Histogram/fromYaml yaml)))

(defn num-points
  "returns: `int`"
  (^Integer [^Histogram this]
    (-> this (.numPoints))))

(defn get-bin-lower-bounds
  "returns: `double[]`"
  ([^Histogram this]
    (-> this (.getBinLowerBounds))))

(defn get-bin-upper-bounds
  "returns: `double[]`"
  ([^Histogram this]
    (-> this (.getBinUpperBounds))))

(defn get-bin-mid-values
  "returns: `double[]`"
  ([^Histogram this]
    (-> this (.getBinMidValues))))

