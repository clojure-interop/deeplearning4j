(ns org.nd4j.nativeblas.Nd4jCpu$half_truncatediv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_truncatediv]))

(defn ->half-truncatediv
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_truncatediv [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_truncatediv p))
  (^Nd4jCpu$half_truncatediv []
    (new Nd4jCpu$half_truncatediv )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_truncatediv`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_truncatediv [^Nd4jCpu$half_truncatediv this ^Long position]
    (-> this (.position position))))

