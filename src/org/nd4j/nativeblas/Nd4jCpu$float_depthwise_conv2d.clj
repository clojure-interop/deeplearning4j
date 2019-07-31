(ns org.nd4j.nativeblas.Nd4jCpu$float_depthwise_conv2d
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_depthwise_conv2d]))

(defn ->float-depthwise-conv-2d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_depthwise_conv2d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_depthwise_conv2d p))
  (^Nd4jCpu$float_depthwise_conv2d []
    (new Nd4jCpu$float_depthwise_conv2d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_depthwise_conv2d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_depthwise_conv2d [^Nd4jCpu$float_depthwise_conv2d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_depthwise_conv2d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

