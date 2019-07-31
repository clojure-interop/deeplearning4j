(ns org.nd4j.nativeblas.Nd4jCpu$float_matmul
  "This op is general matmum implementation. Depending on inputs dimensionality output result might be different.
 matrix x matrix = BLAS gemm
 vector x matrix = BLAS gemm
 vector x vector = BLAS dot
 vector x scalar = element-wise mul
 scalar x vector = element-wise mul
 Optional T arguments:
 0: alpha (where applicable)
 1: beta (where applicable)
 Optional Integer arguments:
 0: transA (where applicable)
 1: transB (where applicable)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_matmul]))

(defn ->float-matmul
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_matmul [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_matmul p))
  (^Nd4jCpu$float_matmul []
    (new Nd4jCpu$float_matmul )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_matmul`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_matmul [^Nd4jCpu$float_matmul this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_matmul this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

