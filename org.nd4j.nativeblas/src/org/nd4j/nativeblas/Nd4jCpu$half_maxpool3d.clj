(ns org.nd4j.nativeblas.Nd4jCpu$half_maxpool3d
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_maxpool3d]))

(defn ->half-maxpool-3d
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_maxpool3d [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_maxpool3d p))
  (^Nd4jCpu$half_maxpool3d []
    (new Nd4jCpu$half_maxpool3d )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_maxpool3d`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_maxpool3d [^Nd4jCpu$half_maxpool3d this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_maxpool3d this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

