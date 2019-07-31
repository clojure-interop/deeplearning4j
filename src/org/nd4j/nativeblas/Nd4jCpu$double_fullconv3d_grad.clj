(ns org.nd4j.nativeblas.Nd4jCpu$double_fullconv3d_grad
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_fullconv3d_grad]))

(defn ->double-fullconv-3d-grad
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_fullconv3d_grad [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_fullconv3d_grad p))
  (^Nd4jCpu$double_fullconv3d_grad []
    (new Nd4jCpu$double_fullconv3d_grad )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_fullconv3d_grad`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_fullconv3d_grad [^Nd4jCpu$double_fullconv3d_grad this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_fullconv3d_grad this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

