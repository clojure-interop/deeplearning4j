(ns org.nd4j.nativeblas.Nd4jCpu$float_boolean_or
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_boolean_or]))

(defn ->float-boolean-or
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_boolean_or [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_boolean_or p))
  (^Nd4jCpu$float_boolean_or []
    (new Nd4jCpu$float_boolean_or )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_boolean_or`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_boolean_or [^Nd4jCpu$float_boolean_or this ^Long position]
    (-> this (.position position))))

