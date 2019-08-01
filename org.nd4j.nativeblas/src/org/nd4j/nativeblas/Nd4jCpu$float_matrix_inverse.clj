(ns org.nd4j.nativeblas.Nd4jCpu$float_matrix_inverse
  "matrix_inverse op. - make inverse for all 2D square matricies found in the input tensor
 input params:
 0 - the tensor with dimension (x * y * z * ::: * M * M)
 return value:
 tensor with dimension (x * y * z * ::: * M * M) with inverse M x M matricies in it"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_matrix_inverse]))

(defn ->float-matrix-inverse
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_matrix_inverse [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_matrix_inverse p))
  (^Nd4jCpu$float_matrix_inverse []
    (new Nd4jCpu$float_matrix_inverse )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_matrix_inverse`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_matrix_inverse [^Nd4jCpu$float_matrix_inverse this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_matrix_inverse this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

