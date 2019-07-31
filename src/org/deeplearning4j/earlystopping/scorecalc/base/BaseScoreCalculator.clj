(ns org.deeplearning4j.earlystopping.scorecalc.base.BaseScoreCalculator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc.base BaseScoreCalculator]))

(defn *arr
  "in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray in]
    (BaseScoreCalculator/arr in)))

(defn *get-0
  "in - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [in]
    (BaseScoreCalculator/get0 in)))

(defn calculate-score
  "Description copied from interface: ScoreCalculator

  network - `T`

  returns: `double`"
  (^Double [^BaseScoreCalculator this network]
    (-> this (.calculateScore network))))

