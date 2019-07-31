(ns org.deeplearning4j.eval.curves.BaseCurve
  "Abstract class for ROC and Precision recall curves"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.curves BaseCurve]))

(defn ->base-curve
  "Constructor."
  (^BaseCurve []
    (new BaseCurve )))

(def *-default-format-prec
  "Static Constant.

  type: int"
  BaseCurve/DEFAULT_FORMAT_PREC)

(defn *from-json
  "json - JSON representation - `java.lang.String`
  curve-class - Class for the curve - `java.lang.Class`

  returns: Instance of the curve - `<T extends org.deeplearning4j.eval.curves.BaseCurve> T`"
  ([^java.lang.String json ^java.lang.Class curve-class]
    (BaseCurve/fromJson json curve-class)))

(defn *from-yaml
  "yaml - YAML representation - `java.lang.String`
  curve-class - Class for the curve - `java.lang.Class`

  returns: Instance of the curve - `<T extends org.deeplearning4j.eval.curves.BaseCurve> T`"
  ([^java.lang.String yaml ^java.lang.Class curve-class]
    (BaseCurve/fromYaml yaml curve-class)))

(defn num-points
  "returns: The number of points in the curve - `int`"
  (^Integer [^BaseCurve this]
    (-> this (.numPoints))))

(defn get-x
  "returns: X axis values - `double[]`"
  ([^BaseCurve this]
    (-> this (.getX))))

(defn get-y
  "returns: Y-axis values - `double[]`"
  ([^BaseCurve this]
    (-> this (.getY))))

(defn get-title
  "returns: Title for the curve - `java.lang.String`"
  (^java.lang.String [^BaseCurve this]
    (-> this (.getTitle))))

(defn to-json
  "returns: JSON representation of the curve - `java.lang.String`"
  (^java.lang.String [^BaseCurve this]
    (-> this (.toJson))))

(defn to-yaml
  "returns: YAML representation of the curve - `java.lang.String`"
  (^java.lang.String [^BaseCurve this]
    (-> this (.toYaml))))

