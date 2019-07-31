(ns org.nd4j.nativeblas.Nd4jCpu$float_deconv2d_tf
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_deconv2d_tf]))

(defn ->float-deconv-2d-tf
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_deconv2d_tf [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_deconv2d_tf p))
  (^Nd4jCpu$float_deconv2d_tf []
    (new Nd4jCpu$float_deconv2d_tf )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_deconv2d_tf`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_deconv2d_tf [^Nd4jCpu$float_deconv2d_tf this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_deconv2d_tf this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

