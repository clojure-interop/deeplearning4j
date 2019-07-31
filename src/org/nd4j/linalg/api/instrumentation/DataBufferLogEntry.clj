(ns org.nd4j.linalg.api.instrumentation.DataBufferLogEntry
  "Data buffer log entry. Used for tracking buffer statistics"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.instrumentation DataBufferLogEntry]))

(defn ->data-buffer-log-entry
  "Constructor.

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  status - `java.lang.String`"
  (^DataBufferLogEntry [^org.nd4j.linalg.api.buffer.DataBuffer buffer ^java.lang.String status]
    (new DataBufferLogEntry buffer status))
  (^DataBufferLogEntry [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (new DataBufferLogEntry buffer))
  (^DataBufferLogEntry []
    (new DataBufferLogEntry )))

(defn set-references
  "references - `java.util.Collection`"
  ([^DataBufferLogEntry this ^java.util.Collection references]
    (-> this (.setReferences references))))

(defn get-data-type
  "returns: `java.lang.String`"
  (^java.lang.String [^DataBufferLogEntry this]
    (-> this (.getDataType))))

(defn set-timestamp
  "timestamp - `long`"
  ([^DataBufferLogEntry this ^Long timestamp]
    (-> this (.setTimestamp timestamp))))

(defn get-stack-trace-elements
  "returns: `java.lang.StackTraceElement[]`"
  ([^DataBufferLogEntry this]
    (-> this (.getStackTraceElements))))

(defn get-status
  "returns: `java.lang.String`"
  (^java.lang.String [^DataBufferLogEntry this]
    (-> this (.getStatus))))

(defn set-data-type
  "data-type - `java.lang.String`"
  ([^DataBufferLogEntry this ^java.lang.String data-type]
    (-> this (.setDataType data-type))))

(defn get-timestamp
  "returns: `long`"
  (^Long [^DataBufferLogEntry this]
    (-> this (.getTimestamp))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DataBufferLogEntry this]
    (-> this (.toString))))

(defn set-length
  "length - `long`"
  ([^DataBufferLogEntry this ^Long length]
    (-> this (.setLength length))))

(defn set-stack-trace-elements
  "stack-trace-elements - `java.lang.StackTraceElement[]`"
  ([^DataBufferLogEntry this stack-trace-elements]
    (-> this (.setStackTraceElements stack-trace-elements))))

(defn get-references
  "returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^DataBufferLogEntry this]
    (-> this (.getReferences))))

(defn length
  "returns: `long`"
  (^Long [^DataBufferLogEntry this]
    (-> this (.length))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DataBufferLogEntry this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DataBufferLogEntry this ^java.lang.Object o]
    (-> this (.equals o))))

(defn set-status
  "status - `java.lang.String`"
  ([^DataBufferLogEntry this ^java.lang.String status]
    (-> this (.setStatus status))))

