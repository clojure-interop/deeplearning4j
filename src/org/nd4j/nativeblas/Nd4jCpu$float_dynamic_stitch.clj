(ns org.nd4j.nativeblas.Nd4jCpu$float_dynamic_stitch
  "dynamic_stitch - merge partitions from the second param a input tensor
 into a single tensor accordingly to index array given.
 the first param - index array
 the second params - tensors to be merged
 returns a num of NDArrays as output
 the operation is inversion od dynamic_partition"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_dynamic_stitch]))

(defn ->float-dynamic-stitch
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_dynamic_stitch [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_dynamic_stitch p))
  (^Nd4jCpu$float_dynamic_stitch []
    (new Nd4jCpu$float_dynamic_stitch )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_dynamic_stitch`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_dynamic_stitch [^Nd4jCpu$float_dynamic_stitch this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_dynamic_stitch this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

