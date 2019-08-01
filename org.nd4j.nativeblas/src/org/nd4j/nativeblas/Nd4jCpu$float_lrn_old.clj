(ns org.nd4j.nativeblas.Nd4jCpu$float_lrn_old
  "Local response normalization implementation.
 Reference: http://papers.nips.cc/paper/4824-imagenet-classification-with-deep-convolutional-neural-networks
 Expected arguments:
 input: 4D array
 T args:
 0: alpha
 1: beta
 2: bias
 3: depth"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_lrn_old]))

(defn ->float-lrn-old
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_lrn_old [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_lrn_old p))
  (^Nd4jCpu$float_lrn_old []
    (new Nd4jCpu$float_lrn_old )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_lrn_old`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_lrn_old [^Nd4jCpu$float_lrn_old this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_lrn_old this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

