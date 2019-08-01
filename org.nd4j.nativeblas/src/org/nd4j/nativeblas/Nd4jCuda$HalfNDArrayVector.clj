(ns org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfNDArrayVector]))

(defn ->half-nd-array-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfNDArrayVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfNDArrayVector p))
  (^Nd4jCuda$HalfNDArrayVector []
    (new Nd4jCuda$HalfNDArrayVector )))

(defn begin
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator [^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.begin))))

(defn put
  "i - `long`
  value - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector [^Nd4jCuda$HalfNDArrayVector this ^Long i ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray value]
    (-> this (.put i value)))
  ([^Nd4jCuda$HalfNDArrayVector this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector x]
    (-> this (.put x))))

(defn pop-back
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray [^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.pop_back))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.toString))))

(defn push-back
  "value - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector [^Nd4jCuda$HalfNDArrayVector this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArray value]
    (-> this (.push_back value))))

(defn empty
  "returns: `boolean`"
  (^Boolean [^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.empty))))

(defn resize
  "n - `long`"
  ([^Nd4jCuda$HalfNDArrayVector this ^Long n]
    (-> this (.resize n))))

(defn size
  "returns: `long`"
  (^Long [^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.size))))

(defn clear
  ""
  ([^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.clear))))

(defn get
  "i - `long`

  returns: `(function="at")  org.nd4j.nativeblas.Nd4jCuda$HalfNDArray`"
  ([^Nd4jCuda$HalfNDArrayVector this ^Long i]
    (-> this (.get i)))
  ([^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.get))))

(defn end
  "returns: `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector$Iterator [^Nd4jCuda$HalfNDArrayVector this]
    (-> this (.end))))

