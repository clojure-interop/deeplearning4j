(ns org.nd4j.nativeblas.Nd4jCpu$double_testop2i2o
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_testop2i2o]))

(defn ->double-testop-2i-2o
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_testop2i2o [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_testop2i2o p))
  (^Nd4jCpu$double_testop2i2o []
    (new Nd4jCpu$double_testop2i2o )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_testop2i2o`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_testop2i2o [^Nd4jCpu$double_testop2i2o this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_testop2i2o this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

