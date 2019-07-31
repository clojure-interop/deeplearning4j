(ns org.nd4j.nativeblas.Nd4jCpu$half_segment_mean
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_segment_mean]))

(defn ->half-segment-mean
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_segment_mean [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_segment_mean p))
  (^Nd4jCpu$half_segment_mean []
    (new Nd4jCpu$half_segment_mean )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_segment_mean`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_segment_mean [^Nd4jCpu$half_segment_mean this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_segment_mean this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

