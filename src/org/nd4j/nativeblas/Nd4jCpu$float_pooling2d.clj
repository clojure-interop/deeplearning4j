(ns org.nd4j.nativeblas.Nd4jCpu$float_pooling2d
  "Universal pooling op, combines max/avg/pnorm pooling.
 Shouldn't be used directly, consider using corresponding operations instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_pooling2d]))

(defn ->float-pooling-2d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_pooling2d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_pooling2d p))
  (^Nd4jCpu$float_pooling2d []
    (new Nd4jCpu$float_pooling2d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_pooling2d`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_pooling2d [^Nd4jCpu$float_pooling2d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_pooling2d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

