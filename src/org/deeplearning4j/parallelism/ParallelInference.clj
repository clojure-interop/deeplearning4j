(ns org.deeplearning4j.parallelism.ParallelInference
  "This class is simple wrapper for
 ParallelInference using batched input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism ParallelInference]))

(def *-default-num-workers
  "Static Constant.

  type: int"
  ParallelInference/DEFAULT_NUM_WORKERS)

(def *-default-batch-limit
  "Static Constant.

  type: int"
  ParallelInference/DEFAULT_BATCH_LIMIT)

(def *-default-inference-mode
  "Static Constant.

  type: org.deeplearning4j.parallelism.inference.InferenceMode"
  ParallelInference/DEFAULT_INFERENCE_MODE)

(def *-default-queue-limit
  "Static Constant.

  type: int"
  ParallelInference/DEFAULT_QUEUE_LIMIT)

(defn shutdown
  "This method gracefully shuts down ParallelInference instance"
  ([^ParallelInference this]
    (-> this (.shutdown))))

(defn output
  "Generate predictions/outputs from the network, optionally using input masks for predictions

  input - Input to the network - `org.nd4j.linalg.api.ndarray.INDArray[]`
  input-masks - Input masks for the network. May be null. - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: Output from the network - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ParallelInference this input input-masks]
    (-> this (.output input input-masks)))
  ([^ParallelInference this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.output input))))

