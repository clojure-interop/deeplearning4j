(ns org.nd4j.nativeblas.Nd4jCpu$double_argmin
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_argmin]))

(defn ->double-argmin
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_argmin [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_argmin p))
  (^Nd4jCpu$double_argmin []
    (new Nd4jCpu$double_argmin )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_argmin`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_argmin [^Nd4jCpu$double_argmin this ^Long position]
    (-> this (.position position))))

