(ns org.nd4j.jita.allocator.pointers.PointersPair
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.pointers PointersPair]))

(defn ->pointers-pair
  "Constructor.

  device-pointer - `long`
  host-pointer - `long`"
  (^PointersPair [^Long device-pointer ^Long host-pointer]
    (new PointersPair device-pointer host-pointer)))

