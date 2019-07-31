(ns org.nd4j.rng.deallocator.GarbageStateReference
  "Weak reference for NativeRandom garbage collector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.rng.deallocator GarbageStateReference]))

(defn ->garbage-state-reference
  "Constructor.

  referent - `org.nd4j.rng.deallocator.NativePack`
  queue - `java.lang.ref.ReferenceQueue`"
  (^GarbageStateReference [^org.nd4j.rng.deallocator.NativePack referent ^java.lang.ref.ReferenceQueue queue]
    (new GarbageStateReference referent queue)))

