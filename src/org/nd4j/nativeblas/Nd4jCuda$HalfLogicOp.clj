(ns org.nd4j.nativeblas.Nd4jCuda$HalfLogicOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfLogicOp]))

(defn ->half-logic-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfLogicOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfLogicOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$HalfLogicOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

