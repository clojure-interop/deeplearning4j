(ns org.nd4j.nativeblas.Nd4jCpu$float_svd
  "performs singular value decomposition (SVD) of one one or more matrices, evaluates the SVD of each inner-most 2D matrix in input array:
 x[..., :, :] = u[..., :, :] * s[...,:] * transpose(v[..., :, :])
 Input array:
 x[..., Rows, Cols], the necessary condition is: rank of x >= 2
 Outputs arrays:
 s[..., diagSize] - array with singular values which are stored in decreasing order, diagSize is smaller among Rows and Cols
 u[..., Rows, Rows] if IArgs[1] is true, else u[..., Rows, diagSize] - array with right singular vectors
 v[..., Cols, Cols] if IArgs[1] is true, else v[..., Cols, diagSize] - array with left singular vectors
 Integer arguments:
 IArgs[0] - bool, whether to calculate u and v, s is calculated in any case
 IArgs[1] - bool, whether to calculate full-sized u and v
 IArgs[2] - the number of cols or rows which determines what algorithm to use. More precisely:
 if diagSize < IArgs[2] then Jacobi algorithm is used, in opposite case the Divide-And-Conquer is applied
 Recommended value is 16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_svd]))

(defn ->float-svd
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_svd [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_svd p))
  (^Nd4jCpu$float_svd []
    (new Nd4jCpu$float_svd )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_svd`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_svd [^Nd4jCpu$float_svd this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_svd this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

