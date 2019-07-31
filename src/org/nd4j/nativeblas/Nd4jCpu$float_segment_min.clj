(ns org.nd4j.nativeblas.Nd4jCpu$float_segment_min
  "segment_min op. - make a tensor filled by min values according to index tensor given.
 input params:
 0 - the tensor with data;
 1 - the tensor with indices.
 return value:
 tensor with min values according to indices sets."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_segment_min]))

(defn ->float-segment-min
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_segment_min [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_segment_min p))
  (^Nd4jCpu$float_segment_min []
    (new Nd4jCpu$float_segment_min )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_segment_min`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_segment_min [^Nd4jCpu$float_segment_min this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_segment_min this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

