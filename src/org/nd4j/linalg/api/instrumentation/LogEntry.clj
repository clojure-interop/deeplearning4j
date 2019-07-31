(ns org.nd4j.linalg.api.instrumentation.LogEntry
  "Log entry for statistics about ndarrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.instrumentation LogEntry]))

(defn ->log-entry
  "Constructor.

  to-log - `org.nd4j.linalg.api.ndarray.INDArray`
  stack-trace-elements - `java.lang.StackTraceElement[]`
  status - `java.lang.String`"
  (^LogEntry [^org.nd4j.linalg.api.ndarray.INDArray to-log stack-trace-elements ^java.lang.String status]
    (new LogEntry to-log stack-trace-elements status))
  (^LogEntry [^org.nd4j.linalg.api.ndarray.INDArray to-log ^java.lang.String status]
    (new LogEntry to-log status))
  (^LogEntry [^org.nd4j.linalg.api.ndarray.INDArray to-log]
    (new LogEntry to-log))
  (^LogEntry []
    (new LogEntry )))

(defn set-references
  "num-references - `java.util.Collection`"
  ([^LogEntry this ^java.util.Collection num-references]
    (-> this (.setReferences num-references))))

(defn get-data-type
  "returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.getDataType))))

(defn get-stack-trace-elements
  "returns: `java.lang.StackTraceElement[]`"
  ([^LogEntry this]
    (-> this (.getStackTraceElements))))

(defn set-stride
  "stride - `long[]`"
  ([^LogEntry this stride]
    (-> this (.setStride stride))))

(defn set-nd-array-type
  "nd-array-type - `java.lang.String`"
  ([^LogEntry this ^java.lang.String nd-array-type]
    (-> this (.setNdArrayType nd-array-type))))

(defn set-data-type
  "data-type - `java.lang.String`"
  ([^LogEntry this ^java.lang.String data-type]
    (-> this (.setDataType data-type))))

(defn get-nd-array-type
  "returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.getNdArrayType))))

(defn set-shape
  "shape - `long[]`"
  ([^LogEntry this shape]
    (-> this (.setShape shape))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.toString))))

(defn set-length
  "length - `long`"
  ([^LogEntry this ^Long length]
    (-> this (.setLength length))))

(defn set-stack-trace-elements
  "stack-trace-elements - `java.lang.StackTraceElement[]`"
  ([^LogEntry this stack-trace-elements]
    (-> this (.setStackTraceElements stack-trace-elements))))

(defn set-id
  "id - `java.lang.String`"
  ([^LogEntry this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-references
  "returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^LogEntry this]
    (-> this (.getReferences))))

(defn get-stride
  "returns: `long[]`"
  ([^LogEntry this]
    (-> this (.getStride))))

(defn get-id
  "returns: `java.lang.String`"
  (^java.lang.String [^LogEntry this]
    (-> this (.getId))))

(defn length
  "returns: `long`"
  (^Long [^LogEntry this]
    (-> this (.length))))

(defn get-shape
  "returns: `long[]`"
  ([^LogEntry this]
    (-> this (.getShape))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LogEntry this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LogEntry this ^java.lang.Object o]
    (-> this (.equals o))))

