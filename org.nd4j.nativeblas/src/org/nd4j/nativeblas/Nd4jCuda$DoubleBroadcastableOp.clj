(ns org.nd4j.nativeblas.Nd4jCuda$DoubleBroadcastableOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleBroadcastableOp]))

(defn ->double-broadcastable-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleBroadcastableOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleBroadcastableOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$DoubleBroadcastableOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

