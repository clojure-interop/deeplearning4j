(ns org.nd4j.nativeblas.Nd4jCpu$float_softmax_cross_entropy_loss_with_logits
  "Implementation of softmax cross-entropy loss function max(logits, 0.) - logits * labels  log(1.  exp(-abs(logits)));
 Input arrays:
 0: logits - logits, type float
 1: labels - ground truth vales, expected to be 0. or 1., type float.
 Must have the same shape as logits.
 Input integer arguments:
 0: optional (default is last dimension) dimension with classes
 Output array:
 0: loss values, type float. An array with shape resulting from reducing of logits shape along dimension with classes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_softmax_cross_entropy_loss_with_logits]))

(defn ->float-softmax-cross-entropy-loss-with-logits
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_softmax_cross_entropy_loss_with_logits [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_softmax_cross_entropy_loss_with_logits p))
  (^Nd4jCpu$float_softmax_cross_entropy_loss_with_logits []
    (new Nd4jCpu$float_softmax_cross_entropy_loss_with_logits )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_softmax_cross_entropy_loss_with_logits`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_softmax_cross_entropy_loss_with_logits [^Nd4jCpu$float_softmax_cross_entropy_loss_with_logits this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_softmax_cross_entropy_loss_with_logits this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

