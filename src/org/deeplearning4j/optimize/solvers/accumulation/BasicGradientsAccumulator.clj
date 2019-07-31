(ns org.deeplearning4j.optimize.solvers.accumulation.BasicGradientsAccumulator
  "This class provides accumulation for gradients for both input (i.e. updates coming from network) and output (comint from one ore more models training at the same time)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation BasicGradientsAccumulator]))

(defn ->basic-gradients-accumulator
  "Constructor.

  Creates new GradientsAccumulator with custom starting threshold

  parties - `int`
  handler - MessageHandler instance that'll be used for communication purposes - `org.deeplearning4j.optimize.solvers.accumulation.MessageHandler`"
  (^BasicGradientsAccumulator [^Integer parties ^org.deeplearning4j.optimize.solvers.accumulation.MessageHandler handler]
    (new BasicGradientsAccumulator parties handler))
  (^BasicGradientsAccumulator [^Integer parties]
    (new BasicGradientsAccumulator parties)))

(defn apply-update
  "This method applies accumulated updates via given StepFunction

  function - `org.deeplearning4j.optimize.api.StepFunction`
  params - `org.nd4j.linalg.api.ndarray.INDArray`
  grad - `org.nd4j.linalg.api.ndarray.INDArray`
  alpha - `double`"
  ([^BasicGradientsAccumulator this ^org.deeplearning4j.optimize.api.StepFunction function ^org.nd4j.linalg.api.ndarray.INDArray params ^org.nd4j.linalg.api.ndarray.INDArray grad ^Double alpha]
    (-> this (.applyUpdate function params grad alpha)))
  ([^BasicGradientsAccumulator this ^org.deeplearning4j.optimize.api.StepFunction function ^org.nd4j.linalg.api.ndarray.INDArray params ^org.nd4j.linalg.api.ndarray.INDArray grad]
    (-> this (.applyUpdate function params grad))))

(defn store-update
  "This method accepts updates suitable for StepFunction, and accumulates/propagates it across all workers

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BasicGradientsAccumulator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.storeUpdate array))))

(defn receive-update
  "This method accepts updates suitable for StepFunction and puts them to the queue, which is used in backpropagation loop
  PLEASE NOTE: array is expected to be ready for use and match params dimensionality

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BasicGradientsAccumulator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.receiveUpdate array))))

(defn reset
  "This method resets all accumulated updates (if any)"
  ([^BasicGradientsAccumulator this]
    (-> this (.reset))))

(defn touch
  "This method does initialization of given worker wrt Thread-Device Affinity"
  ([^BasicGradientsAccumulator this]
    (-> this (.touch))))

(defn set-external-source
  "Description copied from interface: GradientsAccumulator

  source - `java.util.Queue`"
  ([^BasicGradientsAccumulator this ^java.util.Queue source]
    (-> this (.setExternalSource source))))

