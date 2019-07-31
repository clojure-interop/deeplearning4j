(ns org.nd4j.nativeblas.Nd4jCuda$DoubleBooleanOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleBooleanOp]))

(defn ->double-boolean-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleBooleanOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleBooleanOp p)))

(defn evaluate
  "args - `org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$DoubleBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$DoubleNDArrayVector args]
    (-> this (.evaluate args))))

(defn execute
  "Description copied from class: Nd4jCuda.DoubleDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCuda$DoubleContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$DoubleBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$DoubleContext block]
    (-> this (.execute block))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$DoubleBooleanOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCuda$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

