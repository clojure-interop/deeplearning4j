(ns org.nd4j.nativeblas.Nd4jCpu$double_parallel_stack
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_parallel_stack]))

(defn ->double-parallel-stack
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_parallel_stack [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_parallel_stack p))
  (^Nd4jCpu$double_parallel_stack []
    (new Nd4jCpu$double_parallel_stack )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_parallel_stack`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_parallel_stack [^Nd4jCpu$double_parallel_stack this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_parallel_stack this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

