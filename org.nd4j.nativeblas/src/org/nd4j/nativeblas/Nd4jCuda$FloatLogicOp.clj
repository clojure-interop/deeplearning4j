(ns org.nd4j.nativeblas.Nd4jCuda$FloatLogicOp
  "Logic ops are unique snowflakes in any Graph. They dramatically change Graph Execution process, by introducing loops, conditions, etc.
 Their code is the part of GraphExecutioner logic. But we still want them to be expressed via Graph
 \\tparam T"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatLogicOp]))

(defn ->float-logic-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatLogicOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatLogicOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$FloatLogicOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

