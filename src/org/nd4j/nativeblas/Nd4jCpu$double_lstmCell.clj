(ns org.nd4j.nativeblas.Nd4jCpu$double_lstmCell
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_lstmCell]))

(defn ->double-lstm-cell
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_lstmCell [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_lstmCell p))
  (^Nd4jCpu$double_lstmCell []
    (new Nd4jCpu$double_lstmCell )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_lstmCell`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_lstmCell [^Nd4jCpu$double_lstmCell this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_lstmCell this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

