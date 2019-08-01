(ns org.deeplearning4j.eval.ROC
  "ROC (Receiver Operating Characteristic) for binary classifiers.
 ROC has 2 modes of operation:
 (a) Thresholded (less memory)
 (b) Exact (default; use numSteps == 0 to set. May not scale to very large datasets)

 Thresholded Is an approximate method, that (for large datasets) may use significantly less memory than exact..
 Whereas exact implementations will automatically calculate the threshold points based on the data set to give a
 'smoother' and more accurate ROC curve (or optimal cut points for diagnostic purposes), thresholded uses fixed steps
 of size 1.0 / thresholdSteps, as this allows easy implementation for batched and distributed evaluation scenarios (where the
 full data set is not available in memory on any one machine at once).
 Note that in some cases (very skewed probability predictions, for example) the threshold approach can be inaccurate,
 often underestimating the true area.

 The data is assumed to be binary classification - nColumns == 1 (single binary output variable) or nColumns == 2
 (probability distribution over 2 classes, with column 1 being values for 'positive' examples)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval ROC]))

(defn ->roc
  "Constructor.

  threshold-steps - Number of threshold steps to use for the ROC calculation. If set to 0: use exact calculation - `int`
  roc-remove-redundant-pts - Usually set to true. If true, remove any redundant points from ROC and P-R curves - `boolean`
  exact-alloc-block-size - if using exact mode, the block size relocation. Users can likely use the defaultsetting in almost all cases - `int`"
  (^ROC [^Integer threshold-steps ^Boolean roc-remove-redundant-pts ^Integer exact-alloc-block-size]
    (new ROC threshold-steps roc-remove-redundant-pts exact-alloc-block-size))
  (^ROC [^Integer threshold-steps ^Boolean roc-remove-redundant-pts]
    (new ROC threshold-steps roc-remove-redundant-pts))
  (^ROC [^Integer threshold-steps]
    (new ROC threshold-steps))
  (^ROC []
    (new ROC )))

(defn reset
  ""
  ([^ROC this]
    (-> this (.reset))))

(defn stats
  "returns: `java.lang.String`"
  (^java.lang.String [^ROC this]
    (-> this (.stats))))

(defn eval
  "Evaluate (collect statistics for) the given minibatch of data.
  For time series (3 dimensions) use BaseEvaluation.evalTimeSeries(INDArray, INDArray) or BaseEvaluation.evalTimeSeries(INDArray, INDArray, INDArray)

  labels - Labels / true outcomes - `org.nd4j.linalg.api.ndarray.INDArray`
  predictions - Predictions - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ROC this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predictions]
    (-> this (.eval labels predictions))))

(defn get-precision-recall-curve
  "Get the precision recall curve as array.
  return[0] = threshold array
  return[1] = precision array
  return[2] = recall array

  returns: `org.deeplearning4j.eval.curves.PrecisionRecallCurve`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve [^ROC this]
    (-> this (.getPrecisionRecallCurve))))

(defn get-roc-curve
  "Get the ROC curve, as a set of (threshold, falsePositive, truePositive) points

  returns: ROC curve - `org.deeplearning4j.eval.curves.RocCurve`"
  (^org.deeplearning4j.eval.curves.RocCurve [^ROC this]
    (-> this (.getRocCurve))))

(defn calculate-auc
  "Calculate the AUROC - Area Under ROC Curve
  Utilizes trapezoidal integration internally

  returns: AUC - `double`"
  (^Double [^ROC this]
    (-> this (.calculateAUC))))

(defn calculate-aucpr
  "Calculate the area under the precision/recall curve - aka AUCPR

  returns: `double`"
  (^Double [^ROC this]
    (-> this (.calculateAUCPR))))

(defn merge
  "Merge this ROC instance with another.
  This ROC instance is modified, by adding the stats from the other instance.

  other - ROC instance to combine with this one - `org.deeplearning4j.eval.ROC`"
  ([^ROC this ^org.deeplearning4j.eval.ROC other]
    (-> this (.merge other))))

