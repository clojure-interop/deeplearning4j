(ns org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleNDArrayVector$Iterator]))

(defn ->iterator
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleNDArrayVector$Iterator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleNDArrayVector$Iterator p))
  (^Nd4jCpu$DoubleNDArrayVector$Iterator []
    (new Nd4jCpu$DoubleNDArrayVector$Iterator )))

(defn increment
  "returns: `(value="operator++")   org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator`"
  ([^Nd4jCpu$DoubleNDArrayVector$Iterator this]
    (-> this (.increment))))

(defn equals
  "it - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator`

  returns: `(value="operator==")  boolean`"
  ([^Nd4jCpu$DoubleNDArrayVector$Iterator this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator it]
    (-> this (.equals it))))

(defn get
  "returns: `(value="operator*")   org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  ([^Nd4jCpu$DoubleNDArrayVector$Iterator this]
    (-> this (.get))))

