(ns org.nd4j.nativeblas.Nd4jCpu$float_scatter_max
  "This operation applies Max operation to specific inputs through given indices
 Expected arguments:
 input: array to be updated
 indices: array containing indexes for first dimension of input
 updates: array containing elements to be interfered with input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_scatter_max]))

(defn ->float-scatter-max
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_scatter_max [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_scatter_max p))
  (^Nd4jCpu$float_scatter_max []
    (new Nd4jCpu$float_scatter_max )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_scatter_max`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_scatter_max [^Nd4jCpu$float_scatter_max this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_scatter_max this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

