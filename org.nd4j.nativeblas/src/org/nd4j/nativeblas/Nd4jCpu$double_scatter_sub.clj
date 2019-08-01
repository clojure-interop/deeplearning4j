(ns org.nd4j.nativeblas.Nd4jCpu$double_scatter_sub
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_scatter_sub]))

(defn ->double-scatter-sub
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_scatter_sub [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_scatter_sub p))
  (^Nd4jCpu$double_scatter_sub []
    (new Nd4jCpu$double_scatter_sub )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_scatter_sub`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_scatter_sub [^Nd4jCpu$double_scatter_sub this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_scatter_sub this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

