(ns org.nd4j.nativeblas.Nd4jCuda$NDIndexInterval
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$NDIndexInterval]))

(defn ->nd-index-interval
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$NDIndexInterval [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$NDIndexInterval p)))

