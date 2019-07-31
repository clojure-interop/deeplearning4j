(ns org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleNDArrayVector]))

(defn ->double-nd-array-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleNDArrayVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleNDArrayVector p))
  (^Nd4jCuda$DoubleNDArrayVector []
    (new Nd4jCuda$DoubleNDArrayVector )))

(defn begin
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator [^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.begin))))

(defn put
  "i - `long`
  value - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector [^Nd4jCuda$DoubleNDArrayVector this ^Long i ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray value]
    (-> this (.put i value)))
  ([^Nd4jCuda$DoubleNDArrayVector this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector x]
    (-> this (.put x))))

(defn pop-back
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray [^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.pop_back))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.toString))))

(defn push-back
  "value - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector [^Nd4jCuda$DoubleNDArrayVector this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray value]
    (-> this (.push_back value))))

(defn empty
  "returns: `boolean`"
  (^Boolean [^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.empty))))

(defn resize
  "n - `long`"
  ([^Nd4jCuda$DoubleNDArrayVector this ^Long n]
    (-> this (.resize n))))

(defn size
  "returns: `long`"
  (^Long [^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.size))))

(defn clear
  ""
  ([^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.clear))))

(defn get
  "i - `long`

  returns: `(function="at")  org.nd4j.nativeblas.Nd4jCuda$DoubleNDArray`"
  ([^Nd4jCuda$DoubleNDArrayVector this ^Long i]
    (-> this (.get i)))
  ([^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.get))))

(defn end
  "returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector$Iterator [^Nd4jCuda$DoubleNDArrayVector this]
    (-> this (.end))))

