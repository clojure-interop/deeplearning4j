(ns org.nd4j.linalg.api.ops.impl.meta.PostulateMetaOp
  "You're NOT supposed to directly call this op. Do it on your own risk, only if you're absolutely have to."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.meta PostulateMetaOp]))

(defn ->postulate-meta-op
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^PostulateMetaOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new PostulateMetaOp x y))
  (^PostulateMetaOp []
    (new PostulateMetaOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^PostulateMetaOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^PostulateMetaOp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^PostulateMetaOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

