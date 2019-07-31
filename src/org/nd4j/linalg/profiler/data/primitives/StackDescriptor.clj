(ns org.nd4j.linalg.profiler.data.primitives.StackDescriptor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data.primitives StackDescriptor]))

(defn ->stack-descriptor
  "Constructor.

  stack - `java.lang.StackTraceElement[]`"
  (^StackDescriptor [stack]
    (new StackDescriptor stack)))

(defn get-entry-name
  "returns: `java.lang.String`"
  (^java.lang.String [^StackDescriptor this]
    (-> this (.getEntryName))))

(defn get-element-name
  "idx - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^StackDescriptor this ^Integer idx]
    (-> this (.getElementName idx))))

(defn size
  "returns: `int`"
  (^Integer [^StackDescriptor this]
    (-> this (.size))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StackDescriptor this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StackDescriptor this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StackDescriptor this]
    (-> this (.toString))))

