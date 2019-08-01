(ns org.deeplearning4j.eval.EvaluationCalibration
  "EvaluationCalibration is an evaluation class designed to analyze the calibration of a classifier.
 It provides a number of tools for this purpose:
 - Counts of the number of labels and predictions for each class
 - Reliability diagram (or reliability curve)
 - Residual plot (histogram)
 - Histograms of probabilities, including probabilities for each class separately

 References:
 - Reliability diagram: see for example Niculescu-Mizil and Caruana 2005, Predicting Good Probabilities With
 Supervised Learning
 - Residual plot: see Wallace and Dahabreh 2012, Class Probability Estimates are Unreliable for Imbalanced Data
 (and How to Fix Them)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval EvaluationCalibration]))

(defn ->evaluation-calibration
  "Constructor.

  Create an EvaluationCalibration instance with the specified number of bins

  reliability-diag-num-bins - Number of bins for the reliability diagram (usually 10) - `int`
  histogram-num-bins - Number of bins for the histograms - `int`
  exclude-empty-bins - For the reliability diagram, whether empty bins should be excluded - `boolean`"
  (^EvaluationCalibration [^Integer reliability-diag-num-bins ^Integer histogram-num-bins ^Boolean exclude-empty-bins]
    (new EvaluationCalibration reliability-diag-num-bins histogram-num-bins exclude-empty-bins))
  (^EvaluationCalibration [^Integer reliability-diag-num-bins ^Integer histogram-num-bins]
    (new EvaluationCalibration reliability-diag-num-bins histogram-num-bins))
  (^EvaluationCalibration []
    (new EvaluationCalibration )))

(def *-default-reliability-diag-num-bins
  "Static Constant.

  type: int"
  EvaluationCalibration/DEFAULT_RELIABILITY_DIAG_NUM_BINS)

(def *-default-histogram-num-bins
  "Static Constant.

  type: int"
  EvaluationCalibration/DEFAULT_HISTOGRAM_NUM_BINS)

(defn get-residual-plot
  "Get the residual plot, only for examples of the specified class.. The residual plot is defined as a histogram of
  |label_i - prob(class_i | input)| for all and examples; for this particular method, only predictions where
  i == labelClassIdx are included.
  In general, small residuals indicate a superior classifier to large residuals.

  label-class-idx - Index of the class to get the residual plot for - `int`

  returns: Residual plot (histogram) - all predictions/classes - `org.deeplearning4j.eval.curves.Histogram`"
  (^org.deeplearning4j.eval.curves.Histogram [^EvaluationCalibration this ^Integer label-class-idx]
    (-> this (.getResidualPlot label-class-idx))))

(defn get-prediction-counts-each-class
  "returns: The number of network predictions for each class. For N classes, be returned array is of length N, with
  out[i] being the number of predicted values (max probability) for class i - `int[]`"
  ([^EvaluationCalibration this]
    (-> this (.getPredictionCountsEachClass))))

(defn get-residual-plot-all-classes
  "Get the residual plot for all classes combined. The residual plot is defined as a histogram of
  |label_i - prob(class_i | input)| for all classes i and examples.
  In general, small residuals indicate a superior classifier to large residuals.

  returns: Residual plot (histogram) - all predictions/classes - `org.deeplearning4j.eval.curves.Histogram`"
  (^org.deeplearning4j.eval.curves.Histogram [^EvaluationCalibration this]
    (-> this (.getResidualPlotAllClasses))))

(defn get-probability-histogram
  "Return a probability histogram of the specified label class index. That is, for label class index i,
  a histogram of P(class_i | input) is returned, only for those examples that are labelled as class i.

  label-class-idx - Index of the label class to get the histogram for - `int`

  returns: Probability histogram - `org.deeplearning4j.eval.curves.Histogram`"
  (^org.deeplearning4j.eval.curves.Histogram [^EvaluationCalibration this ^Integer label-class-idx]
    (-> this (.getProbabilityHistogram label-class-idx))))

(defn reset
  ""
  ([^EvaluationCalibration this]
    (-> this (.reset))))

(defn get-probability-histogram-all-classes
  "Return a probability histogram for all predictions/classes.

  returns: Probability histogram - `org.deeplearning4j.eval.curves.Histogram`"
  (^org.deeplearning4j.eval.curves.Histogram [^EvaluationCalibration this]
    (-> this (.getProbabilityHistogramAllClasses))))

(defn eval
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  network-predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^EvaluationCalibration this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.eval labels network-predictions mask-array)))
  ([^EvaluationCalibration this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions]
    (-> this (.eval labels network-predictions))))

(defn num-classes
  "returns: `int`"
  (^Integer [^EvaluationCalibration this]
    (-> this (.numClasses))))

(defn merge
  "other - `org.deeplearning4j.eval.EvaluationCalibration`"
  ([^EvaluationCalibration this ^org.deeplearning4j.eval.EvaluationCalibration other]
    (-> this (.merge other))))

(defn stats
  "returns: `java.lang.String`"
  (^java.lang.String [^EvaluationCalibration this]
    (-> this (.stats))))

(defn get-label-counts-each-class
  "returns: The number of observed labels for each class. For N classes, be returned array is of length N, with
  out[i] being the number of labels of class i - `int[]`"
  ([^EvaluationCalibration this]
    (-> this (.getLabelCountsEachClass))))

(defn get-reliability-diagram
  "Get the reliability diagram for the specified class

  class-idx - Index of the class to get the reliability diagram for - `int`

  returns: `org.deeplearning4j.eval.curves.ReliabilityDiagram`"
  (^org.deeplearning4j.eval.curves.ReliabilityDiagram [^EvaluationCalibration this ^Integer class-idx]
    (-> this (.getReliabilityDiagram class-idx))))

