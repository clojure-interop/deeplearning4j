(ns org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatNDArrayVector$Iterator]))

(defn ->iterator
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatNDArrayVector$Iterator [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatNDArrayVector$Iterator p))
  (^Nd4jCuda$FloatNDArrayVector$Iterator []
    (new Nd4jCuda$FloatNDArrayVector$Iterator )))

(defn increment
  "returns: `(value="operator++")   org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator`"
  ([^Nd4jCuda$FloatNDArrayVector$Iterator this]
    (-> this (.increment))))

(defn equals
  "it - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator`

  returns: `(value="operator==")  boolean`"
  ([^Nd4jCuda$FloatNDArrayVector$Iterator this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator it]
    (-> this (.equals it))))

(defn get
  "returns: `(value="operator*")   org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArrayVector$Iterator this]
    (-> this (.get))))

