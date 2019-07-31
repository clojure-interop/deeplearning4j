(ns org.nd4j.nativeblas.Nd4jCpu$double_lrn_old
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_lrn_old]))

(defn ->double-lrn-old
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_lrn_old [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_lrn_old p))
  (^Nd4jCpu$double_lrn_old []
    (new Nd4jCpu$double_lrn_old )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_lrn_old`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_lrn_old [^Nd4jCpu$double_lrn_old this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_lrn_old this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

