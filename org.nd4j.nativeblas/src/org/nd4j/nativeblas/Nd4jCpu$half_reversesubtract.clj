(ns org.nd4j.nativeblas.Nd4jCpu$half_reversesubtract
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_reversesubtract]))

(defn ->half-reversesubtract
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_reversesubtract [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_reversesubtract p))
  (^Nd4jCpu$half_reversesubtract []
    (new Nd4jCpu$half_reversesubtract )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_reversesubtract`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_reversesubtract [^Nd4jCpu$half_reversesubtract this ^Long position]
    (-> this (.position position))))

