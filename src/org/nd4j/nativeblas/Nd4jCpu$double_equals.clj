(ns org.nd4j.nativeblas.Nd4jCpu$double_equals
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_equals]))

(defn ->double-equals
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_equals [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_equals p))
  (^Nd4jCpu$double_equals []
    (new Nd4jCpu$double_equals )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_equals`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_equals [^Nd4jCpu$double_equals this ^Long position]
    (-> this (.position position))))

