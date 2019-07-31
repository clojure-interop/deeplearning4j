(ns org.nd4j.linalg.api.ops.impl.meta.ReduceMetaOp
  "This is special case PredicateOp, with opB being only either Accumulation, Variance or Reduce3 op"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.meta ReduceMetaOp]))

(defn ->reduce-meta-op
  "Constructor.

  op-a - `org.nd4j.linalg.api.ops.ScalarOp`
  op-b - `org.nd4j.linalg.api.ops.Accumulation`
  dimensions - `int`"
  (^ReduceMetaOp [^org.nd4j.linalg.api.ops.ScalarOp op-a ^org.nd4j.linalg.api.ops.Accumulation op-b ^Integer dimensions]
    (new ReduceMetaOp op-a op-b dimensions))
  (^ReduceMetaOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new ReduceMetaOp x y))
  (^ReduceMetaOp []
    (new ReduceMetaOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ReduceMetaOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ReduceMetaOp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ReduceMetaOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

