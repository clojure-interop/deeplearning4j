(ns org.nd4j.jita.allocator.context.ContextPack
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.context ContextPack]))

(defn ->context-pack
  "Constructor.

  total-lanes - `int`"
  (^ContextPack [^Integer total-lanes]
    (new ContextPack total-lanes)))

(defn add-lane
  "lane-id - `java.lang.Integer`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`"
  ([^ContextPack this ^java.lang.Integer lane-id ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.addLane lane-id context))))

(defn get-context-for-lane
  "lane-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^ContextPack this ^java.lang.Integer lane-id]
    (-> this (.getContextForLane lane-id))))

(defn next-random-lane
  "returns: `int`"
  (^Integer [^ContextPack this]
    (-> this (.nextRandomLane))))

