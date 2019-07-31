(ns org.nd4j.linalg.profiler.data.primitives.StackTree
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data.primitives StackTree]))

(defn ->stack-tree
  "Constructor."
  (^StackTree []
    (new StackTree )))

(defn render-tree
  "display-counts - `boolean`

  returns: `java.lang.String`"
  (^java.lang.String [^StackTree this ^Boolean display-counts]
    (-> this (.renderTree display-counts))))

(defn consume-stack-trace
  "descriptor - `org.nd4j.linalg.profiler.data.primitives.StackDescriptor`
  increment - `long`"
  ([^StackTree this ^org.nd4j.linalg.profiler.data.primitives.StackDescriptor descriptor ^Long increment]
    (-> this (.consumeStackTrace descriptor increment)))
  ([^StackTree this ^org.nd4j.linalg.profiler.data.primitives.StackDescriptor descriptor]
    (-> this (.consumeStackTrace descriptor))))

(defn get-total-events-number
  "returns: `long`"
  (^Long [^StackTree this]
    (-> this (.getTotalEventsNumber))))

(defn get-unique-branches-number
  "returns: `int`"
  (^Integer [^StackTree this]
    (-> this (.getUniqueBranchesNumber))))

(defn reset
  ""
  ([^StackTree this]
    (-> this (.reset))))

