(ns org.nd4j.jita.allocator.garbage.GarbageBufferReference
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.garbage GarbageBufferReference]))

(defn ->garbage-buffer-reference
  "Constructor.

  referent - `org.nd4j.linalg.api.buffer.BaseDataBuffer`
  q - `java.lang.ref.ReferenceQueue`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  (^GarbageBufferReference [^org.nd4j.linalg.api.buffer.BaseDataBuffer referent ^java.lang.ref.ReferenceQueue q ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (new GarbageBufferReference referent q point)))

(defn get-point
  "returns: `org.nd4j.jita.allocator.impl.AllocationPoint`"
  (^org.nd4j.jita.allocator.impl.AllocationPoint [^GarbageBufferReference this]
    (-> this (.getPoint))))

