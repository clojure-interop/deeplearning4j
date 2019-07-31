(ns org.nd4j.nativeblas.Nd4jCpu$double_less_equal
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_less_equal]))

(defn ->double-less-equal
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_less_equal [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_less_equal p))
  (^Nd4jCpu$double_less_equal []
    (new Nd4jCpu$double_less_equal )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_less_equal`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_less_equal [^Nd4jCpu$double_less_equal this ^Long position]
    (-> this (.position position))))

