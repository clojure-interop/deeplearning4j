(ns org.nd4j.nativeblas.Nd4jCpu$half_reduce_norm2_bp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_reduce_norm2_bp]))

(defn ->half-reduce-norm-2-bp
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_reduce_norm2_bp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_reduce_norm2_bp p))
  (^Nd4jCpu$half_reduce_norm2_bp []
    (new Nd4jCpu$half_reduce_norm2_bp )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_reduce_norm2_bp`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_reduce_norm2_bp [^Nd4jCpu$half_reduce_norm2_bp this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_reduce_norm2_bp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

