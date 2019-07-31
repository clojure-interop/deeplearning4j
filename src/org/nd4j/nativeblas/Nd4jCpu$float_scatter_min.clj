(ns org.nd4j.nativeblas.Nd4jCpu$float_scatter_min
  "This operation applies Min operation to specific inputs through given indices
 Expected arguments:
 input: array to be updated
 indices: array containing indexes for first dimension of input
 updates: array containing elements to be interfered with input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_scatter_min]))

(defn ->float-scatter-min
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_scatter_min [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_scatter_min p))
  (^Nd4jCpu$float_scatter_min []
    (new Nd4jCpu$float_scatter_min )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_scatter_min`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_scatter_min [^Nd4jCpu$float_scatter_min this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_scatter_min this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

