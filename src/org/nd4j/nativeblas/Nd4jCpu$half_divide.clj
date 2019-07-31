(ns org.nd4j.nativeblas.Nd4jCpu$half_divide
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_divide]))

(defn ->half-divide
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_divide [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_divide p))
  (^Nd4jCpu$half_divide []
    (new Nd4jCpu$half_divide )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_divide`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_divide [^Nd4jCpu$half_divide this ^Long position]
    (-> this (.position position))))

