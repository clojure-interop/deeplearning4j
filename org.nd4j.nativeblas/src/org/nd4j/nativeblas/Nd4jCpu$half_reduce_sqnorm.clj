(ns org.nd4j.nativeblas.Nd4jCpu$half_reduce_sqnorm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_reduce_sqnorm]))

(defn ->half-reduce-sqnorm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_reduce_sqnorm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_reduce_sqnorm p))
  (^Nd4jCpu$half_reduce_sqnorm []
    (new Nd4jCpu$half_reduce_sqnorm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_reduce_sqnorm`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_reduce_sqnorm [^Nd4jCpu$half_reduce_sqnorm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_reduce_sqnorm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

