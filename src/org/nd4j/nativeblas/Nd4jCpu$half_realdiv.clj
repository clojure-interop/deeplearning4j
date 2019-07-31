(ns org.nd4j.nativeblas.Nd4jCpu$half_realdiv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_realdiv]))

(defn ->half-realdiv
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_realdiv [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_realdiv p))
  (^Nd4jCpu$half_realdiv []
    (new Nd4jCpu$half_realdiv )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_realdiv`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_realdiv [^Nd4jCpu$half_realdiv this ^Long position]
    (-> this (.position position))))

