(ns org.nd4j.linalg.api.instrumentation.InMemoryInstrumentation
  "Collects log entries in memory"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.instrumentation InMemoryInstrumentation]))

(defn ->in-memory-instrumentation
  "Constructor."
  (^InMemoryInstrumentation []
    (new InMemoryInstrumentation )))

(defn log
  "Description copied from interface: Instrumentation

  to-log - the ndarray to log - `org.nd4j.linalg.api.ndarray.INDArray`
  status - the status - `java.lang.String`"
  ([^InMemoryInstrumentation this ^org.nd4j.linalg.api.ndarray.INDArray to-log ^java.lang.String status]
    (-> this (.log to-log status)))
  ([^InMemoryInstrumentation this ^org.nd4j.linalg.api.ndarray.INDArray to-log]
    (-> this (.log to-log))))

(defn get-still-alive
  "Description copied from interface: Instrumentation

  returns: the still alive ndarrays - `java.util.Collection<org.nd4j.linalg.api.instrumentation.LogEntry>`"
  (^java.util.Collection [^InMemoryInstrumentation this]
    (-> this (.getStillAlive))))

(defn get-destroyed
  "Description copied from interface: Instrumentation

  returns: the destroyed ndarrays - `java.util.Collection<org.nd4j.linalg.api.instrumentation.LogEntry>`"
  (^java.util.Collection [^InMemoryInstrumentation this]
    (-> this (.getDestroyed))))

(defn destroyed?
  "Description copied from interface: Instrumentation

  id - the id to check - `java.lang.String`

  returns: true if the ndarray has been destroyed, false otherwise - `boolean`"
  (^Boolean [^InMemoryInstrumentation this ^java.lang.String id]
    (-> this (.isDestroyed id))))

(defn get-data-buffer-log-entries
  "returns: `java.util.List<org.nd4j.linalg.api.instrumentation.DataBufferLogEntry>`"
  (^java.util.List [^InMemoryInstrumentation this]
    (-> this (.getDataBufferLogEntries))))

(defn set-data-buffer-log-entries
  "data-buffer-log-entries - `java.util.List`"
  ([^InMemoryInstrumentation this ^java.util.List data-buffer-log-entries]
    (-> this (.setDataBufferLogEntries data-buffer-log-entries))))

(defn get-entries
  "returns: `java.util.List<org.nd4j.linalg.api.instrumentation.LogEntry>`"
  (^java.util.List [^InMemoryInstrumentation this]
    (-> this (.getEntries))))

(defn set-entries
  "entries - `java.util.List`"
  ([^InMemoryInstrumentation this ^java.util.List entries]
    (-> this (.setEntries entries))))

