(ns org.nd4j.jita.memory.impl.CudaDirectProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.memory.impl CudaDirectProvider]))

(defn ->cuda-direct-provider
  "Constructor."
  (^CudaDirectProvider []
    (new CudaDirectProvider )))

(defn malloc
  "This method provides PointersPair to memory chunk specified by AllocationShape

  shape - shape of desired memory chunk - `org.nd4j.jita.allocator.impl.AllocationShape`
  point - target AllocationPoint structure - `org.nd4j.jita.allocator.impl.AllocationPoint`
  location - either HOST or DEVICE - `org.nd4j.jita.allocator.enums.AllocationStatus`

  returns: `org.nd4j.jita.allocator.pointers.PointersPair`"
  (^org.nd4j.jita.allocator.pointers.PointersPair [^CudaDirectProvider this ^org.nd4j.jita.allocator.impl.AllocationShape shape ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.enums.AllocationStatus location]
    (-> this (.malloc shape point location))))

(defn free
  "This method frees specific chunk of memory, described by AllocationPoint passed in

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^CudaDirectProvider this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.free point))))

(defn ping-device-for-free-memory
  "This method checks specified device for specified amount of memory

  device-id - `java.lang.Integer`
  required-memory - `long`

  returns: `boolean`"
  (^Boolean [^CudaDirectProvider this ^java.lang.Integer device-id ^Long required-memory]
    (-> this (.pingDeviceForFreeMemory device-id required-memory))))

(defn purge-cache
  ""
  ([^CudaDirectProvider this]
    (-> this (.purgeCache))))

