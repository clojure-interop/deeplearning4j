(ns org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator
  "This GradientsAccumulator is suited for CUDA backend."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation EncodedGradientsAccumulator]))

(defn ->encoded-gradients-accumulator
  "Constructor.

  parties - `int`
  threshold - `double`"
  (^EncodedGradientsAccumulator [^Integer parties ^Double threshold]
    (new EncodedGradientsAccumulator parties threshold))
  (^EncodedGradientsAccumulator [^Double parties]
    (new EncodedGradientsAccumulator parties)))

(defn *get-optimal-buffer-size
  "This method returns optimal bufferSize for a given model
  We know, that updates are guaranteed to have MAX size of params / 16. So, here we go.
  I.e. for model with 100m params, that's 400m of floats (or 800m of doubles)
  The worst case for us is bitmap encoding, that takes 2 bits to encode each gradient value
  so, for float in worst case we'll have (100m / 16) int elements. So, our buffer size will be 6.25m * queueSize * 4 bytes per int

  params-length - `long`
  num-workers - `int`
  queue-size - `int`

  returns: `long`"
  (^Long [^Long params-length ^Integer num-workers ^Integer queue-size]
    (EncodedGradientsAccumulator/getOptimalBufferSize params-length num-workers queue-size)))

(defn fallback-to-single-consumer-mode
  "Description copied from interface: Registerable

  really-fallback - `boolean`"
  ([^EncodedGradientsAccumulator this ^Boolean really-fallback]
    (-> this (.fallbackToSingleConsumerMode really-fallback))))

(defn register-consumers
  "Description copied from interface: Registerable

  num-consumers - `int`"
  ([^EncodedGradientsAccumulator this ^Integer num-consumers]
    (-> this (.registerConsumers num-consumers))))

(defn apply-update
  "This method applies accumulated updates via given StepFunction

  function - `org.deeplearning4j.optimize.api.StepFunction`
  params - `org.nd4j.linalg.api.ndarray.INDArray`
  updates - `org.nd4j.linalg.api.ndarray.INDArray`
  alpha - `double`"
  ([^EncodedGradientsAccumulator this ^org.deeplearning4j.optimize.api.StepFunction function ^org.nd4j.linalg.api.ndarray.INDArray params ^org.nd4j.linalg.api.ndarray.INDArray updates ^Double alpha]
    (-> this (.applyUpdate function params updates alpha)))
  ([^EncodedGradientsAccumulator this ^org.deeplearning4j.optimize.api.StepFunction function ^org.nd4j.linalg.api.ndarray.INDArray params ^org.nd4j.linalg.api.ndarray.INDArray updates]
    (-> this (.applyUpdate function params updates))))

(defn set-external-source
  "This method allows to pass external updates to accumulator, they will be populated across all workers using this GradientsAccumulator instance

  source - `java.util.Queue`"
  ([^EncodedGradientsAccumulator this ^java.util.Queue source]
    (-> this (.setExternalSource source))))

(defn touch
  "This method does initialization of given worker wrt Thread-Device Affinity"
  ([^EncodedGradientsAccumulator this]
    (-> this (.touch))))

(defn store-update
  "This method accepts updates suitable for StepFunction, and accumulates/propagates it across all workers

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^EncodedGradientsAccumulator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.storeUpdate array))))

(defn receive-update
  "This method accepts updates suitable for StepFunction and puts them to the queue, which is used in backpropagation loop

  PLEASE NOTE: array is expected to be ready for use and match params dimensionality

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^EncodedGradientsAccumulator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.receiveUpdate array))))

(defn reset
  "This method resets all accumulated updates (if any)"
  ([^EncodedGradientsAccumulator this]
    (-> this (.reset))))

