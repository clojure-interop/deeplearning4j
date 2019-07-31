(ns org.nd4j.nativeblas.Nd4jCuda$IntVectorVector
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$IntVectorVector]))

(defn ->int-vector-vector
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$IntVectorVector [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$IntVectorVector p))
  (^Nd4jCuda$IntVectorVector []
    (new Nd4jCuda$IntVectorVector )))

(defn put
  "j - `long`
  value - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$IntVectorVector put((value="size_t") long i, @`"
  ([^Nd4jCuda$IntVectorVector this ^Long j ^Integer value]
    (-> this (.put j value)))
  ([^Nd4jCuda$IntVectorVector this ^org.nd4j.nativeblas.Nd4jCuda$IntVectorVector x]
    (-> this (.put x))))

(defn empty
  "i - `long`

  returns: `boolean`"
  (^Boolean [^Nd4jCuda$IntVectorVector this ^Long i]
    (-> this (.empty i)))
  (^Boolean [^Nd4jCuda$IntVectorVector this]
    (-> this (.empty))))

(defn size
  "i - `long`

  returns: `(function="at")  long`"
  ([^Nd4jCuda$IntVectorVector this ^Long i]
    (-> this (.size i)))
  (^Long [^Nd4jCuda$IntVectorVector this]
    (-> this (.size))))

(defn clear
  "i - `long`"
  ([^Nd4jCuda$IntVectorVector this ^Long i]
    (-> this (.clear i)))
  ([^Nd4jCuda$IntVectorVector this]
    (-> this (.clear))))

(defn resize
  "n - `long`"
  ([^Nd4jCuda$IntVectorVector this ^Long n]
    (-> this (.resize n))))

(defn get
  "j - `long`

  returns: `(function="at")  int get((value="size_t") long i, @`"
  ([^Nd4jCuda$IntVectorVector this ^Long j]
    (-> this (.get j)))
  ([^Nd4jCuda$IntVectorVector this]
    (-> this (.get))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jCuda$IntVectorVector this]
    (-> this (.toString))))

