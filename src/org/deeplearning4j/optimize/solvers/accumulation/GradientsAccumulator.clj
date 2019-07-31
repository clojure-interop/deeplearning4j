(ns org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation GradientsAccumulator]))

(defn set-external-source
  "This method allows to pass external updates to accumulator, they will be populated across all workers using this GradientsAccumulator instance

  source - `java.util.Queue`"
  ([^GradientsAccumulator this ^java.util.Queue source]
    (-> this (.setExternalSource source))))

(defn apply-update
  "This method applies accumulated updates via given StepFunction

  function - `org.deeplearning4j.optimize.api.StepFunction`
  params - `org.nd4j.linalg.api.ndarray.INDArray`
  updates - `org.nd4j.linalg.api.ndarray.INDArray`
  alpha - `double`"
  ([^GradientsAccumulator this ^org.deeplearning4j.optimize.api.StepFunction function ^org.nd4j.linalg.api.ndarray.INDArray params ^org.nd4j.linalg.api.ndarray.INDArray updates ^Double alpha]
    (-> this (.applyUpdate function params updates alpha)))
  ([^GradientsAccumulator this ^org.deeplearning4j.optimize.api.StepFunction function ^org.nd4j.linalg.api.ndarray.INDArray params ^org.nd4j.linalg.api.ndarray.INDArray updates]
    (-> this (.applyUpdate function params updates))))

(defn store-update
  "This method accepts updates suitable for StepFunction, and accumulates/propagates it across all workers

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GradientsAccumulator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.storeUpdate array))))

(defn receive-update
  "This method accepts updates suitable for StepFunction and puts them to the queue, which is used in backpropagation loop
  PLEASE NOTE: array is expected to be ready for use and match params dimensionality

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GradientsAccumulator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.receiveUpdate array))))

(defn reset
  "This method resets all accumulated updates (if any)"
  ([^GradientsAccumulator this]
    (-> this (.reset))))

(defn touch
  "This method does initialization of given worker wrt Thread-Device Affinity"
  ([^GradientsAccumulator this]
    (-> this (.touch))))

