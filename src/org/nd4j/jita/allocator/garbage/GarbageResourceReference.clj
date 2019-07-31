(ns org.nd4j.jita.allocator.garbage.GarbageResourceReference
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.garbage GarbageResourceReference]))

(defn ->garbage-resource-reference
  "Constructor.

  referent - `java.lang.Thread`
  q - `java.lang.ref.ReferenceQueue`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`
  device-id - `int`"
  (^GarbageResourceReference [^java.lang.Thread referent ^java.lang.ref.ReferenceQueue q ^org.nd4j.linalg.jcublas.context.CudaContext context ^Integer device-id]
    (new GarbageResourceReference referent q context device-id)))

(defn get-context
  "returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^GarbageResourceReference this]
    (-> this (.getContext))))

(defn get-thread-id
  "returns: `long`"
  (^Long [^GarbageResourceReference this]
    (-> this (.getThreadId))))

(defn get-device-id
  "returns: `int`"
  (^Integer [^GarbageResourceReference this]
    (-> this (.getDeviceId))))

