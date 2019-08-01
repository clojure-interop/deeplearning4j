(ns org.nd4j.nativeblas.Nd4jCpu$half_equals
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_equals]))

(defn ->half-equals
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_equals [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_equals p))
  (^Nd4jCpu$half_equals []
    (new Nd4jCpu$half_equals )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_equals`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_equals [^Nd4jCpu$half_equals this ^Long position]
    (-> this (.position position))))

