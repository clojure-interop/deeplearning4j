(ns org.nd4j.nativeblas.Nd4jCpu$double_is_non_decreasing
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_is_non_decreasing]))

(defn ->double-is-non-decreasing
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_is_non_decreasing [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_is_non_decreasing p))
  (^Nd4jCpu$double_is_non_decreasing []
    (new Nd4jCpu$double_is_non_decreasing )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_is_non_decreasing`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_is_non_decreasing [^Nd4jCpu$double_is_non_decreasing this ^Long position]
    (-> this (.position position))))

