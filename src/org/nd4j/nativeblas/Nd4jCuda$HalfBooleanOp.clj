(ns org.nd4j.nativeblas.Nd4jCuda$HalfBooleanOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfBooleanOp]))

(defn ->half-boolean-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfBooleanOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfBooleanOp p)))

(defn evaluate
  "args - `org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfNDArrayVector args]
    (-> this (.evaluate args))))

(defn execute
  "Description copied from class: Nd4jCuda.HalfDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.execute block))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$HalfBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

