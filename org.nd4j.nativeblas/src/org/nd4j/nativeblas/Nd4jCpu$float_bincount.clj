(ns org.nd4j.nativeblas.Nd4jCpu$float_bincount
  "bincount operation return a vector with element counted.
 input params:
 - input tensor - only int part are accepted
 - weights - the same shape tensor with integer weights for element (optional)
 default weight - 1,1,1..,1 for all values in the tensor
 optional ints:
 - min_length - zero or greater
 - max_length - between min_length and max(input)  1
 returns four tensors:
 - vector tensor with length to min(max_len, max(input)  1) with count
 of values in indexed place"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_bincount]))

(defn ->float-bincount
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_bincount [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_bincount p))
  (^Nd4jCpu$float_bincount []
    (new Nd4jCpu$float_bincount )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_bincount`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_bincount [^Nd4jCpu$float_bincount this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_bincount this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

