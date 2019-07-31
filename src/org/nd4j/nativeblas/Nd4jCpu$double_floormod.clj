(ns org.nd4j.nativeblas.Nd4jCpu$double_floormod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_floormod]))

(defn ->double-floormod
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_floormod [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_floormod p))
  (^Nd4jCpu$double_floormod []
    (new Nd4jCpu$double_floormod )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_floormod`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_floormod [^Nd4jCpu$double_floormod this ^Long position]
    (-> this (.position position))))

