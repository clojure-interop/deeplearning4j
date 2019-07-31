(ns org.deeplearning4j.optimize.solvers.accumulation.MessageHandler
  "This interface describes communication primitive for GradientsAccumulator
 PLEASE NOTE: All implementations of this interface must be thread-safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.solvers.accumulation MessageHandler]))

(defn initialize
  "This method does initial configuration of given MessageHandler instance

  accumulator - `org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator`"
  ([^MessageHandler this ^org.deeplearning4j.optimize.solvers.accumulation.GradientsAccumulator accumulator]
    (-> this (.initialize accumulator))))

(defn broadcast-updates
  "This method does broadcast of given update message across network

  updates - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: TRUE if something was sent, FALSE otherwise - `boolean`"
  (^Boolean [^MessageHandler this ^org.nd4j.linalg.api.ndarray.INDArray updates]
    (-> this (.broadcastUpdates updates))))

