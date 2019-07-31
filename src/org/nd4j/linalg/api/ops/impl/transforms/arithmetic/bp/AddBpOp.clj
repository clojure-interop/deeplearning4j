(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp.AddBpOp
  "Addition backprop operation. Supports 'undoing' of auto broadcast as applied in add op forward pass"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp AddBpOp]))

(defn ->add-bp-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  eps - `org.nd4j.autodiff.samediff.SDVariable`"
  (^AddBpOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable eps]
    (new AddBpOp same-diff x y eps))
  (^AddBpOp []
    (new AddBpOp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^AddBpOp this]
    (-> this (.opName))))

