(ns org.nd4j.nativeblas.Nd4jCpu$DoubleBooleanOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleBooleanOp]))

(defn ->double-boolean-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleBooleanOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleBooleanOp p)))

(defn evaluate
  "args - `org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$DoubleBooleanOp this ^org.nd4j.nativeblas.Nd4jCpu$DoubleNDArrayVector args]
    (-> this (.evaluate args))))

(defn execute
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$DoubleBooleanOp this ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.execute block))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$DoubleBooleanOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

