(ns org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfNDArrayVector$Iterator]))

(defn ->iterator
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfNDArrayVector$Iterator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfNDArrayVector$Iterator p))
  (^Nd4jCpu$HalfNDArrayVector$Iterator []
    (new Nd4jCpu$HalfNDArrayVector$Iterator )))

(defn increment
  "returns: `(value="operator++")   org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator`"
  ([^Nd4jCpu$HalfNDArrayVector$Iterator this]
    (-> this (.increment))))

(defn equals
  "it - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator`

  returns: `(value="operator==")  boolean`"
  ([^Nd4jCpu$HalfNDArrayVector$Iterator this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator it]
    (-> this (.equals it))))

(defn get
  "returns: `(value="operator*")   org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  ([^Nd4jCpu$HalfNDArrayVector$Iterator this]
    (-> this (.get))))

