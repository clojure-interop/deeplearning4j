(ns org.nd4j.nativeblas.Nd4jCpu$float_stack
  "This operation stacks a list of rank tensors into one rank-(R+1) tensor.
 Expected arguments:
 0...: N-Dimensional arrays to stack"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_stack]))

(defn ->float-stack
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_stack [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_stack p))
  (^Nd4jCpu$float_stack []
    (new Nd4jCpu$float_stack )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_stack`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_stack [^Nd4jCpu$float_stack this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_stack this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

