(ns org.nd4j.nativeblas.Nd4jCpu$float_dynamic_partition
  "dynamic_partition - partition a input tensor onto num_partitions
 accordingly to index array given.
 the first param - NDArray to be partitioned.
 the second param - index array
 the third param (integer param) - num or partitions.
 returns a num of NDArrays as output"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_dynamic_partition]))

(defn ->float-dynamic-partition
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_dynamic_partition [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_dynamic_partition p))
  (^Nd4jCpu$float_dynamic_partition []
    (new Nd4jCpu$float_dynamic_partition )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_dynamic_partition`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_dynamic_partition [^Nd4jCpu$float_dynamic_partition this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_dynamic_partition this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

