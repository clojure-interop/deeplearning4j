(ns org.nd4j.linalg.api.ops.impl.accum.bp.BaseReductionBp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp BaseReductionBp]))

(defn ->base-reduction-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input-1 - Pre-reduced input 1 - `org.nd4j.autodiff.samediff.SDVariable`
  orig-input-2 - Pre-reduced input 2 - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - Gradient at the output - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - If true: reduction dimensions were kept - `boolean`
  dimensions - Dimensions to reduce. May be null - `int`"
  (^BaseReductionBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input-1 ^org.nd4j.autodiff.samediff.SDVariable orig-input-2 ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new BaseReductionBp same-diff orig-input-1 orig-input-2 grad-at-output keep-dims dimensions))
  (^BaseReductionBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean keep-dims ^Integer dimensions]
    (new BaseReductionBp same-diff orig-input grad-at-output keep-dims dimensions))
  (^BaseReductionBp []
    (new BaseReductionBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BaseReductionBp this]
    (-> this (.opName))))

