(ns org.deeplearning4j.optimize.solvers.accumulation.LocalHandler
  "MessageHandler implementation suited for ParallelWrapper running on single box
 PLEASE NOTE: This handler does NOT provide any network connectivity."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation LocalHandler]))

(defn ->local-handler
  "Constructor."
  (^LocalHandler []
    (new LocalHandler )))

(defn initialize
  "Description copied from interface: MessageHandler

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  ([^LocalHandler this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.initialize accumulator))))

(defn broadcast-updates
  "Description copied from interface: MessageHandler

  updates - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: TRUE if something was sent, FALSE otherwise - `boolean`"
  (^Boolean [^LocalHandler this ^org.nd4j.linalg.api.ndarray.INDArray updates]
    (-> this (.broadcastUpdates updates))))

