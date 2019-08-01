(ns org.deeplearning4j.eval.Evaluation
  "Evaluation metrics:
 - precision, recall, f1, fBeta, accuracy, Matthews correlation coefficient, gMeasure
 - Top N accuracy (if using constructor Evaluation(List, int))
 - Custom binary evaluation decision threshold (use constructor Evaluation(double) (default if not set is
 argmax / 0.5)
 - Custom cost array, using Evaluation(INDArray) or Evaluation(List, INDArray) for multi-class

 Note: Care should be taken when using the Evaluation class for binary classification metrics such as F1, precision,
 recall, etc. There are a number of cases to consider:
 1. For binary classification (1 or 2 network outputs)
 a) Default behaviour: class 1 is assumed as the positive class. Consequently, no-arg methods such as f1(),
 precision(), recall() etc will report the binary metric for class 1 only
 b) To set class 0 as the positive class instead of class 1 (the default), use Evaluation(int, Integer) or
 Evaluation(double, Integer) or #setBinaryPositiveClass(Integer). Then, f1(),
 precision(), recall() etc will report the binary metric for class 0 only.
 c) To use macro-averaged metrics over both classes for binary classification (uncommon and usually not advisable)
 specify 'null' as the argument (instead of 0 or 1) as per (b) above
 2. For multi-class classification, binary metric methods such as f1(), precision(), recall()
 will report macro-average (of the one-vs-all) binary metrics. Note that you can specify micro vs. macro averaging
 using f1(EvaluationAveraging) and similar methods

 Note that setting a custom binary decision threshold is only possible for the binary case (1 or 2 outputs) and cannot
 be used if the number of classes exceeds 2. Predictions with probability > threshold are considered to be class 1,
 and are considered class 0 otherwise.

 Cost arrays (a row vector, of size equal to the number of outputs) modify the evaluation process: instead of simply
 doing predictedClass = argMax(probabilities), we do predictedClass = argMax(cost * probabilities). Consequently, an
 array of all 1s (or, indeed any array of equal values) will result in the same performance as no cost array; non-
 equal values will bias the predictions for or against certain classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval Evaluation]))

(defn ->evaluation
  "Constructor.

  Constructor for specifying the number of classes, and optionally the positive class for binary classification.
  See Evaluation javadoc for more details on evaluation in the binary case

  num-classes - The number of classes for the evaluation. Must be 2, if binaryPositiveClass is non-null - `int`
  binary-positive-class - If non-null, the positive class (0 or 1). - `java.lang.Integer`"
  (^Evaluation [^Integer num-classes ^java.lang.Integer binary-positive-class]
    (new Evaluation num-classes binary-positive-class))
  (^Evaluation [^Integer num-classes]
    (new Evaluation num-classes))
  (^Evaluation []
    (new Evaluation )))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^java.lang.String json]
    (Evaluation/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^java.lang.String yaml]
    (Evaluation/fromYaml yaml)))

(defn increment-true-positives
  "class-label - `java.lang.Integer`"
  ([^Evaluation this ^java.lang.Integer class-label]
    (-> this (.incrementTruePositives class-label))))

(defn false-alarm-rate
  "False Alarm Rate (FAR) reflects rate of misclassified to classified records
  http://ro.ecu.edu.au/cgi/viewcontent.cgi?article=1058&context=isw
  Note: value returned will differ depending on number of classes and settings.
  1. For binary classification, if the positive class is set (via default value of 1, via constructor,
  or via #setBinaryPositiveClass(Integer)), the returned value will be for the specified positive class
  only.
  2. For the multi-class case, or when #getBinaryPositiveClass() is null, the returned value is macro-averaged
  across all classes. i.e., is macro-averaged false alarm rate)

  returns: the fpr for the outcomes - `double`"
  (^Double [^Evaluation this]
    (-> this (.falseAlarmRate))))

(defn get-prediction-by-predicted-class
  "Get a list of predictions, for all data with the specified predicted class, regardless of the actual data
  class.

  Note: Prediction errors are ONLY available if the \"evaluate with metadata\" method is used: eval(INDArray, INDArray, List)
  Otherwise (if the metadata hasn't been recorded via that previously mentioned eval method), there is no value in
  splitting each prediction out into a separate Prediction object - instead, use the confusion matrix to get the counts,
  via getConfusionMatrix()

  predicted-class - Actual class to get predictions for - `int`

  returns: List of predictions, or null if the \"evaluate with metadata\" method was not used - `java.util.List<org.deeplearning4j.eval.meta.Prediction>`"
  (^java.util.List [^Evaluation this ^Integer predicted-class]
    (-> this (.getPredictionByPredictedClass predicted-class))))

(defn precision
  "Returns the precision for a given label

  class-label - the label - `java.lang.Integer`
  edge-case - What to output in case of 0/0 - `double`

  returns: the precision for the label - `double`"
  (^Double [^Evaluation this ^java.lang.Integer class-label ^Double edge-case]
    (-> this (.precision class-label edge-case)))
  (^Double [^Evaluation this ^java.lang.Integer class-label]
    (-> this (.precision class-label)))
  (^Double [^Evaluation this]
    (-> this (.precision))))

(defn positive
  "Returns all of the positive guesses:
  true positive  false negative

  returns: `java.util.Map<java.lang.Integer,java.lang.Integer>`"
  (^java.util.Map [^Evaluation this]
    (-> this (.positive))))

(defn class-count
  "Returns the number of times the given label
  has actually occurred

  clazz - the label - `java.lang.Integer`

  returns: the number of times the label
  actually occurred - `int`"
  (^Integer [^Evaluation this ^java.lang.Integer clazz]
    (-> this (.classCount clazz))))

(defn recall
  "Returns the recall for a given label

  class-label - the label - `int`
  edge-case - What to output in case of 0/0 - `double`

  returns: Recall rate as a double - `double`"
  (^Double [^Evaluation this ^Integer class-label ^Double edge-case]
    (-> this (.recall class-label edge-case)))
  (^Double [^Evaluation this ^Integer class-label]
    (-> this (.recall class-label)))
  (^Double [^Evaluation this]
    (-> this (.recall))))

(defn get-predictions-by-actual-class
  "Get a list of predictions, for all data with the specified actual class, regardless of the predicted
  class.

  Note: Prediction errors are ONLY available if the \"evaluate with metadata\" method is used: eval(INDArray, INDArray, List)
  Otherwise (if the metadata hasn't been recorded via that previously mentioned eval method), there is no value in
  splitting each prediction out into a separate Prediction object - instead, use the confusion matrix to get the counts,
  via getConfusionMatrix()

  actual-class - Actual class to get predictions for - `int`

  returns: List of predictions, or null if the \"evaluate with metadata\" method was not used - `java.util.List<org.deeplearning4j.eval.meta.Prediction>`"
  (^java.util.List [^Evaluation this ^Integer actual-class]
    (-> this (.getPredictionsByActualClass actual-class))))

(defn confusion-matrix
  "Get the confusion matrix as a String

  returns: Confusion matrix as a String - `java.lang.String`"
  (^java.lang.String [^Evaluation this]
    (-> this (.confusionMatrix))))

(defn false-negative-rate
  "Returns the false negative rate for a given label

  class-label - the label - `java.lang.Integer`
  edge-case - What to output in case of 0/0 - `double`

  returns: fnr as a double - `double`"
  (^Double [^Evaluation this ^java.lang.Integer class-label ^Double edge-case]
    (-> this (.falseNegativeRate class-label edge-case)))
  (^Double [^Evaluation this ^java.lang.Integer class-label]
    (-> this (.falseNegativeRate class-label)))
  (^Double [^Evaluation this]
    (-> this (.falseNegativeRate))))

(defn increment-false-positives
  "class-label - `java.lang.Integer`"
  ([^Evaluation this ^java.lang.Integer class-label]
    (-> this (.incrementFalsePositives class-label))))

(defn g-measure
  "Calculate the G-measure for the given output

  output - The specified output - `int`

  returns: The G-measure for the specified output - `double`"
  (^Double [^Evaluation this ^Integer output]
    (-> this (.gMeasure output))))

(defn top-n-accuracy
  "Top N accuracy of the predictions so far. For top N = 1 (default), equivalent to accuracy()

  returns: Top N accuracy - `double`"
  (^Double [^Evaluation this]
    (-> this (.topNAccuracy))))

(defn get-top-n-correct-count
  "Return the number of correct predictions according to top N value. For top N = 1 (default) this is equivalent to
  the number of correct predictions

  returns: Number of correct top N predictions - `int`"
  (^Integer [^Evaluation this]
    (-> this (.getTopNCorrectCount))))

(defn increment-true-negatives
  "class-label - `java.lang.Integer`"
  ([^Evaluation this ^java.lang.Integer class-label]
    (-> this (.incrementTrueNegatives class-label))))

(defn negative
  "Total negatives true negatives  false negatives

  returns: the overall negative count - `java.util.Map<java.lang.Integer,java.lang.Integer>`"
  (^java.util.Map [^Evaluation this]
    (-> this (.negative))))

(defn get-predictions
  "Get a list of predictions in the specified confusion matrix entry (i.e., for the given actua/predicted class pair)

  actual-class - Actual class - `int`
  predicted-class - Predicted class - `int`

  returns: List of predictions that match the specified actual/predicted classes, or null if the \"evaluate with metadata\" method was not used - `java.util.List<org.deeplearning4j.eval.meta.Prediction>`"
  (^java.util.List [^Evaluation this ^Integer actual-class ^Integer predicted-class]
    (-> this (.getPredictions actual-class predicted-class))))

(defn reset
  ""
  ([^Evaluation this]
    (-> this (.reset))))

(defn average-f-beta-num-classes-excluded
  "When calculating the (macro) average FBeta, how many classes are excluded from the average due to
  no predictions – i.e., FBeta would be calculated from a precision or recall of 0/0

  returns: Number of classes excluded from the average FBeta - `int`"
  (^Integer [^Evaluation this]
    (-> this (.averageFBetaNumClassesExcluded))))

(defn matthews-correlation
  "Calculate the binary Mathews correlation coefficient, for the specified class.
  MCC = (TP*TN - FP*FN) / sqrt((TP+FP)(TP+FN)(TN+FP)(TN+FN))

  class-idx - Class index to calculate Matthews correlation coefficient for - `int`

  returns: `double`"
  (^Double [^Evaluation this ^Integer class-idx]
    (-> this (.matthewsCorrelation class-idx))))

(defn get-num-row-counter
  "returns: `int`"
  (^Integer [^Evaluation this]
    (-> this (.getNumRowCounter))))

(defn eval
  "Evaluate the output
  using the given true labels,
  the input to the multi layer network
  and the multi layer network to
  use for evaluation

  true-labels - the labels to ise - `org.nd4j.linalg.api.ndarray.INDArray`
  input - the input to the network to usefor evaluation - `org.nd4j.linalg.api.ndarray.INDArray`
  network - the network to use for output - `org.deeplearning4j.nn.graph.ComputationGraph`"
  ([^Evaluation this ^org.nd4j.linalg.api.ndarray.INDArray true-labels ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.graph.ComputationGraph network]
    (-> this (.eval true-labels input network)))
  ([^Evaluation this ^org.nd4j.linalg.api.ndarray.INDArray real-outcomes ^org.nd4j.linalg.api.ndarray.INDArray guesses]
    (-> this (.eval real-outcomes guesses))))

(defn false-positives
  "False positive: wrong guess

  returns: the count of the false positives - `java.util.Map<java.lang.Integer,java.lang.Integer>`"
  (^java.util.Map [^Evaluation this]
    (-> this (.falsePositives))))

(defn true-negatives
  "True negatives: correctly rejected

  returns: the total true negatives so far - `java.util.Map<java.lang.Integer,java.lang.Integer>`"
  (^java.util.Map [^Evaluation this]
    (-> this (.trueNegatives))))

(defn score-for-metric
  "metric - `org.deeplearning4j.eval.Evaluation$Metric`

  returns: `double`"
  (^Double [^Evaluation this ^org.deeplearning4j.eval.Evaluation$Metric metric]
    (-> this (.scoreForMetric metric))))

(defn average-precision-num-classes-excluded
  "When calculating the (macro) average precision, how many classes are excluded from the average due to
  no predictions – i.e., precision would be the edge case of 0/0

  returns: Number of classes excluded from the average precision - `int`"
  (^Integer [^Evaluation this]
    (-> this (.averagePrecisionNumClassesExcluded))))

(defn average-recall-num-classes-excluded
  "When calculating the (macro) average Recall, how many classes are excluded from the average due to
  no predictions – i.e., recall would be the edge case of 0/0

  returns: Number of classes excluded from the average recall - `int`"
  (^Integer [^Evaluation this]
    (-> this (.averageRecallNumClassesExcluded))))

(defn f-1
  "Calculate f1 score for a given class

  class-label - the label to calculate f1 for - `int`

  returns: the f1 score for the given label - `double`"
  (^Double [^Evaluation this ^Integer class-label]
    (-> this (.f1 class-label)))
  (^Double [^Evaluation this]
    (-> this (.f1))))

(defn increment-false-negatives
  "class-label - `java.lang.Integer`"
  ([^Evaluation this ^java.lang.Integer class-label]
    (-> this (.incrementFalseNegatives class-label))))

(defn false-negatives
  "False negatives: correctly rejected

  returns: the total false negatives so far - `java.util.Map<java.lang.Integer,java.lang.Integer>`"
  (^java.util.Map [^Evaluation this]
    (-> this (.falseNegatives))))

(defn add-to-confusion
  "Adds to the confusion matrix

  real - the actual guess - `java.lang.Integer`
  guess - the system guess - `java.lang.Integer`"
  ([^Evaluation this ^java.lang.Integer real ^java.lang.Integer guess]
    (-> this (.addToConfusion real guess))))

(defn true-positives
  "True positives: correctly rejected

  returns: the total true positives so far - `java.util.Map<java.lang.Integer,java.lang.Integer>`"
  (^java.util.Map [^Evaluation this]
    (-> this (.truePositives))))

(defn false-positive-rate
  "Returns the false positive rate for a given label

  class-label - the label - `int`
  edge-case - What to output in case of 0/0 - `double`

  returns: fpr as a double - `double`"
  (^Double [^Evaluation this ^Integer class-label ^Double edge-case]
    (-> this (.falsePositiveRate class-label edge-case)))
  (^Double [^Evaluation this ^Integer class-label]
    (-> this (.falsePositiveRate class-label)))
  (^Double [^Evaluation this]
    (-> this (.falsePositiveRate))))

(defn get-prediction-errors
  "Get a list of prediction errors, on a per-record basis

  Note: Prediction errors are ONLY available if the \"evaluate with metadata\" method is used: eval(INDArray, INDArray, List)
  Otherwise (if the metadata hasn't been recorded via that previously mentioned eval method), there is no value in
  splitting each prediction out into a separate Prediction object - instead, use the confusion matrix to get the counts,
  via getConfusionMatrix()

  returns: A list of prediction errors, or null if no metadata has been recorded - `java.util.List<org.deeplearning4j.eval.meta.Prediction>`"
  (^java.util.List [^Evaluation this]
    (-> this (.getPredictionErrors))))

(defn get-class-label
  "clazz - `java.lang.Integer`

  returns: `java.lang.String`"
  (^java.lang.String [^Evaluation this ^java.lang.Integer clazz]
    (-> this (.getClassLabel clazz))))

(defn get-top-n-total-count
  "Return the total number of top N evaluations. Most of the time, this is exactly equal to getNumRowCounter(),
  but may differ in the case of using eval(int, int) as top N accuracy cannot be calculated in that case
  (i.e., requires the full probability distribution, not just predicted/actual indices)

  returns: Total number of top N predictions - `int`"
  (^Integer [^Evaluation this]
    (-> this (.getTopNTotalCount))))

(defn accuracy
  "Accuracy:
  (TP  TN) / (P  N)

  returns: the accuracy of the guesses so far - `double`"
  (^Double [^Evaluation this]
    (-> this (.accuracy))))

(defn merge
  "Merge the other evaluation object into this one. The result is that this Evaluation instance contains the counts
  etc from both

  other - Evaluation object to merge into this one. - `org.deeplearning4j.eval.Evaluation`"
  ([^Evaluation this ^org.deeplearning4j.eval.Evaluation other]
    (-> this (.merge other))))

(defn f-beta
  "Calculate the f_beta for a given class, where f_beta is defined as:
  (1+beta^2) * (precision * recall) / (beta^2 * precision  recall).
  F1 is a special case of f_beta, with beta=1.0

  beta - Beta value to use - `double`
  class-label - Class label - `int`
  default-value - Default value to use when precision or recall is undefined (0/0 for prec. or recall) - `double`

  returns: F_beta - `double`"
  (^Double [^Evaluation this ^Double beta ^Integer class-label ^Double default-value]
    (-> this (.fBeta beta class-label default-value)))
  (^Double [^Evaluation this ^Double beta ^Integer class-label]
    (-> this (.fBeta beta class-label))))

(defn get-confusion-matrix
  "Returns the confusion matrix variable

  returns: confusion matrix variable for this evaluation - `org.deeplearning4j.eval.ConfusionMatrix<java.lang.Integer>`"
  (^org.deeplearning4j.eval.ConfusionMatrix [^Evaluation this]
    (-> this (.getConfusionMatrix))))

(defn average-f-1-num-classes-excluded
  "When calculating the (macro) average F1, how many classes are excluded from the average due to
  no predictions – i.e., F1 would be calculated from a precision or recall of 0/0

  returns: Number of classes excluded from the average F1 - `int`"
  (^Integer [^Evaluation this]
    (-> this (.averageF1NumClassesExcluded))))

(defn stats
  "Method to obtain the classification report as a String

  suppress-warnings - whether or not to output warnings related to the evaluation results - `boolean`
  include-confusion - whether the confusion matrix should be included it the returned stats or not - `boolean`

  returns: A (multi-line) String with accuracy, precision, recall, f1 score etc - `java.lang.String`"
  (^java.lang.String [^Evaluation this ^Boolean suppress-warnings ^Boolean include-confusion]
    (-> this (.stats suppress-warnings include-confusion)))
  (^java.lang.String [^Evaluation this ^Boolean suppress-warnings]
    (-> this (.stats suppress-warnings)))
  (^java.lang.String [^Evaluation this]
    (-> this (.stats))))

(defn confusion-to-string
  "Get a String representation of the confusion matrix

  returns: `java.lang.String`"
  (^java.lang.String [^Evaluation this]
    (-> this (.confusionToString))))

