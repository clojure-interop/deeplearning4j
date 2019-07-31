(ns org.nd4j.nativeblas.Nd4jCpu$float_apply_sgd
  "This operation updates parameters with provided gradients, wrt learning rate
 Expected arguments:
 x: parameters, any shape
 y: gradients. same shape as x
 lr: optional, learning rate
 T args:
 0: optional, learning rate"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_apply_sgd]))

(defn ->float-apply-sgd
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_apply_sgd [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_apply_sgd p))
  (^Nd4jCpu$float_apply_sgd []
    (new Nd4jCpu$float_apply_sgd )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_apply_sgd`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_apply_sgd [^Nd4jCpu$float_apply_sgd this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_apply_sgd this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

