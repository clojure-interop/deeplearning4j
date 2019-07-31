(ns org.nd4j.nativeblas.Nd4jCpu$float_Return
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_Return]))

(defn ->float-return
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_Return [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_Return p))
  (^Nd4jCpu$float_Return []
    (new Nd4jCpu$float_Return )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_Return`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_Return [^Nd4jCpu$float_Return this ^Long position]
    (-> this (.position position))))

