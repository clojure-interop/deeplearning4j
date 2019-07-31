(ns org.nd4j.nativeblas.Nd4jCpu$float_reduce_sqnorm_bp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reduce_sqnorm_bp]))

(defn ->float-reduce-sqnorm-bp
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reduce_sqnorm_bp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reduce_sqnorm_bp p))
  (^Nd4jCpu$float_reduce_sqnorm_bp []
    (new Nd4jCpu$float_reduce_sqnorm_bp )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reduce_sqnorm_bp`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reduce_sqnorm_bp [^Nd4jCpu$float_reduce_sqnorm_bp this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_reduce_sqnorm_bp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

