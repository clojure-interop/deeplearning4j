(ns org.nd4j.nativeblas.Nd4jCpu$LongVectorVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$LongVectorVector]))

(defn ->long-vector-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$LongVectorVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$LongVectorVector p))
  (^Nd4jCpu$LongVectorVector []
    (new Nd4jCpu$LongVectorVector )))

(defn put
  "j - `long`
  value - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$LongVectorVector put((value="size_t") long i, @`"
  ([^Nd4jCpu$LongVectorVector this ^Long j ^Long value]
    (-> this (.put j value)))
  ([^Nd4jCpu$LongVectorVector this ^org.nd4j.nativeblas.Nd4jCpu$LongVectorVector x]
    (-> this (.put x))))

(defn empty
  "i - `long`

  returns: `boolean`"
  (^Boolean [^Nd4jCpu$LongVectorVector this ^Long i]
    (-> this (.empty i)))
  (^Boolean [^Nd4jCpu$LongVectorVector this]
    (-> this (.empty))))

(defn size
  "i - `long`

  returns: `(function="at")  long`"
  ([^Nd4jCpu$LongVectorVector this ^Long i]
    (-> this (.size i)))
  (^Long [^Nd4jCpu$LongVectorVector this]
    (-> this (.size))))

(defn clear
  "i - `long`"
  ([^Nd4jCpu$LongVectorVector this ^Long i]
    (-> this (.clear i)))
  ([^Nd4jCpu$LongVectorVector this]
    (-> this (.clear))))

(defn resize
  "n - `long`"
  ([^Nd4jCpu$LongVectorVector this ^Long n]
    (-> this (.resize n))))

(defn get
  "j - `long`

  returns: `(function="at") (value="Nd4jLong")  long get((value="size_t") long i, @`"
  ([^Nd4jCpu$LongVectorVector this ^Long j]
    (-> this (.get j)))
  ([^Nd4jCpu$LongVectorVector this]
    (-> this (.get))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCpu$LongVectorVector this]
    (-> this (.toString))))

