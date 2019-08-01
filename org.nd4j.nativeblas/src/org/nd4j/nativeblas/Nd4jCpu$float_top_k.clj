(ns org.nd4j.nativeblas.Nd4jCpu$float_top_k
  "top_k operation returns a vector of k top values for
 given NDArray as tensor with default boolean (true)
 as sort for result index array
 will be sorted by the values in descending order.
 The first parameter is a NDArray for working.
 The second is k (default 1) - optional
 The third is boolean value(default is 1) (0 - as is, 1 - sorted by value) optional"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_top_k]))

(defn ->float-top-k
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_top_k [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_top_k p))
  (^Nd4jCpu$float_top_k []
    (new Nd4jCpu$float_top_k )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_top_k`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_top_k [^Nd4jCpu$float_top_k this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_top_k this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

