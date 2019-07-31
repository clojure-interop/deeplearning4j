(ns org.nd4j.nativeblas.Nd4jCpu$double_squaredsubtract
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_squaredsubtract]))

(defn ->double-squaredsubtract
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_squaredsubtract [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_squaredsubtract p))
  (^Nd4jCpu$double_squaredsubtract []
    (new Nd4jCpu$double_squaredsubtract )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_squaredsubtract`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_squaredsubtract [^Nd4jCpu$double_squaredsubtract this ^Long position]
    (-> this (.position position))))

