(ns org.nd4j.nativeblas.Nd4jCpu$half_depthwise_conv2d_bp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_depthwise_conv2d_bp]))

(defn ->half-depthwise-conv-2d-bp
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_depthwise_conv2d_bp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_depthwise_conv2d_bp p))
  (^Nd4jCpu$half_depthwise_conv2d_bp []
    (new Nd4jCpu$half_depthwise_conv2d_bp )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_depthwise_conv2d_bp`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_depthwise_conv2d_bp [^Nd4jCpu$half_depthwise_conv2d_bp this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_depthwise_conv2d_bp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

