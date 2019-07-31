(ns org.nd4j.nativeblas.Nd4jCpu$half_fullconv3d_grad
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_fullconv3d_grad]))

(defn ->half-fullconv-3d-grad
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_fullconv3d_grad [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_fullconv3d_grad p))
  (^Nd4jCpu$half_fullconv3d_grad []
    (new Nd4jCpu$half_fullconv3d_grad )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_fullconv3d_grad`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_fullconv3d_grad [^Nd4jCpu$half_fullconv3d_grad this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_fullconv3d_grad this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

