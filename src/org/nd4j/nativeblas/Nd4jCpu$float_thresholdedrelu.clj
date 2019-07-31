(ns org.nd4j.nativeblas.Nd4jCpu$float_thresholdedrelu
  "Thresholded Rectified Linear Unit
 f(x) = x for x > theta, f(x) = 0 otherwise
 theta must be >= 0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_thresholdedrelu]))

(defn ->float-thresholdedrelu
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_thresholdedrelu [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_thresholdedrelu p))
  (^Nd4jCpu$float_thresholdedrelu []
    (new Nd4jCpu$float_thresholdedrelu )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_thresholdedrelu`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_thresholdedrelu [^Nd4jCpu$float_thresholdedrelu this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_thresholdedrelu this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

