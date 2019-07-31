(ns org.deeplearning4j.eval.curves.PrecisionRecallCurve
  "Precision recall curve: A set of (recall, precision) points and different thresholds"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.curves PrecisionRecallCurve]))

(defn ->precision-recall-curve
  "Constructor.

  threshold - `double[]`
  precision - `double[]`
  recall - `double[]`
  tp-count - `int[]`
  fp-count - `int[]`
  fn-count - `int[]`
  total-count - `int`"
  (^PrecisionRecallCurve [threshold precision recall tp-count fp-count fn-count ^Integer total-count]
    (new PrecisionRecallCurve threshold precision recall tp-count fp-count fn-count total-count)))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.eval.curves.PrecisionRecallCurve`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve [^java.lang.String json]
    (PrecisionRecallCurve/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.eval.curves.PrecisionRecallCurve`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve [^java.lang.String yaml]
    (PrecisionRecallCurve/fromYaml yaml)))

(defn get-precision
  "i - Point number, 0 to numPoints()-1 inclusive - `int`

  returns: Precision of a given point - `double`"
  (^Double [^PrecisionRecallCurve this ^Integer i]
    (-> this (.getPrecision i))))

(defn get-point-at-recall
  "Get the point (index, threshold, precision, recall) at the given recall.
  Specifically, return the points at the highest threshold that has recall equal to or greater than the
  requested recall.

  recall - Recall to get the point for - `double`

  returns: point (index, threshold, precision, recall) at (or closest exceeding) the given recall - `org.deeplearning4j.eval.curves.PrecisionRecallCurve$Point`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve$Point [^PrecisionRecallCurve this ^Double recall]
    (-> this (.getPointAtRecall recall))))

(defn get-point-at-precision
  "Get the point (index, threshold, precision, recall) at the given precision.
  Specifically, return the points at the lowest threshold that has precision equal to or greater than the
  requested precision.

  precision - Precision to get the point for - `double`

  returns: point (index, threshold, precision, recall) at (or closest exceeding) the given precision - `org.deeplearning4j.eval.curves.PrecisionRecallCurve$Point`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve$Point [^PrecisionRecallCurve this ^Double precision]
    (-> this (.getPointAtPrecision precision))))

(defn get-recall
  "i - Point number, 0 to numPoints()-1 inclusive - `int`

  returns: Recall of a given point - `double`"
  (^Double [^PrecisionRecallCurve this ^Integer i]
    (-> this (.getRecall i))))

(defn get-point-at-threshold
  "Get the point (index, threshold, precision, recall) at the given threshold.
  Note that if the threshold is not found exactly, the next highest threshold exceeding the requested threshold
  is returned

  threshold - Threshold to get the point for - `double`

  returns: point (index, threshold, precision, recall) at the given threshold - `org.deeplearning4j.eval.curves.PrecisionRecallCurve$Point`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve$Point [^PrecisionRecallCurve this ^Double threshold]
    (-> this (.getPointAtThreshold threshold))))

(defn get-y
  "returns: Y-axis values - `double[]`"
  ([^PrecisionRecallCurve this]
    (-> this (.getY))))

(defn get-x
  "returns: X axis values - `double[]`"
  ([^PrecisionRecallCurve this]
    (-> this (.getX))))

(defn get-confusion-matrix-at-point
  "Get the binary confusion matrix for the given position. As per getPointAtThreshold(double).

  point - Position at which to get the binary confusion matrix - `int`

  returns: Binary confusion matrix - `org.deeplearning4j.eval.curves.PrecisionRecallCurve$Confusion`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve$Confusion [^PrecisionRecallCurve this ^Integer point]
    (-> this (.getConfusionMatrixAtPoint point))))

(defn get-confusion-matrix-at-threshold
  "Get the binary confusion matrix for the given threshold. As per getPointAtThreshold(double),
  if the threshold is not found exactly, the next highest threshold exceeding the requested threshold
  is returned

  threshold - Threshold at which to get the confusion matrix - `double`

  returns: Binary confusion matrix - `org.deeplearning4j.eval.curves.PrecisionRecallCurve$Confusion`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve$Confusion [^PrecisionRecallCurve this ^Double threshold]
    (-> this (.getConfusionMatrixAtThreshold threshold))))

(defn num-points
  "returns: The number of points in the curve - `int`"
  (^Integer [^PrecisionRecallCurve this]
    (-> this (.numPoints))))

(defn get-threshold
  "i - Point number, 0 to numPoints()-1 inclusive - `int`

  returns: Threshold of a given point - `double`"
  (^Double [^PrecisionRecallCurve this ^Integer i]
    (-> this (.getThreshold i))))

(defn calculate-auprc
  "returns: The area under the precision recall curve - `double`"
  (^Double [^PrecisionRecallCurve this]
    (-> this (.calculateAUPRC))))

(defn get-title
  "returns: Title for the curve - `java.lang.String`"
  (^java.lang.String [^PrecisionRecallCurve this]
    (-> this (.getTitle))))

