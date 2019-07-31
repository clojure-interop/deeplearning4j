(ns org.nd4j.nativeblas.Nd4jCpu$double_add
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_add]))

(defn ->double-add
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_add [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_add p))
  (^Nd4jCpu$double_add []
    (new Nd4jCpu$double_add )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_add`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_add [^Nd4jCpu$double_add this ^Long position]
    (-> this (.position position))))

