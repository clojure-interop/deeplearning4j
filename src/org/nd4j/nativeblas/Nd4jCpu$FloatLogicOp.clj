(ns org.nd4j.nativeblas.Nd4jCpu$FloatLogicOp
  "Logic ops are unique snowflakes in any Graph. They dramatically change Graph Execution process, by introducing loops, conditions, etc.
 Their code is the part of GraphExecutioner logic. But we still want them to be expressed via Graph
 \\tparam T"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$FloatLogicOp]))

(defn ->float-logic-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$FloatLogicOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$FloatLogicOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$FloatLogicOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

