(ns org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfNDArrayVector]))

(defn ->half-nd-array-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfNDArrayVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfNDArrayVector p))
  (^Nd4jCpu$HalfNDArrayVector []
    (new Nd4jCpu$HalfNDArrayVector )))

(defn begin
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator [^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.begin))))

(defn put
  "i - `long`
  value - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector [^Nd4jCpu$HalfNDArrayVector this ^Long i ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray value]
    (-> this (.put i value)))
  ([^Nd4jCpu$HalfNDArrayVector this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector x]
    (-> this (.put x))))

(defn pop-back
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray [^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.pop_back))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.toString))))

(defn push-back
  "value - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector [^Nd4jCpu$HalfNDArrayVector this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArray value]
    (-> this (.push_back value))))

(defn empty
  "returns: `boolean`"
  (^Boolean [^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.empty))))

(defn resize
  "n - `long`"
  ([^Nd4jCpu$HalfNDArrayVector this ^Long n]
    (-> this (.resize n))))

(defn size
  "returns: `long`"
  (^Long [^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.size))))

(defn clear
  ""
  ([^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.clear))))

(defn get
  "i - `long`

  returns: `(function="at")  org.nd4j.nativeblas.Nd4jCpu$HalfNDArray`"
  ([^Nd4jCpu$HalfNDArrayVector this ^Long i]
    (-> this (.get i)))
  ([^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.get))))

(defn end
  "returns: `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector$Iterator [^Nd4jCpu$HalfNDArrayVector this]
    (-> this (.end))))

