(ns org.nd4j.nativeblas.Nd4jCuda$IntIntPair
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$IntIntPair]))

(defn ->int-int-pair
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$IntIntPair [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$IntIntPair p))
  (^Nd4jCuda$IntIntPair [^Integer first-value ^Integer second-value]
    (new Nd4jCuda$IntIntPair first-value second-value))
  (^Nd4jCuda$IntIntPair []
    (new Nd4jCuda$IntIntPair )))

(defn put
  "first-value - `int`
  second-value - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$IntIntPair this ^Integer first-value ^Integer second-value]
    (-> this (.put first-value second-value)))
  ([^Nd4jCuda$IntIntPair this ^org.nd4j.nativeblas.Nd4jCuda$IntIntPair x]
    (-> this (.put x))))

(defn first
  "first - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$IntIntPair this ^Integer first]
    (-> this (.first first)))
  (^Integer [^Nd4jCuda$IntIntPair this]
    (-> this (.first))))

(defn second
  "second - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCuda$IntIntPair [^Nd4jCuda$IntIntPair this ^Integer second]
    (-> this (.second second)))
  (^Integer [^Nd4jCuda$IntIntPair this]
    (-> this (.second))))

