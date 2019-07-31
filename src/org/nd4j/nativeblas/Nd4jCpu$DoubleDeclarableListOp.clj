(ns org.nd4j.nativeblas.Nd4jCpu$DoubleDeclarableListOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleDeclarableListOp]))

(defn ->double-declarable-list-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleDeclarableListOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleDeclarableListOp p)))

(defn execute
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$DoubleDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.execute block)))
  (^org.nd4j.nativeblas.Nd4jCpu$DoubleResultSet [^Nd4jCpu$DoubleDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayList list ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector inputs ^org.bytedeco.javacpp.DoublePointer t-args ^org.bytedeco.javacpp.IntPointer i-args]
    (-> this (.execute list inputs t-args i-args))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$DoubleDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

