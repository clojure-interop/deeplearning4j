(ns org.nd4j.linalg.api.ops.impl.grid.FreeGridOp
  "Simple GridOp that operates on arbitrary number of Ops, that have no relations between them."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.grid FreeGridOp]))

(defn ->free-grid-op
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^FreeGridOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new FreeGridOp x y))
  (^FreeGridOp [^org.nd4j.linalg.api.ops.Op ops]
    (new FreeGridOp ops))
  (^FreeGridOp []
    (new FreeGridOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^FreeGridOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^FreeGridOp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^FreeGridOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

