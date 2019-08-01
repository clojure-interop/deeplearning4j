(ns org.nd4j.nativeblas.Nd4jCpu$float_clip_by_global_norm
  "clip a list of given tensors with given average norm when needed
 Input:
 a list of tensors (at least one)
 Input floating point argument:
 clip_norm - a value that used as threshold value and norm to be used
 return a list of clipped tensors
 and global_norm as scalar tensor at the end"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_clip_by_global_norm]))

(defn ->float-clip-by-global-norm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_clip_by_global_norm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_clip_by_global_norm p))
  (^Nd4jCpu$float_clip_by_global_norm []
    (new Nd4jCpu$float_clip_by_global_norm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_clip_by_global_norm`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_clip_by_global_norm [^Nd4jCpu$float_clip_by_global_norm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_clip_by_global_norm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

