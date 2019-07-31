(ns org.nd4j.nativeblas.Nd4jCpu$NDIndexPoint
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$NDIndexPoint]))

(defn ->nd-index-point
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$NDIndexPoint [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$NDIndexPoint p)))

