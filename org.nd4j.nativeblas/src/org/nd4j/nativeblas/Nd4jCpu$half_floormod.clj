(ns org.nd4j.nativeblas.Nd4jCpu$half_floormod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_floormod]))

(defn ->half-floormod
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_floormod [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_floormod p))
  (^Nd4jCpu$half_floormod []
    (new Nd4jCpu$half_floormod )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_floormod`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_floormod [^Nd4jCpu$half_floormod this ^Long position]
    (-> this (.position position))))

