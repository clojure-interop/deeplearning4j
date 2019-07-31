(ns org.nd4j.linalg.api.ops.impl.accum.bp.VarianceBp
  "Backprop op for variance reduction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum.bp VarianceBp]))

(defn ->variance-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  orig-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  bias-corrected - `boolean`
  keep-dims - `boolean`
  dimensions - `int`"
  (^VarianceBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable orig-input ^org.nd4j.autodiff.samediff.SDVariable grad-at-output ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (new VarianceBp same-diff orig-input grad-at-output bias-corrected keep-dims dimensions))
  (^VarianceBp []
    (new VarianceBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^VarianceBp this]
    (-> this (.opName))))

