(ns org.nd4j.nativeblas.Nd4jCpu$half_multiply
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_multiply]))

(defn ->half-multiply
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_multiply [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_multiply p))
  (^Nd4jCpu$half_multiply []
    (new Nd4jCpu$half_multiply )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_multiply`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_multiply [^Nd4jCpu$half_multiply this ^Long position]
    (-> this (.position position))))

