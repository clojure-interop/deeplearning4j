(ns org.nd4j.nativeblas.Nd4jCpu$float_eye
  "creates identity 2D matrix or batch of identical 2D identity matrices
 Input array:
 provide some array - in any case operation simply neglects it
 Input integer arguments:
 IArgs[0] - order of output identity matrix, 99 -> 'c'-order, 102 -> 'f'-order
 IArgs[1] - the number of rows in output inner-most 2D identity matrix
 IArgs[2] - optional, the number of columns in output inner-most 2D identity matrix, if this argument is not provided then it is taken to be equal to number of rows
 IArgs[3,4,...] - optional, shape of batch, output matrix will have leading batch dimensions of this shape"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_eye]))

(defn ->float-eye
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_eye [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_eye p))
  (^Nd4jCpu$float_eye []
    (new Nd4jCpu$float_eye )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_eye`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_eye [^Nd4jCpu$float_eye this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_eye this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

