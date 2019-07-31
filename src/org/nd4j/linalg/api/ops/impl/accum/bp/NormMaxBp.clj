(ns org.nd4j.linalg.api.ops.impl.accum.bp.NormMaxBp
  "Backprop op for Norm Max reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp NormMaxBp]))

(defn ->norm-max-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`"
  (^NormMaxBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new NormMaxBp same-diff orig-input grad-at-output keep-dims dimensions))
  (^NormMaxBp []
    (new NormMaxBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^NormMaxBp this]
    (-> this (.opName))))

