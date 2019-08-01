(ns org.nd4j.nativeblas.Nd4jCpu$half_greater
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_greater]))

(defn ->half-greater
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_greater [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_greater p))
  (^Nd4jCpu$half_greater []
    (new Nd4jCpu$half_greater )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_greater`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_greater [^Nd4jCpu$half_greater this ^Long position]
    (-> this (.position position))))

