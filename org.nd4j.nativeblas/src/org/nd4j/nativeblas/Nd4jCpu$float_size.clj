(ns org.nd4j.nativeblas.Nd4jCpu$float_size
  "This operation returns length of input array
 Expected arguments:
 input: N-dimensional array
 TODO: make this operation reduction, to allow TAD -> size"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_size]))

(defn ->float-size
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_size [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_size p))
  (^Nd4jCpu$float_size []
    (new Nd4jCpu$float_size )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_size`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_size [^Nd4jCpu$float_size this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_size this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

