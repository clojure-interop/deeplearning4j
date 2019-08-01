(ns org.nd4j.nativeblas.Nd4jCpu$float_normalize_moments
  "normalize_moments operation normalize already calculated mean and variation
 accordingly to shift and count.
 input params:
 - count of data
 - tensor with mean
 - tensor with variance (the same shape as before)
 - optional floating point param shift.
 returns a normalized pair mean and variance with the same shapes as input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_normalize_moments]))

(defn ->float-normalize-moments
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_normalize_moments [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_normalize_moments p))
  (^Nd4jCpu$float_normalize_moments []
    (new Nd4jCpu$float_normalize_moments )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_normalize_moments`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_normalize_moments [^Nd4jCpu$float_normalize_moments this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_normalize_moments this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

