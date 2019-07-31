(ns org.nd4j.nativeblas.Nd4jCpu$float_scatter_div
  "This operation applies Divide operation to specific inputs wrt indices
 Expected arguments:
 input: array to be updated
 indices: array containing indexes for first dimension of input
 updates: array containing elements to be interfered with input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_scatter_div]))

(defn ->float-scatter-div
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_scatter_div [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_scatter_div p))
  (^Nd4jCpu$float_scatter_div []
    (new Nd4jCpu$float_scatter_div )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_scatter_div`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_scatter_div [^Nd4jCpu$float_scatter_div this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_scatter_div this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

