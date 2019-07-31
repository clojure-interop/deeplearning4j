(ns org.nd4j.jita.allocator.context.impl.LimitedContextPool
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.context.impl LimitedContextPool]))

(defn ->limited-context-pool
  "Constructor."
  (^LimitedContextPool []
    (new LimitedContextPool )))

(defn acquire-context-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^LimitedContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextForDevice device-id))))

(defn acquire-context-pack-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.jita.allocator.context.ContextPack`"
  (^org.nd4j.jita.allocator.context.ContextPack [^LimitedContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextPackForDevice device-id))))

(defn get-context-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^LimitedContextPool this ^java.lang.Integer device-id]
    (-> this (.getContextForDevice device-id))))

