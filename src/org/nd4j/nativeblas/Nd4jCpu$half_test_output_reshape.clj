(ns org.nd4j.nativeblas.Nd4jCpu$half_test_output_reshape
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_test_output_reshape]))

(defn ->half-test-output-reshape
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_test_output_reshape [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_test_output_reshape p))
  (^Nd4jCpu$half_test_output_reshape []
    (new Nd4jCpu$half_test_output_reshape )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_test_output_reshape`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_test_output_reshape [^Nd4jCpu$half_test_output_reshape this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_test_output_reshape this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

