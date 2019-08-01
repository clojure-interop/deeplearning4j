(ns org.nd4j.nativeblas.Nd4jCpu$float_sequence_mask
  "sequence_mask op. - make mask for given tensor filled by (j > x[i_1, i_2,...,i_n]) -> z[i_1, i_2,...,i_n,j]
 input params:
 0 - the ND-tensor filled by integer-like values
 optional int param - maxlength (maxlength >= max(x)). By default maxlength = max(x).
 return value:
 (N+1)D tensor filled by 0 and 1 accordingly the mask"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_sequence_mask]))

(defn ->float-sequence-mask
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_sequence_mask [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_sequence_mask p))
  (^Nd4jCpu$float_sequence_mask []
    (new Nd4jCpu$float_sequence_mask )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_sequence_mask`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_sequence_mask [^Nd4jCpu$float_sequence_mask this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_sequence_mask this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

