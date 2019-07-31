(ns org.nd4j.nativeblas.Nd4jCpu$float_conv3d
  "3D convolution implementation
 IntArgs:
 0: dilation T
 1: dilation W
 2: dilation H
 4: padding T
 5: padding W
 6: padding H"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_conv3d]))

(defn ->float-conv-3d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_conv3d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_conv3d p))
  (^Nd4jCpu$float_conv3d []
    (new Nd4jCpu$float_conv3d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_conv3d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_conv3d [^Nd4jCpu$float_conv3d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_conv3d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

