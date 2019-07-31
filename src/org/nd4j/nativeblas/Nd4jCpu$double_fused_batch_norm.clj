(ns org.nd4j.nativeblas.Nd4jCpu$double_fused_batch_norm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_fused_batch_norm]))

(defn ->double-fused-batch-norm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_fused_batch_norm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_fused_batch_norm p))
  (^Nd4jCpu$double_fused_batch_norm []
    (new Nd4jCpu$double_fused_batch_norm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_fused_batch_norm`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_fused_batch_norm [^Nd4jCpu$double_fused_batch_norm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_fused_batch_norm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

