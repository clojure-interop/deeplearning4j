(ns org.nd4j.nativeblas.Nd4jCpu$half_add
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_add]))

(defn ->half-add
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_add [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_add p))
  (^Nd4jCpu$half_add []
    (new Nd4jCpu$half_add )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_add`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_add [^Nd4jCpu$half_add this ^Long position]
    (-> this (.position position))))

