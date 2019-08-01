(ns org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatNDArrayVector]))

(defn ->float-nd-array-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatNDArrayVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatNDArrayVector p))
  (^Nd4jCuda$FloatNDArrayVector []
    (new Nd4jCuda$FloatNDArrayVector )))

(defn begin
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator [^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.begin))))

(defn put
  "i - `long`
  value - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector [^Nd4jCuda$FloatNDArrayVector this ^Long i ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray value]
    (-> this (.put i value)))
  ([^Nd4jCuda$FloatNDArrayVector this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector x]
    (-> this (.put x))))

(defn pop-back
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.pop_back))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.toString))))

(defn push-back
  "value - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector [^Nd4jCuda$FloatNDArrayVector this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray value]
    (-> this (.push_back value))))

(defn empty
  "returns: `boolean`"
  (^Boolean [^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.empty))))

(defn resize
  "n - `long`"
  ([^Nd4jCuda$FloatNDArrayVector this ^Long n]
    (-> this (.resize n))))

(defn size
  "returns: `long`"
  (^Long [^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.size))))

(defn clear
  ""
  ([^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.clear))))

(defn get
  "i - `long`

  returns: `(function="at")  org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatNDArrayVector this ^Long i]
    (-> this (.get i)))
  ([^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.get))))

(defn end
  "returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArrayVector$Iterator [^Nd4jCuda$FloatNDArrayVector this]
    (-> this (.end))))

