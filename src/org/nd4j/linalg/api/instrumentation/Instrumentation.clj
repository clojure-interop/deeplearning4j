(ns org.nd4j.linalg.api.instrumentation.Instrumentation
  "Instrumentation for logging statistics
 about the ndarrays being allocated and destroyed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.instrumentation Instrumentation]))

(defn log
  "Log the given ndarray

  to-log - the ndarray to log - `org.nd4j.linalg.api.ndarray.INDArray`
  status - the status - `java.lang.String`"
  ([^Instrumentation this ^org.nd4j.linalg.api.ndarray.INDArray to-log ^java.lang.String status]
    (-> this (.log to-log status)))
  ([^Instrumentation this ^org.nd4j.linalg.api.ndarray.INDArray to-log]
    (-> this (.log to-log))))

(defn get-still-alive
  "Get the still alive ndarrays

  returns: the still alive ndarrays - `java.util.Collection<org.nd4j.linalg.api.instrumentation.LogEntry>`"
  (^java.util.Collection [^Instrumentation this]
    (-> this (.getStillAlive))))

(defn get-destroyed
  "Get the destroyed ndarrays

  returns: the destroyed ndarrays - `java.util.Collection<org.nd4j.linalg.api.instrumentation.LogEntry>`"
  (^java.util.Collection [^Instrumentation this]
    (-> this (.getDestroyed))))

(defn destroyed?
  "Returns whether the given ndarray has been destroyed

  id - the id to check - `java.lang.String`

  returns: true if the ndarray has been destroyed, false otherwise - `boolean`"
  (^Boolean [^Instrumentation this ^java.lang.String id]
    (-> this (.isDestroyed id))))

