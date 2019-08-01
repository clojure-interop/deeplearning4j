(ns org.nd4j.nativeblas.Nd4jCpu$half_Return
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_Return]))

(defn ->half-return
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_Return [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_Return p))
  (^Nd4jCpu$half_Return []
    (new Nd4jCpu$half_Return )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_Return`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_Return [^Nd4jCpu$half_Return this ^Long position]
    (-> this (.position position))))

