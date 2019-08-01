(ns org.nd4j.nativeblas.Nd4jCpu$float_depth_to_space
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_depth_to_space]))

(defn ->float-depth-to-space
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_depth_to_space [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_depth_to_space p))
  (^Nd4jCpu$float_depth_to_space []
    (new Nd4jCpu$float_depth_to_space )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_depth_to_space`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_depth_to_space [^Nd4jCpu$float_depth_to_space this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_depth_to_space this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

