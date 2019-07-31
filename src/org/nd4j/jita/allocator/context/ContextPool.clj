(ns org.nd4j.jita.allocator.context.ContextPool
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.context ContextPool]))

(defn acquire-context-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^ContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextForDevice device-id))))

(defn acquire-context-pack-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.jita.allocator.context.ContextPack`"
  (^org.nd4j.jita.allocator.context.ContextPack [^ContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextPackForDevice device-id))))

