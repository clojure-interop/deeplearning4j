(ns org.nd4j.nativeblas.Nd4jCpu$float_scatter_upd
  "This operation applies Assign operation to specific inputs wrt indices
 Expected arguments:
 input: array to be updated
 indices: array containing indexes for first dimension of input
 updates: array containing elements to be interfered with input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_scatter_upd]))

(defn ->float-scatter-upd
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_scatter_upd [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_scatter_upd p))
  (^Nd4jCpu$float_scatter_upd []
    (new Nd4jCpu$float_scatter_upd )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_scatter_upd`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_scatter_upd [^Nd4jCpu$float_scatter_upd this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_scatter_upd this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

