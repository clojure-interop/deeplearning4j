(ns org.nd4j.nativeblas.Nd4jCpu$float_avgpool2d
  "This op implements average pooling for convolution networks.
 Expected Input: 4D array, NCHW format.
 IntArgs:
 0: kernel height
 1: kernel width
 2: stride height
 3: stride width
 4: padding height
 5: padding width
 6: dilation height
 7: dilation width
 8: same mode: 0 false, 1 true"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_avgpool2d]))

(defn ->float-avgpool-2d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_avgpool2d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_avgpool2d p))
  (^Nd4jCpu$float_avgpool2d []
    (new Nd4jCpu$float_avgpool2d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_avgpool2d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_avgpool2d [^Nd4jCpu$float_avgpool2d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_avgpool2d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

