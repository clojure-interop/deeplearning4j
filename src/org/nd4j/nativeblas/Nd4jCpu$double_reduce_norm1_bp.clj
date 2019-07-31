(ns org.nd4j.nativeblas.Nd4jCpu$double_reduce_norm1_bp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_reduce_norm1_bp]))

(defn ->double-reduce-norm-1-bp
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_reduce_norm1_bp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_reduce_norm1_bp p))
  (^Nd4jCpu$double_reduce_norm1_bp []
    (new Nd4jCpu$double_reduce_norm1_bp )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_reduce_norm1_bp`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_reduce_norm1_bp [^Nd4jCpu$double_reduce_norm1_bp this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_reduce_norm1_bp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

