(ns org.nd4j.nativeblas.Nd4jCuda$HalfBroadcastableOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfBroadcastableOp]))

(defn ->half-broadcastable-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfBroadcastableOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfBroadcastableOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$HalfBroadcastableOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

