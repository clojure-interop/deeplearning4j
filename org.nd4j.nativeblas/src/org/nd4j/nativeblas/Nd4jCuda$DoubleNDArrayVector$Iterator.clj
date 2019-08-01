(ns org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleNDArrayVector$Iterator]))

(defn ->iterator
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleNDArrayVector$Iterator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleNDArrayVector$Iterator p))
  (^Nd4jCuda$DoubleNDArrayVector$Iterator []
    (new Nd4jCuda$DoubleNDArrayVector$Iterator )))

(defn increment
  "returns: `(value="operator++")   org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator`"
  ([^Nd4jCuda$DoubleNDArrayVector$Iterator this]
    (-> this (.increment))))

(defn equals
  "it - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator`

  returns: `(value="operator==")  boolean`"
  ([^Nd4jCuda$DoubleNDArrayVector$Iterator this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator it]
    (-> this (.equals it))))

(defn get
  "returns: `(value="operator*")   org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  ([^Nd4jCuda$DoubleNDArrayVector$Iterator this]
    (-> this (.get))))

