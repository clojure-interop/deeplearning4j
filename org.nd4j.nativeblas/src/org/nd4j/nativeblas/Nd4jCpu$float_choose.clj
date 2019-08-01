(ns org.nd4j.nativeblas.Nd4jCpu$float_choose
  "This op takes either 1 argument and 1 scalar
 or 1 argument and another comparison array
 and runs a pre defined conditional op.
 The output of the op is dynamic in size and returns a flat vector of elements
 that return true on the given condition.
 In numpy parlance, most people might understand:
 a[a > 2]
 where a is a numpy array and the condition is true when an element is
 > 2. Libnd4j already implements a number of pre defined conditions.
 \\tparam T"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_choose]))

(defn ->float-choose
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_choose [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_choose p))
  (^Nd4jCpu$float_choose []
    (new Nd4jCpu$float_choose )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_choose`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_choose [^Nd4jCpu$float_choose this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_choose this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

