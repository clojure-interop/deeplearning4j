(ns org.nd4j.nativeblas.Nd4jCpu$double_reverse_sequence
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_reverse_sequence]))

(defn ->double-reverse-sequence
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_reverse_sequence [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_reverse_sequence p))
  (^Nd4jCpu$double_reverse_sequence []
    (new Nd4jCpu$double_reverse_sequence )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_reverse_sequence`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_reverse_sequence [^Nd4jCpu$double_reverse_sequence this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_reverse_sequence this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

