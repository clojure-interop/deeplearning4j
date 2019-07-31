(ns org.nd4j.jita.allocator.impl.AllocationShape
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.impl AllocationShape]))

(defn ->allocation-shape
  "Constructor.

  length - `long`
  element-size - `int`
  data-type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^AllocationShape [^Long length ^Integer element-size ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type]
    (new AllocationShape length element-size data-type)))

(defn get-number-of-bytes
  "returns: `long`"
  (^Long [^AllocationShape this]
    (-> this (.getNumberOfBytes))))

