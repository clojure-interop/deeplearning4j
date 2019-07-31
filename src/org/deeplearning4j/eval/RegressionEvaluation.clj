(ns org.deeplearning4j.eval.RegressionEvaluation
  "Evaluation method for the evaluation of regression algorithms.
 Provides the following metrics, for each column:
 - MSE: mean squared error
 - MAE: mean absolute error
 - RMSE: root mean squared error
 - RSE: relative squared error
 - PC: pearson correlation coefficient
 - R^2: coefficient of determination
 See for example: http://www.saedsayad.com/model_evaluation_r.htm
 For classification, see Evaluation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval RegressionEvaluation]))

(defn ->regression-evaluation
  "Constructor.

  Create a regression evaluation object with the specified number of columns, and specified precision
  for the stats() method.

  n-columns - Number of columns - `long`
  precision - `long`"
  (^RegressionEvaluation [^Long n-columns ^Long precision]
    (new RegressionEvaluation n-columns precision))
  (^RegressionEvaluation [^Long n-columns]
    (new RegressionEvaluation n-columns))
  (^RegressionEvaluation []
    (new RegressionEvaluation )))

(def *-default-precision
  "Static Constant.

  type: int"
  RegressionEvaluation/DEFAULT_PRECISION)

(defn averageroot-mean-squared-error
  "Average RMSE across all columns

  returns: `double`"
  (^Double [^RegressionEvaluation this]
    (-> this (.averagerootMeanSquaredError))))

(defn average-r-squared
  "Average R2 across all columns

  returns: R2 score accross all columns - `double`"
  (^Double [^RegressionEvaluation this]
    (-> this (.averageRSquared))))

(defn correlation-r-2
  "Deprecated. Use pearsonCorrelation(int) instead.
  For the R2 score use rSquared(int).

  column - Column to evaluate - `int`

  returns: Pearson Correlation for the given column - `double`"
  (^Double [^RegressionEvaluation this ^Integer column]
    (-> this (.correlationR2 column))))

(defn reset
  ""
  ([^RegressionEvaluation this]
    (-> this (.reset))))

(defn mean-absolute-error
  "column - `int`

  returns: `double`"
  (^Double [^RegressionEvaluation this ^Integer column]
    (-> this (.meanAbsoluteError column))))

(defn r-squared
  "Coefficient of Determination (R^2 Score)

  column - Column to evaluate - `int`

  returns: R^2 score for column with index column - `double`"
  (^Double [^RegressionEvaluation this ^Integer column]
    (-> this (.rSquared column))))

(defn eval
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^RegressionEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predictions ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.eval labels predictions mask-array)))
  ([^RegressionEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predictions]
    (-> this (.eval labels predictions))))

(defn score-for-metric
  "metric - `org.deeplearning4j.eval.RegressionEvaluation$Metric`

  returns: `double`"
  (^Double [^RegressionEvaluation this ^org.deeplearning4j.eval.RegressionEvaluation$Metric metric]
    (-> this (.scoreForMetric metric))))

(defn average-pearson-correlation
  "Average Pearson Correlation Coefficient across all columns

  returns: Pearson Correlation Coefficient across all columns - `double`"
  (^Double [^RegressionEvaluation this]
    (-> this (.averagePearsonCorrelation))))

(defn relative-squared-error
  "column - `int`

  returns: `double`"
  (^Double [^RegressionEvaluation this ^Integer column]
    (-> this (.relativeSquaredError column))))

(defn root-mean-squared-error
  "column - `int`

  returns: `double`"
  (^Double [^RegressionEvaluation this ^Integer column]
    (-> this (.rootMeanSquaredError column))))

(defn mean-squared-error
  "column - `int`

  returns: `double`"
  (^Double [^RegressionEvaluation this ^Integer column]
    (-> this (.meanSquaredError column))))

(defn num-columns
  "returns: `int`"
  (^Integer [^RegressionEvaluation this]
    (-> this (.numColumns))))

(defn averagecorrelation-r-2
  "Deprecated. Use averagePearsonCorrelation() instead.
  For the R2 score use averageRSquared().

  returns: Pearson Correlation averaged over all columns - `double`"
  (^Double [^RegressionEvaluation this]
    (-> this (.averagecorrelationR2))))

(defn pearson-correlation
  "Pearson Correlation Coefficient for samples

  column - Column to evaluate - `int`

  returns: Pearson Correlation Coefficient for column with index column - `double`"
  (^Double [^RegressionEvaluation this ^Integer column]
    (-> this (.pearsonCorrelation column))))

(defn average-mean-absolute-error
  "Average MAE across all columns

  returns: `double`"
  (^Double [^RegressionEvaluation this]
    (-> this (.averageMeanAbsoluteError))))

(defn average-mean-squared-error
  "Average MSE across all columns

  returns: `double`"
  (^Double [^RegressionEvaluation this]
    (-> this (.averageMeanSquaredError))))

(defn merge
  "other - `org.deeplearning4j.eval.RegressionEvaluation`"
  ([^RegressionEvaluation this ^org.deeplearning4j.eval.RegressionEvaluation other]
    (-> this (.merge other))))

(defn averagerelative-squared-error
  "Average RSE across all columns

  returns: `double`"
  (^Double [^RegressionEvaluation this]
    (-> this (.averagerelativeSquaredError))))

(defn stats
  "returns: `java.lang.String`"
  (^java.lang.String [^RegressionEvaluation this]
    (-> this (.stats))))

