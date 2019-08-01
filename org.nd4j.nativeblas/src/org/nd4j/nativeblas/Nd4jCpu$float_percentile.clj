(ns org.nd4j.nativeblas.Nd4jCpu$float_percentile
  "This operation performs calculation of percentile of input array along given axises
 Input - tensor with rank N > 0
 Output - tensor with rank (N - length(axis)) or scalar if number of Integer arguments is zero
 Float arguments:
 0: percentile (scalar) in range [0,100] (inclusively)
 1: interpolation (optional), possible values are 0-\"lower\", 1-\"higher\", 2-\"nearest\"(default)
 2: keepDims (optional), if it is non zero, then unities are kept in reduced resulting shape of output array, default is 0
 Integer arguments - axis - the sequence of axises to calculate percentile along, if sequence is empty then calculate percentile for whole input tensor and return result as scalar"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_percentile]))

(defn ->float-percentile
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_percentile [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_percentile p))
  (^Nd4jCpu$float_percentile []
    (new Nd4jCpu$float_percentile )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_percentile`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_percentile [^Nd4jCpu$float_percentile this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_percentile this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

