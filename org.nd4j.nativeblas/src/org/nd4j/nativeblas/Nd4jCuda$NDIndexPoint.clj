(ns org.nd4j.nativeblas.Nd4jCuda$NDIndexPoint
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$NDIndexPoint]))

(defn ->nd-index-point
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$NDIndexPoint [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$NDIndexPoint p)))

