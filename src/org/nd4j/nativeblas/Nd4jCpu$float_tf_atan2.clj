(ns org.nd4j.nativeblas.Nd4jCpu$float_tf_atan2
  "Special atan2 op impl for TF's args order
 \\tparam T"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_tf_atan2]))

(defn ->float-tf-atan-2
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_tf_atan2 [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_tf_atan2 p))
  (^Nd4jCpu$float_tf_atan2 []
    (new Nd4jCpu$float_tf_atan2 )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_tf_atan2`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_tf_atan2 [^Nd4jCpu$float_tf_atan2 this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_tf_atan2 this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

