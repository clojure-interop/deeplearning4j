(ns org.deeplearning4j.parallelism.ParallelInference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism ParallelInference$Builder]))

(defn ->builder
  "Constructor.

  model - `org.deeplearning4j.nn.api.Model`"
  (^ParallelInference$Builder [^org.deeplearning4j.nn.api.Model model]
    (new ParallelInference$Builder model)))

(defn inference-mode
  "This method allows you to define mode that'll be used during inference. Options are:
  SEQUENTIAL: Input will be sent to last-used worker unmodified.
  BATCHED: Multiple inputs will be packed into single batch, and
  sent to last-used device.

  inference-mode - `org.deeplearning4j.parallelism.inference.InferenceMode`

  returns: `org.deeplearning4j.parallelism.ParallelInference$Builder`"
  (^org.deeplearning4j.parallelism.ParallelInference$Builder [^ParallelInference$Builder this ^org.deeplearning4j.parallelism.inference.InferenceMode inference-mode]
    (-> this (.inferenceMode inference-mode))))

(defn workers
  "This method defines, how many model copies will be used for inference.
  PLEASE NOTE: This method primarily suited for multi-GPU systems

  workers - `int`

  returns: `org.deeplearning4j.parallelism.ParallelInference$Builder`"
  (^org.deeplearning4j.parallelism.ParallelInference$Builder [^ParallelInference$Builder this ^Integer workers]
    (-> this (.workers workers))))

(defn batch-limit
  "This method defines, how many input samples can
  be batched within given time frame.
  PLEASE NOTE: This value has no effect in
  SEQUENTIAL inference mode

  limit - `int`

  returns: `org.deeplearning4j.parallelism.ParallelInference$Builder`"
  (^org.deeplearning4j.parallelism.ParallelInference$Builder [^ParallelInference$Builder this ^Integer limit]
    (-> this (.batchLimit limit))))

(defn queue-limit
  "This method defines buffer queue size.
  Default value: 64

  limit - `int`

  returns: `org.deeplearning4j.parallelism.ParallelInference$Builder`"
  (^org.deeplearning4j.parallelism.ParallelInference$Builder [^ParallelInference$Builder this ^Integer limit]
    (-> this (.queueLimit limit))))

(defn build
  "This method builds new ParallelInference instance

  returns: `org.deeplearning4j.parallelism.ParallelInference`"
  (^org.deeplearning4j.parallelism.ParallelInference [^ParallelInference$Builder this]
    (-> this (.build))))

