(ns org.nd4j.nativeblas.Nd4jCpu$half_reduce_min
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_reduce_min]))

(defn ->half-reduce-min
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_reduce_min [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_reduce_min p))
  (^Nd4jCpu$half_reduce_min []
    (new Nd4jCpu$half_reduce_min )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_reduce_min`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_reduce_min [^Nd4jCpu$half_reduce_min this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_reduce_min this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

