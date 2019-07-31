(ns org.nd4j.nativeblas.Nd4jCpu$half_squaredsubtract
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_squaredsubtract]))

(defn ->half-squaredsubtract
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_squaredsubtract [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_squaredsubtract p))
  (^Nd4jCpu$half_squaredsubtract []
    (new Nd4jCpu$half_squaredsubtract )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_squaredsubtract`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_squaredsubtract [^Nd4jCpu$half_squaredsubtract this ^Long position]
    (-> this (.position position))))

