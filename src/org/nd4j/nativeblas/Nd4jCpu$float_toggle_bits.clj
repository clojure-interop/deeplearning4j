(ns org.nd4j.nativeblas.Nd4jCpu$float_toggle_bits
  "This operation toggles individual bits of each element in array
 PLEASE NOTE: This operation is possible only on integer datatypes
 \\tparam T"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_toggle_bits]))

(defn ->float-toggle-bits
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_toggle_bits [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_toggle_bits p))
  (^Nd4jCpu$float_toggle_bits []
    (new Nd4jCpu$float_toggle_bits )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_toggle_bits`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_toggle_bits [^Nd4jCpu$float_toggle_bits this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_toggle_bits this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

