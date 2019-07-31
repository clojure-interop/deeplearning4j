(ns org.deeplearning4j.eval.IEvaluation
  "A general purpose interface for evaluating neural networks - methods are shared by implemetations such as
 Evaluation, RegressionEvaluation, ROC, ROCMultiClass"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval IEvaluation]))

(defn eval
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  network-predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  record-meta-data - `java.util.List`"
  ([^IEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions ^java.util.List record-meta-data]
    (-> this (.eval labels network-predictions record-meta-data)))
  ([^IEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions]
    (-> this (.eval labels network-predictions))))

(defn eval-time-series
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  predicted - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^IEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predicted ^org.nd4j.linalg.api.ndarray.INDArray labels-mask-array]
    (-> this (.evalTimeSeries labels predicted labels-mask-array)))
  ([^IEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predicted]
    (-> this (.evalTimeSeries labels predicted))))

(defn merge
  "other - `T`"
  ([^IEvaluation this other]
    (-> this (.merge other))))

(defn reset
  ""
  ([^IEvaluation this]
    (-> this (.reset))))

(defn stats
  "returns: `java.lang.String`"
  (^java.lang.String [^IEvaluation this]
    (-> this (.stats))))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^IEvaluation this]
    (-> this (.toJson))))

(defn to-yaml
  "returns: `java.lang.String`"
  (^java.lang.String [^IEvaluation this]
    (-> this (.toYaml))))

