(ns org.nd4j.nativeblas.Nd4jCpu$float_confusion_matrix
  "This operation calculate the confusion matrix for a
 pair of prediction and label 1-D arrays.
 Expected arguments:
 Input arrays:
 0 - predictions: 1-D array
 1 - labels: 1-D array
 2 - weights : optional
 Int args:
 0 - num_classes: optional"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_confusion_matrix]))

(defn ->float-confusion-matrix
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_confusion_matrix [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_confusion_matrix p))
  (^Nd4jCpu$float_confusion_matrix []
    (new Nd4jCpu$float_confusion_matrix )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_confusion_matrix`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_confusion_matrix [^Nd4jCpu$float_confusion_matrix this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_confusion_matrix this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

