(ns org.deeplearning4j.optimize.solvers.accumulation.EncodingHandler
  "This MessageHandler implementation is suited for debugging mostly, but still can be used in production environment if you really want that.
 Basic idea: updates are encoded before sharing.
 This handler is used as basement for distributed handler though.
 PLEASE NOTE: This handler does NOT provide any network connectivity. *"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation EncodingHandler]))

(defn ->encoding-handler
  "Constructor.

  This method builds new EncodingHandler instance

  threshold - Initial encoding threshold - `double`
  min-threshold - Minimal encoding threshold (for threshold decay) - `double`
  threshold-step - Decay step for threshold decay - `double`
  step-trigger - Sparse/Dense ratio that will trigger decay step. In range 0..100 - `double`
  step-delay - Minimal number of iterations between decay steps - `int`
  shake-frequency - How ofter we'll be sending dense updates with lower threshold - `int`
  boundary - `java.lang.Double`"
  (^EncodingHandler [^Double threshold ^Double min-threshold ^Double threshold-step ^Double step-trigger ^Integer step-delay ^Integer shake-frequency ^java.lang.Double boundary]
    (new EncodingHandler threshold min-threshold threshold-step step-trigger step-delay shake-frequency boundary))
  (^EncodingHandler [^Double threshold ^Double min-threshold ^Double threshold-step ^Double step-trigger ^Integer step-delay ^Integer shake-frequency]
    (new EncodingHandler threshold min-threshold threshold-step step-trigger step-delay shake-frequency))
  (^EncodingHandler [^Double threshold ^java.lang.Double boundary]
    (new EncodingHandler threshold boundary))
  (^EncodingHandler [^Double threshold]
    (new EncodingHandler threshold))
  (^EncodingHandler []
    (new EncodingHandler )))

(defn initialize
  "Description copied from interface: MessageHandler

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  ([^EncodingHandler this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.initialize accumulator))))

(defn encode-updates
  "updates - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^EncodingHandler this ^org.nd4j.linalg.api.ndarray.INDArray updates]
    (-> this (.encodeUpdates updates))))

(defn decode-updates
  "Deprecated.

  message - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^EncodingHandler this ^org.nd4j.linalg.api.ndarray.INDArray message]
    (-> this (.decodeUpdates message))))

(defn broadcast-updates
  "Description copied from interface: MessageHandler

  updates - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: TRUE if something was sent, FALSE otherwise - `boolean`"
  (^Boolean [^EncodingHandler this ^org.nd4j.linalg.api.ndarray.INDArray updates]
    (-> this (.broadcastUpdates updates))))

