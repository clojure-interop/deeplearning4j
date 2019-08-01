(ns org.nd4j.nativeblas.Nd4jCpu$float_matrix_diag_part
  "Returns a diagonal vector for any submatricies with in a given tensor.
 It is an op inverse to matrix_set_giag.
 Using input tensor as batched 2D diagonals flat them to vector (1D) with diagonal values.
 Input : batched tensor with rank >=2
 Output: tensor with rank lesser by 1 from input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_matrix_diag_part]))

(defn ->float-matrix-diag-part
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_matrix_diag_part [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_matrix_diag_part p))
  (^Nd4jCpu$float_matrix_diag_part []
    (new Nd4jCpu$float_matrix_diag_part )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_matrix_diag_part`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_matrix_diag_part [^Nd4jCpu$float_matrix_diag_part this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_matrix_diag_part this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

