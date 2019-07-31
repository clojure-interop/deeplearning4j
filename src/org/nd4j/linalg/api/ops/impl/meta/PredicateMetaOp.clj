(ns org.nd4j.linalg.api.ops.impl.meta.PredicateMetaOp
  "This MetaOp covers case, when Op A and Op B are both using linear memory access
 You're NOT supposed to directly call this op. Do it on your own risk, only if you're absolutely have to."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.meta PredicateMetaOp]))

(defn ->predicate-meta-op
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^PredicateMetaOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new PredicateMetaOp x y))
  (^PredicateMetaOp []
    (new PredicateMetaOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^PredicateMetaOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^PredicateMetaOp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^PredicateMetaOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

