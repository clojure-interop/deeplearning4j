(ns org.nd4j.nativeblas.Nd4jCpu$float_unique_with_counts
  "This operation returns 3 1D arrays for given 1D array with unique element count and indexes
 input:
 0 - 1D array
 output:
 0 - 1D array with unique values
 1 - 1D array with ids for values in array above
 2 - 1D array with counts for values in array above"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_unique_with_counts]))

(defn ->float-unique-with-counts
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_unique_with_counts [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_unique_with_counts p))
  (^Nd4jCpu$float_unique_with_counts []
    (new Nd4jCpu$float_unique_with_counts )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_unique_with_counts`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_unique_with_counts [^Nd4jCpu$float_unique_with_counts this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_unique_with_counts this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

