(ns org.deeplearning4j.eval.curves.RocCurve
  "ROC curve: a set of (false positive, true positive) tuples at different thresholds"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.curves RocCurve]))

(defn ->roc-curve
  "Constructor.

  threshold - `double[]`
  fpr - `double[]`
  tpr - `double[]`"
  (^RocCurve [threshold fpr tpr]
    (new RocCurve threshold fpr tpr)))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.eval.curves.RocCurve`"
  (^org.deeplearning4j.eval.curves.RocCurve [^java.lang.String json]
    (RocCurve/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.eval.curves.RocCurve`"
  (^org.deeplearning4j.eval.curves.RocCurve [^java.lang.String yaml]
    (RocCurve/fromYaml yaml)))

(defn num-points
  "returns: The number of points in the curve - `int`"
  (^Integer [^RocCurve this]
    (-> this (.numPoints))))

(defn get-x
  "returns: X axis values - `double[]`"
  ([^RocCurve this]
    (-> this (.getX))))

(defn get-y
  "returns: Y-axis values - `double[]`"
  ([^RocCurve this]
    (-> this (.getY))))

(defn get-title
  "returns: Title for the curve - `java.lang.String`"
  (^java.lang.String [^RocCurve this]
    (-> this (.getTitle))))

(defn get-threshold
  "i - Point number, 0 to numPoints()-1 inclusive - `int`

  returns: Threshold of a given point - `double`"
  (^Double [^RocCurve this ^Integer i]
    (-> this (.getThreshold i))))

(defn get-true-positive-rate
  "i - Point number, 0 to numPoints()-1 inclusive - `int`

  returns: True positive rate of a given point - `double`"
  (^Double [^RocCurve this ^Integer i]
    (-> this (.getTruePositiveRate i))))

(defn get-false-positive-rate
  "i - Point number, 0 to numPoints()-1 inclusive - `int`

  returns: False positive rate of a given point - `double`"
  (^Double [^RocCurve this ^Integer i]
    (-> this (.getFalsePositiveRate i))))

(defn calculate-auc
  "Calculate and return the area under ROC curve

  returns: `double`"
  (^Double [^RocCurve this]
    (-> this (.calculateAUC))))

