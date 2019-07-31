(ns org.nd4j.nativeblas.Nd4jCpu$float_in_top_k
  "in_top_k operation returns a vector of k boolean values for
 given NDArray as 2D matrix of predicted in the NDArray k top values
 The first parameter is a NDArray of predicted values (2d array).
 The second is NDArray as vector of indeces k top values will be search.
 The third is k"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_in_top_k]))

(defn ->float-in-top-k
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_in_top_k [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_in_top_k p))
  (^Nd4jCpu$float_in_top_k []
    (new Nd4jCpu$float_in_top_k )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_in_top_k`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_in_top_k [^Nd4jCpu$float_in_top_k this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_in_top_k this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

