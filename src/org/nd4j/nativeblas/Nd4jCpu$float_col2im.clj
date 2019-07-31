(ns org.nd4j.nativeblas.Nd4jCpu$float_col2im
  "This op implements col2im algorithm, widely used in convolution neural networks
 Input: 6D input expected (like output of im2col op)
 Int args:
 0: stride height
 1: stride width
 2: padding height
 3: padding width
 4: image height
 5: image width
 6: dilation height
 7: dilation width"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_col2im]))

(defn ->float-col-2im
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_col2im [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_col2im p))
  (^Nd4jCpu$float_col2im []
    (new Nd4jCpu$float_col2im )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_col2im`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_col2im [^Nd4jCpu$float_col2im this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_col2im this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

