(ns org.nd4j.nativeblas.Nd4jCpu$double_realdiv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_realdiv]))

(defn ->double-realdiv
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_realdiv [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_realdiv p))
  (^Nd4jCpu$double_realdiv []
    (new Nd4jCpu$double_realdiv )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_realdiv`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_realdiv [^Nd4jCpu$double_realdiv this ^Long position]
    (-> this (.position position))))

