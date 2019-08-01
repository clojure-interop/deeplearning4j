(ns org.nd4j.nativeblas.Nd4jCpu$double_hardsigmoid
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_hardsigmoid]))

(defn ->double-hardsigmoid
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_hardsigmoid [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_hardsigmoid p))
  (^Nd4jCpu$double_hardsigmoid []
    (new Nd4jCpu$double_hardsigmoid )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_hardsigmoid`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_hardsigmoid [^Nd4jCpu$double_hardsigmoid this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_hardsigmoid this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

