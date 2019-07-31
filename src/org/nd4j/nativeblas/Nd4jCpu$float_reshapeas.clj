(ns org.nd4j.nativeblas.Nd4jCpu$float_reshapeas
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reshapeas]))

(defn ->float-reshapeas
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reshapeas [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reshapeas p))
  (^Nd4jCpu$float_reshapeas []
    (new Nd4jCpu$float_reshapeas )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reshapeas`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reshapeas [^Nd4jCpu$float_reshapeas this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_reshapeas this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

