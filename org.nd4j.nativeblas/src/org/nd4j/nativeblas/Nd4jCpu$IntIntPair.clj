(ns org.nd4j.nativeblas.Nd4jCpu$IntIntPair
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$IntIntPair]))

(defn ->int-int-pair
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$IntIntPair [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$IntIntPair p))
  (^Nd4jCpu$IntIntPair [^Integer first-value ^Integer second-value]
    (new Nd4jCpu$IntIntPair first-value second-value))
  (^Nd4jCpu$IntIntPair []
    (new Nd4jCpu$IntIntPair )))

(defn put
  "first-value - `int`
  second-value - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$IntIntPair this ^Integer first-value ^Integer second-value]
    (-> this (.put first-value second-value)))
  ([^Nd4jCpu$IntIntPair this ^org.nd4j.nativeblas.Nd4jCpu$IntIntPair x]
    (-> this (.put x))))

(defn first
  "first - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$IntIntPair this ^Integer first]
    (-> this (.first first)))
  (^Integer [^Nd4jCpu$IntIntPair this]
    (-> this (.first))))

(defn second
  "second - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$IntIntPair`"
  (^org.nd4j.nativeblas.Nd4jCpu$IntIntPair [^Nd4jCpu$IntIntPair this ^Integer second]
    (-> this (.second second)))
  (^Integer [^Nd4jCpu$IntIntPair this]
    (-> this (.second))))

