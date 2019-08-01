(ns org.deeplearning4j.eval.EvaluationUtils
  "Utility methods for performing evaluation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval EvaluationUtils]))

(defn ->evaluation-utils
  "Constructor."
  (^EvaluationUtils []
    (new EvaluationUtils )))

(defn *precision
  "Calculate the precision from true positive and false positive counts

  tp-count - True positive count - `long`
  fp-count - False positive count - `long`
  edge-case - Edge case value use to avoid 0/0 - `double`

  returns: Precision - `double`"
  (^Double [^Long tp-count ^Long fp-count ^Double edge-case]
    (EvaluationUtils/precision tp-count fp-count edge-case)))

(defn *recall
  "Calculate the recall from true positive and false negative counts

  tp-count - True positive count - `long`
  fn-count - False negative count - `long`
  edge-case - Edge case values used to avoid 0/0 - `double`

  returns: Recall - `double`"
  (^Double [^Long tp-count ^Long fn-count ^Double edge-case]
    (EvaluationUtils/recall tp-count fn-count edge-case)))

(defn *false-negative-rate
  "Calculate the false negative rate from the false negative counts and true positive count

  fn-count - False negative count - `long`
  tp-count - True positive count - `long`
  edge-case - Edge case value to use to avoid 0/0 - `double`

  returns: False negative rate - `double`"
  (^Double [^Long fn-count ^Long tp-count ^Double edge-case]
    (EvaluationUtils/falseNegativeRate fn-count tp-count edge-case)))

(defn *reshape-time-series-to-2d
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray labels]
    (EvaluationUtils/reshapeTimeSeriesTo2d labels)))

(defn *g-measure
  "Calculate the G-measure from precision and recall

  precision - Precision value - `double`
  recall - Recall value - `double`

  returns: G-measure - `double`"
  (^Double [^Double precision ^Double recall]
    (EvaluationUtils/gMeasure precision recall)))

(defn *matthews-correlation
  "Calculate the binary Matthews correlation coefficient from counts

  tp - True positive count - `long`
  fp - False positive counts - `long`
  fn - False negative counts - `long`
  tn - True negative count - `long`

  returns: Matthews correlation coefficient - `double`"
  (^Double [^Long tp ^Long fp ^Long fn ^Long tn]
    (EvaluationUtils/matthewsCorrelation tp fp fn tn)))

(defn *extract-non-masked-time-steps
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  predicted - `org.nd4j.linalg.api.ndarray.INDArray`
  output-mask - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predicted ^org.nd4j.linalg.api.ndarray.INDArray output-mask]
    (EvaluationUtils/extractNonMaskedTimeSteps labels predicted output-mask)))

(defn *false-positive-rate
  "Calculate the false positive rate from the false positive count and true negative count

  fp-count - False positive count - `long`
  tn-count - True negative count - `long`
  edge-case - Edge case values are used to avoid 0/0 - `double`

  returns: False positive rate - `double`"
  (^Double [^Long fp-count ^Long tn-count ^Double edge-case]
    (EvaluationUtils/falsePositiveRate fp-count tn-count edge-case)))

(defn *f-beta
  "Calculate the F beta value from counts

  beta - Beta of value to use - `double`
  tp - True positive count - `long`
  fp - False positive count - `long`
  fn - False negative count - `long`

  returns: F beta - `double`"
  (^Double [^Double beta ^Long tp ^Long fp ^Long fn]
    (EvaluationUtils/fBeta beta tp fp fn))
  (^Double [^Double beta ^Double precision ^Double recall]
    (EvaluationUtils/fBeta beta precision recall)))

