(ns org.nd4j.nativeblas.Nd4jCpu$float_select
  "This op takes 2 n-dimensional arrays as input, and return
 array of the same shape, with elements, either from x or y, depending on the condition."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_select]))

(defn ->float-select
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_select [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_select p))
  (^Nd4jCpu$float_select []
    (new Nd4jCpu$float_select )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_select`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_select [^Nd4jCpu$float_select this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_select this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

