(ns org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfNDArrayVector$Iterator]))

(defn ->iterator
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfNDArrayVector$Iterator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfNDArrayVector$Iterator p))
  (^Nd4jCuda$HalfNDArrayVector$Iterator []
    (new Nd4jCuda$HalfNDArrayVector$Iterator )))

(defn increment
  "returns: `(value="operator++")   org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator`"
  ([^Nd4jCuda$HalfNDArrayVector$Iterator this]
    (-> this (.increment))))

(defn equals
  "it - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator`

  returns: `(value="operator==")  boolean`"
  ([^Nd4jCuda$HalfNDArrayVector$Iterator this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator it]
    (-> this (.equals it))))

(defn get
  "returns: `(value="operator*")   org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  ([^Nd4jCuda$HalfNDArrayVector$Iterator this]
    (-> this (.get))))

