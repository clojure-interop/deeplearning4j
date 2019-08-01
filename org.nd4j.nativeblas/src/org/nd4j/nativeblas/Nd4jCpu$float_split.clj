(ns org.nd4j.nativeblas.Nd4jCpu$float_split
  "This operation splits given NDArray into chunks of specific size, along given dimension
 0 - input array
 1 - optional axis
 Integer arguments:
 0 - number of splits
 1 - optional axis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_split]))

(defn ->float-split
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_split [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_split p))
  (^Nd4jCpu$float_split []
    (new Nd4jCpu$float_split )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_split`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_split [^Nd4jCpu$float_split this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_split this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

