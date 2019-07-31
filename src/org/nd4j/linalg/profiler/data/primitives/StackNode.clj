(ns org.nd4j.linalg.profiler.data.primitives.StackNode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data.primitives StackNode]))

(defn ->stack-node
  "Constructor.

  uri - `java.lang.String`"
  (^StackNode [^java.lang.String uri]
    (new StackNode uri)))

(defn get-nodes
  "returns: `java.util.Collection<org.nd4j.linalg.profiler.data.primitives.StackNode>`"
  (^java.util.Collection [^StackNode this]
    (-> this (.getNodes))))

(defn traverse
  "own-level - `int`
  display-counts - `boolean`"
  ([^StackNode this ^Integer own-level ^Boolean display-counts]
    (-> this (.traverse own-level display-counts))))

(defn consume
  "descriptor - `org.nd4j.linalg.profiler.data.primitives.StackDescriptor`
  last-level - `int`
  delta - `long`"
  ([^StackNode this ^org.nd4j.linalg.profiler.data.primitives.StackDescriptor descriptor ^Integer last-level ^Long delta]
    (-> this (.consume descriptor last-level delta)))
  ([^StackNode this ^org.nd4j.linalg.profiler.data.primitives.StackDescriptor descriptor ^Integer last-level]
    (-> this (.consume descriptor last-level))))

(defn compare-to
  "o - `org.nd4j.linalg.profiler.data.primitives.StackNode`

  returns: `int`"
  (^Integer [^StackNode this ^org.nd4j.linalg.profiler.data.primitives.StackNode o]
    (-> this (.compareTo o))))

