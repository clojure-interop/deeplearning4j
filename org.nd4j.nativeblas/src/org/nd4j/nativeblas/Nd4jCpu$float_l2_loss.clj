(ns org.nd4j.nativeblas.Nd4jCpu$float_l2_loss
  "l2_loss op.
 compute a l2 norm for given array.
 input param - an array (tensor)
 output value - a real number with given type (e.g. float or double)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_l2_loss]))

(defn ->float-l-2-loss
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_l2_loss [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_l2_loss p))
  (^Nd4jCpu$float_l2_loss []
    (new Nd4jCpu$float_l2_loss )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_l2_loss`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_l2_loss [^Nd4jCpu$float_l2_loss this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_l2_loss this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

