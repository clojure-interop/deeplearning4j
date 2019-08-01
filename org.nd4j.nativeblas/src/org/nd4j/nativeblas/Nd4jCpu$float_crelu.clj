(ns org.nd4j.nativeblas.Nd4jCpu$float_crelu
  "This is Concatenated RELU implementation.
 What happens inside: RELU(Concat((x, -x, {-1})))
 PLEASE NOTE: Concatenation will double amount of features available in input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_crelu]))

(defn ->float-crelu
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_crelu [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_crelu p))
  (^Nd4jCpu$float_crelu []
    (new Nd4jCpu$float_crelu )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_crelu`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_crelu [^Nd4jCpu$float_crelu this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_crelu this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

