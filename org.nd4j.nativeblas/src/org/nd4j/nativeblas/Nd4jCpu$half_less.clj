(ns org.nd4j.nativeblas.Nd4jCpu$half_less
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_less]))

(defn ->half-less
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_less [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_less p))
  (^Nd4jCpu$half_less []
    (new Nd4jCpu$half_less )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_less`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_less [^Nd4jCpu$half_less this ^Long position]
    (-> this (.position position))))

