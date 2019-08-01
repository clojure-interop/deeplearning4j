(ns org.nd4j.nativeblas.Nd4jCpu$double_Conditional
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_Conditional]))

(defn ->double-conditional
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_Conditional [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_Conditional p))
  (^Nd4jCpu$double_Conditional []
    (new Nd4jCpu$double_Conditional )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_Conditional`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_Conditional [^Nd4jCpu$double_Conditional this ^Long position]
    (-> this (.position position))))

