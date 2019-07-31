(ns org.nd4j.nativeblas.Nd4jCpu$double_less
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_less]))

(defn ->double-less
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_less [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_less p))
  (^Nd4jCpu$double_less []
    (new Nd4jCpu$double_less )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_less`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_less [^Nd4jCpu$double_less this ^Long position]
    (-> this (.position position))))

