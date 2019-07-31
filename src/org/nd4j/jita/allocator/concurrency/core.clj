(ns org.nd4j.jita.allocator.concurrency.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.nd4j.jita.allocator.concurrency.AtomicState])
(require '[org.nd4j.jita.allocator.concurrency.DeviceAllocationsTracker])
(require '[org.nd4j.jita.allocator.concurrency.Lock])
(require '[org.nd4j.jita.allocator.concurrency.RRWLock])
