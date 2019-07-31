(ns org.nd4j.nativeblas.Nd4jCpu$double_maximum
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_maximum]))

(defn ->double-maximum
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_maximum [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_maximum p))
  (^Nd4jCpu$double_maximum []
    (new Nd4jCpu$double_maximum )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_maximum`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_maximum [^Nd4jCpu$double_maximum this ^Long position]
    (-> this (.position position))))

