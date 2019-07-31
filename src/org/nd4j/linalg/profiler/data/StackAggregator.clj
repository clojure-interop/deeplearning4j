(ns org.nd4j.linalg.profiler.data.StackAggregator
  "This is utility class, provides stack traces collection, used in OpProfiler, to count events occurrences based on their position in code"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data StackAggregator]))

(defn ->stack-aggregator
  "Constructor."
  (^StackAggregator []
    (new StackAggregator )))

(defn render-tree
  "display-counts - `boolean`"
  ([^StackAggregator this ^Boolean display-counts]
    (-> this (.renderTree display-counts)))
  ([^StackAggregator this]
    (-> this (.renderTree))))

(defn reset
  ""
  ([^StackAggregator this]
    (-> this (.reset))))

(defn increment-count
  "time - `long`"
  ([^StackAggregator this ^Long time]
    (-> this (.incrementCount time)))
  ([^StackAggregator this]
    (-> this (.incrementCount))))

(defn get-total-events-number
  "returns: `long`"
  (^Long [^StackAggregator this]
    (-> this (.getTotalEventsNumber))))

(defn get-unique-branches-number
  "returns: `int`"
  (^Integer [^StackAggregator this]
    (-> this (.getUniqueBranchesNumber))))

(defn get-last-descriptor
  "returns: `org.nd4j.linalg.profiler.data.primitives.StackDescriptor`"
  (^org.nd4j.linalg.profiler.data.primitives.StackDescriptor [^StackAggregator this]
    (-> this (.getLastDescriptor))))

