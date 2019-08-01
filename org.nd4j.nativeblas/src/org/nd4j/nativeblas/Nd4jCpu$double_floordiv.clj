(ns org.nd4j.nativeblas.Nd4jCpu$double_floordiv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_floordiv]))

(defn ->double-floordiv
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_floordiv [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_floordiv p))
  (^Nd4jCpu$double_floordiv []
    (new Nd4jCpu$double_floordiv )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_floordiv`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_floordiv [^Nd4jCpu$double_floordiv this ^Long position]
    (-> this (.position position))))

