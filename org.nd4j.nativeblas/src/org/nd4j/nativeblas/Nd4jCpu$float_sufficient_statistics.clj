(ns org.nd4j.nativeblas.Nd4jCpu$float_sufficient_statistics
  "sufficient_statistics operation return calculated mean and variation with data count.
 this operation is invert for moments
 accordingly to shift and count.
 input params:
 - input tensor
 - axes vector
 - optional floating point param shift.
 - optional int (as bool) keep_dimension
 returns four tensors:
 - scalar tensor (data count)
 - sum elements of input (accross axises)
 - sum of squares of input (accross axises)
 - shift (if was given by input floating param)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_sufficient_statistics]))

(defn ->float-sufficient-statistics
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_sufficient_statistics [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_sufficient_statistics p))
  (^Nd4jCpu$float_sufficient_statistics []
    (new Nd4jCpu$float_sufficient_statistics )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_sufficient_statistics`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_sufficient_statistics [^Nd4jCpu$float_sufficient_statistics this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_sufficient_statistics this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

