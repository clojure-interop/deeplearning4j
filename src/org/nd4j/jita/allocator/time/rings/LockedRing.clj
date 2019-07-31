(ns org.nd4j.jita.allocator.time.rings.LockedRing
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time.rings LockedRing]))

(defn ->locked-ring
  "Constructor.

  Builds new BasicRing with specified number of elements stored

  ring-length - `int`"
  (^LockedRing [^Integer ring-length]
    (new LockedRing ring-length)))

(defn get-average
  "returns: `float`"
  (^Float [^LockedRing this]
    (-> this (.getAverage))))

(defn store
  "rate - `double`"
  ([^LockedRing this ^Double rate]
    (-> this (.store rate))))

