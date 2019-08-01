(ns org.nd4j.nativeblas.Nd4jCpu$float_boolean_and
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_boolean_and]))

(defn ->float-boolean-and
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_boolean_and [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_boolean_and p))
  (^Nd4jCpu$float_boolean_and []
    (new Nd4jCpu$float_boolean_and )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_boolean_and`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_boolean_and [^Nd4jCpu$float_boolean_and this ^Long position]
    (-> this (.position position))))

