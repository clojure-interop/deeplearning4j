(ns org.nd4j.nativeblas.Nd4jCpu$float_softplus
  "This is Softplus activation function implementation
 Math is: log(1  exp(x))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_softplus]))

(defn ->float-softplus
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_softplus [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_softplus p))
  (^Nd4jCpu$float_softplus []
    (new Nd4jCpu$float_softplus )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_softplus`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_softplus [^Nd4jCpu$float_softplus this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_softplus this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

