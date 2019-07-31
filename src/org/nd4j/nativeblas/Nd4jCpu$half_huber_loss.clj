(ns org.nd4j.nativeblas.Nd4jCpu$half_huber_loss
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_huber_loss]))

(defn ->half-huber-loss
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_huber_loss [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_huber_loss p))
  (^Nd4jCpu$half_huber_loss []
    (new Nd4jCpu$half_huber_loss )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_huber_loss`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_huber_loss [^Nd4jCpu$half_huber_loss this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$half_huber_loss this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

