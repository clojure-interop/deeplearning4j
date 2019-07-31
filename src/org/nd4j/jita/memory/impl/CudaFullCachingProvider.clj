(ns org.nd4j.jita.memory.impl.CudaFullCachingProvider
  "This MemoryProvider implementation does caching for both host and device memory within predefined limits."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.memory.impl CudaFullCachingProvider]))

(defn ->cuda-full-caching-provider
  "Constructor."
  (^CudaFullCachingProvider []
    (new CudaFullCachingProvider )))

(defn init
  ""
  ([^CudaFullCachingProvider this]
    (-> this (.init))))

(defn malloc
  "This method provides PointersPair to memory chunk specified by AllocationShape
  PLEASE NOTE: This method can actually ignore malloc request, and give out previously cached free memory chunk with equal shape.

  shape - shape of desired memory chunk - `org.nd4j.jita.allocator.impl.AllocationShape`
  point - target AllocationPoint structure - `org.nd4j.jita.allocator.impl.AllocationPoint`
  location - either HOST or DEVICE - `org.nd4j.jita.allocator.enums.AllocationStatus`

  returns: `org.nd4j.jita.allocator.pointers.PointersPair`"
  (^org.nd4j.jita.allocator.pointers.PointersPair [^CudaFullCachingProvider this ^org.nd4j.jita.allocator.impl.AllocationShape shape ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.enums.AllocationStatus location]
    (-> this (.malloc shape point location))))

(defn free
  "This method frees specific chunk of memory, described by AllocationPoint passed in
  PLEASE NOTE: This method can actually ignore free, and keep released memory chunk for future reuse.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^CudaFullCachingProvider this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.free point))))

(defn purge-cache
  ""
  ([^CudaFullCachingProvider this]
    (-> this (.purgeCache))))

