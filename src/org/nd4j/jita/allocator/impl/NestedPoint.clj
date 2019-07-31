(ns org.nd4j.jita.allocator.impl.NestedPoint
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.impl NestedPoint]))

(defn ->nested-point
  "Constructor.

  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  (^NestedPoint [^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (new NestedPoint shape)))

(defn get-ticks
  "Returns number of ticks for this point

  returns: `long`"
  (^Long [^NestedPoint this]
    (-> this (.getTicks))))

(defn tick
  "Increments number of ticks by one"
  ([^NestedPoint this]
    (-> this (.tick))))

(defn tack
  ""
  ([^NestedPoint this]
    (-> this (.tack))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NestedPoint this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NestedPoint this]
    (-> this (.hashCode))))

