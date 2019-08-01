(ns org.nd4j.nativeblas.Nd4jCpu$float_max_pool_with_argmax
  "This op same as maxpool2d with a variant to return a matrix of indexes for max values
 Input - 4D tensor
 Output:
 0 - 4D tensor as input
 1 - 4D tensor with max value indexes
 Int params:
 9 int with 2x4 vectors and 1 bool value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_max_pool_with_argmax]))

(defn ->float-max-pool-with-argmax
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_max_pool_with_argmax [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_max_pool_with_argmax p))
  (^Nd4jCpu$float_max_pool_with_argmax []
    (new Nd4jCpu$float_max_pool_with_argmax )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_max_pool_with_argmax`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_max_pool_with_argmax [^Nd4jCpu$float_max_pool_with_argmax this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_max_pool_with_argmax this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

