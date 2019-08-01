(ns org.nd4j.nativeblas.Nd4jCpu$float_onehot
  "This operation return one-hot encoded n-dimensional array
 Expected arguments:
 input: N-dimensional array
 T args:
 0: 'on' value
 1: 'off' value
 Int args:
 0: depth
 1: axis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_onehot]))

(defn ->float-onehot
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_onehot [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_onehot p))
  (^Nd4jCpu$float_onehot []
    (new Nd4jCpu$float_onehot )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_onehot`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_onehot [^Nd4jCpu$float_onehot this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_onehot this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

