(ns org.nd4j.nativeblas.Nd4jCpu$float_sigmoid
  "This is Sigmoid activation function implementation
 Math is: 1 / 1  exp(-x)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_sigmoid]))

(defn ->float-sigmoid
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_sigmoid [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_sigmoid p))
  (^Nd4jCpu$float_sigmoid []
    (new Nd4jCpu$float_sigmoid )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_sigmoid`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_sigmoid [^Nd4jCpu$float_sigmoid this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_sigmoid this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

