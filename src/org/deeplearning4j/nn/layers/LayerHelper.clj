(ns org.deeplearning4j.nn.layers.LayerHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers LayerHelper]))

(defn helper-memory-use
  "Return the currently allocated memory for the helper.
  (a) Excludes: any shared memory used by multiple helpers/layers
  (b) Excludes any temporary memory
  (c) Includes all memory that persists for longer than the helper method
  This is mainly used for debugging and reporting purposes. Returns a map:
  Key: The name of the type of memory
  Value: The amount of memory

  returns: Map of memory, may be null if none is used. - `java.util.Map<java.lang.String,java.lang.Long>`"
  (^java.util.Map [^LayerHelper this]
    (-> this (.helperMemoryUse))))

