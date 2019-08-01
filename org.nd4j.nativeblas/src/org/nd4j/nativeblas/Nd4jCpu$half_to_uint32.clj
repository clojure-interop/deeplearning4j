(ns org.nd4j.nativeblas.Nd4jCpu$half_to_uint32
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_to_uint32]))

(defn ->half-to-uint-32
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_to_uint32 [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_to_uint32 p))
  (^Nd4jCpu$half_to_uint32 []
    (new Nd4jCpu$half_to_uint32 )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_to_uint32`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_to_uint32 [^Nd4jCpu$half_to_uint32 this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_to_uint32 this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

