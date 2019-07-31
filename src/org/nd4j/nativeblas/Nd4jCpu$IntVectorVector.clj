(ns org.nd4j.nativeblas.Nd4jCpu$IntVectorVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$IntVectorVector]))

(defn ->int-vector-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$IntVectorVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$IntVectorVector p))
  (^Nd4jCpu$IntVectorVector []
    (new Nd4jCpu$IntVectorVector )))

(defn put
  "j - `long`
  value - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$IntVectorVector put((value="size_t") long i, @`"
  ([^Nd4jCpu$IntVectorVector this ^Long j ^Integer value]
    (-> this (.put j value)))
  ([^Nd4jCpu$IntVectorVector this ^org.nd4j.nativeblas.Nd4jCpu$IntVectorVector x]
    (-> this (.put x))))

(defn empty
  "i - `long`

  returns: `boolean`"
  (^Boolean [^Nd4jCpu$IntVectorVector this ^Long i]
    (-> this (.empty i)))
  (^Boolean [^Nd4jCpu$IntVectorVector this]
    (-> this (.empty))))

(defn size
  "i - `long`

  returns: `(function="at")  long`"
  ([^Nd4jCpu$IntVectorVector this ^Long i]
    (-> this (.size i)))
  (^Long [^Nd4jCpu$IntVectorVector this]
    (-> this (.size))))

(defn clear
  "i - `long`"
  ([^Nd4jCpu$IntVectorVector this ^Long i]
    (-> this (.clear i)))
  ([^Nd4jCpu$IntVectorVector this]
    (-> this (.clear))))

(defn resize
  "n - `long`"
  ([^Nd4jCpu$IntVectorVector this ^Long n]
    (-> this (.resize n))))

(defn get
  "j - `long`

  returns: `(function="at")  int get((value="size_t") long i, @`"
  ([^Nd4jCpu$IntVectorVector this ^Long j]
    (-> this (.get j)))
  ([^Nd4jCpu$IntVectorVector this]
    (-> this (.get))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCpu$IntVectorVector this]
    (-> this (.toString))))

