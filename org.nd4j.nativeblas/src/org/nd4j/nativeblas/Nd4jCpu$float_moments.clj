(ns org.nd4j.nativeblas.Nd4jCpu$float_moments
  "moments operation calculate a mean and variation for given NDArray
 with reduce a result according to axis array given.
 For full axis the result is both mean and variance of all members in array.
 Otherwise there are two NDArrays with means and variances for
 Axes can be put as the second NDArray or as int vector.
 the optional flag \"keep_dims\" can be set as T param"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_moments]))

(defn ->float-moments
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_moments [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_moments p))
  (^Nd4jCpu$float_moments []
    (new Nd4jCpu$float_moments )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_moments`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_moments [^Nd4jCpu$float_moments this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_moments this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

