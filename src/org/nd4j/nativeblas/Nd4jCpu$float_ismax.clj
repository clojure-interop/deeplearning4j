(ns org.nd4j.nativeblas.Nd4jCpu$float_ismax
  "This op produces binary matrix wrt to target dimension.
 Maximum value within each TAD is replaced with 1, other values are set to true.
 Int args:
 0: axis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_ismax]))

(defn ->float-ismax
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_ismax [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_ismax p))
  (^Nd4jCpu$float_ismax []
    (new Nd4jCpu$float_ismax )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_ismax`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_ismax [^Nd4jCpu$float_ismax this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_ismax this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

