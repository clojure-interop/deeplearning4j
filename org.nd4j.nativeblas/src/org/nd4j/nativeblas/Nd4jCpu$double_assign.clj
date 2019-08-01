(ns org.nd4j.nativeblas.Nd4jCpu$double_assign
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_assign]))

(defn ->double-assign
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_assign [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_assign p))
  (^Nd4jCpu$double_assign []
    (new Nd4jCpu$double_assign )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_assign`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_assign [^Nd4jCpu$double_assign this ^Long position]
    (-> this (.position position))))

