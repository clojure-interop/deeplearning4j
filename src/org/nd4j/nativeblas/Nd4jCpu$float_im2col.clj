(ns org.nd4j.nativeblas.Nd4jCpu$float_im2col
  "This op implements im2col algorithm, widely used in convolution neural networks
 Input: 4D input expected
 Int args:
 0: kernel height
 1: kernel width
 2: stride height
 3: stride width
 4: padding height
 5: padding width
 6: dilation height
 7: dilation width
 8: isSameMode"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_im2col]))

(defn ->float-im-2col
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_im2col [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_im2col p))
  (^Nd4jCpu$float_im2col []
    (new Nd4jCpu$float_im2col )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_im2col`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_im2col [^Nd4jCpu$float_im2col this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_im2col this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

