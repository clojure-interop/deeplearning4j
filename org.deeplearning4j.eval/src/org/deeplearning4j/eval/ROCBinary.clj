(ns org.deeplearning4j.eval.ROCBinary
  "ROC (Receiver Operating Characteristic) for multi-task binary classifiers.
 As per ROC, ROCBinary supports both exact (thersholdSteps == 0) and thresholded; see ROC for details.

 Unlike ROC (which supports a single binary label (as a single column probability, or 2 column 'softmax' probability
 distribution), ROCBinary assumes that all outputs are independent binary variables. This also differs from
 ROCMultiClass, which should be used for multi-class (single non-binary) cases.

 ROCBinary supports per-example and per-output masking: for per-output masking, any particular output may be absent
 (mask value 0) and hence won't be included in the calculated ROC."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval ROCBinary]))

(defn ->roc-binary
  "Constructor.

  threshold-steps - Number of threshold steps to use for the ROC calculation. If set to 0: use exact calculation - `int`
  roc-remove-redundant-pts - Usually set to true. If true, remove any redundant points from ROC and P-R curves - `boolean`"
  (^ROCBinary [^Integer threshold-steps ^Boolean roc-remove-redundant-pts]
    (new ROCBinary threshold-steps roc-remove-redundant-pts))
  (^ROCBinary [^Integer threshold-steps]
    (new ROCBinary threshold-steps))
  (^ROCBinary []
    (new ROCBinary )))

(def *-default-stats-precision
  "Static Constant.

  type: int"
  ROCBinary/DEFAULT_STATS_PRECISION)

(defn get-roc-curve
  "Get the ROC curve for the specified output

  output-num - Number of the output to get the ROC curve for - `int`

  returns: ROC curve - `org.deeplearning4j.eval.curves.RocCurve`"
  (^org.deeplearning4j.eval.curves.RocCurve [^ROCBinary this ^Integer output-num]
    (-> this (.getRocCurve output-num))))

(defn get-count-actual-negative
  "Get the actual negative count (accounting for any masking) for the specified output/column

  output-num - Index of the output (0 to numLabels()-1) - `int`

  returns: `long`"
  (^Long [^ROCBinary this ^Integer output-num]
    (-> this (.getCountActualNegative output-num))))

(defn get-precision-recall-curve
  "Get the Precision-Recall curve for the specified output

  output-num - Number of the output to get the P-R curve for - `int`

  returns: Precision recall curve - `org.deeplearning4j.eval.curves.PrecisionRecallCurve`"
  (^org.deeplearning4j.eval.curves.PrecisionRecallCurve [^ROCBinary this ^Integer output-num]
    (-> this (.getPrecisionRecallCurve output-num))))

(defn reset
  ""
  ([^ROCBinary this]
    (-> this (.reset))))

(defn calculate-average-auc
  "Macro-average AUC for all outcomes

  returns: the (macro-)average AUC for all outcomes. - `double`"
  (^Double [^ROCBinary this]
    (-> this (.calculateAverageAuc))))

(defn eval
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  network-predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ROCBinary this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.eval labels network-predictions mask-array)))
  ([^ROCBinary this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions]
    (-> this (.eval labels network-predictions))))

(defn calculate-aucpr
  "Calculate the AUCPR - Area Under Curve - Precision Recall
  Utilizes trapezoidal integration internally

  output-num - Output number to calculate AUCPR for - `int`

  returns: AUCPR - `double`"
  (^Double [^ROCBinary this ^Integer output-num]
    (-> this (.calculateAUCPR output-num))))

(defn get-count-actual-positive
  "Get the actual positive count (accounting for any masking) for the specified output/column

  output-num - Index of the output (0 to numLabels()-1) - `int`

  returns: `long`"
  (^Long [^ROCBinary this ^Integer output-num]
    (-> this (.getCountActualPositive output-num))))

(defn set-label-names
  "Set the label names, for printing via stats()

  labels - `java.util.List`"
  ([^ROCBinary this ^java.util.List labels]
    (-> this (.setLabelNames labels))))

(defn num-labels
  "Returns the number of labels - (i.e., size of the prediction/labels arrays) - if known. Returns -1 otherwise

  returns: `int`"
  (^Integer [^ROCBinary this]
    (-> this (.numLabels))))

(defn calculate-average-aucpr
  "returns: the (macro-)average AUPRC (area under precision recall curve) - `double`"
  (^Double [^ROCBinary this]
    (-> this (.calculateAverageAUCPR))))

(defn calculate-auc
  "Calculate the AUC - Area Under (ROC) Curve
  Utilizes trapezoidal integration internally

  output-num - Output number to calculate AUC for - `int`

  returns: AUC - `double`"
  (^Double [^ROCBinary this ^Integer output-num]
    (-> this (.calculateAUC output-num))))

(defn merge
  "other - `org.deeplearning4j.eval.ROCBinary`"
  ([^ROCBinary this ^org.deeplearning4j.eval.ROCBinary other]
    (-> this (.merge other))))

(defn stats
  "print-precision - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^ROCBinary this ^Integer print-precision]
    (-> this (.stats print-precision)))
  (^java.lang.String [^ROCBinary this]
    (-> this (.stats))))

