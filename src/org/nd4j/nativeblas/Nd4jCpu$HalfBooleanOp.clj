(ns org.nd4j.nativeblas.Nd4jCpu$HalfBooleanOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$HalfBooleanOp]))

(defn ->half-boolean-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$HalfBooleanOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$HalfBooleanOp p)))

(defn evaluate
  "args - `org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector`

  returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$HalfBooleanOp this ^org.nd4j.nativeblas.Nd4jCpu$HalfNDArrayVector args]
    (-> this (.evaluate args))))

(defn execute
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: 0 if OK, error code otherwise - `(value="Nd4jStatus")  int`"
  ([^Nd4jCpu$HalfBooleanOp this ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.execute block))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.HalfDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$HalfBooleanOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$HalfContext block]
    (-> this (.calculateOutputShape input-shape block))))

