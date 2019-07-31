(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp.FloorModBpOp
  "Floor div backprop operation. Supports 'undoing' of auto broadcast as applied in floor div op forward pass"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp FloorModBpOp]))

(defn ->floor-mod-bp-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  eps - `org.nd4j.autodiff.samediff.SDVariable`"
  (^FloorModBpOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable eps]
    (new FloorModBpOp same-diff x y eps))
  (^FloorModBpOp []
    (new FloorModBpOp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^FloorModBpOp this]
    (-> this (.opName))))

