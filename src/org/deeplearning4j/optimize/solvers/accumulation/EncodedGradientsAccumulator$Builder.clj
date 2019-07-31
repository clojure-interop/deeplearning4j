(ns org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation EncodedGradientsAccumulator$Builder]))

(defn ->builder
  "Constructor.

  This

  parties - `int`"
  (^EncodedGradientsAccumulator$Builder [^Integer parties]
    (new EncodedGradientsAccumulator$Builder parties)))

(defn message-handler
  "This method allows to specify MessageHandler instance
  Default value: EncodingHandler

  handler - `org.deeplearning4j.optimize.solvers.accumulation.MessageHandler`

  returns: `org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder`"
  (^org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder [^EncodedGradientsAccumulator$Builder this ^org.deeplearning4j.optimize.solvers.accumulation.MessageHandler handler]
    (-> this (.messageHandler handler))))

(defn encoding-threshold
  "This method allows to set encoding threshold for this accumulator instance
  Default value: 1e-3

  threshold - `double`

  returns: `org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder`"
  (^org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder [^EncodedGradientsAccumulator$Builder this ^Double threshold]
    (-> this (.encodingThreshold threshold))))

(defn updates-boundary
  "This method enables optional limit for max number of updates per message
  Default value: 1.0 (no limit)

  boundary - positive value in range 0..1 - `double`

  returns: `org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder`"
  (^org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder [^EncodedGradientsAccumulator$Builder this ^Double boundary]
    (-> this (.updatesBoundary boundary))))

(defn memory-parameters
  "This method allows to define buffer memory parameters for this GradientsAccumulator
  Default values: 100MB initialMemory, 5 queueSize

  initial-memory - `long`
  queue-size - `int`

  returns: `org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder`"
  (^org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator$Builder [^EncodedGradientsAccumulator$Builder this ^Long initial-memory ^Integer queue-size]
    (-> this (.memoryParameters initial-memory queue-size))))

(defn build
  "returns: `org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator`"
  (^org.deeplearning4j.optimize.solvers.accumulation.EncodedGradientsAccumulator [^EncodedGradientsAccumulator$Builder this]
    (-> this (.build))))

