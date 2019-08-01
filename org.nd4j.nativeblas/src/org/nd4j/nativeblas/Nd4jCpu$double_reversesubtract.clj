(ns org.nd4j.nativeblas.Nd4jCpu$double_reversesubtract
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_reversesubtract]))

(defn ->double-reversesubtract
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_reversesubtract [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_reversesubtract p))
  (^Nd4jCpu$double_reversesubtract []
    (new Nd4jCpu$double_reversesubtract )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_reversesubtract`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_reversesubtract [^Nd4jCpu$double_reversesubtract this ^Long position]
    (-> this (.position position))))

