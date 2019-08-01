(ns org.nd4j.nativeblas.Nd4jCpu$half_minimum
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_minimum]))

(defn ->half-minimum
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_minimum [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_minimum p))
  (^Nd4jCpu$half_minimum []
    (new Nd4jCpu$half_minimum )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_minimum`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_minimum [^Nd4jCpu$half_minimum this ^Long position]
    (-> this (.position position))))

