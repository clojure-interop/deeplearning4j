(ns org.nd4j.nativeblas.Nd4jCpu$double_unique_with_counts
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_unique_with_counts]))

(defn ->double-unique-with-counts
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_unique_with_counts [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_unique_with_counts p))
  (^Nd4jCpu$double_unique_with_counts []
    (new Nd4jCpu$double_unique_with_counts )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_unique_with_counts`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_unique_with_counts [^Nd4jCpu$double_unique_with_counts this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_unique_with_counts this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

