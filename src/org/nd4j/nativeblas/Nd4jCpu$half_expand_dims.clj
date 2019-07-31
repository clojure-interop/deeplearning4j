(ns org.nd4j.nativeblas.Nd4jCpu$half_expand_dims
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_expand_dims]))

(defn ->half-expand-dims
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_expand_dims [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_expand_dims p))
  (^Nd4jCpu$half_expand_dims []
    (new Nd4jCpu$half_expand_dims )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_expand_dims`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_expand_dims [^Nd4jCpu$half_expand_dims this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_expand_dims this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

