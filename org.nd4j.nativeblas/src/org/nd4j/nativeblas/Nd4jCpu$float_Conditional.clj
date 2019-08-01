(ns org.nd4j.nativeblas.Nd4jCpu$float_Conditional
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_Conditional]))

(defn ->float-conditional
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_Conditional [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_Conditional p))
  (^Nd4jCpu$float_Conditional []
    (new Nd4jCpu$float_Conditional )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_Conditional`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_Conditional [^Nd4jCpu$float_Conditional this ^Long position]
    (-> this (.position position))))

