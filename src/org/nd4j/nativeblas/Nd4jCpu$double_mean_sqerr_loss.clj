(ns org.nd4j.nativeblas.Nd4jCpu$double_mean_sqerr_loss
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_mean_sqerr_loss]))

(defn ->double-mean-sqerr-loss
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_mean_sqerr_loss [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_mean_sqerr_loss p))
  (^Nd4jCpu$double_mean_sqerr_loss []
    (new Nd4jCpu$double_mean_sqerr_loss )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_mean_sqerr_loss`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_mean_sqerr_loss [^Nd4jCpu$double_mean_sqerr_loss this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_mean_sqerr_loss this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

