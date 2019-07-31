(ns org.nd4j.nativeblas.Nd4jCpu$float_clipbyavgnorm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_clipbyavgnorm]))

(defn ->float-clipbyavgnorm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_clipbyavgnorm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_clipbyavgnorm p))
  (^Nd4jCpu$float_clipbyavgnorm []
    (new Nd4jCpu$float_clipbyavgnorm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_clipbyavgnorm`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_clipbyavgnorm [^Nd4jCpu$float_clipbyavgnorm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_clipbyavgnorm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

