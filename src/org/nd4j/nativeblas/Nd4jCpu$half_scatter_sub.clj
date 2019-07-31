(ns org.nd4j.nativeblas.Nd4jCpu$half_scatter_sub
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_scatter_sub]))

(defn ->half-scatter-sub
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_scatter_sub [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_scatter_sub p))
  (^Nd4jCpu$half_scatter_sub []
    (new Nd4jCpu$half_scatter_sub )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_scatter_sub`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_scatter_sub [^Nd4jCpu$half_scatter_sub this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_scatter_sub this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

