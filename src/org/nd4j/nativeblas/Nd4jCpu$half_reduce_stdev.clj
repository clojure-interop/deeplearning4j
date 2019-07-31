(ns org.nd4j.nativeblas.Nd4jCpu$half_reduce_stdev
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_reduce_stdev]))

(defn ->half-reduce-stdev
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_reduce_stdev [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_reduce_stdev p))
  (^Nd4jCpu$half_reduce_stdev []
    (new Nd4jCpu$half_reduce_stdev )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_reduce_stdev`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_reduce_stdev [^Nd4jCpu$half_reduce_stdev this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_reduce_stdev this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

