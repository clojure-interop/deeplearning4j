(ns org.nd4j.nativeblas.Nd4jCpu$float_batchnorm_bp
  "back prop in batch normalization
 Expected arguments:
 input: input array (any number of dimensions)
 mean:
 variance:
 gamma: optional
 beta: optional
 dLdOut: next epsilon
 Int args:
 0: apply scale
 1: apply offset
 T args:
 0: epsilon
 output arrays:
 dL/dInput
 dL/dMean
 dL/dVariance
 dL/dGamma
 dL/dBeta"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_batchnorm_bp]))

(defn ->float-batchnorm-bp
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_batchnorm_bp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_batchnorm_bp p))
  (^Nd4jCpu$float_batchnorm_bp []
    (new Nd4jCpu$float_batchnorm_bp )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_batchnorm_bp`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_batchnorm_bp [^Nd4jCpu$float_batchnorm_bp this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_batchnorm_bp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

