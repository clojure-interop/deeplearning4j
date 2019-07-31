(ns org.nd4j.nativeblas.Nd4jCpu$half_random_exponential
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_random_exponential]))

(defn ->half-random-exponential
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_random_exponential [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_random_exponential p))
  (^Nd4jCpu$half_random_exponential []
    (new Nd4jCpu$half_random_exponential )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_random_exponential`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_random_exponential [^Nd4jCpu$half_random_exponential this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_random_exponential this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

