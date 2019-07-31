(ns org.nd4j.nativeblas.Nd4jCpu$half_Conditional
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_Conditional]))

(defn ->half-conditional
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_Conditional [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_Conditional p))
  (^Nd4jCpu$half_Conditional []
    (new Nd4jCpu$half_Conditional )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_Conditional`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_Conditional [^Nd4jCpu$half_Conditional this ^Long position]
    (-> this (.position position))))

