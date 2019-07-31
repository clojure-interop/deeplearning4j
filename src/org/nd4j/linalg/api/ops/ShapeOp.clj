(ns org.nd4j.linalg.api.ops.ShapeOp
  "Shape manipulation ops"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops ShapeOp]))

(defn ->shape-op
  "Constructor.

  Specify an alternative output array

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the output - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements to iterate on - `long`"
  (^ShapeOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new ShapeOp x z n))
  (^ShapeOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new ShapeOp x z))
  (^ShapeOp [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new ShapeOp x))
  (^ShapeOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new ShapeOp same-diff i-v shape in-place extra-args))
  (^ShapeOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new ShapeOp x y z n))
  (^ShapeOp []
    (new ShapeOp )))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^ShapeOp this]
    (-> this (.calculateOutputShape))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^ShapeOp this]
    (-> this (.opType))))

