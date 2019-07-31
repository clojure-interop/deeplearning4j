(ns org.deeplearning4j.nn.simple.multiclass.RankClassificationResult
  "A RankClassificationResult
 is an abstraction over an activation matrix
 for ranking classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.simple.multiclass RankClassificationResult]))

(defn ->rank-classification-result
  "Constructor.

  Takes in a classification matrix
  and the labels for each column

  outcome - the outcome - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the labels for the outcomes - `java.util.List`"
  (^RankClassificationResult [^org.nd4j.linalg.api.ndarray.INDArray outcome ^java.util.List labels]
    (new RankClassificationResult outcome labels))
  (^RankClassificationResult [^org.nd4j.linalg.api.ndarray.INDArray outcome]
    (new RankClassificationResult outcome)))

(defn max-outcome-for-row
  "Get the max index for the given row

  r - the row to get the max index for - `int`

  returns: the label for the given
  element - `java.lang.String`"
  (^java.lang.String [^RankClassificationResult this ^Integer r]
    (-> this (.maxOutcomeForRow r))))

(defn max-outcomes
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RankClassificationResult this]
    (-> this (.maxOutcomes))))

