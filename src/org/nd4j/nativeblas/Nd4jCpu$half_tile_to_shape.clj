(ns org.nd4j.nativeblas.Nd4jCpu$half_tile_to_shape
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_tile_to_shape]))

(defn ->half-tile-to-shape
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_tile_to_shape [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_tile_to_shape p))
  (^Nd4jCpu$half_tile_to_shape []
    (new Nd4jCpu$half_tile_to_shape )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_tile_to_shape`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_tile_to_shape [^Nd4jCpu$half_tile_to_shape this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_tile_to_shape this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

