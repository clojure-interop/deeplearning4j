(ns org.nd4j.nativeblas.Nd4jCpu$float_pointwise_conv2d
  "point-wise 2D convolution
 Expected input:
 x: 4D array
 weight: 4D Array [1, 1, iC, oC] (NHWC) or [oC, iC, 1, 1] (NCHW)
 bias: optional vector, length of oC
 IntArgs:
 0: data format: 1 NHWC, 0 NCHW (optional, by default = NHWC)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_pointwise_conv2d]))

(defn ->float-pointwise-conv-2d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_pointwise_conv2d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_pointwise_conv2d p))
  (^Nd4jCpu$float_pointwise_conv2d []
    (new Nd4jCpu$float_pointwise_conv2d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_pointwise_conv2d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_pointwise_conv2d [^Nd4jCpu$float_pointwise_conv2d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_pointwise_conv2d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

