(ns org.nd4j.nativeblas.Nd4jCpu$float_conv2d
  "2D convolution implementation
 Expected input:
 x: 4D array
 weight: 4D Array
 bias: optional vector, length of outputChannels
 IntArgs:
 0: kernel height
 1: kernel width
 2: stride height
 3: stride width
 4: padding height
 5: padding width
 6: dilation height
 7: dilation width
 8: same mode: 1 true, 0 false
 9: data format: 1 NHWC, 0 NCHW"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_conv2d]))

(defn ->float-conv-2d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_conv2d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_conv2d p))
  (^Nd4jCpu$float_conv2d []
    (new Nd4jCpu$float_conv2d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_conv2d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_conv2d [^Nd4jCpu$float_conv2d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_conv2d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

