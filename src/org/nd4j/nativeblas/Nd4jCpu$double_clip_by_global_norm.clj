(ns org.nd4j.nativeblas.Nd4jCpu$double_clip_by_global_norm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_clip_by_global_norm]))

(defn ->double-clip-by-global-norm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_clip_by_global_norm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_clip_by_global_norm p))
  (^Nd4jCpu$double_clip_by_global_norm []
    (new Nd4jCpu$double_clip_by_global_norm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_clip_by_global_norm`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_clip_by_global_norm [^Nd4jCpu$double_clip_by_global_norm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_clip_by_global_norm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

