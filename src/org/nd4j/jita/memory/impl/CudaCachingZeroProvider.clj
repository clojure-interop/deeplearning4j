(ns org.nd4j.jita.memory.impl.CudaCachingZeroProvider
  "This is MemoryProvider implementation, that adds cache for memory reuse purposes. Only host memory is cached for future reuse.
 If some memory chunk gets released via allocator, it'll be probably saved for future reused within same JVM process."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.memory.impl CudaCachingZeroProvider]))

(defn ->cuda-caching-zero-provider
  "Constructor."
  (^CudaCachingZeroProvider []
    (new CudaCachingZeroProvider )))

(defn malloc
  "This method provides PointersPair to memory chunk specified by AllocationShape
  PLEASE NOTE: This method can actually ignore malloc request, and give out previously cached free memory chunk with equal shape.

  shape - shape of desired memory chunk - `org.nd4j.jita.allocator.impl.AllocationShape`
  point - target AllocationPoint structure - `org.nd4j.jita.allocator.impl.AllocationPoint`
  location - either HOST or DEVICE - `org.nd4j.jita.allocator.enums.AllocationStatus`

  returns: `org.nd4j.jita.allocator.pointers.PointersPair`"
  (^org.nd4j.jita.allocator.pointers.PointersPair [^CudaCachingZeroProvider this ^org.nd4j.jita.allocator.impl.AllocationShape shape ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.enums.AllocationStatus location]
    (-> this (.malloc shape point location))))

(defn free
  "This method frees specific chunk of memory, described by AllocationPoint passed in.
  PLEASE NOTE: This method can actually ignore free, and keep released memory chunk for future reuse.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^CudaCachingZeroProvider this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.free point))))

(defn print-cache-stats
  "Deprecated."
  ([^CudaCachingZeroProvider this]
    (-> this (.printCacheStats))))

(defn purge-cache
  ""
  ([^CudaCachingZeroProvider this]
    (-> this (.purgeCache))))

