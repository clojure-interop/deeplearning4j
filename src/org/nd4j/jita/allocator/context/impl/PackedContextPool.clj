(ns org.nd4j.jita.allocator.context.impl.PackedContextPool
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.context.impl PackedContextPool]))

(defn ->packed-context-pool
  "Constructor.

  Deprecated."
  (^PackedContextPool []
    (new PackedContextPool )))

(defn acquire-context-for-device
  "Deprecated.

  device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^PackedContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextForDevice device-id))))

(defn acquire-context-pack-for-device
  "Deprecated.

  device-id - `java.lang.Integer`

  returns: `org.nd4j.jita.allocator.context.ContextPack`"
  (^org.nd4j.jita.allocator.context.ContextPack [^PackedContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextPackForDevice device-id))))

