(ns org.nd4j.nativeblas.Nd4jCuda$DoubleDeclarableListOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleDeclarableListOp]))

(defn ->double-declarable-list-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleDeclarableListOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleDeclarableListOp p)))

(defn execute
  "Description copied from class: Nd4jCuda.DoubleDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCuda$DoubleContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$DoubleDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCuda$DoubleContext block]
    (-> this (.execute block)))
  (^org.nd4j.nativeblas.Nd4jCuda$DoubleResultSet [^Nd4jCuda$DoubleDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayList list ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector inputs ^org.bytedeco.javacpp.DoublePointer t-args ^org.bytedeco.javacpp.IntPointer i-args]
    (-> this (.execute list inputs t-args i-args))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$DoubleDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

