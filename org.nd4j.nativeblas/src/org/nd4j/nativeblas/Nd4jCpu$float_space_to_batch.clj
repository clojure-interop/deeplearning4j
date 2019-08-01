(ns org.nd4j.nativeblas.Nd4jCpu$float_space_to_batch
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_space_to_batch]))

(defn ->float-space-to-batch
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_space_to_batch [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_space_to_batch p))
  (^Nd4jCpu$float_space_to_batch []
    (new Nd4jCpu$float_space_to_batch )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_space_to_batch`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_space_to_batch [^Nd4jCpu$float_space_to_batch this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_space_to_batch this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

