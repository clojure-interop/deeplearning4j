(ns org.nd4j.nativeblas.Nd4jCpu$double_norm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_norm]))

(defn ->double-norm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_norm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_norm p))
  (^Nd4jCpu$double_norm []
    (new Nd4jCpu$double_norm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_norm`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_norm [^Nd4jCpu$double_norm this ^Long position]
    (-> this (.position position))))

