(ns org.nd4j.nativeblas.Nd4jCpu$double_greater_equal
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_greater_equal]))

(defn ->double-greater-equal
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_greater_equal [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_greater_equal p))
  (^Nd4jCpu$double_greater_equal []
    (new Nd4jCpu$double_greater_equal )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_greater_equal`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_greater_equal [^Nd4jCpu$double_greater_equal this ^Long position]
    (-> this (.position position))))

