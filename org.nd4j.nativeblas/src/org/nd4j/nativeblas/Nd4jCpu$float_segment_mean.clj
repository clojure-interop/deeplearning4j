(ns org.nd4j.nativeblas.Nd4jCpu$float_segment_mean
  "segment_mean op. - make a tensor filled by average of values according to index tensor given.
 input params:
 0 - the tensor with data;
 1 - the tensor with indices.
 return value:
 tensor with average of values according to indices sets."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_segment_mean]))

(defn ->float-segment-mean
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_segment_mean [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_segment_mean p))
  (^Nd4jCpu$float_segment_mean []
    (new Nd4jCpu$float_segment_mean )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_segment_mean`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_segment_mean [^Nd4jCpu$float_segment_mean this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_segment_mean this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

