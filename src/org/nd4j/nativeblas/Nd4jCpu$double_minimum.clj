(ns org.nd4j.nativeblas.Nd4jCpu$double_minimum
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_minimum]))

(defn ->double-minimum
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_minimum [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_minimum p))
  (^Nd4jCpu$double_minimum []
    (new Nd4jCpu$double_minimum )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_minimum`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_minimum [^Nd4jCpu$double_minimum this ^Long position]
    (-> this (.position position))))

