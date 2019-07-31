(ns org.nd4j.nativeblas.Nd4jCpu$float_tensormmul
  "tensorMmul/tensorDot operation
 takes 2 ndarrays, and 2 sets of axes
 Integer argumens map:
 IArgs[0] - number of axes along for first array
 IArgs[1]... axes values for first array
 IArgs[] - number of axes along for second array
 IArgs[1]... axes values for second array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_tensormmul]))

(defn ->float-tensormmul
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_tensormmul [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_tensormmul p))
  (^Nd4jCpu$float_tensormmul []
    (new Nd4jCpu$float_tensormmul )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_tensormmul`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_tensormmul [^Nd4jCpu$float_tensormmul this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_tensormmul this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

