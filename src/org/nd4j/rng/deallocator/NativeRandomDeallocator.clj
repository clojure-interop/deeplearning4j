(ns org.nd4j.rng.deallocator.NativeRandomDeallocator
  "Since NativeRandom assumes some native resources, we have to track their use, and deallocate them as soon they are released by JVM GC"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.rng.deallocator NativeRandomDeallocator]))

(def *-deallocator-thread-name-prefix
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  NativeRandomDeallocator/DeallocatorThreadNamePrefix)

(defn *get-instance
  "returns: `org.nd4j.rng.deallocator.NativeRandomDeallocator`"
  (^org.nd4j.rng.deallocator.NativeRandomDeallocator []
    (NativeRandomDeallocator/getInstance )))

(defn track-state-pointer
  "This method is used internally from NativeRandom deallocators
  This method doesn't accept Random interface implementations intentionally.

  random - `org.nd4j.rng.deallocator.NativePack`"
  ([^NativeRandomDeallocator this ^org.nd4j.rng.deallocator.NativePack random]
    (-> this (.trackStatePointer random))))

