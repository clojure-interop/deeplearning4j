(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp.DivBpOp
  "Division backprop operation. Supports 'undoing' of auto broadcast as applied in div op forward pass"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp DivBpOp]))

(defn ->div-bp-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  eps - `org.nd4j.autodiff.samediff.SDVariable`"
  (^DivBpOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable eps]
    (new DivBpOp same-diff x y eps))
  (^DivBpOp []
    (new DivBpOp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DivBpOp this]
    (-> this (.opName))))

