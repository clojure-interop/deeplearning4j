(ns org.nd4j.nativeblas.Nd4jCpu$float_to_int64
  "This operation casts elements of input array to int64 (aka long long) data type
 PLEASE NOTE: This op is disabled atm, and reserved for future releases."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_to_int64]))

(defn ->float-to-int-64
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_to_int64 [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_to_int64 p))
  (^Nd4jCpu$float_to_int64 []
    (new Nd4jCpu$float_to_int64 )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_to_int64`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_to_int64 [^Nd4jCpu$float_to_int64 this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_to_int64 this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

