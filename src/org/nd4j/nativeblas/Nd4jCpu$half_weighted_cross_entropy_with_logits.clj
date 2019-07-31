(ns org.nd4j.nativeblas.Nd4jCpu$half_weighted_cross_entropy_with_logits
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_weighted_cross_entropy_with_logits]))

(defn ->half-weighted-cross-entropy-with-logits
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_weighted_cross_entropy_with_logits [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_weighted_cross_entropy_with_logits p))
  (^Nd4jCpu$half_weighted_cross_entropy_with_logits []
    (new Nd4jCpu$half_weighted_cross_entropy_with_logits )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_weighted_cross_entropy_with_logits`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_weighted_cross_entropy_with_logits [^Nd4jCpu$half_weighted_cross_entropy_with_logits this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_weighted_cross_entropy_with_logits this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

