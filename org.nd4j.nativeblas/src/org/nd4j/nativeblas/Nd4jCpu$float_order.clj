(ns org.nd4j.nativeblas.Nd4jCpu$float_order
  "This op changes order of given array to specified order.
 In other words: C/F order switch
 Int args:
 0 - isForder. set to 1 for F order output, or 0 for C order output
 \\tparam T"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_order]))

(defn ->float-order
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_order [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_order p))
  (^Nd4jCpu$float_order []
    (new Nd4jCpu$float_order )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_order`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_order [^Nd4jCpu$float_order this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_order this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

