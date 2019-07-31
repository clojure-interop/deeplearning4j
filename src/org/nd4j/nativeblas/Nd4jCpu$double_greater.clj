(ns org.nd4j.nativeblas.Nd4jCpu$double_greater
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_greater]))

(defn ->double-greater
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_greater [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_greater p))
  (^Nd4jCpu$double_greater []
    (new Nd4jCpu$double_greater )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_greater`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_greater [^Nd4jCpu$double_greater this ^Long position]
    (-> this (.position position))))

