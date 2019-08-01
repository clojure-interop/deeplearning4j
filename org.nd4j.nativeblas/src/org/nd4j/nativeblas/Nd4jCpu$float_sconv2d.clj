(ns org.nd4j.nativeblas.Nd4jCpu$float_sconv2d
  "Depthwise convolution2d op:
 Expected inputs:
 x: 4D array, NCHW format
 weightsDepth: 4D array,
 weightsPointwise: optional, 4D array
 bias: optional, vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_sconv2d]))

(defn ->float-sconv-2d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_sconv2d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_sconv2d p))
  (^Nd4jCpu$float_sconv2d []
    (new Nd4jCpu$float_sconv2d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_sconv2d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_sconv2d [^Nd4jCpu$float_sconv2d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_sconv2d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

