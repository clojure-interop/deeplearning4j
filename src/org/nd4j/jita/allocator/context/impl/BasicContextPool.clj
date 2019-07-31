(ns org.nd4j.jita.allocator.context.impl.BasicContextPool
  "This is context pool implementation, addressing shared cublas allocations together with shared stream pools
 Each context given contains:
 1. Stream for custom kernel invocations.
 2. cuBLAS handle tied with separate stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.context.impl BasicContextPool]))

(defn ->basic-context-pool
  "Constructor."
  (^BasicContextPool []
    (new BasicContextPool )))

(defn contains-context-for-thread
  "thread-id - `long`

  returns: `boolean`"
  (^Boolean [^BasicContextPool this ^Long thread-id]
    (-> this (.containsContextForThread thread-id))))

(defn get-context-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^BasicContextPool this ^java.lang.Integer device-id]
    (-> this (.getContextForDevice device-id))))

(defn acquire-context-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^BasicContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextForDevice device-id))))

(defn reset-pool
  "This methods reset everything in pool, forcing recreation of all streams
  PLEASE NOTE: This is debugging-related method, and should NOT be used in real tasks

  device-id - `int`"
  ([^BasicContextPool this ^Integer device-id]
    (-> this (.resetPool device-id))))

(defn get-cu-context-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.jita.allocator.pointers.cuda.CUcontext`"
  (^org.nd4j.jita.allocator.pointers.cuda.CUcontext [^BasicContextPool this ^java.lang.Integer device-id]
    (-> this (.getCuContextForDevice device-id))))

(defn acquire-context-pack-for-device
  "device-id - `java.lang.Integer`

  returns: `org.nd4j.jita.allocator.context.ContextPack`"
  (^org.nd4j.jita.allocator.context.ContextPack [^BasicContextPool this ^java.lang.Integer device-id]
    (-> this (.acquireContextPackForDevice device-id))))

