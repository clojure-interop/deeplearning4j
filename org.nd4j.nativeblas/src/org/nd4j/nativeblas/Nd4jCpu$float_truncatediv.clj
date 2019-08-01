(ns org.nd4j.nativeblas.Nd4jCpu$float_truncatediv
  "\\tparam T"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_truncatediv]))

(defn ->float-truncatediv
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_truncatediv [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_truncatediv p))
  (^Nd4jCpu$float_truncatediv []
    (new Nd4jCpu$float_truncatediv )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_truncatediv`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_truncatediv [^Nd4jCpu$float_truncatediv this ^Long position]
    (-> this (.position position))))

