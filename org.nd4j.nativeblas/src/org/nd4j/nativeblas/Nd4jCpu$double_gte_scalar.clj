(ns org.nd4j.nativeblas.Nd4jCpu$double_gte_scalar
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_gte_scalar]))

(defn ->double-gte-scalar
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_gte_scalar [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_gte_scalar p))
  (^Nd4jCpu$double_gte_scalar []
    (new Nd4jCpu$double_gte_scalar )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_gte_scalar`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_gte_scalar [^Nd4jCpu$double_gte_scalar this ^Long position]
    (-> this (.position position))))

