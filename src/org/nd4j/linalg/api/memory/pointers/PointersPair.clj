(ns org.nd4j.linalg.api.memory.pointers.PointersPair
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.pointers PointersPair]))

(defn ->pointers-pair
  "Constructor.

  host-pointer - `org.nd4j.linalg.api.memory.pointers.PagedPointer`
  device-pointer - `org.nd4j.linalg.api.memory.pointers.PagedPointer`"
  (^PointersPair [^org.nd4j.linalg.api.memory.pointers.PagedPointer host-pointer ^org.nd4j.linalg.api.memory.pointers.PagedPointer device-pointer]
    (new PointersPair host-pointer device-pointer)))

