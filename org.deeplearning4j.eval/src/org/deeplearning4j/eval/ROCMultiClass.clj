(ns org.deeplearning4j.eval.ROCMultiClass
  "ROC (Receiver Operating Characteristic) for multi-class classifiers.
 As per ROC, ROCBinary supports both exact (thersholdSteps == 0) and thresholded; see ROC for details.

 The ROC curves are produced by treating the predictions as a set of one-vs-all classifiers, and then calculating
 ROC curves for each. In practice, this means for N classes, we get N ROC curves."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval ROCMultiClass]))

(defn ->roc-multi-class
  "Constructor.

  threshold-steps - Number of threshold steps to use for the ROC calculation. If set to 0: use exact calculation - `int`
  roc-remove-redundant-pts - Usually set to true. If true, remove any redundant points from ROC and P-R curves - `boolean`"
  (^ROCMultiClass [^Integer threshold-steps ^Boolean roc-remove-redundant-pts]
    (new ROCMultiClass threshold-steps roc-remove-redundant-pts))
  (^ROCMultiClass [^Integer threshold-steps]
    (new ROCMultiClass threshold-steps))
  (^ROCMultiClass []
    (new ROCMultiClass )))

(def *-default-stats-precision
  "Static Constant.

  type: int"
  ROCMultiClass/DEFAULT_STATS_PRECISION)

(defn get-roc-curve
  "Get the (one vs. all) ROC curve for the specified class

  class-idx - Class index to get the ROC curve for - `int`

  returns: ROC curve for the given class - `org.deeplearning4j.eval.curves.RocCurve`"
  (^org.deeplearning4j.eval.curves.RocCurve [^ROCMultiClass this ^Integer class-idx]
    (-> this (.getRocCurve class-idx))))

(defn calculate-average-auc
  "Calculate the macro-average (one-vs-all) AUC for all classes

  returns: `double`"
  (^Double [^ROCMultiClass this]
    (-> this (.calculateAverageAUC))))

(defn get-num-classes
  "returns: `int`"
  (^Integer [^ROCMultiClass this]
    (-> this (.getNumClasses))))

(defn get-count-actual-negative
  "Get the actual negative count (accounting for any masking) for the specified output/column

  output-num - Index of the class - `int`

  returns: `long`"
  (^Long [^ROCMultiClass this ^Integer output-num]
    (-> this (.getCountActualNegative output-num))))

(defn get-precision-recall-curve
  "Get the (one vs. all) Precision-Recall curve for the specified class

  class-idx - Class to get the P-R curve for - `int`

  returns: Precision recall curve for the given class - `org.deeplearning4j.eval.curves.PrecisionRecallCurve`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve [^ROCMultiClass this ^Integer class-idx]
    (-> this (.getPrecisionRecallCurve class-idx))))

(defn reset
  ""
  ([^ROCMultiClass this]
    (-> this (.reset))))

(defn eval
  "Evaluate (collect statistics for) the given minibatch of data.
  For time series (3 dimensions) use BaseEvaluation.evalTimeSeries(INDArray, INDArray) or BaseEvaluation.evalTimeSeries(INDArray, INDArray, INDArray)

  labels - Labels / true outcomes - `org.nd4j.linalg.api.ndarray.INDArray`
  predictions - Predictions - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ROCMultiClass this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predictions]
    (-> this (.eval labels predictions))))

(defn calculate-aucpr
  "Calculate the AUPRC - Area Under Curve Precision Recall
  Utilizes trapezoidal integration internally

  class-idx - `int`

  returns: AUC - `double`"
  (^Double [^ROCMultiClass this ^Integer class-idx]
    (-> this (.calculateAUCPR class-idx))))

(defn get-count-actual-positive
  "Get the actual positive count (accounting for any masking) for the specified class

  output-num - Index of the class - `int`

  returns: `long`"
  (^Long [^ROCMultiClass this ^Integer output-num]
    (-> this (.getCountActualPositive output-num))))

(defn calculate-average-aucpr
  "Calculate the macro-average (one-vs-all) AUCPR (area under precision recall curve) for all classes

  returns: `double`"
  (^Double [^ROCMultiClass this]
    (-> this (.calculateAverageAUCPR))))

(defn calculate-auc
  "Calculate the AUC - Area Under ROC Curve
  Utilizes trapezoidal integration internally

  class-idx - `int`

  returns: AUC - `double`"
  (^Double [^ROCMultiClass this ^Integer class-idx]
    (-> this (.calculateAUC class-idx))))

(defn merge
  "Merge this ROCMultiClass instance with another.
  This ROCMultiClass instance is modified, by adding the stats from the other instance.

  other - ROCMultiClass instance to combine with this one - `org.deeplearning4j.eval.ROCMultiClass`"
  ([^ROCMultiClass this ^org.deeplearning4j.eval.ROCMultiClass other]
    (-> this (.merge other))))

(defn stats
  "print-precision - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^ROCMultiClass this ^Integer print-precision]
    (-> this (.stats print-precision)))
  (^java.lang.String [^ROCMultiClass this]
    (-> this (.stats))))

