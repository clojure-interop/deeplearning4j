(ns org.nd4j.nativeblas.Nd4jCpu$half_not_equals
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_not_equals]))

(defn ->half-not-equals
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_not_equals [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_not_equals p))
  (^Nd4jCpu$half_not_equals []
    (new Nd4jCpu$half_not_equals )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_not_equals`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_not_equals [^Nd4jCpu$half_not_equals this ^Long position]
    (-> this (.position position))))

