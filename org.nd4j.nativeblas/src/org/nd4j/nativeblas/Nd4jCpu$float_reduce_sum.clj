(ns org.nd4j.nativeblas.Nd4jCpu$float_reduce_sum
  "reduction_sum - tf.reduction_sum operation
 input params:
 0 - NDArray
 T_ARG param (optional):
 0 - keep_dims != 0.
 int params (optional):
 0 - axe 1
 1 - axe 2
 ...
 N-1 axe N
 All axes are optional and should be between 0 and input->rankOf() - 1
 output:
 0 - NDArray with reduces shape accordingly to axes (the scalar in default case)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reduce_sum]))

(defn ->float-reduce-sum
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reduce_sum [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reduce_sum p))
  (^Nd4jCpu$float_reduce_sum []
    (new Nd4jCpu$float_reduce_sum )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reduce_sum`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reduce_sum [^Nd4jCpu$float_reduce_sum this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_reduce_sum this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

