(ns org.nd4j.nativeblas.Nd4jCpu$double_mod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_mod]))

(defn ->double-mod
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_mod [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_mod p))
  (^Nd4jCpu$double_mod []
    (new Nd4jCpu$double_mod )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_mod`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_mod [^Nd4jCpu$double_mod this ^Long position]
    (-> this (.position position))))

