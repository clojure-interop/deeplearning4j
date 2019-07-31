(ns org.nd4j.nativeblas.Nd4jCpu$double_divide
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_divide]))

(defn ->double-divide
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_divide [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_divide p))
  (^Nd4jCpu$double_divide []
    (new Nd4jCpu$double_divide )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_divide`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_divide [^Nd4jCpu$double_divide this ^Long position]
    (-> this (.position position))))

