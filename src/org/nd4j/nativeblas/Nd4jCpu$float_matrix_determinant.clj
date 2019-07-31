(ns org.nd4j.nativeblas.Nd4jCpu$float_matrix_determinant
  "matrix_determinant op.
 input params:
 0 - the tensor with dimension (x * y * z * ::: * M * M)
 return value:
 tensor with dimension (x * y * z * ::: *) with determinant for all
 M x M matricies"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_matrix_determinant]))

(defn ->float-matrix-determinant
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_matrix_determinant [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_matrix_determinant p))
  (^Nd4jCpu$float_matrix_determinant []
    (new Nd4jCpu$float_matrix_determinant )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_matrix_determinant`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_matrix_determinant [^Nd4jCpu$float_matrix_determinant this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_matrix_determinant this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

