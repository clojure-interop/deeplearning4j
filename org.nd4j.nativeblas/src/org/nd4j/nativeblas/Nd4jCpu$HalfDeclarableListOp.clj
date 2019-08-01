(ns org.nd4j.nativeblas.Nd4jCpu$HalfDeclarableListOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfDeclarableListOp]))

(defn ->half-declarable-list-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfDeclarableListOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfDeclarableListOp p)))

(defn execute
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$HalfDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.execute block)))
  ([^Nd4jCpu$HalfDeclarableListOp this ^org.bytedeco.javacpp.ShortPointer t-args ^org.bytedeco.javacpp.IntPointer i-args]
    (-> this (.execute t-args i-args))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$HalfDeclarableListOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

