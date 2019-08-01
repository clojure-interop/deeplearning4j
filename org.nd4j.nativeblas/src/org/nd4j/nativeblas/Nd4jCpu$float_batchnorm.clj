(ns org.nd4j.nativeblas.Nd4jCpu$float_batchnorm
  "Batch normalization implementation.
 Reference: https://arxiv.org/abs/1502.03167v3
 Expected arguments:
 input: input array (any number of dimensions)
 mean:
 variance:
 gamma:
 beta:
 Int args:
 0: apply scale
 1: apply offset
 T args:
 0: epsilon"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_batchnorm]))

(defn ->float-batchnorm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_batchnorm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_batchnorm p))
  (^Nd4jCpu$float_batchnorm []
    (new Nd4jCpu$float_batchnorm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_batchnorm`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_batchnorm [^Nd4jCpu$float_batchnorm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_batchnorm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

