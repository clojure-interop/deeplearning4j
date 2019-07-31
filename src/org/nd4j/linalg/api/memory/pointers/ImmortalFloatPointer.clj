(ns org.nd4j.linalg.api.memory.pointers.ImmortalFloatPointer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.pointers ImmortalFloatPointer]))

(defn ->immortal-float-pointer
  "Constructor.

  pointer - `org.nd4j.linalg.api.memory.pointers.PagedPointer`"
  (^ImmortalFloatPointer [^org.nd4j.linalg.api.memory.pointers.PagedPointer pointer]
    (new ImmortalFloatPointer pointer)))

