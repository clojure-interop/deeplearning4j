(ns org.nd4j.nativeblas.Nd4jCpu$float_invert_permutation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_invert_permutation]))

(defn ->float-invert-permutation
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_invert_permutation [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_invert_permutation p))
  (^Nd4jCpu$float_invert_permutation []
    (new Nd4jCpu$float_invert_permutation )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_invert_permutation`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_invert_permutation [^Nd4jCpu$float_invert_permutation this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_invert_permutation this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

