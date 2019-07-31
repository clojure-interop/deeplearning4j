(ns org.nd4j.nativeblas.Nd4jCpu$double_multiply
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_multiply]))

(defn ->double-multiply
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_multiply [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_multiply p))
  (^Nd4jCpu$double_multiply []
    (new Nd4jCpu$double_multiply )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_multiply`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_multiply [^Nd4jCpu$double_multiply this ^Long position]
    (-> this (.position position))))

