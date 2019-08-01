(ns org.nd4j.nativeblas.Nd4jCpu$half_thresholdedrelu
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_thresholdedrelu]))

(defn ->half-thresholdedrelu
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_thresholdedrelu [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_thresholdedrelu p))
  (^Nd4jCpu$half_thresholdedrelu []
    (new Nd4jCpu$half_thresholdedrelu )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_thresholdedrelu`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_thresholdedrelu [^Nd4jCpu$half_thresholdedrelu this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_thresholdedrelu this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

