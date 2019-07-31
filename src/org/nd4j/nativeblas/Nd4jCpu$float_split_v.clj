(ns org.nd4j.nativeblas.Nd4jCpu$float_split_v
  "This operation splits given NDArray into chunks of specific size, along given dimension
 Input arrays:
 0 - input array
 1 - array of sizes
 2 - optional axis
 Integer arguments:
 0 - optional axis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_split_v]))

(defn ->float-split-v
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_split_v [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_split_v p))
  (^Nd4jCpu$float_split_v []
    (new Nd4jCpu$float_split_v )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_split_v`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_split_v [^Nd4jCpu$float_split_v this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_split_v this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

