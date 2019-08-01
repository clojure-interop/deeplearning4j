(ns org.nd4j.nativeblas.Nd4jCpu$double_scatter_mul
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_scatter_mul]))

(defn ->double-scatter-mul
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_scatter_mul [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_scatter_mul p))
  (^Nd4jCpu$double_scatter_mul []
    (new Nd4jCpu$double_scatter_mul )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_scatter_mul`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_scatter_mul [^Nd4jCpu$double_scatter_mul this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_scatter_mul this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

