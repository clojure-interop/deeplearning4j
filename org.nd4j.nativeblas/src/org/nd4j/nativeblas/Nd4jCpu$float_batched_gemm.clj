(ns org.nd4j.nativeblas.Nd4jCpu$float_batched_gemm
  "This operation implements batched matrix multiplication
 Expected arguments:
 alpha: vector of T
 beta: vector of T
 ...: A, B matrices sequentially. i.e: AAAAABBBBB
 Integer arguments:
 transA, transB, M, N, K, ldA, ldB, ldC - usual BLAS gemm arguments
 batchCount - number of operations in this batch
 PLEASE NOTE: M, N, K, ldA, ldB, ldC should be equal for all matrices within batch."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_batched_gemm]))

(defn ->float-batched-gemm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_batched_gemm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_batched_gemm p))
  (^Nd4jCpu$float_batched_gemm []
    (new Nd4jCpu$float_batched_gemm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_batched_gemm`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_batched_gemm [^Nd4jCpu$float_batched_gemm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_batched_gemm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

