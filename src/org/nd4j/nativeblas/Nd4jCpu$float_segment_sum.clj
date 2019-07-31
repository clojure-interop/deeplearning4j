(ns org.nd4j.nativeblas.Nd4jCpu$float_segment_sum
  "segment_sum op. - make a tensor filled by sum of values according to index tensor given.
 input params:
 0 - the tensor with data;
 1 - the tensor with indices.
 return value:
 tensor with sum of values according to indices sets."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_segment_sum]))

(defn ->float-segment-sum
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_segment_sum [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_segment_sum p))
  (^Nd4jCpu$float_segment_sum []
    (new Nd4jCpu$float_segment_sum )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_segment_sum`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_segment_sum [^Nd4jCpu$float_segment_sum this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_segment_sum this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

