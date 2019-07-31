(ns org.nd4j.nativeblas.Nd4jCpu$half_scatter_div
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_scatter_div]))

(defn ->half-scatter-div
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_scatter_div [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_scatter_div p))
  (^Nd4jCpu$half_scatter_div []
    (new Nd4jCpu$half_scatter_div )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_scatter_div`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_scatter_div [^Nd4jCpu$half_scatter_div this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_scatter_div this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

