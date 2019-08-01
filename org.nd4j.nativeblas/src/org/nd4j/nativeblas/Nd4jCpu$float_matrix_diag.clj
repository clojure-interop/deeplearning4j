(ns org.nd4j.nativeblas.Nd4jCpu$float_matrix_diag
  "Returns a batched matrix tensor with diagonal values given (as TF.matrix_diag)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_matrix_diag]))

(defn ->float-matrix-diag
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_matrix_diag [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_matrix_diag p))
  (^Nd4jCpu$float_matrix_diag []
    (new Nd4jCpu$float_matrix_diag )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_matrix_diag`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_matrix_diag [^Nd4jCpu$float_matrix_diag this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_matrix_diag this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

