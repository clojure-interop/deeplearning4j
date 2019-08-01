(ns org.nd4j.nativeblas.Nd4jCpu$double_truncatediv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_truncatediv]))

(defn ->double-truncatediv
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_truncatediv [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_truncatediv p))
  (^Nd4jCpu$double_truncatediv []
    (new Nd4jCpu$double_truncatediv )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_truncatediv`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_truncatediv [^Nd4jCpu$double_truncatediv this ^Long position]
    (-> this (.position position))))

