(ns org.nd4j.nativeblas.Nd4jCpu$HalfDeclarableCustomOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfDeclarableCustomOp]))

(defn ->half-declarable-custom-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfDeclarableCustomOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfDeclarableCustomOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shapes - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$HalfDeclarableCustomOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shapes ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shapes block))))

