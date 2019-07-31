(ns org.nd4j.nativeblas.Nd4jCpu$double_gather_nd
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_gather_nd]))

(defn ->double-gather-nd
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_gather_nd [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_gather_nd p))
  (^Nd4jCpu$double_gather_nd []
    (new Nd4jCpu$double_gather_nd )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_gather_nd`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_gather_nd [^Nd4jCpu$double_gather_nd this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_gather_nd this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

