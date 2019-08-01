(ns org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatNDArrayVector$Iterator]))

(defn ->iterator
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatNDArrayVector$Iterator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatNDArrayVector$Iterator p))
  (^Nd4jCpu$FloatNDArrayVector$Iterator []
    (new Nd4jCpu$FloatNDArrayVector$Iterator )))

(defn increment
  "returns: `(value="operator++")   org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator`"
  ([^Nd4jCpu$FloatNDArrayVector$Iterator this]
    (-> this (.increment))))

(defn equals
  "it - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator`

  returns: `(value="operator==")  boolean`"
  ([^Nd4jCpu$FloatNDArrayVector$Iterator this ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator it]
    (-> this (.equals it))))

(defn get
  "returns: `(value="operator*")   org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  ([^Nd4jCpu$FloatNDArrayVector$Iterator this]
    (-> this (.get))))

