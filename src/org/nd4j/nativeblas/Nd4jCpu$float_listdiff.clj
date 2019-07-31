(ns org.nd4j.nativeblas.Nd4jCpu$float_listdiff
  "This operation takes 2 arrays: original values, and values to be excluded. And returns 2 arrays: values left after exclusion, and indices in original array for surivals.
 Expected arguments:
 0: vector with original values
 1: vector with values to exclude"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_listdiff]))

(defn ->float-listdiff
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_listdiff [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_listdiff p))
  (^Nd4jCpu$float_listdiff []
    (new Nd4jCpu$float_listdiff )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_listdiff`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_listdiff [^Nd4jCpu$float_listdiff this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_listdiff this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

