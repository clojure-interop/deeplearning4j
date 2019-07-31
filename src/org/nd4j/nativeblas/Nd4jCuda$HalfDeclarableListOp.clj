(ns org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableListOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfDeclarableListOp]))

(defn ->half-declarable-list-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfDeclarableListOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfDeclarableListOp p)))

(defn execute
  "Description copied from class: Nd4jCuda.HalfDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.execute block)))
  ([^Nd4jCuda$HalfDeclarableListOp this ^org.bytedeco.javacpp.ShortPointer t-args ^org.bytedeco.javacpp.IntPointer i-args]
    (-> this (.execute t-args i-args))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$HalfDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

