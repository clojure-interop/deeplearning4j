(ns org.nd4j.nativeblas.Nd4jCpu$float_unique
  "This operation returns unique elements from input array as vector, and their original indices in input array
 Expected input:
 input: N-dimensional array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_unique]))

(defn ->float-unique
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_unique [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_unique p))
  (^Nd4jCpu$float_unique []
    (new Nd4jCpu$float_unique )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_unique`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_unique [^Nd4jCpu$float_unique this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_unique this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

