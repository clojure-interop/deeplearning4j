(ns org.nd4j.nativeblas.Nd4jCpu$float_conv1d
  "1D temporal convolution implementation
 Expected input:
 x: 3D array
 weight: 3D Array
 bias: optional vector
 Int args:
 0: kernel
 1: stride
 2: padding"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_conv1d]))

(defn ->float-conv-1d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_conv1d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_conv1d p))
  (^Nd4jCpu$float_conv1d []
    (new Nd4jCpu$float_conv1d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_conv1d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_conv1d [^Nd4jCpu$float_conv1d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_conv1d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

