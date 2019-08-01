(ns org.nd4j.nativeblas.Nd4jCpu$float_cast
  "This operation casts elements of input array to specified data type
 PLEASE NOTE: This op is disabled atm, and reserved for future releases.
 Int args:
 0: target DataType"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_cast]))

(defn ->float-cast
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_cast [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_cast p))
  (^Nd4jCpu$float_cast []
    (new Nd4jCpu$float_cast )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_cast`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_cast [^Nd4jCpu$float_cast this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_cast this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

