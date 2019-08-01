(ns org.deeplearning4j.eval.BaseEvaluation
  "BaseEvaluation implement common evaluation functionality (for time series, etc) for Evaluation,
 RegressionEvaluation, ROC, ROCMultiClass etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval BaseEvaluation]))

(defn ->base-evaluation
  "Constructor."
  (^BaseEvaluation []
    (new BaseEvaluation )))

(defn *from-yaml
  "yaml - YAML representation - `java.lang.String`
  clazz - Class - `java.lang.Class`

  returns: Evaluation instance - `<T extends org.deeplearning4j.eval.IEvaluation> T`"
  ([^java.lang.String yaml ^java.lang.Class clazz]
    (BaseEvaluation/fromYaml yaml clazz)))

(defn *from-json
  "json - Jason representation of the evaluation instance - `java.lang.String`
  clazz - Class - `java.lang.Class`

  returns: Evaluation instance - `<T extends org.deeplearning4j.eval.IEvaluation> T`"
  ([^java.lang.String json ^java.lang.Class clazz]
    (BaseEvaluation/fromJson json clazz)))

(defn eval-time-series
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  labels-mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predictions ^org.nd4j.linalg.api.ndarray.INDArray labels-mask]
    (-> this (.evalTimeSeries labels predictions labels-mask)))
  ([^BaseEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray predicted]
    (-> this (.evalTimeSeries labels predicted))))

(defn eval
  "labels - `org.nd4j.linalg.api.ndarray.INDArray`
  network-predictions - `org.nd4j.linalg.api.ndarray.INDArray`
  record-meta-data - `java.util.List`"
  ([^BaseEvaluation this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray network-predictions ^java.util.List record-meta-data]
    (-> this (.eval labels network-predictions record-meta-data))))

(defn to-json
  "returns: JSON representation of the evaluation instance - `java.lang.String`"
  (^java.lang.String [^BaseEvaluation this]
    (-> this (.toJson))))

(defn to-yaml
  "returns: YAML representation of the evaluation instance - `java.lang.String`"
  (^java.lang.String [^BaseEvaluation this]
    (-> this (.toYaml))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseEvaluation this]
    (-> this (.toString))))

