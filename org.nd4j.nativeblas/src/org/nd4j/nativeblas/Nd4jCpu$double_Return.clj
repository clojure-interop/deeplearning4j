(ns org.nd4j.nativeblas.Nd4jCpu$double_Return
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_Return]))

(defn ->double-return
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_Return [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_Return p))
  (^Nd4jCpu$double_Return []
    (new Nd4jCpu$double_Return )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_Return`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_Return [^Nd4jCpu$double_Return this ^Long position]
    (-> this (.position position))))

