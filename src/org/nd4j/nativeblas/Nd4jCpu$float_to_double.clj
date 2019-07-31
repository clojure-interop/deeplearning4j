(ns org.nd4j.nativeblas.Nd4jCpu$float_to_double
  "This operation casts elements of input array to double data type
 PLEASE NOTE: This op is disabled atm, and reserved for future releases."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_to_double]))

(defn ->float-to-double
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_to_double [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_to_double p))
  (^Nd4jCpu$float_to_double []
    (new Nd4jCpu$float_to_double )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_to_double`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_to_double [^Nd4jCpu$float_to_double this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_to_double this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

