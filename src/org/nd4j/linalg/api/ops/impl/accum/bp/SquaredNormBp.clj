(ns org.nd4j.linalg.api.ops.impl.accum.bp.SquaredNormBp
  "Backprop op for squared norm (sum_i x_i^2) reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp SquaredNormBp]))

(defn ->squared-norm-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`"
  (^SquaredNormBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new SquaredNormBp same-diff orig-input grad-at-output keep-dims dimensions))
  (^SquaredNormBp []
    (new SquaredNormBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredNormBp this]
    (-> this (.opName))))

