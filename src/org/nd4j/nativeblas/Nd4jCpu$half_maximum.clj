(ns org.nd4j.nativeblas.Nd4jCpu$half_maximum
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_maximum]))

(defn ->half-maximum
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_maximum [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_maximum p))
  (^Nd4jCpu$half_maximum []
    (new Nd4jCpu$half_maximum )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_maximum`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_maximum [^Nd4jCpu$half_maximum this ^Long position]
    (-> this (.position position))))

