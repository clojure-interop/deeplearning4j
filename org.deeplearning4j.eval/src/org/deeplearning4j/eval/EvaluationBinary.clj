(ns org.deeplearning4j.eval.EvaluationBinary
  "EvaluationBinary: used for evaluating networks with binary classification outputs. The typical classification metrics,
 such as accuracy, precision, recall, F1 score, etc. are calculated for each output.
 Note that ROCBinary is also used internally to calculate AUC for each output, but only when using an
 appropriate constructor, EvaluationBinary(int, Integer)

 Note that EvaluationBinary supports both per-example and per-output masking.
 EvaluationBinary by default uses a decision threshold of 0.5, however decision thresholds can be set on a per-output
 basis using EvaluationBinary(INDArray).

 The most common use case: multi-task networks, where each output is a binary value. This differs from Evaluation
 in that Evaluation is for a single class (binary or non-binary) evaluation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval EvaluationBinary]))

(defn ->evaluation-binary
  "Constructor.

  This constructor allows for ROC to be calculated in addition to the standard evaluation metrics, when the
  rocBinarySteps arg is non-null. See ROCBinary for more details

  size - Number of outputs - `int`
  roc-binary-steps - Constructor arg for ROCBinary.ROCBinary(int) - `java.lang.Integer`"
  (^EvaluationBinary [^Integer size ^java.lang.Integer roc-binary-steps]
    (new EvaluationBinary size roc-binary-steps))
  (^EvaluationBinary [^org.nd4j.linalg.api.ndarray.INDArray decision-threshold]
    (new EvaluationBinary decision-threshold)))

(def *-default-precision
  "Static Constant.

  type: int"
  EvaluationBinary/DEFAULT_PRECISION)

(def *-default-edge-value
  "Static Constant.

  type: double"
  EvaluationBinary/DEFAULT_EDGE_VALUE)

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.eval.EvaluationBinary`"
  (^org.deeplearning4j.eval.EvaluationBinary [^java.lang.String json]
    (EvaluationBinary/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.eval.EvaluationBinary`"
  (^org.deeplearning4j.eval.EvaluationBinary [^java.lang.String yaml]
    (EvaluationBinary/fromYaml yaml)))

(defn total-count
  "Get the total number of values for the specified column, accounting for any masking

  output-num - `int`

  returns: `int`"
  (^Integer [^EvaluationBinary this ^Integer output-num]
    (-> this (.totalCount output-num))))

(defn precision
  "Get the precision (tp / (tp  fp)) for the specified output

  output-num - `int`

  returns: `double`"
  (^Double [^EvaluationBinary this ^Integer output-num]
    (-> this (.precision output-num))))

(defn average-precision
  "returns: `double`"
  (^Double [^EvaluationBinary this]
    (-> this (.averagePrecision))))

(defn recall
  "Get the recall (tp / (tp  fn)) for the specified output

  output-num - `int`

  returns: `double`"
  (^Double [^EvaluationBinary this ^Integer output-num]
    (-> this (.recall output-num))))

(defn false-negative-rate
  "Returns the false negative rate for a given label

  class-label - the label - `java.lang.Integer`
  edge-case - What to output in case of 0/0 - `double`

  returns: fnr as a double - `double`"
  (^Double [^EvaluationBinary this ^java.lang.Integer class-label ^Double edge-case]
    (-> this (.falseNegativeRate class-label edge-case)))
  (^Double [^EvaluationBinary this ^java.lang.Integer class-label]
    (-> this (.falseNegativeRate class-label))))

(defn average-recall
  "returns: `double`"
  (^Double [^EvaluationBinary this]
    (-> this (.averageRecall))))

(defn g-measure
  "Calculate the G-measure for the given output

  output - The specified output - `int`

  returns: The G-measure for the specified output - `double`"
  (^Double [^EvaluationBinary this ^Integer output]
    (-> this (.gMeasure output))))

(defn eval-time-series
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^EvaluationBinary this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predictions ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.evalTimeSeries labels predictions labels-mask))))

(defn reset
  ""
  ([^EvaluationBinary this]
    (-> this (.reset))))

(defn matthews-correlation
  "Calculate the Matthews correlation coefficient for the specified output

  output-num - Output number - `int`

  returns: Matthews correlation coefficient - `double`"
  (^Double [^EvaluationBinary this ^Integer output-num]
    (-> this (.matthewsCorrelation output-num))))

(defn average-f-1
  "returns: `double`"
  (^Double [^EvaluationBinary this]
    (-> this (.averageF1))))

(defn eval
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  network-predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^EvaluationBinary this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.eval labels network-predictions mask-array)))
  ([^EvaluationBinary this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions]
    (-> this (.eval labels network-predictions))))

(defn average-accuracy
  "returns: `double`"
  (^Double [^EvaluationBinary this]
    (-> this (.averageAccuracy))))

(defn false-positives
  "Get the false positives count for the specified output

  output-num - `int`

  returns: `int`"
  (^Integer [^EvaluationBinary this ^Integer output-num]
    (-> this (.falsePositives output-num))))

(defn true-negatives
  "Get the true negatives count for the specified output

  output-num - `int`

  returns: `int`"
  (^Integer [^EvaluationBinary this ^Integer output-num]
    (-> this (.trueNegatives output-num))))

(defn f-1
  "Get the F1 score for the specified output

  output-num - `int`

  returns: `double`"
  (^Double [^EvaluationBinary this ^Integer output-num]
    (-> this (.f1 output-num))))

(defn false-negatives
  "Get the false negatives count for the specified output

  output-num - `int`

  returns: `int`"
  (^Integer [^EvaluationBinary this ^Integer output-num]
    (-> this (.falseNegatives output-num))))

(defn set-label-names
  "Set the label names, for printing via stats()

  labels - `java.util.List`"
  ([^EvaluationBinary this ^java.util.List labels]
    (-> this (.setLabelNames labels))))

(defn true-positives
  "Get the true positives count for the specified output

  output-num - `int`

  returns: `int`"
  (^Integer [^EvaluationBinary this ^Integer output-num]
    (-> this (.truePositives output-num))))

(defn get-roc-binary
  "Returns the ROCBinary instance, if present

  returns: `org.deeplearning4j.eval.ROCBinary`"
  (^org.deeplearning4j.eval.ROCBinary [^EvaluationBinary this]
    (-> this (.getROCBinary))))

(defn false-positive-rate
  "Returns the false positive rate for a given label

  class-label - the label - `int`
  edge-case - What to output in case of 0/0 - `double`

  returns: fpr as a double - `double`"
  (^Double [^EvaluationBinary this ^Integer class-label ^Double edge-case]
    (-> this (.falsePositiveRate class-label edge-case)))
  (^Double [^EvaluationBinary this ^Integer class-label]
    (-> this (.falsePositiveRate class-label))))

(defn num-labels
  "Returns the number of labels - (i.e., size of the prediction/labels arrays) - if known. Returns -1 otherwise

  returns: `int`"
  (^Integer [^EvaluationBinary this]
    (-> this (.numLabels))))

(defn accuracy
  "Get the accuracy for the specified output

  output-num - `int`

  returns: `double`"
  (^Double [^EvaluationBinary this ^Integer output-num]
    (-> this (.accuracy output-num))))

(defn merge
  "other - `org.deeplearning4j.eval.EvaluationBinary`"
  ([^EvaluationBinary this ^org.deeplearning4j.eval.EvaluationBinary other]
    (-> this (.merge other))))

(defn f-beta
  "Calculate the F-beta value for the given output

  beta - Beta value to use - `double`
  output-num - Output number - `int`

  returns: F-beta for the given output - `double`"
  (^Double [^EvaluationBinary this ^Double beta ^Integer output-num]
    (-> this (.fBeta beta output-num))))

(defn stats
  "Get a String representation of the EvaluationBinary class, using the specified precision

  print-precision - The precision (number of decimal places) for the accuracy, f1, etc. - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^EvaluationBinary this ^Integer print-precision]
    (-> this (.stats print-precision)))
  (^java.lang.String [^EvaluationBinary this]
    (-> this (.stats))))

