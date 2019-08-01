(ns org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleNDArrayVector]))

(defn ->double-nd-array-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleNDArrayVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleNDArrayVector p))
  (^Nd4jCpu$DoubleNDArrayVector []
    (new Nd4jCpu$DoubleNDArrayVector )))

(defn begin
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator [^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.begin))))

(defn put
  "i - `long`
  value - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector [^Nd4jCpu$DoubleNDArrayVector this ^Long i ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray value]
    (-> this (.put i value)))
  ([^Nd4jCpu$DoubleNDArrayVector this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector x]
    (-> this (.put x))))

(defn pop-back
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray [^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.pop_back))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.toString))))

(defn push-back
  "value - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector [^Nd4jCpu$DoubleNDArrayVector this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray value]
    (-> this (.push_back value))))

(defn empty
  "returns: `boolean`"
  (^Boolean [^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.empty))))

(defn resize
  "n - `long`"
  ([^Nd4jCpu$DoubleNDArrayVector this ^Long n]
    (-> this (.resize n))))

(defn size
  "returns: `long`"
  (^Long [^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.size))))

(defn clear
  ""
  ([^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.clear))))

(defn get
  "i - `long`

  returns: `(function="at")  org.nd4j.nativeblas.Nd4jCpu$DoubleNDArray`"
  ([^Nd4jCpu$DoubleNDArrayVector this ^Long i]
    (-> this (.get i)))
  ([^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.get))))

(defn end
  "returns: `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector$Iterator [^Nd4jCpu$DoubleNDArrayVector this]
    (-> this (.end))))

