(ns org.nd4j.nativeblas.Nd4jCpu$float_log_poison_loss
  "This op calculates logarithmic loss of poison distributed input
 Input arguments
 0 - target
 1 - input
 optional int - boolean value compute_full_loss: 0 (default) or 1 (compute)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_log_poison_loss]))

(defn ->float-log-poison-loss
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_log_poison_loss [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_log_poison_loss p))
  (^Nd4jCpu$float_log_poison_loss []
    (new Nd4jCpu$float_log_poison_loss )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_log_poison_loss`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_log_poison_loss [^Nd4jCpu$float_log_poison_loss this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_log_poison_loss this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

