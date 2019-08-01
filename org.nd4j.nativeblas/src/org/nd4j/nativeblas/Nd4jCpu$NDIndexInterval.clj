(ns org.nd4j.nativeblas.Nd4jCpu$NDIndexInterval
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$NDIndexInterval]))

(defn ->nd-index-interval
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$NDIndexInterval [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$NDIndexInterval p)))

