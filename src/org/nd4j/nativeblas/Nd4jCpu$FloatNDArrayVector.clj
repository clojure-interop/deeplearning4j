(ns org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatNDArrayVector]))

(defn ->float-nd-array-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatNDArrayVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatNDArrayVector p))
  (^Nd4jCpu$FloatNDArrayVector []
    (new Nd4jCpu$FloatNDArrayVector )))

(defn begin
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator [^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.begin))))

(defn put
  "i - `long`
  value - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector [^Nd4jCpu$FloatNDArrayVector this ^Long i ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray value]
    (-> this (.put i value)))
  ([^Nd4jCpu$FloatNDArrayVector this ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector x]
    (-> this (.put x))))

(defn pop-back
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray [^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.pop_back))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.toString))))

(defn push-back
  "value - `org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector [^Nd4jCpu$FloatNDArrayVector this ^org.nd4j.nativeblas.Nd4jCpu$FloatNDArray value]
    (-> this (.push_back value))))

(defn empty
  "returns: `boolean`"
  (^Boolean [^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.empty))))

(defn resize
  "n - `long`"
  ([^Nd4jCpu$FloatNDArrayVector this ^Long n]
    (-> this (.resize n))))

(defn size
  "returns: `long`"
  (^Long [^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.size))))

(defn clear
  ""
  ([^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.clear))))

(defn get
  "i - `long`

  returns: `(function="at")  org.nd4j.nativeblas.Nd4jCpu$FloatNDArray`"
  ([^Nd4jCpu$FloatNDArrayVector this ^Long i]
    (-> this (.get i)))
  ([^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.get))))

(defn end
  "returns: `org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCpu$FloatNDArrayVector$Iterator [^Nd4jCpu$FloatNDArrayVector this]
    (-> this (.end))))

